use crate::compact::{compact_path, RawCommand};
use crate::protocol::*;
use usvg::Tree;

pub fn convert_tree(tree: &Tree, normalize_size: Option<f64>) -> SvgDocument {
    let size = tree.size();
    let mut view_box = ViewBox {
        x: 0.0,
        y: 0.0,
        width: size.width() as f64,
        height: size.height() as f64,
    };

    let mut global_scale = 1.0;
    if let Some(target_size) = normalize_size {
        let max_dim = view_box.width.max(view_box.height);
        if (max_dim - target_size).abs() > f64::EPSILON {
            global_scale = target_size / max_dim;
            view_box.width *= global_scale;
            view_box.height *= global_scale;
        }
    }

    let root = tree.root();
    let nodes = root.children().iter().filter_map(|n| convert_node(n, global_scale)).collect();
    let merged_nodes = merge_nodes(nodes);

    SvgDocument { view_box, nodes: merged_nodes }
}

fn convert_node(node: &usvg::Node, scale: f64) -> Option<Node> {
    match node {
        usvg::Node::Group(group) => convert_group(group, scale).map(Node::Group),
        usvg::Node::Path(path) => convert_path(path, scale).map(Node::Path),
        _ => None,
    }
}

fn convert_path(path: &usvg::Path, scale: f64) -> Option<PathNode> {
    if !path.is_visible() {
        return None;
    }

    let mut abs_transform = path.abs_transform();
    if (scale - 1.0).abs() > f64::EPSILON {
        abs_transform.sx *= scale as f32;
        abs_transform.sy *= scale as f32;
        abs_transform.tx *= scale as f32;
        abs_transform.ty *= scale as f32;
    }
    let d = compact_path(&path_to_commands(path.data(), abs_transform));

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
        width: s.width().get() as f64 * scale,
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

fn convert_group(group: &usvg::Group, scale: f64) -> Option<GroupNode> {
    // 跳过带 mask 的 Group（描边扩展路径）
    if group.mask().is_some() {
        return None;
    }

    let opacity = group.opacity().get() as f64;
    let clip_path = group.clip_path().map(extract_clip_path_data);

    // Compose ImageVector.Builder.group() 不支持 alpha 参数。
    // 将 group opacity bake 到子节点的 fill/stroke opacity 中。
    let children: Vec<Node> = group
        .children()
        .iter()
        .filter_map(|node| convert_node_with_opacity(node, opacity, scale))
        .collect();
    let merged_children = merge_nodes(children);

    // bake 后 group 自身 opacity 重置为 1.0
    Some(GroupNode {
        opacity: 1.0,
        transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
        clip_path,
        children: merged_children,
    })
}

fn convert_node_with_opacity(node: &usvg::Node, group_opacity: f64, scale: f64) -> Option<Node> {
    match node {
        usvg::Node::Group(g) => {
            // 递归：嵌套 group 的 opacity 相乘
            let inner_opacity = g.opacity().get() as f64 * group_opacity;
            let clip_path = g.clip_path().map(extract_clip_path_data);
            if g.mask().is_some() {
                return None;
            }
            let children: Vec<Node> = g
                .children()
                .iter()
                .filter_map(|n| convert_node_with_opacity(n, inner_opacity, scale))
                .collect();
            let merged_children = merge_nodes(children);
            Some(Node::Group(GroupNode {
                opacity: 1.0,
                transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
                clip_path,
                children: merged_children,
            }))
        }
        usvg::Node::Path(p) => convert_path_with_opacity(p, group_opacity, scale).map(Node::Path),
        _ => None,
    }
}

fn convert_path_with_opacity(path: &usvg::Path, group_opacity: f64, scale: f64) -> Option<PathNode> {
    if !path.is_visible() {
        return None;
    }

    let mut abs_transform = path.abs_transform();
    if (scale - 1.0).abs() > f64::EPSILON {
        abs_transform.sx *= scale as f32;
        abs_transform.sy *= scale as f32;
        abs_transform.tx *= scale as f32;
        abs_transform.ty *= scale as f32;
    }
    let d = compact_path(&path_to_commands(path.data(), abs_transform));

    let fill = path.fill().map(|f| {
        let base_opacity = f.opacity().get() as f64;
        FillStyle {
            color: color_to_hex(f.paint()),
            opacity: base_opacity * group_opacity,
            rule: match f.rule() {
                usvg::FillRule::NonZero => "nonzero".to_string(),
                usvg::FillRule::EvenOdd => "evenodd".to_string(),
            },
        }
    });

    let stroke = path.stroke().map(|s| {
        let base_opacity = s.opacity().get() as f64;
        StrokeStyle {
            color: color_to_hex(s.paint()),
            opacity: base_opacity * group_opacity,
            width: s.width().get() as f64 * scale,
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
        }
    });

    Some(PathNode {
        d,
        transform: [1.0, 0.0, 0.0, 1.0, 0.0, 0.0],
        fill,
        stroke,
        visibility: "visible".to_string(),
    })
}

/// Merge consecutive Path nodes with identical styles.
fn merge_nodes(nodes: Vec<Node>) -> Vec<Node> {
    if nodes.len() < 2 {
        return nodes;
    }

    let mut result = Vec::new();
    let mut iter = nodes.into_iter();

    if let Some(mut current) = iter.next() {
        for next in iter {
            match (&mut current, &next) {
                (Node::Path(p1), Node::Path(p2)) => {
                    // Check if styles match exactly
                    if p1.fill == p2.fill && 
                       p1.stroke == p2.stroke && 
                       p1.visibility == p2.visibility &&
                       p1.transform == p2.transform 
                    {
                        // Merge them
                        if !p1.d.is_empty() && !p2.d.is_empty() {
                            p1.d.push(' ');
                        }
                        p1.d.push_str(&p2.d);
                    } else {
                        result.push(current);
                        current = next;
                    }
                }
                _ => {
                    result.push(current);
                    current = next;
                }
            }
        }
        result.push(current);
    }

    result
}

/// Convert tiny-skia-path verbs+points directly to RawCommand list.
/// Bypasses string representation, avoiding token concatenation bugs.
fn path_to_commands(data: &tiny_skia_path::Path, transform: usvg::Transform) -> Vec<RawCommand> {
    let mut cmds = Vec::new();
    let mut points_iter = data.points().iter();

    for verb in data.verbs() {
        match verb {
            tiny_skia_path::PathVerb::Move => {
                let p = points_iter.next().unwrap();
                let (x, y) = apply_transform(p.x, p.y, &transform);
                cmds.push(RawCommand::M { x, y });
            }
            tiny_skia_path::PathVerb::Line => {
                let p = points_iter.next().unwrap();
                let (x, y) = apply_transform(p.x, p.y, &transform);
                cmds.push(RawCommand::L { x, y });
            }
            tiny_skia_path::PathVerb::Quad => {
                let p1 = points_iter.next().unwrap();
                let p2 = points_iter.next().unwrap();
                let (x1, y1) = apply_transform(p1.x, p1.y, &transform);
                let (x2, y2) = apply_transform(p2.x, p2.y, &transform);
                cmds.push(RawCommand::Q { x1, y1, x: x2, y: y2 });
            }
            tiny_skia_path::PathVerb::Cubic => {
                let p1 = points_iter.next().unwrap();
                let p2 = points_iter.next().unwrap();
                let p3 = points_iter.next().unwrap();
                let (x1, y1) = apply_transform(p1.x, p1.y, &transform);
                let (x2, y2) = apply_transform(p2.x, p2.y, &transform);
                let (x3, y3) = apply_transform(p3.x, p3.y, &transform);
                cmds.push(RawCommand::C { x1, y1, x2, y2, x: x3, y: y3 });
            }
            tiny_skia_path::PathVerb::Close => {
                cmds.push(RawCommand::Z);
            }
        }
    }

    cmds
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
            let d = compact_path(&path_to_commands(path.data(), path.abs_transform()));
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
        let doc = convert_tree(&tree, None);

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
        let doc = convert_tree(&tree, None);

        assert_eq!(doc.nodes.len(), 1);
        match &doc.nodes[0] {
            Node::Group(g) => {
                assert_eq!(g.children.len(), 1);
                match &g.children[0] {
                    Node::Path(p) => {
                        // transform 应为单位矩阵（已 bake）
                        assert_eq!(p.transform, [1.0, 0.0, 0.0, 1.0, 0.0, 0.0]);
                        // rotate(-180 7.5 7.5) applied to M 1 1 -> M 14 14
                        // compact_path strips trailing zeros, so "14.000" → "14"
                        assert!(p.d.contains("14"));
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
        let doc = convert_tree(&tree, None);

        assert_eq!(doc.nodes.len(), 1);
        match &doc.nodes[0] {
            Node::Group(g) => {
                // group opacity 已 bake 到子 path，自身重置为 1.0
                assert!((g.opacity - 1.0).abs() < 0.01);
                assert!(g.clip_path.is_some());
                assert!(g.clip_path.as_ref().unwrap().starts_with('M'));
                assert_eq!(g.children.len(), 1);
                // 子 path 的 fill opacity 应包含 group opacity (0.5)
                match &g.children[0] {
                    Node::Path(p) => {
                        let fill = p.fill.as_ref().unwrap();
                        assert!((fill.opacity - 0.5).abs() < 0.01,
                            "group opacity 0.5 should be baked into fill opacity, got {}", fill.opacity);
                    }
                    _ => panic!("Expected Path child"),
                }
            }
            _ => panic!("Expected Group node"),
        }
    }

    #[test]
    fn test_nested_group_opacity_multiplies() {
        let svg = r##"<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
            <g opacity="0.8">
                <g opacity="0.5">
                    <path d="M 0 0 L 24 24 Z" fill="#000"/>
                </g>
            </g>
        </svg>"##;
        let tree = Tree::from_str(svg, &usvg::Options::default()).unwrap();
        let doc = convert_tree(&tree, None);

        // 两层 group 均无 clipPath，应被 codegen 扁平化（但 converter 层仍保留结构）
        assert_eq!(doc.nodes.len(), 1);
        match &doc.nodes[0] {
            Node::Group(outer) => {
                // 外层 group opacity 已 bake
                assert!((outer.opacity - 1.0).abs() < 0.01);
                assert_eq!(outer.children.len(), 1);
                match &outer.children[0] {
                    Node::Group(inner) => {
                        assert!((inner.opacity - 1.0).abs() < 0.01);
                        assert_eq!(inner.children.len(), 1);
                        // 最终 path 的 fill opacity = 0.8 * 0.5 * 1.0 = 0.4
                        match &inner.children[0] {
                            Node::Path(p) => {
                                let fill = p.fill.as_ref().unwrap();
                                assert!((fill.opacity - 0.4).abs() < 0.01,
                                    "nested opacity should be 0.8*0.5=0.4, got {}", fill.opacity);
                            }
                            _ => panic!("Expected Path"),
                        }
                    }
                    _ => panic!("Expected inner Group"),
                }
            }
            _ => panic!("Expected outer Group"),
        }
    }

    #[test]
    fn test_normalize_15x15_to_24x24() {
        let svg = r##"<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 15 15">
            <path d="M 0 0 L 15 15 Z" fill="#000000"/>
        </svg>"##;

        let tree = Tree::from_str(svg, &usvg::Options::default()).unwrap();

        // Without normalization
        let doc_no_normalize = convert_tree(&tree, None);
        assert_eq!(doc_no_normalize.view_box.width, 15.0);
        assert_eq!(doc_no_normalize.view_box.height, 15.0);

        // With normalization to 24.0
        let doc_normalized = convert_tree(&tree, Some(24.0));
        assert_eq!(doc_normalized.view_box.width, 24.0);
        assert_eq!(doc_normalized.view_box.height, 24.0);
    }

    #[test]
    fn test_mask_constrained_group_is_skipped() {
        let svg = load_fixture("mask_panel.svg");
        let tree = Tree::from_str(&svg, &usvg::Options::default()).unwrap();
        let doc = convert_tree(&tree, None);

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
