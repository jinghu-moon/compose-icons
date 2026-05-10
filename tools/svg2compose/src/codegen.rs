use crate::manifest::ManifestEntry;
use crate::protocol::{GroupNode, Node, PathNode, SvgDocument};

/// Style attributes of a path (everything except pathData).
#[derive(Debug, PartialEq)]
struct PathStyle {
    fill_rule: String,
    fill_color: Option<String>,
    fill_opacity: f64,
    stroke_color: Option<String>,
    stroke_opacity: f64,
    stroke_width: f64,
    stroke_linecap: String,
    stroke_linejoin: String,
}

fn extract_style(path: &PathNode) -> PathStyle {
    PathStyle {
        fill_rule: path.fill.as_ref().map(|f| f.rule.clone()).unwrap_or_default(),
        fill_color: path.fill.as_ref().map(|f| f.color.clone()),
        fill_opacity: path.fill.as_ref().map(|f| f.opacity).unwrap_or(1.0),
        stroke_color: path.stroke.as_ref().map(|s| s.color.clone()),
        stroke_opacity: path.stroke.as_ref().map(|s| s.opacity).unwrap_or(1.0),
        stroke_width: path.stroke.as_ref().map(|s| s.width).unwrap_or(0.0),
        stroke_linecap: path.stroke.as_ref().map(|s| s.linecap.clone()).unwrap_or_default(),
        stroke_linejoin: path.stroke.as_ref().map(|s| s.linejoin.clone()).unwrap_or_default(),
    }
}

/// Collect all flat paths (no nested groups) from the node list.
fn collect_flat_paths<'a>(nodes: &'a [Node], out: &mut Vec<&'a PathNode>) {
    for node in nodes {
        match node {
            Node::Path(p) => out.push(p),
            Node::Group(g) => collect_flat_paths(&g.children, out),
        }
    }
}

/// Check if the icon has only flat paths (no meaningful groups).
fn is_flat_paths_only(nodes: &[Node]) -> bool {
    nodes.iter().all(|n| matches!(n, Node::Path(_)))
}

/// Check if all paths share the same style.
fn all_paths_same_style(paths: &[&PathNode]) -> bool {
    if paths.len() < 2 {
        return false;
    }
    let first = extract_style(paths[0]);
    paths[1..].iter().all(|p| extract_style(p) == first)
}

/// Generate a complete .kt file for one icon.
///
pub fn generate_kotlin_file(
    doc: &SvgDocument,
    entry: &ManifestEntry,
    base_package: &str,
    icon_container: &str,
) -> String {
    let mut out = String::with_capacity(2048);

    let package = format!("{}.{}", base_package, entry.subdirectory);
    let style_cap = capitalize(&entry.style_name);
    let property_host = format!("{}.{}", icon_container, style_cap);
    let vector_name = lower_first(&entry.kotlin_name);

    let max_dim = doc.view_box.width.max(doc.view_box.height);
    let width_dp = format_dp(24.0 / max_dim * doc.view_box.width);
    let height_dp = format_dp(24.0 / max_dim * doc.view_box.height);

    // Determine if template mode is applicable
    let mut all_paths = Vec::new();
    collect_flat_paths(&doc.nodes, &mut all_paths);
    let use_template = !all_paths.is_empty()
        && is_flat_paths_only(&doc.nodes)
        && all_paths_same_style(&all_paths);

    // package
    out.push_str(&format!("package {}\n\n", package));

    // imports
    out.push_str("import androidx.compose.ui.graphics.*\n");
    out.push_str("import androidx.compose.ui.graphics.vector.ImageVector\n");
    if has_meaningful_group(&doc.nodes) {
        out.push_str("import androidx.compose.ui.graphics.vector.group\n");
    }
    out.push_str("import androidx.compose.ui.unit.dp\n");
    out.push_str("import composeicons.core.IconSize\n");
    out.push_str("import composeicons.core.ViewBox\n");
    if use_template {
        out.push_str("import composeicons.core.addPathData\n");
    } else {
        out.push_str("import composeicons.core.parseSvgPathData\n");
    }
    out.push_str(&format!("import {}.{}\n", base_package, icon_container));
    out.push_str(&format!("import {}.{}\n", base_package, entry.helper));
    out.push('\n');

    // extension property
    out.push_str(&format!("val {}.{}: ImageVector\n", property_host, entry.kotlin_name));
    out.push_str("    get() {\n");
    out.push_str(&format!("        if (_{} != null) return _{}!!\n", vector_name, vector_name));
    out.push_str(&format!("        _{} = {}(\n", vector_name, entry.helper));
    out.push_str(&format!("            name = \"{}\",\n", entry.kotlin_name));
    out.push_str(&format!(
        "            size = IconSize(width = {}f.dp, height = {}f.dp),\n",
        width_dp, height_dp
    ));
    out.push_str(&format!(
        "            viewBox = ViewBox(minX = 0f, minY = 0f, width = {}f, height = {}f),\n",
        format_float(doc.view_box.width),
        format_float(doc.view_box.height)
    ));
    out.push_str("        ) {\n");

    // icon content
    for node in &doc.nodes {
        generate_node(&mut out, node, 3, use_template);
    }

    out.push_str("        }\n");
    out.push_str(&format!("        return _{}!!\n", vector_name));
    out.push_str("    }\n");
    out.push('\n');
    out.push_str(&format!("private var _{}: ImageVector? = null\n", vector_name));

    out
}

