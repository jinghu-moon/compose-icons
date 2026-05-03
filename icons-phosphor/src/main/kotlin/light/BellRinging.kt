package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) return _bellRinging!!
        _bellRinging = phosphorLightIcon(
            name = "BellRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.050 69.330 C 220.116 70.829 216.523 69.681 215.000 66.760 C 207.197 51.352 195.382 38.335 180.800 29.080 C 178.038 27.296 177.227 23.621 178.981 20.840 C 180.734 18.059 184.400 17.207 187.200 18.930 C 203.530 29.376 216.787 43.979 225.610 61.240 C 226.343 62.652 226.486 64.298 226.006 65.815 C 225.525 67.332 224.462 68.597 223.050 69.330 ZM 41.000 66.760 C 48.803 51.352 60.618 38.335 75.200 29.080 C 77.962 27.296 78.773 23.621 77.019 20.840 C 75.266 18.059 71.600 17.207 68.800 18.930 C 52.470 29.376 39.213 43.979 30.390 61.240 C 29.187 63.154 29.161 65.581 30.324 67.520 C 31.487 69.459 33.640 70.579 35.895 70.419 C 38.150 70.258 40.124 68.844 41.000 66.760 ZM 220.000 176.940 C 222.521 181.256 222.549 186.589 220.075 190.931 C 217.600 195.274 212.998 197.968 208.000 198.000 L 165.500 198.000 C 162.490 216.370 146.615 229.856 128.000 229.856 C 109.385 229.856 93.510 216.370 90.500 198.000 L 48.000 198.000 C 42.991 197.989 38.370 195.304 35.880 190.957 C 33.391 186.611 33.414 181.265 35.940 176.940 C 45.130 161.090 50.000 138.630 50.000 112.000 C 50.000 68.922 84.922 34.000 128.000 34.000 C 171.078 34.000 206.000 68.922 206.000 112.000 C 206.000 139.000 210.740 160.860 220.080 176.940 ZM 153.290 198.000 L 102.710 198.000 C 105.503 209.706 115.965 217.965 128.000 217.965 C 140.035 217.965 150.497 209.706 153.290 198.000 ZM 209.710 183.000 C 199.290 165.000 194.000 141.150 194.000 112.000 C 194.000 75.549 164.451 46.000 128.000 46.000 C 91.549 46.000 62.000 75.549 62.000 112.000 C 62.000 141.160 56.710 165.000 46.290 183.000 C 45.933 183.619 45.933 184.381 46.290 185.000 C 46.626 185.624 47.281 186.010 47.990 186.000 L 208.000 186.000 C 208.709 186.010 209.364 185.624 209.700 185.000 C 210.060 184.383 210.064 183.621 209.710 183.000 Z"),
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
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
