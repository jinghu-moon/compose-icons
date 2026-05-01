package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorRegularIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.06f, 110.59f),
                    PathNode.LineTo(208.0f, 106.23f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(208.0f, 47.163445f, 200.83656f, 40.0f, 192.0f, 40.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(55.163445f, 40.0f, 48.0f, 47.163445f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 106.23f),
                    PathNode.LineTo(34.94f, 110.59f),
                    PathNode.CurveTo(28.406294f, 112.768074f, 23.999489f, 118.88281f, 24.0f, 125.77f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 213.54f, 121.89f, 238.72f, 126.06f, 239.76f),
                    PathNode.CurveTo(127.33374f, 240.07838f, 128.66626f, 240.07838f, 129.94f, 239.76f),
                    PathNode.CurveTo(134.11f, 238.72f, 232.0f, 213.54f, 232.0f, 152.0f),
                    PathNode.LineTo(232.0f, 125.77f),
                    PathNode.CurveTo(232.0005f, 118.88281f, 227.59372f, 112.768074f, 221.06f, 110.59f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.LineTo(192.0f, 100.9f),
                    PathNode.LineTo(130.53f, 80.41f),
                    PathNode.CurveTo(128.88776f, 79.86254f, 127.11224f, 79.86254f, 125.47f, 80.41f),
                    PathNode.LineTo(64.0f, 100.9f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 176.91f, 192.32f, 195.0f, 172.45f, 205.83f),
                    PathNode.CurveTo(158.3024f, 213.33711f, 143.40358f, 219.33351f, 128.0f, 223.72f),
                    PathNode.CurveTo(112.689224f, 219.3797f, 97.87767f, 213.44034f, 83.81f, 206.0f),
                    PathNode.CurveTo(47.6f, 186.35f, 40.0f, 165.79f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 125.77f),
                    PathNode.LineTo(120.0f, 99.1f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.CurveTo(120.0f, 172.41827f, 123.58172f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(132.41827f, 176.0f, 136.0f, 172.41827f, 136.0f, 168.0f),
                    PathNode.LineTo(136.0f, 99.1f),
                    PathNode.LineTo(216.0f, 125.77f),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
