use clap::Parser;
use rayon::prelude::*;
use std::collections::BTreeMap;
use std::io::Read;

#[derive(Parser)]
#[command(name = "svg2compose")]
#[command(about = "Convert SVG to Compose-compatible JSON or Kotlin code")]
struct Cli {
    /// Input SVG file path (reads from stdin if not provided)
    #[arg(short, long)]
    input: Option<String>,

    /// Input directory: process all .svg files, write result JSON to --output
    #[arg(long)]
    input_dir: Option<String>,

    /// Output file path for batch mode (required when --input-dir is used)
    #[arg(short, long)]
    output: Option<String>,

    /// Manifest file: generate .kt files directly from manifest JSON
    #[arg(long)]
    manifest: Option<String>,

    /// Output directory for generated .kt files (required when --manifest is used)
    #[arg(long)]
    output_dir: Option<String>,

    /// Write manifest result JSON (viewBox per icon) to this path
    #[arg(long)]
    result: Option<String>,
}

/// Extract <svg ... </svg> from raw text, stripping non-SVG content.
fn clean_svg(raw: &str) -> &str {
    if let Some(start) = raw.find("<svg") {
        if let Some(end) = raw[start..].find("</svg>") {
            return &raw[start..start + end + 6];
        }
    }
    raw
}

fn main() -> Result<(), Box<dyn std::error::Error>> {
    let cli = Cli::parse();

    if let Some(ref manifest_path) = cli.manifest {
        let output_dir = cli.output_dir.as_deref()
            .ok_or("--output-dir is required when --manifest is used")?;
        manifest_process(manifest_path, output_dir, cli.result.as_deref())?;
    } else if let Some(ref dir) = cli.input_dir {
        let output_path = cli.output.as_deref()
            .ok_or("--output is required when --input-dir is used")?;
        batch_process(dir, output_path)?;
    } else {
        let svg_text = match cli.input {
            Some(path) => std::fs::read_to_string(&path)?,
            None => {
                let mut buf = String::new();
                std::io::stdin().read_to_string(&mut buf)?;
                buf
            }
        };

        let cleaned = clean_svg(&svg_text);
        let tree = usvg::Tree::from_str(cleaned, &usvg::Options::default())
            .map_err(|e| format!("Failed to parse SVG: {}", e))?;

        let doc = svg2compose::converter::convert_tree(&tree);
        let json = serde_json::to_string(&doc)?;

        println!("{}", json);
    }

    Ok(())
}

fn batch_process(input_dir: &str, output_path: &str) -> Result<(), Box<dyn std::error::Error>> {
    let dir = std::path::Path::new(input_dir);
    if !dir.is_dir() {
        return Err(format!("{} is not a directory", input_dir).into());
    }

    let svg_files: Vec<(String, std::path::PathBuf)> = std::fs::read_dir(dir)?
        .filter_map(|entry| {
            let entry = entry.ok()?;
            let path = entry.path();
            if path.extension().map(|e| e == "svg").unwrap_or(false) {
                let stem = path.file_stem()?.to_string_lossy().to_string();
                Some((stem, path))
            } else {
                None
            }
        })
        .collect();

    let results: BTreeMap<String, svg2compose::protocol::SvgDocument> = svg_files
        .par_iter()
        .filter_map(|(stem, path)| {
            let raw = std::fs::read_to_string(path).ok()?;
            let cleaned = clean_svg(&raw);
            let tree = usvg::Tree::from_str(cleaned, &usvg::Options::default()).ok()?;
            let doc = svg2compose::converter::convert_tree(&tree);
            Some((stem.clone(), doc))
        })
        .collect();

    let json = serde_json::to_string(&results)?;
    std::fs::write(output_path, json)?;

    Ok(())
}

