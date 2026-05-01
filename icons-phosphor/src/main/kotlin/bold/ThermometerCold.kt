package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorBoldIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 27.281193f, 136.71881f, 4.0f, 108.0f, 4.0f),
                    PathNode.CurveTo(79.2812f, 4.0f, 56.0f, 27.281193f, 56.0f, 56.0f),
                    PathNode.LineTo(56.0f, 150.69f),
                    PathNode.CurveTo(36.960873f, 177.22572f, 40.95614f, 213.84044f, 65.27006f, 235.64563f),
                    PathNode.CurveTo(89.58397f, 257.4508f, 126.41603f, 257.4508f, 150.72995f, 235.64563f),
                    PathNode.CurveTo(175.04385f, 213.84044f, 179.03912f, 177.22572f, 160.0f, 150.69f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 228.0f),
                    PathNode.CurveTo(92.53006f, 228.0005f, 78.44672f, 219.08052f, 71.835464f, 205.09445f),
                    PathNode.CurveTo(65.224205f, 191.10835f, 67.27045f, 174.5639f, 77.09f, 162.61f),
                    PathNode.CurveTo(78.96643f, 160.43274f, 79.99904f, 157.65428f, 80.0f, 154.78f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(80.0f, 40.53603f, 92.536026f, 28.0f, 108.0f, 28.0f),
                    PathNode.CurveTo(123.463974f, 28.0f, 136.0f, 40.53603f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 154.77f),
                    PathNode.CurveTo(135.99733f, 157.57507f, 136.97742f, 160.29243f, 138.77f, 162.45f),
                    PathNode.CurveTo(148.67447f, 174.38055f, 150.79147f, 190.96053f, 144.20256f, 204.99702f),
                    PathNode.CurveTo(137.61365f, 219.03352f, 123.50603f, 227.99745f, 108.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.14f, 81.52f),
                    PathNode.LineTo(231.42f, 86.31f),
                    PathNode.LineTo(240.52f, 98.83f),
                    PathNode.CurveTo(244.41637f, 104.19269f, 243.22769f, 111.69863f, 237.865f, 115.595f),
                    PathNode.CurveTo(232.50232f, 119.49137f, 224.99637f, 118.30269f, 221.1f, 112.94f),
                    PathNode.LineTo(212.0f, 100.42f),
                    PathNode.LineTo(202.9f, 112.94f),
                    PathNode.CurveTo(199.00363f, 118.30269f, 191.49768f, 119.49137f, 186.135f, 115.595f),
                    PathNode.CurveTo(180.77231f, 111.69863f, 179.58363f, 104.19269f, 183.48f, 98.83f),
                    PathNode.LineTo(192.58f, 86.31f),
                    PathNode.LineTo(177.86f, 81.52f),
                    PathNode.CurveTo(173.68488f, 80.27548f, 170.51224f, 76.86585f, 169.5712f, 72.612045f),
                    PathNode.CurveTo(168.63014f, 68.35824f, 170.06854f, 63.928543f, 173.32912f, 61.039066f),
                    PathNode.CurveTo(176.58969f, 58.149586f, 181.16022f, 57.254284f, 185.27f, 58.7f),
                    PathNode.LineTo(200.0f, 63.48f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.CurveTo(200.0f, 41.37258f, 205.37259f, 36.0f, 212.0f, 36.0f),
                    PathNode.CurveTo(218.62741f, 36.0f, 224.0f, 41.37258f, 224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 63.48f),
                    PathNode.LineTo(238.73f, 58.7f),
                    PathNode.CurveTo(242.83978f, 57.254284f, 247.41031f, 58.149586f, 250.67088f, 61.039066f),
                    PathNode.CurveTo(253.93146f, 63.928543f, 255.36986f, 68.35824f, 254.4288f, 72.612045f),
                    PathNode.CurveTo(253.48776f, 76.86585f, 250.31512f, 80.27548f, 246.14f, 81.52f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 188.0f),
                    PathNode.CurveTo(132.00224f, 199.64763f, 123.641f, 209.6154f, 112.170586f, 211.63947f),
                    PathNode.CurveTo(100.700165f, 213.66351f, 89.43233f, 207.15947f, 85.44791f, 196.21454f),
                    PathNode.CurveTo(81.46348f, 185.2696f, 85.91286f, 173.04381f, 96.0f, 167.22f),
                    PathNode.LineTo(96.0f, 132.0f),
                    PathNode.CurveTo(96.0f, 125.37258f, 101.37258f, 120.0f, 108.0f, 120.0f),
                    PathNode.CurveTo(114.62742f, 120.0f, 120.0f, 125.37258f, 120.0f, 132.0f),
                    PathNode.LineTo(120.0f, 167.22f),
                    PathNode.CurveTo(127.4242f, 171.50636f, 131.99835f, 179.42728f, 132.0f, 188.0f),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
