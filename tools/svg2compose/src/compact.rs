/// SVG path compaction: compress usvg path data into minimal SVG path strings.
///
/// Pipeline: commands → relative → H/V shorthand → mixed pick → format

/// Compact a list of absolute-path commands into a minimal SVG path string.
pub fn compact_path(cmds: &[RawCommand]) -> String {
    if cmds.is_empty() {
        return String::new();
    }
    let mut opt = to_relative(cmds);
    apply_hv_shorthand(&mut opt);
    let mixed = pick_shortest(&opt);
    format_path(&mixed)
}

/// Format a f64 number into minimal string representation.
/// - Integer values drop decimals: 12.0 → "12"
/// - Strip trailing zeros: 12.340 → "12.34"
/// - Strip leading zeros: 0.5 → ".5", -0.5 → "-.5"
/// - Zero: "0"
fn format_number(v: f64) -> String {
    if v.abs() < f64::EPSILON {
        return "0".to_string();
    }
    if v.fract().abs() < 1e-9 {
        return format!("{}", v as i64);
    }
    let s = format!("{:.3}", v);
    let s = s.trim_end_matches('0').trim_end_matches('.');
    if s.starts_with("0.") {
        return s[1..].to_string();
    }
    if s.starts_with("-0.") {
        return format!("-{}", &s[2..]);
    }
    s.to_string()
}

/// Determine if a space is needed between the previous token's last char
/// and the current token's first char.
fn needs_space(prev_end: char, curr_start: char) -> bool {
    if prev_end.is_ascii_digit() && curr_start.is_ascii_digit() {
        return true;
    }
    if prev_end.is_ascii_digit() && curr_start == '.' {
        return true;
    }
    false
}

// ── Types ──

/// Raw command in absolute coordinates (directly from usvg path data).
#[derive(Debug, PartialEq)]
pub enum RawCommand {
    M { x: f64, y: f64 },
    L { x: f64, y: f64 },
    Q { x1: f64, y1: f64, x: f64, y: f64 },
    C { x1: f64, y1: f64, x2: f64, y2: f64, x: f64, y: f64 },
    Z,
}

// ── Stage 1: Absolute → Relative ──

/// Optimized command (absolute or relative, possibly shorthand).
/// Variant names mirror SVG path command letters (lowercase = relative).
#[derive(Debug, PartialEq, Clone)]
#[allow(non_camel_case_types)]
enum OptCommand {
    M { x: f64, y: f64 },
    L { x: f64, y: f64 },
    l { dx: f64, dy: f64 },
    h { dx: f64 },
    v { dy: f64 },
    Q { x1: f64, y1: f64, x: f64, y: f64 },
    q { dx1: f64, dy1: f64, dx: f64, dy: f64 },
    C { x1: f64, y1: f64, x2: f64, y2: f64, x: f64, y: f64 },
    c { dx1: f64, dy1: f64, dx2: f64, dy2: f64, dx: f64, dy: f64 },
    Z,
}

struct Cursor {
    x: f64,
    y: f64,
}

fn to_relative(cmds: &[RawCommand]) -> Vec<OptCommand> {
    let mut cursor = Cursor { x: 0.0, y: 0.0 };
    let mut result = Vec::new();
    for cmd in cmds {
        match cmd {
            RawCommand::M { x, y } => {
                result.push(OptCommand::M { x: *x, y: *y });
                cursor.x = *x;
                cursor.y = *y;
            }
            RawCommand::L { x, y } => {
                result.push(OptCommand::l { dx: x - cursor.x, dy: y - cursor.y });
                cursor.x = *x;
                cursor.y = *y;
            }
            RawCommand::Q { x1, y1, x, y } => {
                result.push(OptCommand::q {
                    dx1: x1 - cursor.x, dy1: y1 - cursor.y,
                    dx: x - cursor.x, dy: y - cursor.y,
                });
                cursor.x = *x;
                cursor.y = *y;
            }
            RawCommand::C { x1, y1, x2, y2, x, y } => {
                result.push(OptCommand::c {
                    dx1: x1 - cursor.x, dy1: y1 - cursor.y,
                    dx2: x2 - cursor.x, dy2: y2 - cursor.y,
                    dx: x - cursor.x, dy: y - cursor.y,
                });
                cursor.x = *x;
                cursor.y = *y;
            }
            RawCommand::Z => {
                result.push(OptCommand::Z);
            }
        }
    }
    result
}

