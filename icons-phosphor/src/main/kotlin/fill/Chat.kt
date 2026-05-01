package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorFillIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 200.83656f, 224.83656f, 208.0f, 216.0f, 208.0f),
                    PathNode.LineTo(83.0f, 208.0f),
                    PathNode.LineTo(50.4f, 236.16f),
                    PathNode.LineTo(50.31f, 236.23f),
                    PathNode.CurveTo(47.430332f, 238.67157f, 43.775406f, 240.00806f, 40.0f, 240.0f),
                    PathNode.CurveTo(37.65275f, 239.99594f, 35.334957f, 239.47708f, 33.21f, 238.48f),
                    PathNode.CurveTo(27.564875f, 235.87845f, 23.96305f, 230.21564f, 24.0f, 224.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 55.163445f, 31.163445f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(224.83656f, 48.0f, 232.0f, 55.163445f, 232.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chat!!
    }

private var _chat: ImageVector? = null
