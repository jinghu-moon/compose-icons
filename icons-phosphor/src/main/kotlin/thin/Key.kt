package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorThinIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.740 42.260 C 188.567 17.062 149.272 12.725 119.211 31.828 C 89.149 50.932 76.387 88.349 88.510 121.840 L 31.510 178.840 C 29.258 181.083 27.995 184.132 28.000 187.310 L 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 72.000 228.000 C 74.209 228.000 76.000 226.209 76.000 224.000 L 76.000 204.000 L 96.000 204.000 C 98.209 204.000 100.000 202.209 100.000 200.000 L 100.000 180.000 L 120.000 180.000 C 121.061 180.001 122.079 179.580 122.830 178.830 L 134.160 167.490 C 142.445 170.485 151.190 172.011 160.000 172.000 L 160.100 172.000 C 190.821 171.960 218.496 153.428 230.234 125.038 C 241.971 96.648 235.463 63.983 213.740 42.260 ZM 227.960 98.260 C 226.810 134.480 196.360 163.980 160.090 164.030 L 160.000 164.030 C 151.365 164.047 142.807 162.407 134.790 159.200 C 133.278 158.530 131.509 158.860 130.340 160.030 L 118.340 172.030 L 96.000 172.030 C 93.791 172.030 92.000 173.821 92.000 176.030 L 92.000 196.030 L 72.000 196.030 C 69.791 196.030 68.000 197.821 68.000 200.030 L 68.000 220.030 L 40.000 220.030 C 37.791 220.030 36.000 218.239 36.000 216.030 L 36.000 187.310 C 36.006 186.250 36.426 185.234 37.170 184.480 L 96.000 125.660 C 97.170 124.491 97.500 122.722 96.830 121.210 C 93.611 113.165 91.971 104.575 92.000 95.910 C 92.000 59.640 121.550 29.190 157.770 28.000 C 176.582 27.372 194.812 34.570 208.121 47.879 C 221.430 61.188 228.628 79.418 228.000 98.230 ZM 188.000 76.000 C 188.000 80.418 184.418 84.000 180.000 84.000 C 175.582 84.000 172.000 80.418 172.000 76.000 C 172.000 71.582 175.582 68.000 180.000 68.000 C 184.418 68.000 188.000 71.582 188.000 76.000 Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