// ── Stage 2: H/V Shorthand ──

fn apply_hv_shorthand(cmds: &mut Vec<OptCommand>) {
    for cmd in cmds.iter_mut() {
        if let OptCommand::l { dx, dy } = cmd {
            if dy.abs() < f64::EPSILON {
                *cmd = OptCommand::h { dx: *dx };
            } else if dx.abs() < f64::EPSILON {
                *cmd = OptCommand::v { dy: *dy };
            }
        }
    }
}

// ── Stage 3: Pick Shortest ──

/// Estimate the string length of a number without formatting it.
fn estimate_number_len(v: f64) -> usize {
    if v.abs() < f64::EPSILON {
        return 1; // "0"
    }
    let mut len = 0;
    if v < 0.0 { len += 1; } // '-'
    let abs = v.abs();
    if abs.fract().abs() < 1e-9 {
        // integer
        len += (abs as u64).to_string().len();
    } else {
        // decimal: use integer part + 1 (dot) + ~2 decimal digits as estimate
        let int_part = abs.trunc() as u64;
        if int_part == 0 {
            len += 1; // leading zero omitted → "."
        } else {
            len += int_part.to_string().len() + 1; // digits + '.'
        }
        len += 2; // ~2 significant decimal digits
    }
    len
}

fn pick_shortest(cmds: &[OptCommand]) -> Vec<OptCommand> {
    let mut cursor = Cursor { x: 0.0, y: 0.0 };
    let mut result = Vec::new();
    for cmd in cmds {
        match cmd {
            OptCommand::M { x, y } => {
                result.push(OptCommand::M { x: *x, y: *y });
                cursor = Cursor { x: *x, y: *y };
            }
            OptCommand::l { dx, dy } => {
                // abs: "L" + x + y; rel: "l" + dx + dy
                let abs_len = 1 + estimate_number_len(cursor.x + dx) + estimate_number_len(cursor.y + dy);
                let rel_len = 1 + estimate_number_len(*dx) + estimate_number_len(*dy);
                if abs_len <= rel_len {
                    result.push(OptCommand::L { x: cursor.x + dx, y: cursor.y + dy });
                } else {
                    result.push(OptCommand::l { dx: *dx, dy: *dy });
                }
                cursor.x += dx;
                cursor.y += dy;
            }
            OptCommand::h { dx } => {
                result.push(OptCommand::h { dx: *dx });
                cursor.x += dx;
            }
            OptCommand::v { dy } => {
                result.push(OptCommand::v { dy: *dy });
                cursor.y += dy;
            }
            OptCommand::q { dx1, dy1, dx, dy } => {
                let abs_len = 1
                    + estimate_number_len(cursor.x + dx1) + estimate_number_len(cursor.y + dy1)
                    + estimate_number_len(cursor.x + dx) + estimate_number_len(cursor.y + dy);
                let rel_len = 1 + estimate_number_len(*dx1) + estimate_number_len(*dy1) + estimate_number_len(*dx) + estimate_number_len(*dy);
                if abs_len <= rel_len {
                    result.push(OptCommand::Q {
                        x1: cursor.x + dx1, y1: cursor.y + dy1,
                        x: cursor.x + dx, y: cursor.y + dy,
                    });
                } else {
                    result.push(OptCommand::q { dx1: *dx1, dy1: *dy1, dx: *dx, dy: *dy });
                }
                cursor.x += dx;
                cursor.y += dy;
            }
            OptCommand::c { dx1, dy1, dx2, dy2, dx, dy } => {
                let abs_len = 1
                    + estimate_number_len(cursor.x + dx1) + estimate_number_len(cursor.y + dy1)
                    + estimate_number_len(cursor.x + dx2) + estimate_number_len(cursor.y + dy2)
                    + estimate_number_len(cursor.x + dx) + estimate_number_len(cursor.y + dy);
                let rel_len = 1
                    + estimate_number_len(*dx1) + estimate_number_len(*dy1)
                    + estimate_number_len(*dx2) + estimate_number_len(*dy2)
                    + estimate_number_len(*dx) + estimate_number_len(*dy);
                if abs_len <= rel_len {
                    result.push(OptCommand::C {
                        x1: cursor.x + dx1, y1: cursor.y + dy1,
                        x2: cursor.x + dx2, y2: cursor.y + dy2,
                        x: cursor.x + dx, y: cursor.y + dy,
                    });
                } else {
                    result.push(OptCommand::c { dx1: *dx1, dy1: *dy1, dx2: *dx2, dy2: *dy2, dx: *dx, dy: *dy });
                }
                cursor.x += dx;
                cursor.y += dy;
            }
            OptCommand::Z => { result.push(OptCommand::Z); }
            // Pass through absolute commands that weren't covered above
            _ => { result.push(cmd.clone()); }
        }
    }
    result
}

