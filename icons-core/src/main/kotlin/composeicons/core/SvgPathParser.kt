package composeicons.core

import androidx.compose.ui.graphics.vector.PathNode

/**
 * Parses an SVG path data string into a List<PathNode>.
 * Supports all standard SVG path commands (both absolute and relative):
 * M/m, L/l, H/h, V/v, C/c, S/s, Q/q, T/t, A/a, Z/z
 * Also handles implicit repeated commands per SVG spec.
 */
fun parseSvgPathData(d: String): List<PathNode> {
    val nodes = mutableListOf<PathNode>()
    val tokens = tokenize(d)
    var i = 0
    var lastCmd = ""

    while (i < tokens.size) {
        val token = tokens[i]
        val cmd: String
        if (token.length == 1 && token[0].isLetter()) {
            cmd = token
            i++
        } else {
            // Implicit repeat of last command (M becomes L, m becomes l)
            cmd = when (lastCmd) {
                "M" -> "L"
                "m" -> "l"
                else -> lastCmd
            }
        }
        lastCmd = cmd

        when (cmd) {
            "M" -> { nodes.add(PathNode.MoveTo(tokens[i].toFloat(), tokens[i + 1].toFloat())); i += 2 }
            "m" -> { nodes.add(PathNode.RelativeMoveTo(tokens[i].toFloat(), tokens[i + 1].toFloat())); i += 2 }
            "L" -> { nodes.add(PathNode.LineTo(tokens[i].toFloat(), tokens[i + 1].toFloat())); i += 2 }
            "l" -> { nodes.add(PathNode.RelativeLineTo(tokens[i].toFloat(), tokens[i + 1].toFloat())); i += 2 }
            "H" -> { nodes.add(PathNode.HorizontalTo(tokens[i].toFloat())); i += 1 }
            "h" -> { nodes.add(PathNode.RelativeHorizontalTo(tokens[i].toFloat())); i += 1 }
            "V" -> { nodes.add(PathNode.VerticalTo(tokens[i].toFloat())); i += 1 }
            "v" -> { nodes.add(PathNode.RelativeVerticalTo(tokens[i].toFloat())); i += 1 }
            "C" -> {
                nodes.add(PathNode.CurveTo(
                    tokens[i].toFloat(), tokens[i + 1].toFloat(),
                    tokens[i + 2].toFloat(), tokens[i + 3].toFloat(),
                    tokens[i + 4].toFloat(), tokens[i + 5].toFloat(),
                ))
                i += 6
            }
            "c" -> {
                nodes.add(PathNode.RelativeCurveTo(
                    tokens[i].toFloat(), tokens[i + 1].toFloat(),
                    tokens[i + 2].toFloat(), tokens[i + 3].toFloat(),
                    tokens[i + 4].toFloat(), tokens[i + 5].toFloat(),
                ))
                i += 6
            }
            "S" -> {
                nodes.add(PathNode.ReflectiveCurveTo(
                    tokens[i].toFloat(), tokens[i + 1].toFloat(),
                    tokens[i + 2].toFloat(), tokens[i + 3].toFloat(),
                ))
                i += 4
            }
            "s" -> {
                nodes.add(PathNode.RelativeReflectiveCurveTo(
                    tokens[i].toFloat(), tokens[i + 1].toFloat(),
                    tokens[i + 2].toFloat(), tokens[i + 3].toFloat(),
                ))
                i += 4
            }
            "Q" -> {
                nodes.add(PathNode.QuadTo(
                    tokens[i].toFloat(), tokens[i + 1].toFloat(),
                    tokens[i + 2].toFloat(), tokens[i + 3].toFloat(),
                ))
                i += 4
            }
            "q" -> {
                nodes.add(PathNode.RelativeQuadTo(
                    tokens[i].toFloat(), tokens[i + 1].toFloat(),
                    tokens[i + 2].toFloat(), tokens[i + 3].toFloat(),
                ))
                i += 4
            }
            "T" -> { nodes.add(PathNode.ReflectiveQuadTo(tokens[i].toFloat(), tokens[i + 1].toFloat())); i += 2 }
            "t" -> { nodes.add(PathNode.RelativeReflectiveQuadTo(tokens[i].toFloat(), tokens[i + 1].toFloat())); i += 2 }
            "A" -> {
                nodes.add(PathNode.ArcTo(
                    horizontalEllipseRadius = tokens[i].toFloat(),
                    verticalEllipseRadius = tokens[i + 1].toFloat(),
                    theta = tokens[i + 2].toFloat(),
                    isMoreThanHalf = tokens[i + 3].toFloat() != 0f,
                    isPositiveArc = tokens[i + 4].toFloat() != 0f,
                    arcStartX = tokens[i + 5].toFloat(),
                    arcStartY = tokens[i + 6].toFloat(),
                ))
                i += 7
            }
            "a" -> {
                nodes.add(PathNode.RelativeArcTo(
                    horizontalEllipseRadius = tokens[i].toFloat(),
                    verticalEllipseRadius = tokens[i + 1].toFloat(),
                    theta = tokens[i + 2].toFloat(),
                    isMoreThanHalf = tokens[i + 3].toFloat() != 0f,
                    isPositiveArc = tokens[i + 4].toFloat() != 0f,
                    arcStartDx = tokens[i + 5].toFloat(),
                    arcStartDy = tokens[i + 6].toFloat(),
                ))
                i += 7
            }
            "Z", "z" -> { nodes.add(PathNode.Close) }
            else -> { i++ } // skip unknown
        }
    }

    return nodes
}

private fun tokenize(d: String): List<String> {
    val tokens = mutableListOf<String>()
    val current = StringBuilder()

    fun flush() {
        if (current.isNotEmpty()) {
            tokens.add(current.toString())
            current.clear()
        }
    }

    for (ch in d) {
        when {
            ch.isLetter() -> {
                flush()
                tokens.add(ch.toString())
            }
            ch == ',' || ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' -> {
                flush()
            }
            ch == '-' -> {
                if (current.isNotEmpty()) {
                    flush()
                }
                current.append(ch)
            }
            ch == '.' -> {
                if (current.contains('.')) {
                    flush()
                }
                current.append(ch)
            }
            else -> {
                current.append(ch)
            }
        }
    }
    flush()

    return tokens
}
