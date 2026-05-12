use std::process::Command;

fn svg2compose_binary() -> &'static str {
    if cfg!(target_os = "windows") {
        "target/release/svg2compose.exe"
    } else {
        "target/release/svg2compose"
    }
}

fn run_cli(input_file: &str) -> (i32, String) {
    let output = Command::new(svg2compose_binary())
        .args(["--input", input_file])
        .output()
        .expect("Failed to execute CLI");

    let stdout = String::from_utf8_lossy(&output.stdout).to_string();
    let exit_code = output.status.code().unwrap_or(-1);

    (exit_code, stdout)
}

#[test]
fn test_cli_single_path_outputs_valid_json() {
    let (exit_code, stdout) = run_cli("tests/fixtures/single_path.svg");
    assert_eq!(exit_code, 0);

    let doc: svg2compose::protocol::SvgDocument = serde_json::from_str(&stdout).unwrap();
    assert_eq!(doc.nodes.len(), 1);
}

#[test]
fn test_cli_transform_svg_outputs_baked_coordinates() {
    let (exit_code, stdout) = run_cli("tests/fixtures/path_with_transform.svg");
    assert_eq!(exit_code, 0);

    let doc: svg2compose::protocol::SvgDocument = serde_json::from_str(&stdout).unwrap();
    // Fixture has <g transform="rotate(...)"> wrapping <path>, so top node is Group
    match &doc.nodes[0] {
        svg2compose::protocol::Node::Group(g) => {
            assert_eq!(g.children.len(), 1);
            match &g.children[0] {
                svg2compose::protocol::Node::Path(p) => {
                    assert_eq!(p.transform, [1.0, 0.0, 0.0, 1.0, 0.0, 0.0]);
                }
                _ => panic!("Expected Path node inside Group"),
            }
        }
        _ => panic!("Expected Group node"),
    }
}

#[test]
fn test_cli_mask_svg_converts_simple_mask_to_clip() {
    let (exit_code, stdout) = run_cli("tests/fixtures/mask_panel.svg");
    assert_eq!(exit_code, 0);

    let doc: svg2compose::protocol::SvgDocument = serde_json::from_str(&stdout).unwrap();
    // Simple mask (opaque filled paths) is converted to clip_path → group preserved
    assert_eq!(doc.nodes.len(), 2);
}

#[test]
fn test_cli_invalid_svg_exits_nonzero() {
    let mut temp_file = std::env::temp_dir();
    temp_file.push("invalid.svg");
    std::fs::write(&temp_file, "not an svg").unwrap();

    let (exit_code, _) = run_cli(temp_file.to_str().unwrap());
    assert_ne!(exit_code, 0);
}
