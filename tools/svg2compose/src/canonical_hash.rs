use std::collections::HashMap;

use crate::manifest::ManifestEntry;
use crate::path_dedup::{SharedPathLookup, SharedPathRef};

/// FNV-1a 64-bit hash. Stable across Rust versions (manually implemented),
/// suitable for incremental cache keys and deterministic codegen.
///
/// Birthday-collision probability for 1e4 distinct icons against 2^64 buckets
/// ≈ n²/(2·M) ≈ 5e7 / 1.8e19 ≈ 2.7e-12 — far below floor for our use case.
pub fn fnv1a_64(bytes: &[u8]) -> u64 {
    let mut h: u64 = 14695981039346656037;
    for b in bytes {
        h ^= *b as u64;
        h = h.wrapping_mul(1099511628211);
    }
    h
}

/// Stable hex token for use as part of a Kotlin `internal val` name.
/// 12 lowercase hex chars (48 bits) — enough entropy for our population sizes
/// while keeping generated identifiers short.
pub fn hash_to_token(h: u64) -> String {
    format!("{:016x}", h).chars().take(12).collect()
}

/// Compute a canonical hash for an icon's path sequence.
///
/// Inputs are joined with `\n` separators so that two icons with the same
/// individual paths but different ordering still hash differently — order
/// affects rendering (z-order, fill rule) and must be preserved.
pub fn canonical_hash_of(paths: &[String]) -> u64 {
    if paths.is_empty() {
        return 0; // sentinel: empty icon never matches anything
    }
    let mut buf = String::new();
    for p in paths {
        buf.push_str(p);
        buf.push('\n');
    }
    fnv1a_64(buf.as_bytes())
}

/// One canonical pool entry: ≥2 distinct icons share the same path sequence.
#[derive(Debug, Clone, PartialEq)]
pub struct CanonicalGroup {
    pub hash: u64,
    pub token: String,
    pub paths: Vec<String>,
    /// Members as (style_name, kotlin_name). Sorted alphabetically for
    /// deterministic codegen.
    pub members: Vec<(String, String)>,
}

/// Build canonical groups from a list of (entry, paths) pairs.
///
/// Only groups containing **≥2 distinct icons** survive — a single-member
/// "group" yields no sharing benefit and would only inflate the shared file.
///
/// Output is sorted by `token` for deterministic codegen.
pub fn build_canonical_pool(
    entries: &[(ManifestEntry, Vec<String>)],
) -> Vec<CanonicalGroup> {
    if entries.is_empty() {
        return Vec::new();
    }

    let mut by_hash: HashMap<u64, Vec<(&ManifestEntry, &Vec<String>)>> = HashMap::new();
    for (entry, paths) in entries {
        if paths.is_empty() {
            continue; // empty path lists never share anything
        }
        let h = canonical_hash_of(paths);
        by_hash.entry(h).or_default().push((entry, paths));
    }

    let mut groups: Vec<CanonicalGroup> = by_hash
        .into_iter()
        .filter(|(_, members)| {
            // Need ≥2 *distinct* icons (different (style, name) pairs).
            // Two entries from the same (style, name) are not a real share —
            // they're the same icon emitted twice (shouldn't happen, but
            // guard against it).
            let distinct: std::collections::HashSet<_> = members
                .iter()
                .map(|(e, _)| (e.style_name.as_str(), e.kotlin_name.as_str()))
                .collect();
            distinct.len() >= 2
        })
        .map(|(hash, members)| {
            let token = hash_to_token(hash);
            let paths = members[0].1.clone();
            let mut sorted_members: Vec<(String, String)> = members
                .iter()
                .map(|(e, _)| (e.style_name.clone(), e.kotlin_name.clone()))
                .collect();
            sorted_members.sort();
            sorted_members.dedup();
            CanonicalGroup {
                hash,
                token,
                paths,
                members: sorted_members,
            }
        })
        .collect();

    groups.sort_by(|a, b| a.token.cmp(&b.token));
    groups
}

