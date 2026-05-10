use std::collections::HashMap;

use crate::manifest::ManifestEntry;
use crate::protocol::Node;

/// A group of styles that share identical pathData sequences.
#[derive(Debug, Clone, PartialEq)]
pub struct SharedGroup {
    /// The styles in this group (e.g., ["Thin", "Light", "Regular", "Bold"]).
    pub styles: Vec<String>,
    /// The shared pathData strings (one per path in the icon).
    pub paths: Vec<String>,
}

/// Result of deduplication for a single icon name.
#[derive(Debug, Clone, PartialEq)]
pub struct IconDedupResult {
    /// The icon name (e.g., "Heart").
    pub icon_name: String,
    /// Shared path groups. Each group has identical pathData across its styles.
    /// If all styles share the same paths, there's exactly one group.
    pub groups: Vec<SharedGroup>,
}

/// A reference to a shared path constant for codegen.
#[derive(Debug, Clone, PartialEq)]
pub struct SharedPathRef {
    /// The constant name (e.g., "_heartPath0" or "_heartPath1_groupA").
    pub const_name: String,
    /// The pathData string value.
    pub path_data: String,
}

/// Maps (icon_name, style_name, path_index) → SharedPathRef.
pub type SharedPathLookup = HashMap<(String, String, usize), SharedPathRef>;

/// Extract all pathData strings from a SvgDocument's node tree (flattened, in order).
pub fn extract_path_data(nodes: &[Node]) -> Vec<String> {
    let mut paths = Vec::new();
    collect_path_data_recursive(nodes, &mut paths);
    paths
}

fn collect_path_data_recursive(nodes: &[Node], out: &mut Vec<String>) {
    for node in nodes {
        match node {
            Node::Path(p) => out.push(p.d.clone()),
            Node::Group(g) => collect_path_data_recursive(&g.children, out),
        }
    }
}

/// Core deduplication engine.
///
/// Takes a list of (ManifestEntry, pathData_sequence) pairs and produces
/// deduplication results grouped by icon name.
///
/// **Determinism contract**: output is sorted by `icon_name` so that running
/// the engine twice on the same input — or on the same input in any order —
/// produces byte-identical results. This is required for downstream MD5-based
/// incremental caching in `GeneratorEngine`.
pub fn dedup_entries(entries: &[(ManifestEntry, Vec<String>)]) -> Vec<IconDedupResult> {
    // Group by icon name
    let mut grouped: HashMap<String, Vec<(&ManifestEntry, &Vec<String>)>> = HashMap::new();
    for (entry, paths) in entries {
        grouped
            .entry(entry.kotlin_name.clone())
            .or_default()
            .push((entry, paths));
    }

    let mut results = Vec::new();

    for (icon_name, style_entries) in &grouped {
        let groups = find_shared_groups(style_entries);
        results.push(IconDedupResult {
            icon_name: icon_name.clone(),
            groups,
        });
    }

    // Determinism: sort output by icon_name so HashMap iteration order
    // does not leak into the result vector.
    results.sort_by(|a, b| a.icon_name.cmp(&b.icon_name));
    results
}

