package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorBoldIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 100.0f),
                    PathNode.CurveTo(84.0f, 93.37258f, 89.37258f, 88.0f, 96.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(166.62741f, 88.0f, 172.0f, 93.37258f, 172.0f, 100.0f),
                    PathNode.CurveTo(172.0f, 106.62742f, 166.62741f, 112.0f, 160.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(89.37258f, 112.0f, 84.0f, 106.62742f, 84.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(166.62741f, 152.0f, 172.0f, 146.62741f, 172.0f, 140.0f),
                    PathNode.CurveTo(172.0f, 133.37259f, 166.62741f, 128.0f, 160.0f, 128.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.CurveTo(89.37258f, 128.0f, 84.0f, 133.37259f, 84.0f, 140.0f),
                    PathNode.CurveTo(84.0f, 146.62741f, 89.37258f, 152.0f, 96.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 195.0457f, 227.0457f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(157.89f, 204.0f),
                    PathNode.LineTo(145.37f, 225.92f),
                    PathNode.CurveTo(141.81053f, 232.15656f, 135.18085f, 236.00621f, 128.0f, 236.00621f),
                    PathNode.CurveTo(120.81916f, 236.00621f, 114.18947f, 232.15656f, 110.63f, 225.92f),
                    PathNode.LineTo(98.11f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(28.954306f, 204.0f, 20.0f, 195.0457f, 20.0f, 184.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 44.954304f, 28.954306f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.LineTo(105.07f, 180.0f),
                    PathNode.CurveTo(109.37743f, 180.00037f, 113.35423f, 182.30936f, 115.49f, 186.05f),
                    PathNode.LineTo(128.0f, 207.94f),
                    PathNode.LineTo(140.51f, 186.05f),
                    PathNode.CurveTo(142.64577f, 182.30936f, 146.62257f, 180.00037f, 150.93f, 180.0f),
                    PathNode.LineTo(212.0f, 180.0f),
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
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
