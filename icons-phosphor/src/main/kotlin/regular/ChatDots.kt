package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorRegularIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 140.0f),
                    PathNode.CurveTo(90.62742f, 140.0f, 96.0f, 134.62741f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 121.37258f, 90.62742f, 116.0f, 84.0f, 116.0f),
                    PathNode.CurveTo(77.37258f, 116.0f, 72.0f, 121.37258f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 134.62741f, 77.37258f, 140.0f, 84.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 140.0f),
                    PathNode.CurveTo(178.62741f, 140.0f, 184.0f, 134.62741f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 121.37258f, 178.62741f, 116.0f, 172.0f, 116.0f),
                    PathNode.CurveTo(165.37259f, 116.0f, 160.0f, 121.37258f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 134.62741f, 165.37259f, 140.0f, 172.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 200.83656f, 224.83656f, 208.0f, 216.0f, 208.0f),
                    PathNode.LineTo(83.0f, 208.0f),
                    PathNode.LineTo(50.4f, 236.16f),
                    PathNode.LineTo(50.31f, 236.23f),
                    PathNode.CurveTo(47.430332f, 238.67157f, 43.775406f, 240.00806f, 40.0f, 240.0f),
                    PathNode.CurveTo(37.649666f, 239.99481f, 35.328854f, 239.47604f, 33.2f, 238.48f),
                    PathNode.CurveTo(27.56051f, 235.87352f, 23.963787f, 230.21259f, 24.0f, 224.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 55.163445f, 31.163445f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(224.83656f, 48.0f, 232.0f, 55.163445f, 232.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.LineTo(74.77f, 194.0f),
                    PathNode.CurveTo(76.21549f, 192.72508f, 78.07266f, 192.01488f, 80.0f, 192.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
