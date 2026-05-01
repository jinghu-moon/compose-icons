package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorBoldIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.00058f, 28.766813f, 49.655075f, 27.375505f, 45.473907f, 28.278093f),
                    PathNode.CurveTo(41.292744f, 29.180681f, 37.908146f, 32.24069f, 36.59f, 36.31f),
                    PathNode.CurveTo(27.008842f, 37.967857f, 20.00834f, 46.27647f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 184.0f),
                    PathNode.CurveTo(20.0f, 195.0457f, 28.954306f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(98.11f, 204.0f),
                    PathNode.LineTo(110.63f, 225.92f),
                    PathNode.CurveTo(114.19082f, 232.15164f, 120.817764f, 235.99747f, 127.995f, 235.99747f),
                    PathNode.CurveTo(135.17224f, 235.99747f, 141.79918f, 232.15164f, 145.36f, 225.92f),
                    PathNode.LineTo(157.89f, 204.0f),
                    PathNode.LineTo(180.89f, 204.0f),
                    PathNode.LineTo(199.14f, 224.07f),
                    PathNode.CurveTo(203.61751f, 228.87978f, 211.1307f, 229.19368f, 215.99382f, 224.77417f),
                    PathNode.CurveTo(220.85693f, 220.35464f, 221.2609f, 212.84575f, 216.9f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(150.93f, 180.0f),
                    PathNode.CurveTo(146.62257f, 180.00037f, 142.64577f, 182.30936f, 140.51f, 186.05f),
                    PathNode.LineTo(128.0f, 207.94f),
                    PathNode.LineTo(115.49f, 186.05f),
                    PathNode.CurveTo(113.35423f, 182.30936f, 109.37743f, 180.00037f, 105.07f, 180.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(50.0f, 60.0f),
                    PathNode.LineTo(159.1f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 174.14f),
                    PathNode.CurveTo(236.0f, 180.76741f, 230.62741f, 186.14f, 224.0f, 186.14f),
                    PathNode.CurveTo(217.37259f, 186.14f, 212.0f, 180.76741f, 212.0f, 174.14f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.LineTo(109.33f, 60.0f),
                    PathNode.CurveTo(102.70258f, 60.0f, 97.33f, 54.62742f, 97.33f, 48.0f),
                    PathNode.CurveTo(97.33f, 41.37258f, 102.70258f, 36.0f, 109.33f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
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
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
