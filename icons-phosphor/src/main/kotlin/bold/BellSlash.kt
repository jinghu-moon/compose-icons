package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorBoldIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.880 207.930 L 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 53.920 64.360 C 47.385 76.549 43.976 90.169 44.000 104.000 C 44.000 129.580 39.410 151.000 30.730 165.930 C 27.131 172.131 27.112 179.781 30.680 186.000 C 34.214 192.226 40.841 196.052 48.000 196.000 L 84.190 196.000 C 86.299 218.620 105.282 235.915 128.000 235.915 C 150.718 235.915 169.701 218.620 171.810 196.000 L 173.600 196.000 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 68.000 104.000 C 67.992 97.084 69.183 90.219 71.520 83.710 L 151.780 172.000 L 54.680 172.000 C 63.520 154.000 68.000 131.140 68.000 104.000 ZM 128.000 212.000 C 118.495 212.002 110.301 205.313 108.400 196.000 L 147.600 196.000 C 145.699 205.313 137.505 212.002 128.000 212.000 ZM 88.890 42.350 C 87.649 39.419 87.623 36.116 88.817 33.166 C 90.012 30.216 92.329 27.861 95.260 26.620 C 121.205 15.639 150.927 18.396 174.409 33.961 C 197.892 49.527 212.008 75.827 212.000 104.000 C 212.000 122.680 214.380 138.930 219.070 152.280 C 221.279 158.532 218.002 165.391 211.750 167.600 C 205.498 169.809 198.639 166.532 196.430 160.280 C 190.830 144.320 188.000 125.400 188.000 104.000 C 188.008 83.877 177.927 65.089 161.155 53.970 C 144.382 42.850 123.153 40.879 104.620 48.720 C 101.689 49.961 98.386 49.987 95.436 48.793 C 92.486 47.598 90.131 45.281 88.890 42.350 Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