/// Build a [SharedPathLookup] from canonical groups, augmenting an existing
/// Layer 1 lookup. Layer 1 entries take precedence — T3 only fills slots
/// that Layer 1 has not already claimed.
///
/// This guarantees Layer 1 + T3 never produce conflicting `internal val`
/// references for the same `(icon, style, path_idx)` slot.
pub fn build_canonical_lookup(
    groups: &[CanonicalGroup],
    layer1_lookup: &SharedPathLookup,
) -> SharedPathLookup {
    let mut lookup = SharedPathLookup::new();
    for group in groups {
        for (style, icon_name) in &group.members {
            for (idx, path) in group.paths.iter().enumerate() {
                let key = (icon_name.clone(), style.clone(), idx);
                if layer1_lookup.contains_key(&key) {
                    continue; // Layer 1 owns this slot
                }
                let const_name = format!("_p{}_{}", group.token, idx);
                lookup.insert(
                    key,
                    SharedPathRef {
                        const_name,
                        path_data: path.clone(),
                    },
                );
            }
        }
    }
    lookup
}

#[cfg(test)]
mod tests {
    use super::*;

    fn make_entry(style: &str, name: &str) -> ManifestEntry {
        ManifestEntry {
            svg: format!("{}.svg", name),
            kotlin_name: name.to_string(),
            style_name: style.to_string(),
            subdirectory: style.to_lowercase(),
            helper: format!("test{}Icon", style),
                md5: None,
        }
    }

    fn make_paths(items: &[&str]) -> Vec<String> {
        items.iter().map(|s| s.to_string()).collect()
    }

    // ─── T3-01: hash function ────────────────────────────────────

    #[test]
    fn fnv1a_64_returns_known_value_for_empty_input() {
        // FNV-1a offset basis is the canonical hash of empty input.
        assert_eq!(fnv1a_64(&[]), 14695981039346656037);
    }

    #[test]
    fn fnv1a_64_is_deterministic() {
        let bytes = b"hello world";
        assert_eq!(fnv1a_64(bytes), fnv1a_64(bytes));
    }

    #[test]
    fn fnv1a_64_distinguishes_distinct_inputs() {
        assert_ne!(fnv1a_64(b"abc"), fnv1a_64(b"abd"));
        assert_ne!(fnv1a_64(b"a"), fnv1a_64(b"aa"));
    }

    #[test]
    fn hash_to_token_is_12_chars() {
        let token = hash_to_token(0x123456789abcdef0);
        assert_eq!(token.len(), 12);
        assert_eq!(token, "123456789abc");
    }

    #[test]
    fn canonical_hash_of_empty_input_returns_sentinel_zero() {
        assert_eq!(canonical_hash_of(&[]), 0);
    }

    #[test]
    fn canonical_hash_of_same_paths_returns_same_value() {
        let a = make_paths(&["M1 1 L2 2", "M3 3"]);
        let b = make_paths(&["M1 1 L2 2", "M3 3"]);
        assert_eq!(canonical_hash_of(&a), canonical_hash_of(&b));
    }

    #[test]
    fn canonical_hash_of_distinct_paths_distinct_hashes() {
        let a = make_paths(&["M1 1"]);
        let b = make_paths(&["M2 2"]);
        assert_ne!(canonical_hash_of(&a), canonical_hash_of(&b));
    }

    #[test]
    fn canonical_hash_of_order_matters() {
        // Path z-order matters: A then B paints differently than B then A.
        let ab = make_paths(&["M1 1", "M2 2"]);
        let ba = make_paths(&["M2 2", "M1 1"]);
        assert_ne!(canonical_hash_of(&ab), canonical_hash_of(&ba));
    }

    // ─── T3-02/03: pool building ─────────────────────────────────

    #[test]
    fn build_canonical_pool_empty_input_empty_output() {
        let groups = build_canonical_pool(&[]);
        assert!(groups.is_empty());
    }

    #[test]
    fn build_canonical_pool_single_member_no_group() {
        let entries = vec![(make_entry("Outline", "Home"), make_paths(&["M1 1"]))];
        let groups = build_canonical_pool(&entries);
        assert!(groups.is_empty(), "single-member groups must be excluded");
    }

    #[test]
    fn build_canonical_pool_two_distinct_icons_same_paths_one_group() {
        let entries = vec![
            (make_entry("Outline", "Home"), make_paths(&["M1 1 L24 24 Z"])),
            (make_entry("Outline", "House"), make_paths(&["M1 1 L24 24 Z"])),
        ];
        let groups = build_canonical_pool(&entries);
        assert_eq!(groups.len(), 1);
        assert_eq!(groups[0].members.len(), 2);
        assert!(groups[0].members.contains(&("Outline".to_string(), "Home".to_string())));
        assert!(groups[0].members.contains(&("Outline".to_string(), "House".to_string())));
    }