/// Check if any group in the tree will actually emit a `group()` call
/// (has clipPath or non-1.0 opacity), meaning the import is needed.
fn has_meaningful_group(nodes: &[Node]) -> bool {
    nodes.iter().any(|node| match node {
        Node::Group(g) => {
            let needs_group = g.clip_path.is_some() || (g.opacity - 1.0).abs() > f64::EPSILON;
            needs_group || has_meaningful_group(&g.children)
        }
        Node::Path(_) => false,
    })
}

fn generate_node(
    out: &mut String,
    node: &Node,
    indent: usize,
    use_template: bool,
) {
    match node {
        Node::Path(path) => {
            if use_template {
                generate_path_minimal(out, path, indent);
            } else {
                generate_path(out, path, indent);
            }
        }
        Node::Group(group) => generate_group(out, group, indent, use_template),
    }
}

/// Minimal path output: just addPathData("...") with pathFillType only if EvenOdd.
fn generate_path_minimal(
    out: &mut String,
    path: &PathNode,
    indent: usize,
) {
    let pad = "    ".repeat(indent);
    let is_evenodd = path.fill.as_ref().map(|f| f.rule.as_str()) == Some("evenodd");

    if is_evenodd {
        out.push_str(&format!(
            "{}addPathData(\"{}\", pathFillType = PathFillType.EvenOdd)\n",
            pad, path.d
        ));
    } else {
        out.push_str(&format!("{}addPathData(\"{}\")\n", pad, path.d));
    }
}

fn generate_path(out: &mut String, path: &PathNode, indent: usize) {
    let pad = "    ".repeat(indent);

    let fill_type = match path.fill.as_ref().map(|f| f.rule.as_str()) {
        Some("evenodd") => "PathFillType.EvenOdd",
        _ => "PathFillType.NonZero",
    };

    let fill_brush = match &path.fill {
        Some(f) => format!("SolidColor(Color(0xFF{}))", f.color.trim_start_matches('#')),
        None => "null".to_string(),
    };

    let stroke_brush = match &path.stroke {
        Some(s) => format!("SolidColor(Color(0xFF{}))", s.color.trim_start_matches('#')),
        None => "null".to_string(),
    };

    let stroke_cap = match path.stroke.as_ref().map(|s| s.linecap.as_str()) {
        Some("round") => "StrokeCap.Round",
        Some("square") => "StrokeCap.Square",
        _ => "StrokeCap.Butt",
    };

    let stroke_join = match path.stroke.as_ref().map(|s| s.linejoin.as_str()) {
        Some("round") => "StrokeJoin.Round",
        Some("bevel") => "StrokeJoin.Bevel",
        _ => "StrokeJoin.Miter",
    };

    let stroke_width = path.stroke.as_ref().map(|s| s.width).unwrap_or(0.0);
    let fill_alpha = path.fill.as_ref().map(|f| f.opacity).unwrap_or(1.0);
    let stroke_alpha = path.stroke.as_ref().map(|s| s.opacity).unwrap_or(1.0);

    out.push_str(&format!("{}addPath(\n", pad));
    out.push_str(&format!("{}    pathData = parseSvgPathData(\"{}\"),\n", pad, path.d));
    out.push_str(&format!("{}    pathFillType = {},\n", pad, fill_type));
    out.push_str(&format!("{}    fill = {},\n", pad, fill_brush));
    out.push_str(&format!("{}    fillAlpha = {}f,\n", pad, format_float(fill_alpha)));
    out.push_str(&format!("{}    stroke = {},\n", pad, stroke_brush));
    out.push_str(&format!("{}    strokeAlpha = {}f,\n", pad, format_float(stroke_alpha)));
    out.push_str(&format!(
        "{}    strokeLineWidth = {}f,\n",
        pad,
        format_float(stroke_width)
    ));
    out.push_str(&format!("{}    strokeLineCap = {},\n", pad, stroke_cap));
    out.push_str(&format!("{}    strokeLineJoin = {},\n", pad, stroke_join));
    out.push_str(&format!("{})\n", pad));
}

