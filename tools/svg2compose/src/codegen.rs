use crate::manifest::ManifestEntry;
use crate::protocol::{GroupNode, Node, PathNode, SvgDocument};

/// Generate a complete .kt file for one icon.
pub fn generate_kotlin_file(doc: &SvgDocument, entry: &ManifestEntry, base_package: &str, icon_container: &str) -> String {
    let mut out = String::with_capacity(2048);

    let package = format!("{}.{}", base_package, entry.subdirectory);
    let style_cap = capitalize(&entry.style_name);
    let property_host = format!("{}.{}", icon_container, style_cap);
    let vector_name = lower_first(&entry.kotlin_name);

    let max_dim = doc.view_box.width.max(doc.view_box.height);
    let width_dp = format_dp(24.0 / max_dim * doc.view_box.width);
    let height_dp = format_dp(24.0 / max_dim * doc.view_box.height);

    // package
    out.push_str(&format!("package {}\n\n", package));

    // imports
    out.push_str("import androidx.compose.ui.graphics.*\n");
    out.push_str("import androidx.compose.ui.graphics.vector.ImageVector\n");
    out.push_str("import androidx.compose.ui.unit.dp\n");
    out.push_str("import composeicons.core.IconSize\n");
    out.push_str("import composeicons.core.ViewBox\n");
    out.push_str("import composeicons.core.parseSvgPathData\n");
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
        generate_node(&mut out, node, 3);
    }

    out.push_str("        }\n");
    out.push_str(&format!("        return _{}!!\n", vector_name));
    out.push_str("    }\n");
    out.push('\n');
    out.push_str(&format!("private var _{}: ImageVector? = null\n", vector_name));

    out
}

fn generate_node(out: &mut String, node: &Node, indent: usize) {
    match node {
        Node::Path(path) => generate_path(out, path, indent),
        Node::Group(group) => generate_group(out, group, indent),
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
    let alpha = path
        .fill
        .as_ref()
        .map(|f| f.opacity)
        .or_else(|| path.stroke.as_ref().map(|s| s.opacity))
        .unwrap_or(1.0);

    out.push_str(&format!("{}addPath(\n", pad));
    out.push_str(&format!("{}    pathData = parseSvgPathData(\"{}\"),\n", pad, path.d));
    out.push_str(&format!("{}    pathFillType = {},\n", pad, fill_type));
    out.push_str(&format!("{}    fill = {},\n", pad, fill_brush));
    out.push_str(&format!("{}    fillAlpha = {}f,\n", pad, format_float(alpha)));
    out.push_str(&format!("{}    stroke = {},\n", pad, stroke_brush));
    out.push_str(&format!("{}    strokeAlpha = {}f,\n", pad, format_float(alpha)));
    out.push_str(&format!(
        "{}    strokeLineWidth = {}f,\n",
        pad,
        format_float(stroke_width)
    ));
    out.push_str(&format!("{}    strokeLineCap = {},\n", pad, stroke_cap));
    out.push_str(&format!("{}    strokeLineJoin = {},\n", pad, stroke_join));
    out.push_str(&format!("{})\n", pad));
}

fn generate_group(out: &mut String, group: &GroupNode, indent: usize) {
    let pad = "    ".repeat(indent);

    out.push_str(&format!("{}group(\n", pad));
    if let Some(ref clip) = group.clip_path {
        out.push_str(&format!(
            "{}    clipPathData = parseSvgPathData(\"{}\"),\n",
            pad, clip
        ));
    }
    if (group.opacity - 1.0).abs() > f64::EPSILON {
        out.push_str(&format!(
            "{}    groupAlpha = {}f,\n",
            pad,
            format_float(group.opacity)
        ));
    }
    out.push_str(&format!("{}) {{\n", pad));

    for child in &group.children {
        generate_node(out, child, indent + 1);
    }

    out.push_str(&format!("{}}}\n", pad));
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
    use crate::protocol::{FillStyle, ViewBox};

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
                opacity: 0.5,
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
        };
        let kt = generate_kotlin_file(&doc, &entry, "composeicons.test", "TestIcons");

        assert!(kt.contains("group("));
        assert!(kt.contains("clipPathData = parseSvgPathData(\"M 0 0 L 24 0 L 24 24 Z\")"));
        assert!(kt.contains("groupAlpha = 0.5f"));
    }

    #[test]
    fn test_format_float() {
        assert_eq!(format_float(15.0), "15");
        assert_eq!(format_float(0.5), "0.5");
        assert_eq!(format_float(1.234567), "1.235");
    }
}