fn manifest_process(manifest_path: &str, output_dir: &str, result_path: Option<&str>) -> Result<(), Box<dyn std::error::Error>> {
    use svg2compose::codegen::{generate_kotlin_file, generate_shared_paths_file, generate_canonical_paths_file};
    use svg2compose::manifest::{IconResult, ManifestResult, ResultViewBox};
    use svg2compose::{canonical_hash, path_dedup};
    use svg2compose::protocol::SvgDocument;

    let manifest = svg2compose::manifest::Manifest::load(manifest_path)?;
    let out_dir = std::path::Path::new(output_dir);

    // Phase 1: parallel SVG → SvgDocument + result data
    // NOTE: A Rust-side SVG parse cache was benchmarked here but found
    // counterproductive — usvg parsing is already fast (~1.3s for 5000 icons)
    // and the 7.1MB cache JSON load overhead exceeds the savings. The
    // Generator's own MD5-based incremental cache (GeneratorReport) already
    // prevents svg2compose from being called for unchanged icons.
    let parsed: Vec<(&svg2compose::manifest::ManifestEntry, SvgDocument)> = manifest
        .icons
        .par_iter()
        .filter_map(|entry| {
            let raw = std::fs::read_to_string(&entry.svg).ok()?;
            let cleaned = clean_svg(&raw);
            let tree = usvg::Tree::from_str(cleaned, &usvg::Options::default()).ok()?;
            let doc = svg2compose::converter::convert_tree(&tree);
            Some((entry, doc))
        })
        .collect();

    // Phase 1.5: cross-style dedup — extract pathData, find shared groups, build lookup
    let entries_with_paths: Vec<(svg2compose::manifest::ManifestEntry, Vec<String>)> = parsed
        .iter()
        .map(|(entry, doc)| {
            let paths = path_dedup::extract_path_data(&doc.nodes);
            (svg2compose::manifest::ManifestEntry::clone(entry), paths)
        })
        .collect();
    let dedup_results = path_dedup::dedup_entries(&entries_with_paths);
    // Only build lookup for icons with actual cross-style sharing (any group >1 style)
    let sharing_results: Vec<_> = dedup_results.iter()
        .filter(|r| r.groups.iter().any(|g| g.styles.len() > 1))
        .cloned()
        .collect();
    let shared_lookup = path_dedup::build_lookup(&sharing_results);

    // Phase 1.6 — Canonical hash pool (T3): cross-icon sharing within this
    // source. Diagnostic-only: counts emitted but no codegen wiring yet.
    let canonical_pool = canonical_hash::build_canonical_pool(&entries_with_paths);
    let canonical_lookup =
        canonical_hash::build_canonical_lookup(&canonical_pool, &shared_lookup);
    {
        let line1 = format!(
            "[T3] canonical pool: {} groups | {} additional shared slots (Layer 1 already shared {})",
            canonical_pool.len(),
            canonical_lookup.len(),
            shared_lookup.len(),
        );
        eprintln!("{}", line1);
        let line2 = if !canonical_pool.is_empty() {
            let total_members: usize = canonical_pool.iter().map(|g| g.members.len()).sum();
            let line = format!(
                "[T3]   covering {} icons across {} groups (avg {:.1} icons/group)",
                total_members,
                canonical_pool.len(),
                total_members as f64 / canonical_pool.len() as f64,
            );
            eprintln!("{}", line);
            Some(line)
        } else {
            None
        };
        // Also write to a stable diagnostic file so the data is recoverable
        // even when stderr is swallowed by the Gradle process wrapper.
        let log_path = out_dir.join("_t3_diagnostic.txt");
        if let Some(parent) = log_path.parent() {
            std::fs::create_dir_all(parent).ok();
        }
        let mut content = String::new();
        content.push_str(&line1);
        content.push('\n');
        if let Some(l) = line2 {
            content.push_str(&l);
            content.push('\n');
        }
        // Per-group breakdown for inspection.
        for group in &canonical_pool {
            content.push_str(&format!(
                "  group _{}: {} members → ",
                group.token,
                group.members.len()
            ));
            for (i, (style, name)) in group.members.iter().enumerate() {
                if i > 0 { content.push_str(", "); }
                content.push_str(&format!("{}/{}", style, name));
            }
            content.push('\n');
        }
        std::fs::write(&log_path, content).ok();
    }

    // Merge Layer 1 + T3 lookups. Layer 1 owns its slots first; T3 fills
    // the gaps (build_canonical_lookup contract enforced this). Codegen
    // accepts a single lookup so we union them here.
    let mut merged_lookup = shared_lookup.clone();
    for (k, v) in canonical_lookup {
        merged_lookup.insert(k, v);
    }

    // Emit shared/CanonicalPaths.kt (T3) when there is at least one group.
    if !canonical_pool.is_empty() {
        let canonical_file = generate_canonical_paths_file(&canonical_pool, &manifest.base_package);
        let file_path = out_dir.join("shared").join("CanonicalPaths.kt");
        if let Some(parent) = file_path.parent() {
            std::fs::create_dir_all(parent).ok();
        }
        std::fs::write(&file_path, canonical_file)?;
    }

    // Generate shared paths files (shared/XxxPaths.kt)
    for result in &dedup_results {
        // Only generate shared files when there's actual sharing (any group has >1 style)
        if result.groups.iter().all(|g| g.styles.len() <= 1) {
            continue;
        }
        let shared_file = generate_shared_paths_file(result, &manifest.base_package);
        let file_path = out_dir.join("shared").join(format!("{}Paths.kt", result.icon_name));
        if let Some(parent) = file_path.parent() {
            std::fs::create_dir_all(parent).ok();
        }
        std::fs::write(&file_path, shared_file)?;
    }

    // Phase 2: generate one .kt file per icon (per-icon mode)
    for (entry, doc) in &parsed {
        let kt = generate_kotlin_file(doc, entry, &manifest.base_package, &manifest.icon_container, Some(&merged_lookup));
        let file_path = out_dir.join(&entry.subdirectory).join(format!("{}.kt", entry.kotlin_name));
        if let Some(parent) = file_path.parent() {
            std::fs::create_dir_all(parent).ok();
        }
        std::fs::write(&file_path, kt)?;
    }

    // Write result JSON if --result is specified
    if let Some(result_file) = result_path {
        let manifest_result: ManifestResult = parsed
            .iter()
            .map(|(entry, doc)| {
                let key = format!("{}/{}", entry.subdirectory, entry.kotlin_name);
                let icon_result = IconResult {
                    view_box: ResultViewBox {
                        min_x: doc.view_box.x,
                        min_y: doc.view_box.y,
                        width: doc.view_box.width,
                        height: doc.view_box.height,
                    },
                    paths: collect_paths(&doc.nodes),
                };
                (key, icon_result)
            })
            .collect();
        let json = serde_json::to_string(&manifest_result)?;
        std::fs::write(result_file, json)?;
    }

    Ok(())
}

