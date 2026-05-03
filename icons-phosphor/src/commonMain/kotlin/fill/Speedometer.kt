package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorFillIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.87f, 90.86f),
                    PathNode.CurveTo(221.20734f, 89.85674f, 220.12857f, 89.20478f, 218.93225f, 89.084564f),
                    PathNode.CurveTo(217.73595f, 88.964355f, 216.54901f, 89.38865f, 215.7f, 90.24f),
                    PathNode.LineTo(140.28f, 165.66f),
                    PathNode.CurveTo(137.11101f, 168.47644f, 132.29509f, 168.33156f, 129.30116f, 165.32967f),
                    PathNode.CurveTo(126.30724f, 162.32779f, 126.17513f, 157.51149f, 129.0f, 154.35f),
                    PathNode.LineTo(221.7f, 61.66f),
                    PathNode.CurveTo(224.82591f, 58.53407f, 224.82591f, 53.46593f, 221.7f, 50.34f),
                    PathNode.CurveTo(218.57407f, 47.21407f, 213.50594f, 47.21407f, 210.38f, 50.34f),
                    PathNode.LineTo(197.0f, 63.73f),
                    PathNode.CurveTo(157.77841f, 33.097878f, 103.05275f, 32.0056f, 62.640095f, 61.04829f),
                    PathNode.CurveTo(22.22744f, 90.09098f, 5.812952f, 142.30836f, 22.34f, 189.25f),
                    PathNode.CurveTo(24.598913f, 195.67072f, 30.653563f, 199.97543f, 37.46f, 200.0f),
                    PathNode.LineTo(218.53f, 200.0f),
                    PathNode.CurveTo(225.331f, 200.00417f, 231.39142f, 195.70853f, 233.64f, 189.29f),
                    PathNode.CurveTo(245.19702f, 156.43051f, 240.8489f, 120.06808f, 221.87f, 90.86f),
                    PathNode.Close,
                    PathNode.MoveTo(57.44f, 166.41f),
                    PathNode.CurveTo(58.3179f, 170.73987f, 55.51978f, 174.96167f, 51.19f, 175.84f),
                    PathNode.CurveTo(50.663506f, 175.94768f, 50.12739f, 176.0013f, 49.59f, 176.0f),
                    PathNode.CurveTo(45.78854f, 175.99506f, 42.515537f, 173.31563f, 41.76f, 169.59f),
                    PathNode.CurveTo(35.95151f, 140.99686f, 44.68282f, 111.383125f, 65.07449f, 90.51485f),
                    PathNode.CurveTo(85.46617f, 69.646576f, 114.87033f, 60.23354f, 143.59f, 65.38f),
                    PathNode.CurveTo(147.93924f, 66.15872f, 150.83372f, 70.31576f, 150.055f, 74.665f),
                    PathNode.CurveTo(149.27628f, 79.01425f, 145.11925f, 81.90872f, 140.77f, 81.13f),
                    PathNode.CurveTo(117.268326f, 76.92254f, 93.20831f, 84.62713f, 76.52226f, 101.70364f),
                    PathNode.CurveTo(59.83622f, 118.78015f, 52.69014f, 143.01192f, 57.44f, 166.41f),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
