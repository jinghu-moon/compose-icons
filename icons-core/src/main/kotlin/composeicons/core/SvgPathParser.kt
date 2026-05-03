package composeicons.core

import androidx.compose.ui.graphics.vector.PathNode

/**
 * Parses an SVG path data string (e.g. "M 0 0 L 10 10 Z") into a List<PathNode>.
 * Supports absolute commands: M, L, Q, C, Z.
 * Used by generated icon code from svg2compose pipeline.
 */
fun parseSvgPathData(d: String): List<PathNode> {
    val nodes = mutableListOf<PathNode>()
    val tokens = tokenize(d)
    var i = 0

    while (i < tokens.size) {
        val cmd = tokens[i]
        i++
        when (cmd) {
            "M" -> {
                nodes.add(PathNode.MoveTo(tokens[i].toFloat(), tokens[i + 1].toFloat()))
                i += 2
            }
            "L" -> {
                nodes.add(PathNode.LineTo(tokens[i].toFloat(), tokens[i + 1].toFloat()))
                i += 2
            }
            "Q" -> {
                nodes.add(
                    PathNode.QuadTo(
                        tokens[i].toFloat(), tokens[i + 1].toFloat(),
                        tokens[i + 2].toFloat(), tokens[i + 3].toFloat(),
                    )
                )
                i += 4
            }
            "C" -> {
                nodes.add(
                    PathNode.CurveTo(
                        tokens[i].toFloat(), tokens[i + 1].toFloat(),
                        tokens[i + 2].toFloat(), tokens[i + 3].toFloat(),
                        tokens[i + 4].toFloat(), tokens[i + 5].toFloat(),
                    )
                )
                i += 6
            }
            "Z" -> {
                nodes.add(PathNode.Close)
            }
        }
    }

    return nodes
}

private fun tokenize(d: String): List<String> {
    val tokens = mutableListOf<String>()
    val current = StringBuilder()

    for (ch in d) {
        when {
            ch.isLetter() -> {
                if (current.isNotEmpty()) {
                    tokens.add(current.toString())
                    current.clear()
                }
                tokens.add(ch.toString())
            }
            ch == '-' && current.isNotEmpty() && !current.last().isWhitespace() -> {
                // 负号作为新数字的开始
                tokens.add(current.toString())
                current.clear()
                current.append(ch)
            }
            ch.isDigit() || ch == '.' || ch == '-' || ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' -> {
                if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r') {
                    if (current.isNotEmpty()) {
                        tokens.add(current.toString())
                        current.clear()
                    }
                } else {
                    current.append(ch)
                }
            }
        }
    }
    if (current.isNotEmpty()) {
        tokens.add(current.toString())
    }

    return tokens
}