/// Find shared groups among styles for a single icon.
///
/// Strategy:
/// 1. If all styles have identical pathData → one shared group
/// 2. If some paths are shared across subsets → partial sharing
/// 3. If nothing is shared → each style is its own group
fn find_shared_groups(style_entries: &[(&ManifestEntry, &Vec<String>)]) -> Vec<SharedGroup> {
    if style_entries.len() <= 1 {
        // Single style — nothing to deduplicate
        return style_entries
            .iter()
            .map(|(entry, paths)| SharedGroup {
                styles: vec![entry.style_name.clone()],
                paths: paths.to_vec(),
            })
            .collect();
    }

    // Check if all styles have identical pathData
    let first_paths = style_entries[0].1;
    let all_same = style_entries
        .iter()
        .all(|(_, paths)| paths_equal(paths, first_paths));

    if all_same {
        // All styles share the same paths — one group.
        // Sort styles for output determinism (T2-01).
        let mut styles: Vec<String> = style_entries
            .iter()
            .map(|(e, _)| e.style_name.clone())
            .collect();
        styles.sort();
        return vec![SharedGroup {
            styles,
            paths: first_paths.clone(),
        }];
    }

    // Partial sharing: group styles by their pathData sequence
    let mut path_to_styles: HashMap<String, Vec<String>> = HashMap::new();
    for (entry, paths) in style_entries {
        let key = paths.join("\x00"); // use null byte as separator for uniqueness
        path_to_styles
            .entry(key)
            .or_default()
            .push(entry.style_name.clone());
    }

    // Each unique pathData sequence becomes a group.
    // Sort styles within each group for determinism (T2-01).
    let mut groups: Vec<SharedGroup> = path_to_styles
        .into_iter()
        .map(|(key, mut styles)| {
            styles.sort();
            let paths: Vec<String> = key.split('\x00').map(|s| s.to_string()).collect();
            SharedGroup { styles, paths }
        })
        .collect();

    // Sort by group size (largest first) for deterministic output
    groups.sort_by(|a, b| b.styles.len().cmp(&a.styles.len()).then(a.styles[0].cmp(&b.styles[0])));

    groups
}

/// Compare two pathData sequences for equality (element-wise string comparison).
pub fn paths_equal(a: &[String], b: &[String]) -> bool {
    a.len() == b.len() && a.iter().zip(b.iter()).all(|(x, y)| x == y)
}

