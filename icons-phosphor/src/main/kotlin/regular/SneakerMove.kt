package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorRegularIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.16f, 166.63f),
                    PathNode.LineTo(202.53f, 152.32f),
                    PathNode.CurveTo(186.22768f, 144.23561f, 175.93893f, 127.58668f, 176.0f, 109.39f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 75.58172f, 172.41827f, 72.0f, 168.0f, 72.0f),
                    PathNode.CurveTo(141.50175f, 71.97244f, 120.02756f, 50.498245f, 120.0f, 24.0f),
                    PathNode.CurveTo(119.9972f, 20.964388f, 118.276535f, 18.191877f, 115.557594f, 16.841946f),
                    PathNode.CurveTo(112.83865f, 15.492012f, 109.58991f, 15.797247f, 107.17f, 17.63f),
                    PathNode.LineTo(30.13f, 76.0f),
                    PathNode.LineTo(29.93f, 76.16f),
                    PathNode.CurveTo(26.405987f, 79.01437f, 24.25879f, 83.23011f, 24.022339f, 87.75893f),
                    PathNode.CurveTo(23.785889f, 92.28774f, 25.482393f, 96.70417f, 28.69f, 99.91f),
                    PathNode.LineTo(142.4f, 213.66f),
                    PathNode.CurveTo(143.90158f, 215.15993f, 145.93762f, 216.00166f, 148.06f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(232.83656f, 216.0f, 240.0f, 208.83656f, 240.0f, 200.0f),
                    PathNode.LineTo(240.0f, 180.94f),
                    PathNode.CurveTo(240.0194f, 174.87563f, 236.5917f, 169.32695f, 231.16f, 166.63f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.LineTo(151.37f, 200.0f),
                    PathNode.LineTo(40.0f, 88.63f),
                    PathNode.LineTo(52.87f, 78.87f),
                    PathNode.LineTo(91.66f, 117.66f),
                    PathNode.CurveTo(94.785934f, 120.79146f, 99.85854f, 120.79593f, 102.99f, 117.67f),
                    PathNode.CurveTo(106.12145f, 114.54407f, 106.12593f, 109.47145f, 103.0f, 106.34f),
                    PathNode.LineTo(65.74f, 69.11f),
                    PathNode.LineTo(105.74f, 38.8f),
                    PathNode.CurveTo(111.94723f, 64.73277f, 133.54959f, 84.121544f, 160.0f, 87.5f),
                    PathNode.LineTo(160.0f, 109.39f),
                    PathNode.CurveTo(159.91904f, 133.65396f, 173.64043f, 155.85329f, 195.38f, 166.63f),
                    PathNode.LineTo(224.0f, 180.94f),
                    PathNode.Close,
                    PathNode.MoveTo(70.8f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(27.581722f, 184.0f, 24.0f, 180.41827f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 171.58173f, 27.581722f, 168.0f, 32.0f, 168.0f),
                    PathNode.LineTo(70.8f, 168.0f),
                    PathNode.CurveTo(75.21828f, 168.0f, 78.8f, 171.58173f, 78.8f, 176.0f),
                    PathNode.CurveTo(78.8f, 180.41827f, 75.21828f, 184.0f, 70.8f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.8f, 208.0f),
                    PathNode.CurveTo(110.8f, 212.41827f, 107.21828f, 216.0f, 102.8f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 203.58173f, 43.581722f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(102.8f, 200.0f),
                    PathNode.CurveTo(107.21828f, 200.0f, 110.8f, 203.58173f, 110.8f, 208.0f),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
