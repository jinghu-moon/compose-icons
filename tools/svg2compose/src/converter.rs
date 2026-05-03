use crate::protocol::*;
use usvg::Tree;

pub fn convert_tree(tree: &Tree) -> SvgDocument {
    let size = tree.size();
    let view_box = ViewBox {
        x: 0.0,
        y: 0.0,
        width: size.width() as f64,
        height: size.height() as f64,
    };

    let root = tree.root();
    let nodes = root.children().iter().filter_map(convert_node).collect();

    SvgDocument { view_box, nodes }
}

fn convert_node(node: &usvg::Node) -> Option<Node> {
    match node {
        usvg::Node::Group(group) => convert_group(group).map(Node::Group),
        usvg::Node::Path(path) => convert_path(path).map(Node::Path),
        _ => None,
    }
}

fn convert_path(path: &usvg::Path) -> Option<PathNode> {
    if !path.is_visible() {
        return None;
    }

    let abs_transform = path.abs_transform();
    let d = path_data_to_string(path.data(), abs_transform);

    let fill = path.fill().map(|f| FillStyle {
        color: color_to_hex(f.paint()),
        opacity: f.opacity().get() as f64,
        rule: match f.rule() {
            usvg::FillRule::NonZero => "nonzero".to_string(),
            usvg::FillRule::EvenOdd => "evenodd".to_string(),
        },
    });

    let stroke = path.stroke().map(|s| StrokeStyle {
        color: color_to_hex(s.paint()),
        opacity: s.opacity().get() as f64,
        width: s.width().get() as f64,
        linecap: match s.linecap() {
            usvg::LineCap::Butt => "butt".to_string(),
            usvg::LineCap::Round => "round".to_string(),
            usvg::LineCap::Square => "square".to_string(),
        },
        linejoin: match s.linejoin() {
            usvg::LineJoin::Miter | usvg::LineJoin::MiterClip => "miter".to_string(),
            usvg::LineJoin::Round => "round".to_string(),
            usvg::LineJoin::Bevel => "bevel".to_string(),
        },
    });

    Some(PathNode {
        d,
        transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0], // baked
        fill,
        stroke,
        visibility: "visible".to_string(),
    })
}

fn convert_group(group: &usvg::Group) -> Option<GroupNode> {
    // 跳过带 mask 的 Group（描边扩展路径）
    if group.mask().is_some() {
        return None;
    }

    let opacity = group.opacity().get() as f64;
    let clip_path = group.clip_path().map(|cp| extract_clip_path_data(cp));
    let children = group.children().iter().filter_map(convert_node).collect();

    Some(GroupNode {
        opacity,
        transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
        clip_path,
        children,
    })
}

fn path_data_to_string(data: &tiny_skia_path::Path, transform: usvg::Transform) -> String {
    let mut result = String::new();
    let mut points_iter = data.points().iter();

    for verb in data.verbs() {
        match verb {
            tiny_skia_path::PathVerb::Move => {
                let p = points_iter.next().unwrap();
                let (x, y) = apply_transform(p.x, p.y, &transform);
                result.push_str(&format!("M {:.3} {:.3}", x, y));
            }
            tiny_skia_path::PathVerb::Line => {
                let p = points_iter.next().unwrap();
                let (x, y) = apply_transform(p.x, p.y, &transform);
                result.push_str(&format!(" L {:.3} {:.3}", x, y));
            }
            tiny_skia_path::PathVerb::Quad => {
                let p1 = points_iter.next().unwrap();
                let p2 = points_iter.next().unwrap();
                let (x1, y1) = apply_transform(p1.x, p1.y, &transform);
                let (x2, y2) = apply_transform(p2.x, p2.y, &transform);
                result.push_str(&format!(" Q {:.3} {:.3} {:.3} {:.3}", x1, y1, x2, y2));
            }
            tiny_skia_path::PathVerb::Cubic => {
                let p1 = points_iter.next().unwrap();
                let p2 = points_iter.next().unwrap();
                let p3 = points_iter.next().unwrap();
                let (x1, y1) = apply_transform(p1.x, p1.y, &transform);
                let (x2, y2) = apply_transform(p2.x, p2.y, &transform);
                let (x3, y3) = apply_transform(p3.x, p3.y, &transform);
                result.push_str(&format!(
                    " C {:.3} {:.3} {:.3} {:.3} {:.3} {:.3}",
                    x1, y1, x2, y2, x3, y3
                ));
            }
            tiny_skia_path::PathVerb::Close => {
                result.push_str(" Z");
            }
        }
    }

    result
}

fn apply_transform(x: f32, y: f32, t: &usvg::Transform) -> (f64, f64) {
    let new_x = t.sx * x + t.kx * y + t.tx;
    let new_y = t.ky * x + t.sy * y + t.ty;
    (new_x as f64, new_y as f64)
}