fn generate_group(
    out: &mut String,
    group: &GroupNode,
    indent: usize,
    use_template: bool,
) {
    let pad = "    ".repeat(indent);

    // 优化：group 无 clipPath 和 opacity 时直接输出子节点
    if group.clip_path.is_none() && (group.opacity - 1.0).abs() < f64::EPSILON {
        for child in &group.children {
            generate_node(out, child, indent, use_template);
        }
        return;
    }

    out.push_str(&format!("{}group(\n", pad));
    if let Some(ref clip) = group.clip_path {
        out.push_str(&format!(
            "{}    clipPathData = parseSvgPathData(\"{}\"),\n",
            pad, clip
        ));
    }
    out.push_str(&format!("{}) {{\n", pad));

    for child in &group.children {
        generate_node(out, child, indent + 1, use_template);
    }

    out.push_str(&format!("{}}}\n", pad));
}

/// Generate a merged .kt file containing multiple icons with shared imports and a HashMap cache.
/// This reduces file count from 20K+ to ~20 files, significantly improving Kotlin compilation time.
pub fn generate_merged_kotlin_file(
    icons: &[(&SvgDocument, &ManifestEntry)],
    base_package: &str,
    icon_container: &str,
) -> String {
    let capacity = icons.len() * 2048;
    let mut out = String::with_capacity(capacity);

    let first = icons[0].1;
    let package = format!("{}.{}", base_package, first.subdirectory);
    let style_cap = capitalize(&first.style_name);
    let property_host = format!("{}.{}", icon_container, style_cap);
    let helper = &first.helper;

    let needs_group = icons.iter().any(|(doc, _)| has_meaningful_group(&doc.nodes));
    // Check if any icon needs parseSvgPathData (i.e., uses non-template mode)
    let needs_parse = icons.iter().any(|(doc, _)| {
        let mut paths = Vec::new();
        collect_flat_paths(&doc.nodes, &mut paths);
        !(is_flat_paths_only(&doc.nodes) && all_paths_same_style(&paths))
    });

    // package
    out.push_str(&format!("package {}\n\n", package));

    // imports (shared)
    out.push_str("import androidx.compose.ui.graphics.*\n");
    out.push_str("import androidx.compose.ui.graphics.vector.ImageVector\n");
    if needs_group {
        out.push_str("import androidx.compose.ui.graphics.vector.group\n");
    }
    out.push_str("import androidx.compose.ui.unit.dp\n");
    out.push_str("import composeicons.core.IconSize\n");
    out.push_str("import composeicons.core.ViewBox\n");
    if needs_parse {
        out.push_str("import composeicons.core.parseSvgPathData\n");
    }
    out.push_str(&format!("import {}.{}\n", base_package, icon_container));
    out.push_str(&format!("import {}.{}\n", base_package, helper));
    out.push_str("import java.util.HashMap\n");
    out.push('\n');

    // shared cache
    out.push_str("private val _cache = HashMap<String, ImageVector>()\n");
    out.push('\n');

    // extension properties
    for (doc, entry) in icons {
        let max_dim = doc.view_box.width.max(doc.view_box.height);
        let width_dp = format_dp(24.0 / max_dim * doc.view_box.width);
        let height_dp = format_dp(24.0 / max_dim * doc.view_box.height);

        // Per-icon template check
        let mut paths = Vec::new();
        collect_flat_paths(&doc.nodes, &mut paths);
        let use_template = !paths.is_empty()
            && is_flat_paths_only(&doc.nodes)
            && all_paths_same_style(&paths);

        out.push_str(&format!("val {}.{}: ImageVector\n", property_host, entry.kotlin_name));
        out.push_str("    get() {\n");
        out.push_str(&format!("        _cache[\"{}\"]?.let {{ return it }}\n", entry.kotlin_name));
        out.push_str(&format!("        val icon = {}(\n", helper));
        out.push_str(&format!("            name = \"{}\",\n", entry.kotlin_name));
        out.push_str(&format!(
            "            size = IconSize(width = {}f.dp, height = {}f.dp),\n",
            width_dp, height_dp
        ));
        out.push_str(&format!(
            "            viewBox = ViewBox(minX = 0f, minY = 0f, width = {}f, height = {}f),\n",
            format_float(doc.view_box.width),
            format_float(doc.view_box.height)
        ));
        out.push_str("        ) {\n");

        for node in &doc.nodes {
            generate_node(&mut out, node, 3, use_template);
        }

        out.push_str("        }\n");
        out.push_str(&format!("        _cache[\"{}\"] = icon\n", entry.kotlin_name));
        out.push_str("        return icon\n");
        out.push_str("    }\n\n");
    }

    out
}