// ── Stage 4: Format ──

fn format_path(cmds: &[OptCommand]) -> String {
    let mut out = String::new();
    let mut prev_cmd: Option<char> = None;

    for cmd in cmds {
        let (letter, args) = match cmd {
            OptCommand::M { x, y } => (Some('M'), vec![*x, *y]),
            OptCommand::L { x, y } => {
                // M 后的 L 可省略命令字母（隐式 lineto）
                if prev_cmd == Some('M') { (None, vec![*x, *y]) }
                else { (Some('L'), vec![*x, *y]) }
            }
            OptCommand::l { dx, dy } => (Some('l'), vec![*dx, *dy]),
            OptCommand::h { dx } => (Some('h'), vec![*dx]),
            OptCommand::v { dy } => (Some('v'), vec![*dy]),
            OptCommand::Q { x1, y1, x, y } => (Some('Q'), vec![*x1, *y1, *x, *y]),
            OptCommand::q { dx1, dy1, dx, dy } => (Some('q'), vec![*dx1, *dy1, *dx, *dy]),
            OptCommand::C { x1, y1, x2, y2, x, y } => (Some('C'), vec![*x1, *y1, *x2, *y2, *x, *y]),
            OptCommand::c { dx1, dy1, dx2, dy2, dx, dy } => (Some('c'), vec![*dx1, *dy1, *dx2, *dy2, *dx, *dy]),
            OptCommand::Z => {
                // Z 前不需要空格
                out.push('Z');
                prev_cmd = Some('Z');
                continue;
            }
        };

        // Command letter omission: same type consecutive
        let need_letter = match letter {
            Some(c) => {
                if let Some(prev) = prev_cmd {
                    c != prev
                } else {
                    true
                }
            }
            None => false,
        };

        if need_letter {
            if let Some(c) = letter {
                if !out.is_empty() {
                    let last = out.chars().last().unwrap();
                    if needs_space(last, c) {
                        out.push(' ');
                    }
                }
                out.push(c);
                prev_cmd = Some(c);
            }
        }

        // Output coordinates
        for &v in &args {
            let s = format_number(v);
            if !out.is_empty() {
                if let Some(last) = out.chars().last() {
                    if needs_space(last, s.chars().next().unwrap()) {
                        out.push(' ');
                    }
                }
            }
            out.push_str(&s);
        }
    }
    out
}

#[cfg(test)]
mod tests {
    use super::*;

    // ── A2: format_number ──

    #[test]
    fn format_number_integer() {
        assert_eq!(format_number(12.0), "12");
    }

