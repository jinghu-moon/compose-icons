use serde::{Deserialize, Serialize};
use std::collections::BTreeMap;
use std::path::PathBuf;

#[derive(Debug, Deserialize)]
pub struct Manifest {
    pub base_package: String,
    pub icon_container: String,
    pub icons: Vec<ManifestEntry>,
}

#[derive(Debug, Clone, Deserialize)]
pub struct ManifestEntry {
    pub svg: String,
    pub kotlin_name: String,
    pub style_name: String,
    pub subdirectory: String,
    pub helper: String,
    /// MD5 hash of the SVG file content, passed by the generator for cache lookup.
    /// When present + cache enabled, Rust can skip re-parsing unchanged SVGs.
    #[serde(default)]
    pub md5: Option<String>,
}

/// ViewBox info returned per successfully processed icon.
#[derive(Debug, Serialize)]
pub struct ResultViewBox {
    pub min_x: f64,
    pub min_y: f64,
    pub width: f64,
    pub height: f64,
}

/// Path data for web-preview rendering.
#[derive(Debug, Serialize)]
pub struct ResultPathNode {
    pub d: String,
    pub fill: Option<String>,
    pub stroke: Option<String>,
    pub stroke_width: Option<f64>,
    pub stroke_line_cap: Option<String>,
    pub stroke_line_join: Option<String>,
    pub fill_rule: Option<String>,
    pub alpha: f64,
}

/// Complete icon result with viewBox and paths.
#[derive(Debug, Serialize)]
pub struct IconResult {
    pub view_box: ResultViewBox,
    pub paths: Vec<ResultPathNode>,
}

/// Key = "subdirectory/kotlinName", Value = icon result.
pub type ManifestResult = BTreeMap<String, IconResult>;

impl Manifest {
    pub fn load(path: &str) -> Result<Self, Box<dyn std::error::Error>> {
        let text = std::fs::read_to_string(path)?;
        let manifest: Manifest = serde_json::from_str(&text)?;
        Ok(manifest)
    }

    /// Group entries by (svg_dir) for efficient file discovery.
    pub fn svg_base_dir(&self) -> Option<PathBuf> {
        self.icons.first().map(|e| {
            let p = PathBuf::from(&e.svg);
            p.parent().map(|p| p.to_path_buf()).unwrap_or_default()
        })
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_manifest_deserializes() {
        let json = r#"{
            "base_package": "composeicons.radix",
            "icon_container": "RadixIcons",
            "icons": [
                {
                    "svg": "refer/Radix/icons/accessibility.svg",
                    "kotlin_name": "Accessibility",
                    "style_name": "Regular",
                    "subdirectory": "regular",
                    "helper": "radixIcon"
                }
            ]
        }"#;
        let manifest: Manifest = serde_json::from_str(json).unwrap();
        assert_eq!(manifest.base_package, "composeicons.radix");
        assert_eq!(manifest.icons.len(), 1);
        assert_eq!(manifest.icons[0].kotlin_name, "Accessibility");
    }
}