fn format_float(v: f64) -> String {
    if v == (v as i64) as f64 {
        format!("{}", v as i64)
    } else {
        format!("{:.3}", v).trim_end_matches('0').trim_end_matches('.').to_string()
    }
}

fn format_dp(v: f64) -> String {
    if v == (v as i64) as f64 {
        format!("{}", v as i64)
    } else {
        format!("{}", v)
    }
}

fn capitalize(s: &str) -> String {
    let mut chars = s.chars();
    match chars.next() {
        Some(c) => c.to_uppercase().to_string() + chars.as_str(),
        None => String::new(),
    }
}

fn lower_first(s: &str) -> String {
    let mut chars = s.chars();
    match chars.next() {
        Some(c) => c.to_lowercase().to_string() + chars.as_str(),
        None => String::new(),
    }
}

#[cfg(test)]
mod tests {
    use super::*;
    use crate::protocol::{FillStyle, StrokeStyle, ViewBox};

    fn make_path(d: &str) -> Node {
        Node::Path(PathNode {
            d: d.to_string(),
            transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
            fill: Some(FillStyle {
                color: "#000000".to_string(),
                opacity: 1.0,
                rule: "nonzero".to_string(),
            }),
            stroke: None,
            visibility: "visible".to_string(),
        })
    }

