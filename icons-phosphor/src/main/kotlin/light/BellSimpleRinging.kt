package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorLightIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 165.920 224.000 C 165.920 227.314 163.234 230.000 159.920 230.000 L 95.920 230.000 C 92.606 230.000 89.920 227.314 89.920 224.000 C 89.920 220.686 92.606 218.000 95.920 218.000 L 159.920 218.000 C 163.234 218.000 165.920 220.686 165.920 224.000 ZM 225.610 61.230 C 216.787 43.972 203.530 29.372 187.200 18.930 C 184.410 17.318 180.845 18.198 179.125 20.923 C 177.405 23.648 178.144 27.245 180.800 29.070 C 195.383 38.328 207.198 51.349 215.000 66.760 C 216.527 69.701 220.149 70.847 223.090 69.320 C 226.031 67.793 227.177 64.171 225.650 61.230 ZM 41.000 66.760 C 48.802 51.349 60.617 38.328 75.200 29.070 C 77.856 27.245 78.595 23.648 76.875 20.923 C 75.155 18.198 71.590 17.318 68.800 18.930 C 52.470 29.372 39.213 43.972 30.390 61.230 C 29.198 63.143 29.179 65.562 30.340 67.494 C 31.500 69.425 33.646 70.544 35.894 70.389 C 38.143 70.234 40.115 68.833 41.000 66.760 ZM 220.000 176.930 C 222.526 181.247 222.557 186.583 220.082 190.929 C 217.607 195.275 213.001 197.970 208.000 198.000 L 48.000 198.000 C 43.010 197.977 38.409 195.300 35.924 190.972 C 33.439 186.645 33.445 181.322 35.940 177.000 C 45.130 161.080 50.000 138.620 50.000 112.000 C 50.000 68.922 84.922 34.000 128.000 34.000 C 171.078 34.000 206.000 68.922 206.000 112.000 C 206.000 139.000 210.740 160.840 220.080 176.930 ZM 209.630 182.930 C 199.290 165.000 194.000 141.140 194.000 112.000 C 194.000 75.549 164.451 46.000 128.000 46.000 C 91.549 46.000 62.000 75.549 62.000 112.000 C 62.000 141.160 56.710 165.000 46.290 183.000 C 45.933 183.619 45.933 184.381 46.290 185.000 C 46.626 185.624 47.281 186.010 47.990 186.000 L 208.000 186.000 C 208.709 186.010 209.364 185.624 209.700 185.000 C 210.060 184.383 210.064 183.621 209.710 183.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