/// Build a lookup table from dedup results for codegen use.
///
/// For each (icon_name, style, path_index), maps to the shared constant reference.
pub fn build_lookup(results: &[IconDedupResult]) -> SharedPathLookup {
    let mut lookup = SharedPathLookup::new();

    for result in results {
        let multi_group = result.groups.len() > 1;

        for (group_idx, group) in result.groups.iter().enumerate() {
            for (path_idx, path_data) in group.paths.iter().enumerate() {
                let const_name = if multi_group {
                    // Multiple groups — suffix with group letter
                    let letter = (b'A' + group_idx as u8) as char;
                    format!(
                        "_{}Path{}_group{}",
                        lower_first(&result.icon_name),
                        path_idx,
                        letter
                    )
                } else {
                    // Single group — no suffix
                    format!("_{}Path{}", lower_first(&result.icon_name), path_idx)
                };

                let shared_ref = SharedPathRef {
                    const_name,
                    path_data: path_data.clone(),
                };

                for style in &group.styles {
                    lookup.insert(
                        (result.icon_name.clone(), style.clone(), path_idx),
                        shared_ref.clone(),
                    );
                }
            }
        }
    }

    lookup
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

    fn make_entry(kotlin_name: &str, style_name: &str) -> ManifestEntry {
        ManifestEntry {
            svg: format!("{}.svg", kotlin_name),
            kotlin_name: kotlin_name.to_string(),
            style_name: style_name.to_string(),
            subdirectory: style_name.to_lowercase(),
            helper: format!("phosphor{}Icon", style_name),
                md5: None,
        }
    }

    fn make_paths(data: &[&str]) -> Vec<String> {
        data.iter().map(|s| s.to_string()).collect()
    }

    // --- Task 1.5: 6 weights, all identical → 1 shared group ---
    #[test]
    fn test_all_six_weights_identical() {
        let entries = vec![
            (make_entry("Heart", "Thin"), make_paths(&["M12 21.35", "M5 12"])),
            (make_entry("Heart", "Light"), make_paths(&["M12 21.35", "M5 12"])),
            (make_entry("Heart", "Regular"), make_paths(&["M12 21.35", "M5 12"])),
            (make_entry("Heart", "Bold"), make_paths(&["M12 21.35", "M5 12"])),
            (make_entry("Heart", "Fill"), make_paths(&["M12 21.35", "M5 12"])),
            (make_entry("Heart", "Duotone"), make_paths(&["M12 21.35", "M5 12"])),
        ];

        let results = dedup_entries(&entries);
        assert_eq!(results.len(), 1);

        let heart = &results[0];
        assert_eq!(heart.icon_name, "Heart");
        assert_eq!(heart.groups.len(), 1, "All 6 weights should be in 1 shared group");
        assert_eq!(heart.groups[0].styles.len(), 6);
        assert_eq!(heart.groups[0].paths, make_paths(&["M12 21.35", "M5 12"]));
    }

    // --- Task 1.6: 4 identical + 2 different → partial sharing ---
    #[test]
    fn test_partial_sharing_four_and_two() {
        let entries = vec![
            (make_entry("Heart", "Thin"), make_paths(&["M12 21.35", "M5 12", "M9 21"])),
            (make_entry("Heart", "Light"), make_paths(&["M12 21.35", "M5 12", "M9 21"])),
            (make_entry("Heart", "Regular"), make_paths(&["M12 21.35", "M5 12", "M9 21"])),
            (make_entry("Heart", "Bold"), make_paths(&["M12 21.35", "M5 12", "M9 21"])),
            (make_entry("Heart", "Fill"), make_paths(&["M12 21.35", "M8 10", "M9 21"])),
            (make_entry("Heart", "Duotone"), make_paths(&["M12 21.35", "M8 10", "M9 21"])),
        ];

        let results = dedup_entries(&entries);
        assert_eq!(results.len(), 1);

        let heart = &results[0];
        assert_eq!(heart.groups.len(), 2, "Should have 2 shared groups");

        // Largest group first (4 styles)
        let group_a = &heart.groups[0];
        assert_eq!(group_a.styles.len(), 4);
        assert!(group_a.styles.contains(&"Thin".to_string()));
        assert!(group_a.styles.contains(&"Light".to_string()));
        assert!(group_a.styles.contains(&"Regular".to_string()));
        assert!(group_a.styles.contains(&"Bold".to_string()));
        assert_eq!(group_a.paths[1], "M5 12");

        // Smaller group (2 styles)
        let group_b = &heart.groups[1];
        assert_eq!(group_b.styles.len(), 2);
        assert!(group_b.styles.contains(&"Fill".to_string()));
        assert!(group_b.styles.contains(&"Duotone".to_string()));
        assert_eq!(group_b.paths[1], "M8 10");
    }

    // --- Task 1.7: All different → no sharing ---
    #[test]
    fn test_all_different_no_sharing() {
        let entries = vec![
            (make_entry("Heart", "Thin"), make_paths(&["M1 1"])),
            (make_entry("Heart", "Light"), make_paths(&["M2 2"])),
            (make_entry("Heart", "Regular"), make_paths(&["M3 3"])),
            (make_entry("Heart", "Bold"), make_paths(&["M4 4"])),
            (make_entry("Heart", "Fill"), make_paths(&["M5 5"])),
            (make_entry("Heart", "Duotone"), make_paths(&["M6 6"])),
        ];

        let results = dedup_entries(&entries);
        let heart = &results[0];
        assert_eq!(heart.groups.len(), 6, "All different → 6 independent groups");
        for group in &heart.groups {
            assert_eq!(group.styles.len(), 1);
        }
    }

    // --- Task 1.8: Single weight source → no sharing, no error ---
    #[test]
    fn test_single_weight_no_sharing() {
        let entries = vec![
            (make_entry("Home", "Outline"), make_paths(&["M0 0 L24 24 Z"])),
            (make_entry("Settings", "Outline"), make_paths(&["M3 12 L21 12 Z"])),
        ];

        let results = dedup_entries(&entries);
        assert_eq!(results.len(), 2);

        for result in &results {
            assert_eq!(result.groups.len(), 1, "Single weight → 1 group per icon");
            assert_eq!(result.groups[0].styles.len(), 1);
        }
    }

    // --- Task 1.3: paths_equal ---
    #[test]
    fn test_paths_equal_identical() {
        let a = make_paths(&["M12 21.35", "M5 12"]);
        let b = make_paths(&["M12 21.35", "M5 12"]);
        assert!(paths_equal(&a, &b));
    }

    #[test]
    fn test_paths_equal_different_length() {
        let a = make_paths(&["M12 21.35"]);
        let b = make_paths(&["M12 21.35", "M5 12"]);
        assert!(!paths_equal(&a, &b));
    }

    #[test]
    fn test_paths_equal_different_content() {
        let a = make_paths(&["M12 21.35", "M5 12"]);
        let b = make_paths(&["M12 21.35", "M8 10"]);
        assert!(!paths_equal(&a, &b));
    }

    // --- build_lookup tests ---
    #[test]
    fn test_build_lookup_single_group() {
        let results = vec![IconDedupResult {
            icon_name: "Heart".to_string(),
            groups: vec![SharedGroup {
                styles: vec!["Thin".to_string(), "Light".to_string()],
                paths: make_paths(&["M12 21", "M5 12"]),
            }],
        }];

        let lookup = build_lookup(&results);

        let thin_ref = lookup
            .get(&("Heart".to_string(), "Thin".to_string(), 0))
            .expect("should have Thin path 0");
        assert_eq!(thin_ref.const_name, "_heartPath0");
        assert_eq!(thin_ref.path_data, "M12 21");

        let light_ref = lookup
            .get(&("Heart".to_string(), "Light".to_string(), 1))
            .expect("should have Light path 1");
        assert_eq!(light_ref.const_name, "_heartPath1");
        assert_eq!(light_ref.path_data, "M5 12");
    }

    #[test]
    fn test_build_lookup_multiple_groups() {
        let results = vec![IconDedupResult {
            icon_name: "Heart".to_string(),
            groups: vec![
                SharedGroup {
                    styles: vec!["Thin".to_string(), "Light".to_string()],
                    paths: make_paths(&["M12 21", "M5 12"]),
                },
                SharedGroup {
                    styles: vec!["Fill".to_string()],
                    paths: make_paths(&["M12 21", "M8 10"]),
                },
            ],
        }];

        let lookup = build_lookup(&results);

        // Group A (first group) — has _groupA suffix
        let thin_ref = lookup
            .get(&("Heart".to_string(), "Thin".to_string(), 0))
            .unwrap();
        assert_eq!(thin_ref.const_name, "_heartPath0_groupA");

        // Group B — has _groupB suffix
        let fill_ref = lookup
            .get(&("Heart".to_string(), "Fill".to_string(), 1))
            .unwrap();
        assert_eq!(fill_ref.const_name, "_heartPath1_groupB");
        assert_eq!(fill_ref.path_data, "M8 10");
    }

    // --- Multiple icons dedup ---
    #[test]
    fn test_multiple_icons_independent() {
        let entries = vec![
            (make_entry("Heart", "Thin"), make_paths(&["M1"])),
            (make_entry("Heart", "Bold"), make_paths(&["M1"])),
            (make_entry("Home", "Thin"), make_paths(&["M2"])),
            (make_entry("Home", "Bold"), make_paths(&["M2"])),
        ];

        let results = dedup_entries(&entries);
        assert_eq!(results.len(), 2);

        let heart = results.iter().find(|r| r.icon_name == "Heart").unwrap();
        assert_eq!(heart.groups.len(), 1);
        assert_eq!(heart.groups[0].styles.len(), 2);

        let home = results.iter().find(|r| r.icon_name == "Home").unwrap();
        assert_eq!(home.groups.len(), 1);
        assert_eq!(home.groups[0].styles.len(), 2);
    }

    // ============================================================
    // T2-01 — dedup_entries determinism contract
    // ============================================================

    fn build_mixed_corpus() -> Vec<(ManifestEntry, Vec<String>)> {
        vec![
            (make_entry("Zoom", "Bold"), make_paths(&["M9 1"])),
            (make_entry("Apple", "Thin"), make_paths(&["M1 1"])),
            (make_entry("Apple", "Bold"), make_paths(&["M1 1"])),
            (make_entry("Mango", "Thin"), make_paths(&["M3 3", "M4 4"])),
            (make_entry("Mango", "Bold"), make_paths(&["M3 3", "M5 5"])),
            (make_entry("Banana", "Thin"), make_paths(&["M2 2"])),
            (make_entry("Banana", "Bold"), make_paths(&["M2 2"])),
            (make_entry("Banana", "Fill"), make_paths(&["M2 2"])),
            (make_entry("Zoom", "Thin"), make_paths(&["M9 1"])),
        ]
    }

    #[test]
    fn test_dedup_entries_idempotent_same_input() {
        let corpus = build_mixed_corpus();
        let a = dedup_entries(&corpus);
        let b = dedup_entries(&corpus);
        assert_eq!(a, b, "same input must yield identical output");
    }

    #[test]
    fn test_dedup_entries_input_order_independent() {
        let corpus = build_mixed_corpus();
        let mut reversed = corpus.clone();
        reversed.reverse();
        let a = dedup_entries(&corpus);
        let b = dedup_entries(&reversed);
        assert_eq!(a, b, "input order must not affect output");
    }

    #[test]
    fn test_dedup_entries_output_sorted_by_icon_name() {
        let corpus = build_mixed_corpus();
        let results = dedup_entries(&corpus);
        let names: Vec<&str> = results.iter().map(|r| r.icon_name.as_str()).collect();
        assert_eq!(
            names,
            vec!["Apple", "Banana", "Mango", "Zoom"],
            "results must be sorted by icon_name"
        );
    }

    #[test]
    fn test_dedup_entries_partial_sharing_groups_stable() {
        // Mango has different Thin/Bold paths → 2 groups.
        // Group order must be stable across runs (largest first, then alphabetical).
        let corpus = build_mixed_corpus();
        let a = dedup_entries(&corpus);
        let b = dedup_entries(&corpus);
        let mango_a = a.iter().find(|r| r.icon_name == "Mango").unwrap();
        let mango_b = b.iter().find(|r| r.icon_name == "Mango").unwrap();
        assert_eq!(mango_a.groups, mango_b.groups);
    }

    // ============================================================
    // T2-04 — build_lookup determinism + downstream stability
    // ============================================================

    #[test]
    fn test_build_lookup_idempotent() {
        let corpus = build_mixed_corpus();
        let dedup = dedup_entries(&corpus);
        let a = build_lookup(&dedup);
        let b = build_lookup(&dedup);
        assert_eq!(a, b, "build_lookup must produce identical maps for identical input");
    }

    #[test]
    fn test_build_lookup_input_order_independent() {
        // Even though build_lookup returns a HashMap (unordered iteration),
        // semantic equality (==) must hold regardless of input ordering.
        let corpus = build_mixed_corpus();
        let mut reversed = corpus.clone();
        reversed.reverse();

        let lookup_forward = build_lookup(&dedup_entries(&corpus));
        let lookup_reverse = build_lookup(&dedup_entries(&reversed));

        assert_eq!(lookup_forward, lookup_reverse, "lookup contents must be order-independent");
    }

    #[test]
    fn test_build_lookup_const_names_are_deterministic() {
        // Asserts the format `_iconNamePath{idx}` (or _groupX suffix) is
        // generated consistently. Downstream codegen.rs depends on this.
        let corpus = build_mixed_corpus();
        let dedup = dedup_entries(&corpus);
        let lookup = build_lookup(&dedup);

        // Apple has a single shared group across Thin/Bold → no _groupX suffix
        let apple_thin = lookup.get(&("Apple".to_string(), "Thin".to_string(), 0)).unwrap();
        assert_eq!(apple_thin.const_name, "_applePath0");

        // Mango has 2 groups (Thin alone, Bold alone) → _groupA / _groupB suffix
        let mango_thin_p1 = lookup.get(&("Mango".to_string(), "Thin".to_string(), 1)).unwrap();
        assert!(
            mango_thin_p1.const_name.contains("_group"),
            "multi-group icon must have _groupX suffix, got: {}",
            mango_thin_p1.const_name
        );
    }

    #[test]
    fn test_pipeline_idempotent_full_round_trip() {
        // dedup → build_lookup, run twice — full pipeline must be stable.
        let corpus = build_mixed_corpus();
        let pipe_a = build_lookup(&dedup_entries(&corpus));
        let pipe_b = build_lookup(&dedup_entries(&corpus));
        assert_eq!(pipe_a, pipe_b);
    }

    #[test]
    fn test_dedup_empty_input_returns_empty_output() {
        let empty: Vec<(ManifestEntry, Vec<String>)> = vec![];
        let results = dedup_entries(&empty);
        assert!(results.is_empty());

        let lookup = build_lookup(&results);
        assert!(lookup.is_empty());
    }
}
