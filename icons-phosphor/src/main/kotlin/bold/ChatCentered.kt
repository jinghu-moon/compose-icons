package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorBoldIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 184.0f),
                    PathNode.CurveTo(20.0f, 195.0457f, 28.954306f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(98.11f, 204.0f),
                    PathNode.LineTo(110.63f, 225.92f),
                    PathNode.CurveTo(114.18947f, 232.15656f, 120.81916f, 236.00621f, 128.0f, 236.00621f),
                    PathNode.CurveTo(135.18085f, 236.00621f, 141.81053f, 232.15656f, 145.37f, 225.92f),
                    PathNode.LineTo(157.89f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(227.0457f, 204.0f, 236.0f, 195.0457f, 236.0f, 184.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 180.0f),
                    PathNode.LineTo(150.93f, 180.0f),
                    PathNode.CurveTo(146.62257f, 180.00037f, 142.64577f, 182.30936f, 140.51f, 186.05f),
                    PathNode.LineTo(128.0f, 207.94f),
                    PathNode.LineTo(115.49f, 186.05f),
                    PathNode.CurveTo(113.35423f, 182.30936f, 109.37743f, 180.00037f, 105.07f, 180.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