fn color_to_hex(paint: &usvg::Paint) -> String {
    match paint {
        usvg::Paint::Color(c) => format!("#{:02x}{:02x}{:02x}", c.red, c.green, c.blue),
        _ => "#000000".to_string(),
    }
}

fn extract_clip_path_data(clip: &usvg::ClipPath) -> String {
    let mut paths = String::new();
    for node in clip.root().children() {
        if let usvg::Node::Path(path) = node {
            let d = path_data_to_string(path.data(), path.abs_transform());
            if !paths.is_empty() {
                paths.push(' ');
            }
            paths.push_str(&d);
        }
    }
    paths
}

#[cfg(test)]
mod tests {
    use super::*;

    fn load_fixture(name: &str) -> String {
        std::fs::read_to_string(format!("tests/fixtures/{}", name))
            .unwrap_or_else(|e| panic!("Failed to load fixture {}: {}", name, e))
    }

    #[test]
    fn test_single_path_converts_to_path_node() {
        let svg = load_fixture("single_path.svg");
        let tree = Tree::from_str(&svg, &usvg::Options::default()).unwrap();
        let doc = convert_tree(&tree);

        assert_eq!(doc.nodes.len(), 1);
        match &doc.nodes[0] {
            Node::Path(p) => {
                assert!(p.d.starts_with('M'));
                assert!(p.d.contains('Z'));
                assert!(p.fill.is_some());
                assert_eq!(p.fill.as_ref().unwrap().color, "#000000");
            }
            _ => panic!("Expected Path node"),
        }
    }

    #[test]
    fn test_path_with_g_transform_bakes_into_coordinates() {
        let svg = load_fixture("path_with_transform.svg");
        let tree = Tree::from_str(&svg, &usvg::Options::default()).unwrap();
        let doc = convert_tree(&tree);

        assert_eq!(doc.nodes.len(), 1);
        match &doc.nodes[0] {
            Node::Group(g) => {
                assert_eq!(g.children.len(), 1);
                match &g.children[0] {
                    Node::Path(p) => {
                        // transform 应为单位矩阵（已 bake）
                        assert_eq!(p.transform, [1.0, 0.0, 0.0, 1.0, 0.0, 0.0]);
                        // rotate(-180 7.5 7.5) applied to M 1 1 -> M 14 14
                        assert!(p.d.contains("14.000"));
                    }
                    _ => panic!("Expected Path node"),
                }
            }
            _ => panic!("Expected Group node"),
        }
    }

    #[test]
    fn test_group_with_clip_path_extracts_clip_data() {
        let svg = load_fixture("group_with_clip.svg");
        let tree = Tree::from_str(&svg, &usvg::Options::default()).unwrap();
        let doc = convert_tree(&tree);

        assert_eq!(doc.nodes.len(), 1);
        match &doc.nodes[0] {
            Node::Group(g) => {
                assert!((g.opacity - 0.5).abs() < 0.01);
                assert!(g.clip_path.is_some());
                assert!(g.clip_path.as_ref().unwrap().starts_with('M'));
                assert_eq!(g.children.len(), 1);
            }
            _ => panic!("Expected Group node"),
        }
    }

    #[test]
    fn test_nested_group_children_converted_recursively() {
        let svg = r#"<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
            <g opacity="0.8">
                <g opacity="0.5">
                    <path d="M 0 0 L 24 24 Z"/>
                </g>
            </g>
        </svg>"#;
        let tree = Tree::from_str(svg, &usvg::Options::default()).unwrap();
        let doc = convert_tree(&tree);

        assert_eq!(doc.nodes.len(), 1);
        match &doc.nodes[0] {
            Node::Group(outer) => {
                assert_eq!(outer.children.len(), 1);
                match &outer.children[0] {
                    Node::Group(inner) => {
                        assert_eq!(inner.children.len(), 1);
                    }
                    _ => panic!("Expected inner Group"),
                }
            }
            _ => panic!("Expected outer Group"),
        }
    }

    #[test]
    fn test_mask_constrained_group_is_skipped() {
        let svg = load_fixture("mask_panel.svg");
        let tree = Tree::from_str(&svg, &usvg::Options::default()).unwrap();
        let doc = convert_tree(&tree);

        // 只有 1 个 Path 节点（填充层），被 mask 约束的 Group 已被跳过
        assert_eq!(doc.nodes.len(), 1);
        match &doc.nodes[0] {
            Node::Path(p) => {
                assert!(!p.d.contains("-5.000")); // 扩展路径已被过滤
            }
            _ => panic!("Expected Path node"),
        }
    }
}
