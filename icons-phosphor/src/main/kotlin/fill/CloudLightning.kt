package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorFillIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.000 168.000 L 132.530 168.000 L 118.130 192.000 L 144.000 192.000 C 146.883 191.999 149.544 193.550 150.965 196.059 C 152.385 198.569 152.345 201.648 150.860 204.120 L 126.860 244.120 C 124.585 247.909 119.669 249.135 115.880 246.860 C 112.091 244.585 110.865 239.669 113.140 235.880 L 129.870 208.000 L 104.000 208.000 C 101.117 208.001 98.456 206.450 97.035 203.941 C 95.615 201.431 95.655 198.352 97.140 195.880 L 113.870 168.000 L 76.870 168.000 C 48.120 168.000 24.200 145.070 24.000 116.360 C 23.867 93.158 39.096 72.665 61.350 66.100 C 62.719 65.704 64.195 66.066 65.226 67.051 C 66.256 68.036 66.684 69.495 66.350 70.880 C 65.071 76.301 64.285 81.827 64.000 87.390 C 63.728 91.794 67.015 95.613 71.410 96.000 L 72.010 96.000 C 76.315 95.954 79.848 92.579 80.090 88.280 C 82.121 46.840 117.011 14.686 158.479 16.040 C 199.947 17.394 232.666 51.755 231.989 93.240 C 231.312 134.724 197.490 167.999 156.000 168.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