    #[test]
    fn format_number_strip_leading_zero() {
        assert_eq!(format_number(0.5), ".5");
    }

    #[test]
    fn format_number_negative_strip_leading_zero() {
        assert_eq!(format_number(-0.5), "-.5");
    }

    #[test]
    fn format_number_strip_trailing_zeros() {
        assert_eq!(format_number(12.340), "12.34");
    }

    #[test]
    fn format_number_zero() {
        assert_eq!(format_number(0.0), "0");
    }

    #[test]
    fn format_number_multi_digit_integer() {
        assert_eq!(format_number(100.0), "100");
    }

    #[test]
    fn format_number_small_decimal() {
        assert_eq!(format_number(0.010), ".01");
    }

    #[test]
    fn format_number_usvg_standard() {
        assert_eq!(format_number(12.000), "12");
    }

    // ── B3: needs_space ──

    #[test]
    fn needs_space_two_positive_ints() {
        assert!(needs_space('2', '8'));
    }

    #[test]
    fn needs_space_negative_sign_separator() {
        assert!(!needs_space('2', '-'));
    }

    #[test]
    fn needs_space_dot_as_separator() {
        // .5.3 → 0.5 0.3 (dot acts as implicit separator)
        assert!(!needs_space('.', '.'));
    }

    #[test]
    fn needs_space_digit_then_dot() {
        // "12.5" ".3" → "12.5.3" ambiguous, needs space → "12.5 .3"
        assert!(needs_space('5', '.'));
    }

    #[test]
    fn needs_space_zero_then_digit() {
        assert!(needs_space('0', '5'));
    }

    // ── B2: to_relative ──

    #[test]
    fn to_relative_pure_vertical() {
        let raw = vec![RawCommand::M { x: 12.0, y: 8.0 }, RawCommand::L { x: 12.0, y: 12.0 }];
        let opt = to_relative(&raw);
        assert_eq!(opt, vec![
            OptCommand::M { x: 12.0, y: 8.0 },
            OptCommand::l { dx: 0.0, dy: 4.0 },
        ]);
    }

    #[test]
    fn to_relative_diagonal() {
        let raw = vec![RawCommand::M { x: 0.0, y: 0.0 }, RawCommand::L { x: 3.0, y: 4.0 }];
        let opt = to_relative(&raw);
        assert_eq!(opt, vec![
            OptCommand::M { x: 0.0, y: 0.0 },
            OptCommand::l { dx: 3.0, dy: 4.0 },
        ]);
    }

    #[test]
    fn to_relative_offset() {
        let raw = vec![RawCommand::M { x: 10.0, y: 20.0 }, RawCommand::L { x: 25.0, y: 30.0 }];
        let opt = to_relative(&raw);
        assert_eq!(opt, vec![
            OptCommand::M { x: 10.0, y: 20.0 },
            OptCommand::l { dx: 15.0, dy: 10.0 },
        ]);
    }

    // ── C1: apply_hv_shorthand ──

    #[test]
    fn hv_pure_vertical() {
        let mut cmds = vec![OptCommand::M { x: 12.0, y: 8.0 }, OptCommand::l { dx: 0.0, dy: 4.0 }];
        apply_hv_shorthand(&mut cmds);
        assert_eq!(cmds[1], OptCommand::v { dy: 4.0 });
    }

    #[test]
    fn hv_pure_horizontal() {
        let mut cmds = vec![OptCommand::M { x: 0.0, y: 0.0 }, OptCommand::l { dx: 10.0, dy: 0.0 }];
        apply_hv_shorthand(&mut cmds);
        assert_eq!(cmds[1], OptCommand::h { dx: 10.0 });
    }

    #[test]
    fn hv_diagonal_unchanged() {
        let mut cmds = vec![OptCommand::M { x: 0.0, y: 0.0 }, OptCommand::l { dx: 3.0, dy: 4.0 }];
        apply_hv_shorthand(&mut cmds);
        assert_eq!(cmds[1], OptCommand::l { dx: 3.0, dy: 4.0 });
    }

