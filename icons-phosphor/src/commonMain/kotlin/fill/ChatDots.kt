package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorFillIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 224.0f),
                    PathNode.CurveTo(23.962313f, 230.23218f, 27.582624f, 235.90726f, 33.25f, 238.5f),
                    PathNode.CurveTo(35.364292f, 239.4845f, 37.66774f, 239.99637f, 40.0f, 240.0f),
                    PathNode.CurveTo(43.75604f, 239.99104f, 47.38747f, 238.65184f, 50.25f, 236.22f),
                    PathNode.LineTo(50.34f, 236.15f),
                    PathNode.LineTo(83.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 55.163445f, 224.83656f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 140.0f),
                    PathNode.CurveTo(77.37258f, 140.0f, 72.0f, 134.62741f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 121.37258f, 77.37258f, 116.0f, 84.0f, 116.0f),
                    PathNode.CurveTo(90.62742f, 116.0f, 96.0f, 121.37258f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 134.62741f, 90.62742f, 140.0f, 84.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 140.0f),
                    PathNode.CurveTo(165.37259f, 140.0f, 160.0f, 134.62741f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 121.37258f, 165.37259f, 116.0f, 172.0f, 116.0f),
                    PathNode.CurveTo(178.62741f, 116.0f, 184.0f, 121.37258f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 134.62741f, 178.62741f, 140.0f, 172.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