    #[test]
    fn test_generate_path_node() {
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 15.0, height: 15.0 },
            nodes: vec![make_path("M 0 0 L 15 15 Z")],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "TestIcon".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "radixIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.radix", "RadixIcons");

        assert!(kt.contains("package composeicons.radix.regular"));
        assert!(kt.contains("val RadixIcons.Regular.TestIcon: ImageVector"));
        assert!(kt.contains("radixIcon("));
        assert!(kt.contains("parseSvgPathData(\"M 0 0 L 15 15 Z\")"));
        assert!(kt.contains("SolidColor(Color(0xFF000000))"));
        assert!(kt.contains("private var _testIcon: ImageVector? = null"));
    }

    #[test]
    fn test_generate_group_with_clip() {
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![Node::Group(GroupNode {
                opacity: 1.0, // converter 已将 opacity bake 到子 path
                transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
                clip_path: Some("M 0 0 L 24 0 L 24 24 Z".to_string()),
                children: vec![make_path("M 1 1 L 23 23 Z")],
            })],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "ClipIcon".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

        assert!(kt.contains("group("));
        assert!(kt.contains("clipPathData = parseSvgPathData(\"M 0 0 L 24 0 L 24 24 Z\")"));
        // groupAlpha 不再输出——opacity 已在 converter 中 bake 到子 path
        assert!(!kt.contains("groupAlpha"));
    }

    #[test]
    fn test_format_float() {
        assert_eq!(format_float(15.0), "15");
        assert_eq!(format_float(0.5), "0.5");
        assert_eq!(format_float(1.234567), "1.235");
    }

    #[test]
    fn test_empty_group_without_clip_is_skipped() {
        // group 无 clipPath、opacity=1.0 时应直接输出子节点，不包裹 group()
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![Node::Group(GroupNode {
                opacity: 1.0,
                transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
                clip_path: None,
                children: vec![make_path("M 0 0 L 24 24 Z")],
            })],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "FlatIcon".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

        // 不应包含 group()，应直接输出 addPath
        assert!(!kt.contains("group("), "Empty group should be flattened");
        assert!(kt.contains("addPath("));
    }

    #[test]
    fn test_separate_fill_and_stroke_alpha() {
        // fill 和 stroke 有不同 opacity 时应分别输出
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![Node::Path(PathNode {
                d: "M 0 0 L 24 24 Z".to_string(),
                transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
                fill: Some(FillStyle {
                    color: "#000000".to_string(),
                    opacity: 0.8,
                    rule: "nonzero".to_string(),
                }),
                stroke: Some(StrokeStyle {
                    color: "#ff0000".to_string(),
                    opacity: 0.5,
                    width: 1.0,
                    linecap: "butt".to_string(),
                    linejoin: "miter".to_string(),
                }),
                visibility: "visible".to_string(),
            })],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "DualAlpha".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

        assert!(kt.contains("fillAlpha = 0.8f"), "fillAlpha should be 0.8");
        assert!(kt.contains("strokeAlpha = 0.5f"), "strokeAlpha should be 0.5");
    }

    #[test]
    fn test_group_import_omitted_when_no_meaningful_group() {
        // P2: 纯 path 文档不应包含 group import
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![make_path("M 0 0 L 24 24 Z")],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "NoGroup".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");
        assert!(!kt.contains("import androidx.compose.ui.graphics.vector.group"),
            "group import should be omitted when no meaningful group exists");
    }

    #[test]
    fn test_group_import_present_when_clip_group_exists() {
        // P2: 有 clipPath 的 group 应包含 group import
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![Node::Group(GroupNode {
                opacity: 1.0,
                transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
                clip_path: Some("M 0 0 L 24 0 Z".to_string()),
                children: vec![make_path("M 0 0 L 24 24 Z")],
            })],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "ClipGroup".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");
        assert!(kt.contains("import androidx.compose.ui.graphics.vector.group"),
            "group import should be present when clip group exists");
    }

    #[test]
    fn test_merged_file_shares_imports_and_cache() {
        let doc1 = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![make_path("M 0 0 L 24 24 Z")],
        };
        let doc2 = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![make_path("M 1 1 L 23 23 Z")],
        };
        let entry1 = ManifestEntry {
            svg: "a.svg".to_string(),
            kotlin_name: "IconA".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let entry2 = ManifestEntry {
            svg: "b.svg".to_string(),
            kotlin_name: "IconB".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };

        let icons: Vec<(&SvgDocument, &ManifestEntry)> = vec![(&doc1, &entry1), (&doc2, &entry2)];
        let kt = generate_merged_kotlin_file(&icons, "composeicons.test", "TestIcons");

        // 共享 import（只出现一次）
        assert_eq!(kt.matches("import composeicons.core.parseSvgPathData").count(), 1);
        // HashMap 缓存
        assert!(kt.contains("import java.util.HashMap"));
        assert!(kt.contains("private val _cache = HashMap<String, ImageVector>()"));
        // 两个 icon 的扩展属性都存在
        assert!(kt.contains("val TestIcons.Regular.IconA: ImageVector"));
        assert!(kt.contains("val TestIcons.Regular.IconB: ImageVector"));
        // 使用 _cache 而非 private var
        assert!(kt.contains("_cache[\"IconA\"]"));
        assert!(kt.contains("_cache[\"IconB\"]"));
        // 不应有 private var
        assert!(!kt.contains("private var _"));
    }

    #[test]
    fn test_merged_file_no_group_import_when_all_paths() {
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![make_path("M 0 0 L 24 24 Z")],
        };
        let entry = ManifestEntry {
            svg: "a.svg".to_string(),
            kotlin_name: "PlainIcon".to_string(),
            style_name: "Outline".to_string(),
            subdirectory: "outline".to_string(),
            helper: "lucideIcon".to_string(),
                md5: None,
        };
        let icons: Vec<(&SvgDocument, &ManifestEntry)> = vec![(&doc, &entry)];
        let kt = generate_merged_kotlin_file(&icons, "composeicons.lucide", "LucideIcons");

        assert!(!kt.contains("import androidx.compose.ui.graphics.vector.group"),
            "merged file with no groups should omit group import");
    }

    #[test]
    fn test_template_mode_when_all_paths_share_style() {
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![
                make_path("M 0 0 L 12 12 Z"),
                make_path("M 12 0 L 0 12 Z"),
                make_path("M 6 0 L 6 12 Z"),
            ],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "TemplateIcon".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

        // Template mode: uses addPathData instead of addPath
        assert!(kt.contains("addPathData(\"M 0 0 L 12 12 Z\")"), "Should use addPathData");
        assert!(kt.contains("addPathData(\"M 12 0 L 0 12 Z\")"), "Should use addPathData");
        assert!(!kt.contains("addPath("), "Should not use full addPath");
        assert!(!kt.contains("parseSvgPathData"), "Should not import parseSvgPathData");
        assert!(!kt.contains("SolidColor"), "Should not repeat style attributes");
    }

    #[test]
    fn test_no_template_when_single_path() {
        // Single path: all_paths_same_style returns false (< 2 paths)
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![make_path("M 0 0 L 24 24 Z")],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "SinglePath".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

        // Single path: uses full addPath with parseSvgPathData
        assert!(kt.contains("addPath("), "Single path should use full addPath");
        assert!(kt.contains("parseSvgPathData"), "Should import parseSvgPathData");
    }

    #[test]
    fn test_no_template_when_styles_differ() {
        // Two paths with different stroke widths
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![
                make_path("M 0 0 L 12 12 Z"),
                Node::Path(PathNode {
                    d: "M 12 0 L 0 12 Z".to_string(),
                    transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
                    fill: Some(FillStyle {
                        color: "#000000".to_string(),
                        opacity: 1.0,
                        rule: "nonzero".to_string(),
                    }),
                    stroke: Some(StrokeStyle {
                        color: "#ff0000".to_string(),
                        opacity: 1.0,
                        width: 2.0,
                        linecap: "round".to_string(),
                        linejoin: "round".to_string(),
                    }),
                    visibility: "visible".to_string(),
                }),
            ],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "DiffStyle".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

        // Different styles: uses full addPath per path
        assert!(kt.contains("addPath("), "Different styles should use full addPath");
    }

    #[test]
    fn test_merged_file_group_import_when_any_icon_has_clip() {
        let doc_plain = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![make_path("M 0 0 L 24 24 Z")],
        };
        let doc_clip = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![Node::Group(GroupNode {
                opacity: 1.0,
                transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
                clip_path: Some("M 0 0 L 24 0 Z".to_string()),
                children: vec![make_path("M 0 0 L 24 24 Z")],
            })],
        };
        let entry1 = ManifestEntry {
            svg: "a.svg".to_string(), kotlin_name: "A".to_string(),
            style_name: "Regular".to_string(), subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let entry2 = ManifestEntry {
            svg: "b.svg".to_string(), kotlin_name: "B".to_string(),
            style_name: "Regular".to_string(), subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let icons: Vec<(&SvgDocument, &ManifestEntry)> = vec![
            (&doc_plain, &entry1), (&doc_clip, &entry2),
        ];
        let kt = generate_merged_kotlin_file(&icons, "composeicons.test", "TestIcons");

        assert!(kt.contains("import androidx.compose.ui.graphics.vector.group"),
            "merged file should include group import if any icon uses it");
    }

    // ============================================================
    // T2-06 — helper-level tests for Full vs Template mode decision
    // ============================================================

    fn make_styled_path(d: &str, fill: Option<&str>, stroke: Option<&str>) -> PathNode {
        PathNode {
            d: d.to_string(),
            transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
            fill: fill.map(|c| FillStyle {
                color: c.to_string(),
                opacity: 1.0,
                rule: "nonzero".to_string(),
            }),
            stroke: stroke.map(|c| StrokeStyle {
                color: c.to_string(),
                opacity: 1.0,
                width: 1.0,
                linecap: "butt".to_string(),
                linejoin: "miter".to_string(),
            }),
            visibility: "visible".to_string(),
        }
    }

    fn make_group_node(children: Vec<Node>) -> Node {
        Node::Group(GroupNode {
            opacity: 1.0,
            transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
            clip_path: None,
            children,
        })
    }

    // --- is_flat_paths_only ---

    #[test]
    fn test_helper_is_flat_paths_only_all_paths() {
        let nodes = vec![make_path("M 0 0"), make_path("M 1 1"), make_path("M 2 2")];
        assert!(is_flat_paths_only(&nodes));
    }

    #[test]
    fn test_helper_is_flat_paths_only_with_one_group() {
        let nodes = vec![make_path("M 0 0"), make_group_node(vec![make_path("M 1 1")])];
        assert!(!is_flat_paths_only(&nodes), "any nested group breaks flatness");
    }

    #[test]
    fn test_helper_is_flat_paths_only_empty() {
        // Vacuously true — no nodes means no group violates flatness.
        let nodes: Vec<Node> = vec![];
        assert!(is_flat_paths_only(&nodes));
    }

    #[test]
    fn test_helper_is_flat_paths_only_only_groups() {
        let nodes = vec![make_group_node(vec![]), make_group_node(vec![])];
        assert!(!is_flat_paths_only(&nodes));
    }

    // --- all_paths_same_style ---

    #[test]
    fn test_helper_all_paths_same_style_single_path_returns_false() {
        // Contract: a single path is treated as NOT-template-eligible
        // (Template mode requires ≥2 paths with shared style; otherwise
        // Full mode lets you keep the explicit PathStyle attributes.)
        let path = make_styled_path("M 0 0", Some("#000"), None);
        assert!(!all_paths_same_style(&[&path]));
    }

    #[test]
    fn test_helper_all_paths_same_style_two_identical_fills() {
        let a = make_styled_path("M 0 0", Some("#000"), None);
        let b = make_styled_path("M 1 1", Some("#000"), None);
        assert!(all_paths_same_style(&[&a, &b]));
    }

    #[test]
    fn test_helper_all_paths_same_style_different_fills_returns_false() {
        let a = make_styled_path("M 0 0", Some("#000"), None);
        let b = make_styled_path("M 1 1", Some("#fff"), None);
        assert!(!all_paths_same_style(&[&a, &b]));
    }

    #[test]
    fn test_helper_all_paths_same_style_different_strokes_returns_false() {
        let a = make_styled_path("M 0 0", None, Some("#000"));
        let b = make_styled_path("M 1 1", None, Some("#fff"));
        assert!(!all_paths_same_style(&[&a, &b]));
    }

    #[test]
    fn test_helper_all_paths_same_style_one_fill_one_stroke_returns_false() {
        let a = make_styled_path("M 0 0", Some("#000"), None);
        let b = make_styled_path("M 1 1", None, Some("#000"));
        assert!(!all_paths_same_style(&[&a, &b]));
    }

    #[test]
    fn test_helper_all_paths_same_style_three_identical_paths() {
        let a = make_styled_path("M 0 0", Some("#000"), None);
        let b = make_styled_path("M 1 1", Some("#000"), None);
        let c = make_styled_path("M 2 2", Some("#000"), None);
        assert!(all_paths_same_style(&[&a, &b, &c]));
    }

    // --- extract_style equivalence ---

    #[test]
    fn test_helper_extract_style_no_fill_no_stroke_eq() {
        // Two paths with no fill/stroke must produce equal PathStyle.
        let a = make_styled_path("M 0 0", None, None);
        let b = make_styled_path("M 1 1", None, None);
        assert_eq!(extract_style(&a), extract_style(&b));
    }

    #[test]
    fn test_helper_extract_style_distinct_when_stroke_widths_differ() {
        let a = make_styled_path("M 0 0", None, Some("#000"));
        let mut b_path = make_styled_path("M 1 1", None, Some("#000"));
        if let Some(s) = b_path.stroke.as_mut() {
            s.width = 2.0;
        }
        assert_ne!(extract_style(&a), extract_style(&b_path));
    }

    // --- end-to-end: nested group forces Full mode ---

    #[test]
    fn test_nested_group_forces_full_mode() {
        // Non-flat structure (a group child) prevents template mode.
        let doc = SvgDocument {
            view_box: ViewBox { x: 0.0, y: 0.0, width: 24.0, height: 24.0 },
            nodes: vec![
                make_path("M 0 0 L 12 12 Z"),
                make_group_node(vec![make_path("M 6 0 L 6 12 Z")]),
            ],
        };
        let entry = ManifestEntry {
            svg: "test.svg".to_string(),
            kotlin_name: "GroupedIcon".to_string(),
            style_name: "Regular".to_string(),
            subdirectory: "regular".to_string(),
            helper: "testIcon".to_string(),
                md5: None,
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

        // Full mode: addPath used, no addPathData
        assert!(kt.contains("addPath("), "Nested group forces Full mode (addPath)");
        assert!(!kt.contains("addPathData("), "Template mode must not be selected");
    }
}
