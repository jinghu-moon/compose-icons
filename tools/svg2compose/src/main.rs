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

    /// Normalize all icons to this viewBox size (e.g., 24.0)
    #[arg(long)]
    normalize_size: Option<f64>,
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
        manifest_process(manifest_path, output_dir, cli.result.as_deref(), cli.normalize_size)?;
    } else if let Some(ref dir) = cli.input_dir {
        let output_path = cli.output.as_deref()
            .ok_or("--output is required when --input-dir is used")?;
        batch_process(dir, output_path, cli.normalize_size)?;
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

        let doc = svg2compose::converter::convert_tree(&tree, cli.normalize_size);
        let json = serde_json::to_string(&doc)?;

        println!("{}", json);
    }

    Ok(())
}

fn batch_process(input_dir: &str, output_path: &str, normalize_size: Option<f64>) -> Result<(), Box<dyn std::error::Error>> {
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
            let doc = svg2compose::converter::convert_tree(&tree, normalize_size);
            Some((stem.clone(), doc))
        })
        .collect();

    let json = serde_json::to_string(&results)?;
    std::fs::write(output_path, json)?;

    Ok(())
}

fn manifest_process(manifest_path: &str, output_dir: &str, result_path: Option<&str>, normalize_size: Option<f64>) -> Result<(), Box<dyn std::error::Error>> {
    use svg2compose::codegen::generate_kotlin_file;
    use svg2compose::manifest::{IconResult, ManifestResult, ResultViewBox};
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
            let doc = svg2compose::converter::convert_tree(&tree, normalize_size);
            Some((entry, doc))
        })
        .collect();

    // Phase 2: generate one .kt file per icon (per-icon mode)
    for (entry, doc) in &parsed {
        let kt = generate_kotlin_file(doc, entry, &manifest.base_package, &manifest.icon_container);
        let file_path = if entry.subdirectory.is_empty() {
            out_dir.join(format!("{}.kt", entry.kotlin_name))
        } else {
            out_dir.join(&entry.subdirectory).join(format!("{}.kt", entry.kotlin_name))
        };
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
                let key = if entry.subdirectory.is_empty() {
                    entry.kotlin_name.clone()
                } else {
                    format!("{}/{}", entry.subdirectory, entry.kotlin_name)
                };
                let (paths, clip_path) = collect_paths(&doc.nodes);
                let icon_result = IconResult {
                    view_box: ResultViewBox {
                        min_x: doc.view_box.x,
                        min_y: doc.view_box.y,
                        width: doc.view_box.width,
                        height: doc.view_box.height,
                    },
                    paths,
                    clip_path,
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
/// Also extracts the top-level group's clip_path if present.
fn collect_paths(nodes: &[svg2compose::protocol::Node]) -> (Vec<svg2compose::manifest::ResultPathNode>, Option<String>) {
    use svg2compose::manifest::ResultPathNode;
    use svg2compose::protocol::Node;

    let mut paths = Vec::new();
    let mut clip_path: Option<String> = None;

    for node in nodes {
        match node {
            Node::Path(p) => {
                let fill_alpha = p.fill.as_ref().map(|f| f.opacity).unwrap_or(1.0);
                let stroke_alpha = p.stroke.as_ref().map(|s| s.opacity).unwrap_or(1.0);
                paths.push(ResultPathNode {
                    d: p.d.clone(),
                    fill: p.fill.as_ref().map(|f| f.color.clone()),
                    stroke: p.stroke.as_ref().map(|s| s.color.clone()),
                    stroke_width: p.stroke.as_ref().map(|s| s.width),
                    stroke_line_cap: p.stroke.as_ref().map(|s| s.linecap.clone()),
                    stroke_line_join: p.stroke.as_ref().map(|s| s.linejoin.clone()),
                    fill_rule: p.fill.as_ref().map(|f| f.rule.clone()),
                    fill_alpha,
                    stroke_alpha,
                });
            }
            Node::Group(g) => {
                if clip_path.is_none() {
                    clip_path = g.clip_path.clone();
                }
                let (child_paths, _) = collect_paths(&g.children);
                paths.extend(child_paths);
            }
        }
    }
    (paths, clip_path)
}
