use clap::Parser;
use rayon::prelude::*;
use std::collections::BTreeMap;
use std::io::Read;

#[derive(Parser)]
#[command(name = "svg2compose")]
#[command(about = "Convert SVG to Compose-compatible JSON")]
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
}

fn main() -> Result<(), Box<dyn std::error::Error>> {
    let cli = Cli::parse();

    if let Some(ref dir) = cli.input_dir {
        // Batch mode
        let output_path = cli.output.as_deref()
            .ok_or("--output is required when --input-dir is used")?;
        batch_process(dir, output_path)?;
    } else {
        // Single file / stdin mode
        let svg_text = match cli.input {
            Some(path) => std::fs::read_to_string(&path)?,
            None => {
                let mut buf = String::new();
                std::io::stdin().read_to_string(&mut buf)?;
                buf
            }
        };

        let tree = usvg::Tree::from_str(&svg_text, &usvg::Options::default())
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

    // Collect all .svg files
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

    // Process in parallel with rayon
    let results: BTreeMap<String, svg2compose::protocol::SvgDocument> = svg_files
        .par_iter()
        .filter_map(|(stem, path)| {
            let svg_text = std::fs::read_to_string(path).ok()?;
            let tree = usvg::Tree::from_str(&svg_text, &usvg::Options::default()).ok()?;
            let doc = svg2compose::converter::convert_tree(&tree);
            Some((stem.clone(), doc))
        })
        .collect();

    let json = serde_json::to_string(&results)?;
    std::fs::write(output_path, json)?;

    Ok(())
}
