use std::fs;
use svg2compose::codegen::generate_kotlin_file;
use svg2compose::converter::convert_tree;
use svg2compose::manifest::ManifestEntry;


fn load_fixture(name: &str) -> String {
    fs::read_to_string(format!("tests/fixtures/{}", name))
        .unwrap_or_else(|e| panic!("Failed to load fixture {}: {}", name, e))
}

fn make_entry(kotlin_name: &str) -> ManifestEntry {
    ManifestEntry {
        svg: format!("tests/fixtures/{}.svg", kotlin_name.to_lowercase()),
        kotlin_name: kotlin_name.to_string(),
        style_name: "Regular".to_string(),
        subdirectory: "regular".to_string(),
        helper: "testIcon".to_string(),
        md5: None,
    }
}

fn generate_and_compare(fixture_name: &str, kotlin_name: &str, snapshot_name: &str) {
    let svg = load_fixture(fixture_name);
    let tree = usvg::Tree::from_str(&svg, &usvg::Options::default())
        .unwrap_or_else(|e| panic!("Failed to parse SVG {}: {}", fixture_name, e));
    let doc = convert_tree(&tree, None);

    let entry = make_entry(kotlin_name);
    let actual = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

    let snapshot_path = format!("tests/snapshots/{}", snapshot_name);
    let expected = fs::read_to_string(&snapshot_path)
        .unwrap_or_else(|e| panic!("Failed to load snapshot {}: {}", snapshot_path, e));

    // Normalize whitespace for comparison
    let actual_lines: Vec<&str> = actual.lines().collect();
    let expected_lines: Vec<&str> = expected.lines().collect();

    assert_eq!(
        actual_lines.len(),
        expected_lines.len(),
        "Line count mismatch for {}: actual {} vs expected {}",
        snapshot_name,
        actual_lines.len(),
        expected_lines.len()
    );

    for (i, (actual_line, expected_line)) in actual_lines.iter().zip(expected_lines.iter()).enumerate() {
        assert_eq!(
            actual_line.trim(),
            expected_line.trim(),
            "Line {} mismatch in {}:\n  actual:   {}\n  expected: {}",
            i + 1,
            snapshot_name,
            actual_line,
            expected_line
        );
    }
}

#[test]
fn test_single_path_snapshot() {
    generate_and_compare("single_path.svg", "SinglePath", "SinglePath.kt");
}

#[test]
fn test_group_with_clip_snapshot() {
    generate_and_compare("group_with_clip.svg", "GroupWithClip", "GroupWithClip.kt");
}

#[test]
fn test_path_with_transform_snapshot() {
    // This test verifies that transform is baked into coordinates
    let svg = load_fixture("path_with_transform.svg");
    let tree = usvg::Tree::from_str(&svg, &usvg::Options::default()).unwrap();
    let doc = convert_tree(&tree, None);

    let entry = make_entry("PathWithTransform");
    let actual = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

    // Verify the generated code contains baked coordinates
    // rotate(-180 7.5 7.5) applied to M 1 1 -> M 14 14
    // compact_path strips trailing zeros, so "14.000" → "14"
    assert!(actual.contains("14"), "Transform should be baked into coordinates");
    // R3 optimization: group without clipPath and opacity=1.0 is flattened
    assert!(!actual.contains("group("), "Group without clipPath should be flattened by R3 optimization");
}

#[test]
fn test_mask_panel_snapshot() {
    // This test verifies that mask groups are skipped
    let svg = load_fixture("mask_panel.svg");
    let tree = usvg::Tree::from_str(&svg, &usvg::Options::default()).unwrap();
    let doc = convert_tree(&tree, None);

    // Only 1 node (the fill layer), mask group should be skipped
    assert_eq!(doc.nodes.len(), 1, "Mask group should be skipped");

    let entry = make_entry("MaskPanel");
    let actual = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

    // Should not contain the expanded path coordinates
    assert!(!actual.contains("-5.000"), "Masked expanded path should be filtered out");
}
