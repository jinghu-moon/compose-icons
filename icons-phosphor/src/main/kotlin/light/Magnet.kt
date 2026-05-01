package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorLightIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.56f, 51.65f),
                    PathNode.CurveTo(189.50339f, 35.26894f, 167.53806f, 26.026632f, 144.6f, 26.0f),
                    PathNode.LineTo(144.27f, 26.0f),
                    PathNode.CurveTo(121.431366f, 25.936993f, 99.51794f, 35.019268f, 83.42f, 51.22f),
                    PathNode.LineTo(22.0f, 113.39f),
                    PathNode.CurveTo(16.588432f, 118.86702f, 16.615236f, 127.68599f, 22.06f, 133.13f),
                    PathNode.LineTo(50.72f, 161.79f),
                    PathNode.CurveTo(53.3388f, 164.42578f, 56.904453f, 165.90247f, 60.62f, 165.89f),
                    PathNode.LineTo(60.7f, 165.89f),
                    PathNode.CurveTo(64.4452f, 165.88309f, 68.02914f, 164.36514f, 70.64f, 161.68f),
                    PathNode.LineTo(131.51f, 99.28f),
                    PathNode.CurveTo(138.46086f, 92.36142f, 149.65742f, 92.23725f, 156.76f, 99.0f),
                    PathNode.CurveTo(160.16891f, 102.31449f, 162.09457f, 106.86537f, 162.1f, 111.62f),
                    PathNode.CurveTo(162.13454f, 116.64297f, 160.17863f, 121.47523f, 156.66f, 125.06f),
                    PathNode.LineTo(94.37f, 185.31f),
                    PathNode.CurveTo(91.67811f, 187.92126f, 90.14644f, 191.50337f, 90.11824f, 195.2536f),
                    PathNode.CurveTo(90.09004f, 199.00381f, 91.56767f, 202.60857f, 94.22f, 205.26f),
                    PathNode.LineTo(122.89f, 233.92f),
                    PathNode.CurveTo(128.32957f, 239.32254f, 137.09586f, 239.36703f, 142.59f, 234.02f),
                    PathNode.LineTo(204.39f, 173.53f),
                    PathNode.CurveTo(238.07f, 139.86f, 238.6f, 85.18f, 205.56f, 51.65f),
                    PathNode.Close,
                    PathNode.MoveTo(62.08f, 153.29f),
                    PathNode.CurveTo(61.705856f, 153.6717f, 61.194492f, 153.88779f, 60.66f, 153.89f),
                    PathNode.CurveTo(60.131454f, 153.87784f, 59.625923f, 153.67134f, 59.24f, 153.31f),
                    PathNode.LineTo(30.57f, 124.65f),
                    PathNode.CurveTo(29.794554f, 123.86993f, 29.794554f, 122.61008f, 30.57f, 121.83f),
                    PathNode.LineTo(55.79f, 96.28f),
                    PathNode.LineTo(87.13f, 127.62f),
                    PathNode.Close,
                    PathNode.MoveTo(134.19f, 225.44f),
                    PathNode.CurveTo(133.40993f, 226.21545f, 132.15007f, 226.21545f, 131.37f, 225.44f),
                    PathNode.LineTo(102.71f, 196.78f),
                    PathNode.CurveTo(102.32949f, 196.40176f, 102.1169f, 195.8865f, 102.12f, 195.35f),
                    PathNode.CurveTo(102.12488f, 194.81898f, 102.34074f, 194.3117f, 102.72f, 193.94f),
                    PathNode.LineTo(128.51f, 169.0f),
                    PathNode.LineTo(159.85f, 200.33f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 165.0f),
                    PathNode.LineTo(168.48f, 191.94f),
                    PathNode.LineTo(137.19f, 160.65f),
                    PathNode.LineTo(165.09f, 133.65f),
                    PathNode.LineTo(165.16f, 133.57f),
                    PathNode.CurveTo(170.98538f, 127.713486f, 174.2261f, 119.77012f, 174.16f, 111.51f),
                    PathNode.CurveTo(174.14633f, 103.53244f, 170.899f, 95.901245f, 165.16f, 90.36f),
                    PathNode.CurveTo(153.3239f, 79.090866f, 134.66693f, 79.294815f, 123.08f, 90.82f),
                    PathNode.LineTo(95.51f, 119.0f),
                    PathNode.LineTo(64.22f, 87.74f),
                    PathNode.LineTo(91.94f, 59.68f),
                    PathNode.CurveTo(105.784424f, 45.749386f, 124.63007f, 37.94175f, 144.27f, 38.0f),
                    PathNode.LineTo(144.55f, 38.0f),
                    PathNode.CurveTo(164.28847f, 38.020763f, 183.18953f, 45.97759f, 197.0f, 60.08f),
                    PathNode.CurveTo(225.44f, 88.92f, 224.94f, 136.0f, 196.0f, 165.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _magnet!!
    }

private var _magnet: ImageVector? = null