/// Recursively collect path data from nodes for web-preview rendering.
fn collect_paths(nodes: &[svg2compose::protocol::Node]) -> Vec<svg2compose::manifest::ResultPathNode> {
    use svg2compose::manifest::ResultPathNode;
    use svg2compose::protocol::Node;

    let mut paths = Vec::new();
    for node in nodes {
        match node {
            Node::Path(p) => {
                let alpha = p.fill.as_ref().map(|f| f.opacity)
                    .or_else(|| p.stroke.as_ref().map(|s| s.opacity))
                    .unwrap_or(1.0);
                paths.push(ResultPathNode {
                    d: p.d.clone(),
                    fill: p.fill.as_ref().map(|f| f.color.clone()),
                    stroke: p.stroke.as_ref().map(|s| s.color.clone()),
                    stroke_width: p.stroke.as_ref().map(|s| s.width),
                    stroke_line_cap: p.stroke.as_ref().map(|s| s.linecap.clone()),
                    stroke_line_join: p.stroke.as_ref().map(|s| s.linejoin.clone()),
                    fill_rule: p.fill.as_ref().map(|f| f.rule.clone()),
                    alpha,
                });
            }
            Node::Group(g) => {
                paths.extend(collect_paths(&g.children));
            }
        }
    }
    paths
}
