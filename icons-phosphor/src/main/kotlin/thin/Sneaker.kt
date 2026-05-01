package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorThinIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.38f, 132.91f),
                    PathNode.LineTo(166.66f, 112.67f),
                    PathNode.CurveTo(159.23315f, 110.176285f, 153.19072f, 104.68514f, 150.0f, 97.53f),
                    PathNode.LineTo(126.69f, 43.12f),
                    PathNode.CurveTo(124.12808f, 37.3589f, 117.54462f, 34.563004f, 111.62f, 36.72f),
                    PathNode.LineTo(35.9f, 64.25f),
                    PathNode.CurveTo(31.156515f, 65.974464f, 27.999098f, 70.48278f, 28.0f, 75.53f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(246.62741f, 204.0f, 252.0f, 198.62741f, 252.0f, 192.0f),
                    PathNode.LineTo(252.0f, 167.06f),
                    PathNode.CurveTo(251.99828f, 151.56435f, 242.08107f, 137.80835f, 227.38f, 132.91f),
                    PathNode.Close,
                    PathNode.MoveTo(38.63f, 71.77f),
                    PathNode.LineTo(114.35f, 44.24f),
                    PathNode.CurveTo(114.78825f, 44.077274f, 115.25253f, 43.99594f, 115.72f, 44.0f),
                    PathNode.CurveTo(117.27866f, 44.00004f, 118.69536f, 44.90547f, 119.35f, 46.32f),
                    PathNode.LineTo(128.17f, 67.0f),
                    PathNode.LineTo(102.63f, 76.29f),
                    PathNode.CurveTo(100.87271f, 76.99577f, 99.85114f, 78.83711f, 100.18245f, 80.70163f),
                    PathNode.CurveTo(100.51376f, 82.56614f, 102.10715f, 83.942825f, 104.0f, 84.0f),
                    PathNode.CurveTo(104.466965f, 83.998215f, 104.93024f, 83.91706f, 105.37f, 83.76f),
                    PathNode.LineTo(131.32f, 74.32f),
                    PathNode.LineTo(139.21f, 92.76f),
                    PathNode.LineTo(118.63f, 100.24f),
                    PathNode.CurveTo(116.80371f, 100.90285f, 115.71783f, 102.782166f, 116.0556f, 104.695435f),
                    PathNode.CurveTo(116.39339f, 106.6087f, 118.057144f, 108.00258f, 120.0f, 108.0f),
                    PathNode.CurveTo(120.466965f, 107.998215f, 120.93024f, 107.91706f, 121.37f, 107.76f),
                    PathNode.LineTo(142.37f, 100.12f),
                    PathNode.LineTo(142.62f, 100.72f),
                    PathNode.CurveTo(145.49629f, 107.16164f, 150.19649f, 112.61969f, 156.14f, 116.42f),
                    PathNode.LineTo(134.64f, 124.24f),
                    PathNode.CurveTo(132.81549f, 124.90221f, 131.72968f, 126.77868f, 132.06474f, 128.6905f),
                    PathNode.CurveTo(132.39981f, 130.60234f, 134.05904f, 131.99773f, 136.0f, 132.0f),
                    PathNode.CurveTo(136.46696f, 131.99821f, 136.93024f, 131.91707f, 137.37f, 131.76f),
                    PathNode.LineTo(166.67f, 121.1f),
                    PathNode.LineTo(224.85f, 140.5f),
                    PathNode.CurveTo(235.22975f, 143.94981f, 242.65038f, 153.12798f, 243.85f, 164.0f),
                    PathNode.LineTo(36.0f, 164.0f),
                    PathNode.LineTo(36.0f, 75.53f),
                    PathNode.CurveTo(35.999187f, 73.84845f, 37.05015f, 72.34594f, 38.63f, 71.77f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 196.0f),
                    PathNode.LineTo(40.0f, 196.0f),
                    PathNode.CurveTo(37.79086f, 196.0f, 36.0f, 194.20914f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.LineTo(244.0f, 172.0f),
                    PathNode.LineTo(244.0f, 192.0f),
                    PathNode.CurveTo(244.0f, 194.20914f, 242.20914f, 196.0f, 240.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
