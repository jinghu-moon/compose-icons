package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorRegularIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.34f, 112.0f),
                    PathNode.LineTo(183.88f, 44.08f),
                    PathNode.CurveTo(146.36621f, 6.641141f, 85.62379f, 6.641141f, 48.11f, 44.08f),
                    PathNode.LineTo(48.02f, 44.17f),
                    PathNode.LineTo(34.25f, 58.4f),
                    PathNode.CurveTo(31.282795f, 61.588753f, 31.411936f, 66.56533f, 34.540527f, 69.595894f),
                    PathNode.CurveTo(37.66912f, 72.626465f, 42.647285f, 72.597176f, 45.74f, 69.53f),
                    PathNode.LineTo(59.47f, 55.35f),
                    PathNode.CurveTo(64.99388f, 49.827232f, 71.29757f, 45.144104f, 78.18f, 41.45f),
                    PathNode.LineTo(124.68f, 88.0f),
                    PathNode.LineTo(28.68f, 184.0f),
                    PathNode.CurveTo(25.678629f, 187.00069f, 23.992416f, 191.0709f, 23.992416f, 195.315f),
                    PathNode.CurveTo(23.992416f, 199.5591f, 25.678629f, 203.62932f, 28.68f, 206.63f),
                    PathNode.LineTo(49.37f, 227.32f),
                    PathNode.CurveTo(52.370686f, 230.32137f, 56.440903f, 232.00758f, 60.685f, 232.00758f),
                    PathNode.CurveTo(64.9291f, 232.00758f, 68.99931f, 230.32137f, 72.0f, 227.32f),
                    PathNode.LineTo(168.0f, 131.32f),
                    PathNode.LineTo(182.34f, 145.66f),
                    PathNode.LineTo(182.34f, 145.66f),
                    PathNode.LineTo(200.0f, 163.3f),
                    PathNode.CurveTo(203.00069f, 166.30138f, 207.0709f, 167.98758f, 211.315f, 167.98758f),
                    PathNode.CurveTo(215.5591f, 167.98758f, 219.62932f, 166.30138f, 222.63f, 163.3f),
                    PathNode.LineTo(251.32f, 134.61f),
                    PathNode.CurveTo(257.56232f, 128.36913f, 257.57126f, 118.25191f, 251.34f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.68f, 216.0f),
                    PathNode.LineTo(40.0f, 195.31f),
                    PathNode.LineTo(108.0f, 127.31f),
                    PathNode.LineTo(128.68f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.34f, 114.32f),
                    PathNode.LineTo(140.0f, 136.67f),
                    PathNode.LineTo(119.31f, 116.0f),
                    PathNode.LineTo(141.66f, 93.65f),
                    PathNode.CurveTo(143.16223f, 92.14945f, 144.00629f, 90.11327f, 144.00629f, 87.99f),
                    PathNode.CurveTo(144.00629f, 85.86673f, 143.16223f, 83.83054f, 141.66f, 82.33f),
                    PathNode.LineTo(94.32f, 35.0f),
                    PathNode.CurveTo(122.168846f, 27.156744f, 152.08249f, 34.961132f, 172.55f, 55.41f),
                    PathNode.LineTo(216.77f, 99.92f),
                    PathNode.LineTo(188.0f, 128.66f),
                    PathNode.LineTo(173.66f, 114.32f),
                    PathNode.CurveTo(172.15945f, 112.81779f, 170.12328f, 111.97371f, 168.0f, 111.97371f),
                    PathNode.CurveTo(165.87672f, 111.97371f, 163.84055f, 112.81779f, 162.34f, 114.32f),
                    PathNode.Close,
                    PathNode.MoveTo(211.34f, 151.98f),
                    PathNode.LineTo(199.34f, 139.98f),
                    PathNode.LineTo(228.0f, 111.25f),
                    PathNode.LineTo(240.0f, 123.25f),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