    #[test]
    fn build_canonical_pool_groups_sorted_by_token() {
        let entries = vec![
            (make_entry("Outline", "ZA"), make_paths(&["M9"])),
            (make_entry("Outline", "ZB"), make_paths(&["M9"])),
            (make_entry("Outline", "AA"), make_paths(&["M1"])),
            (make_entry("Outline", "AB"), make_paths(&["M1"])),
        ];
        let groups = build_canonical_pool(&entries);
        assert_eq!(groups.len(), 2);
        assert!(groups[0].token < groups[1].token, "groups must be sorted by token");
    }

    #[test]
    fn build_canonical_pool_dedup_idempotent() {
        let entries = vec![
            (make_entry("Outline", "A"), make_paths(&["M1"])),
            (make_entry("Outline", "B"), make_paths(&["M1"])),
            (make_entry("Outline", "C"), make_paths(&["M2"])),
            (make_entry("Outline", "D"), make_paths(&["M2"])),
        ];
        let a = build_canonical_pool(&entries);
        let b = build_canonical_pool(&entries);
        assert_eq!(a, b);
    }

    #[test]
    fn build_canonical_pool_excludes_empty_path_icons() {
        let entries = vec![
            (make_entry("Outline", "Empty1"), make_paths(&[])),
            (make_entry("Outline", "Empty2"), make_paths(&[])),
        ];
        let groups = build_canonical_pool(&entries);
        assert!(groups.is_empty(), "empty-path icons must not group together");
    }

    #[test]
    fn build_canonical_pool_same_icon_emitted_twice_not_a_group() {
        // Defensive: if (style, name) appears twice in input, it's the same
        // icon counted twice — not a sharing opportunity.
        let entries = vec![
            (make_entry("Outline", "Home"), make_paths(&["M1"])),
            (make_entry("Outline", "Home"), make_paths(&["M1"])),
        ];
        let groups = build_canonical_pool(&entries);
        assert!(groups.is_empty(), "duplicate (style,name) entries must not form a group");
    }

    // ─── T3 lookup integration with Layer 1 ──────────────────────

    #[test]
    fn build_canonical_lookup_layer1_takes_precedence() {
        let entries = vec![
            (make_entry("Outline", "Home"), make_paths(&["M1"])),
            (make_entry("Outline", "House"), make_paths(&["M1"])),
        ];
        let groups = build_canonical_pool(&entries);

        // Synthesise a Layer 1 lookup that already owns Home/Outline/0
        let mut layer1 = SharedPathLookup::new();
        layer1.insert(
            ("Home".to_string(), "Outline".to_string(), 0),
            SharedPathRef {
                const_name: "_homePath0".to_string(),
                path_data: "M1".to_string(),
            },
        );

        let t3 = build_canonical_lookup(&groups, &layer1);

        assert!(
            !t3.contains_key(&("Home".to_string(), "Outline".to_string(), 0)),
            "T3 must not overwrite Layer 1's slot for Home"
        );
        assert!(
            t3.contains_key(&("House".to_string(), "Outline".to_string(), 0)),
            "T3 must claim House's slot (Layer 1 didn't own it)"
        );
    }

    #[test]
    fn build_canonical_lookup_const_names_use_pool_token() {
        let entries = vec![
            (make_entry("Outline", "A"), make_paths(&["M1"])),
            (make_entry("Outline", "B"), make_paths(&["M1"])),
        ];
        let groups = build_canonical_pool(&entries);
        let lookup = build_canonical_lookup(&groups, &SharedPathLookup::new());

        let entry = lookup.get(&("A".to_string(), "Outline".to_string(), 0)).unwrap();
        assert!(
            entry.const_name.starts_with("_p"),
            "T3 const name must start with `_p`: got {}",
            entry.const_name
        );
        assert!(entry.const_name.ends_with("_0"), "T3 const name must include path index");
    }

    #[test]
    fn build_canonical_lookup_idempotent() {
        let entries = vec![
            (make_entry("Outline", "A"), make_paths(&["M1"])),
            (make_entry("Outline", "B"), make_paths(&["M1"])),
        ];
        let groups = build_canonical_pool(&entries);
        let layer1 = SharedPathLookup::new();
        let a = build_canonical_lookup(&groups, &layer1);
        let b = build_canonical_lookup(&groups, &layer1);
        assert_eq!(a, b);
    }
}
