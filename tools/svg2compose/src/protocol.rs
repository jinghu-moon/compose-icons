use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq)]
pub struct SvgDocument {
    pub view_box: ViewBox,
    pub nodes: Vec<Node>,
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq)]
pub struct ViewBox {
    pub x: f64,
    pub y: f64,
    pub width: f64,
    pub height: f64,
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq)]
#[serde(tag = "type")]
pub enum Node {
    #[serde(rename = "path")]
    Path(PathNode),
    #[serde(rename = "group")]
    Group(GroupNode),
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq)]
pub struct PathNode {
    pub d: String,
    #[serde(default = "default_transform")]
    pub transform: [f64; 6],
    pub fill: Option<FillStyle>,
    pub stroke: Option<StrokeStyle>,
    #[serde(default)]
    pub visibility: String,
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq)]
pub struct GroupNode {
    #[serde(default = "default_opacity")]
    pub opacity: f64,
    #[serde(default = "default_transform")]
    pub transform: [f64; 6],
    #[serde(skip_serializing_if = "Option::is_none")]
    pub clip_path: Option<String>,
    pub children: Vec<Node>,
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq)]
pub struct FillStyle {
    pub color: String,
    #[serde(default = "default_opacity")]
    pub opacity: f64,
    #[serde(default = "default_fill_rule")]
    pub rule: String,
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq)]
pub struct StrokeStyle {
    pub color: String,
    #[serde(default = "default_opacity")]
    pub opacity: f64,
    #[serde(default = "default_stroke_width")]
    pub width: f64,
    #[serde(default = "default_linecap")]
    pub linecap: String,
    #[serde(default = "default_linejoin")]
    pub linejoin: String,
}

fn default_transform() -> [f64; 6] {
    [1.0, 0.0, 0.0, 1.0, 0.0, 0.0]
}

fn default_opacity() -> f64 {
    1.0
}

fn default_fill_rule() -> String {
    "nonzero".to_string()
}

fn default_stroke_width() -> f64 {
    1.0
}

fn default_linecap() -> String {
    "butt".to_string()
}

fn default_linejoin() -> String {
    "miter".to_string()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_path_node_serializes_to_expected_json() {
        let node = Node::Path(PathNode {
            d: "M 0 0 L 10 10 Z".to_string(),
            transform: default_transform(),
            fill: Some(FillStyle {
                color: "#000000".to_string(),
                opacity: 1.0,
                rule: "nonzero".to_string(),
            }),
            stroke: None,
            visibility: "visible".to_string(),
        });
        let json = serde_json::to_string(&node).unwrap();
        assert!(json.contains(r#""type":"path"#));
        assert!(json.contains(r#""d":"M 0 0 L 10 10 Z"#));
    }

    #[test]
    fn test_group_node_with_clip_path_serializes() {
        let node = Node::Group(GroupNode {
            opacity: 0.5,
            transform: default_transform(),
            clip_path: Some("M 0 0 L 10 0 L 10 10 Z".to_string()),
            children: vec![],
        });
        let json = serde_json::to_string(&node).unwrap();
        assert!(json.contains(r#""type":"group"#));
        assert!(json.contains(r#""clip_path":"M 0 0 L 10 0 L 10 10 Z"#));
    }

    #[test]
    fn test_fill_rule_nonzero_serializes() {
        let fill = FillStyle {
            color: "#ff0000".to_string(),
            opacity: 0.8,
            rule: "nonzero".to_string(),
        };
        let json = serde_json::to_string(&fill).unwrap();
        assert!(json.contains(r#""rule":"nonzero"#));
    }
}
