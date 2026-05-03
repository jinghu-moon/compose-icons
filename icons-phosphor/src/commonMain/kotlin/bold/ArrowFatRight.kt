package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatRight: ImageVector
    get() {
        if (_arrowFatRight != null) return _arrowFatRight!!
        _arrowFatRight = phosphorBoldIcon(
            name = "ArrowFatRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 119.51f),
                    PathNode.LineTo(144.49f, 23.51f),
                    PathNode.CurveTo(141.05786f, 20.074038f, 135.89313f, 19.045519f, 131.40652f, 20.904531f),
                    PathNode.CurveTo(126.91993f, 22.763542f, 123.99618f, 27.14352f, 124.0f, 32.0f),
                    PathNode.LineTo(124.0f, 68.0f),
                    PathNode.LineTo(48.0f, 68.0f),
                    PathNode.CurveTo(36.954304f, 68.0f, 28.0f, 76.95431f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 168.0f),
                    PathNode.CurveTo(28.0f, 179.0457f, 36.954304f, 188.0f, 48.0f, 188.0f),
                    PathNode.LineTo(124.0f, 188.0f),
                    PathNode.LineTo(124.0f, 224.0f),
                    PathNode.CurveTo(123.99618f, 228.85648f, 126.91993f, 233.23645f, 131.40652f, 235.09547f),
                    PathNode.CurveTo(135.89313f, 236.95448f, 141.05786f, 235.92596f, 144.49f, 232.49f),
                    PathNode.LineTo(240.49f, 136.49f),
                    PathNode.CurveTo(242.74333f, 134.23918f, 244.00945f, 131.1849f, 244.00945f, 128.0f),
                    PathNode.CurveTo(244.00945f, 124.81509f, 242.74333f, 121.76082f, 240.49f, 119.51f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 195.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 169.37259f, 142.62741f, 164.0f, 136.0f, 164.0f),
                    PathNode.LineTo(52.0f, 164.0f),
                    PathNode.LineTo(52.0f, 92.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(142.62741f, 92.0f, 148.0f, 86.62742f, 148.0f, 80.0f),
                    PathNode.LineTo(148.0f, 61.0f),
                    PathNode.LineTo(215.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowFatRight!!
    }

private var _arrowFatRight: ImageVector? = null