    // ── D1: compact_path end-to-end ──

    #[test]
    fn e2e_vertical_line() {
        let cmds = vec![
            RawCommand::M { x: 12.0, y: 8.0 },
            RawCommand::L { x: 12.0, y: 12.0 },
        ];
        assert_eq!(compact_path(&cmds), "M12 8v4");
    }

    #[test]
    fn e2e_horizontal_tiny() {
        let cmds = vec![
            RawCommand::M { x: 12.0, y: 16.0 },
            RawCommand::L { x: 12.01, y: 16.0 },
        ];
        assert_eq!(compact_path(&cmds), "M12 16h.01");
    }

    #[test]
    fn e2e_implicit_lineto() {
        let cmds = vec![
            RawCommand::M { x: 3.0, y: 3.0 },
            RawCommand::L { x: 21.0, y: 21.0 },
        ];
        assert_eq!(compact_path(&cmds), "M3 3 21 21");
    }

    #[test]
    fn e2e_quad_absolute_when_equal() {
        let cmds = vec![
            RawCommand::M { x: 0.0, y: 0.0 },
            RawCommand::Q { x1: 10.0, y1: 20.0, x: 30.0, y: 40.0 },
        ];
        assert_eq!(compact_path(&cmds), "M0 0Q10 20 30 40");
    }

    #[test]
    fn e2e_quad_relative_when_shorter() {
        let cmds = vec![
            RawCommand::M { x: 100.0, y: 200.0 },
            RawCommand::Q { x1: 105.0, y1: 210.0, x: 110.0, y: 220.0 },
        ];
        assert_eq!(compact_path(&cmds), "M100 200q5 10 10 20");
    }

    #[test]
    fn e2e_cubic_absolute_when_equal() {
        let cmds = vec![
            RawCommand::M { x: 0.0, y: 0.0 },
            RawCommand::C { x1: 1.0, y1: 2.0, x2: 3.0, y2: 4.0, x: 5.0, y: 6.0 },
        ];
        assert_eq!(compact_path(&cmds), "M0 0C1 2 3 4 5 6");
    }

    #[test]
    fn e2e_multi_segment_z() {
        let cmds = vec![
            RawCommand::M { x: 12.0, y: 2.0 },
            RawCommand::L { x: 22.0, y: 12.0 },
            RawCommand::L { x: 12.0, y: 22.0 },
            RawCommand::L { x: 2.0, y: 12.0 },
            RawCommand::Z,
        ];
        assert_eq!(compact_path(&cmds), "M12 2 22 12 12 22 2 12Z");
    }

    #[test]
    fn e2e_zero_length_line() {
        let cmds = vec![
            RawCommand::M { x: 5.0, y: 5.0 },
            RawCommand::L { x: 5.0, y: 5.0 },
        ];
        assert_eq!(compact_path(&cmds), "M5 5h0");
    }

    #[test]
    fn e2e_mid_path_move() {
        // Regression: Move after Line must not corrupt the path
        let cmds = vec![
            RawCommand::M { x: 3.0, y: 16.0 },
            RawCommand::L { x: 3.0, y: 10.5 },
            RawCommand::C { x1: 3.0, y1: 9.119, x2: 4.119, y2: 8.0, x: 5.5, y: 8.0 },
            RawCommand::C { x1: 6.881, y1: 8.0, x2: 8.0, y2: 9.119, x: 8.0, y: 10.5 },
            RawCommand::L { x: 8.0, y: 16.0 },
            RawCommand::M { x: 8.0, y: 12.0 },
            RawCommand::L { x: 3.0, y: 12.0 },
        ];
        let result = compact_path(&cmds);
        assert!(result.contains('M'), "Move must be preserved: {}", result);
        assert!(!result.contains("16.000M"), "No token concatenation: {}", result);
    }
}
