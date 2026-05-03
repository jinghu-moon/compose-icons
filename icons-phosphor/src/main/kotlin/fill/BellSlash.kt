package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorFillIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.840 192.000 L 221.840 192.000 C 221.540 192.517 221.008 192.857 220.412 192.913 C 219.817 192.968 219.231 192.733 218.840 192.280 L 83.270 43.190 C 82.499 42.321 82.144 41.159 82.297 40.007 C 82.451 38.855 83.098 37.827 84.070 37.190 C 97.432 28.352 113.151 23.755 129.170 24.000 C 173.000 24.660 207.800 61.100 208.000 104.920 C 208.140 139.800 216.310 166.460 221.820 175.920 C 224.738 180.881 224.746 187.032 221.840 192.000 ZM 213.920 210.620 C 216.891 213.892 216.647 218.954 213.375 221.925 C 210.103 224.896 205.041 224.652 202.070 221.380 L 182.620 200.000 L 167.160 200.000 C 163.384 218.654 146.988 232.065 127.955 232.065 C 108.922 232.065 92.526 218.654 88.750 200.000 L 47.910 200.000 C 42.361 200.036 37.200 197.154 34.320 192.410 C 31.258 187.280 31.223 180.892 34.230 175.730 C 39.780 166.000 47.930 139.090 47.930 104.000 C 47.919 89.890 51.668 76.031 58.790 63.850 L 42.000 45.380 C 40.037 43.271 39.359 40.270 40.226 37.522 C 41.093 34.775 43.370 32.706 46.187 32.105 C 49.005 31.504 51.928 32.465 53.840 34.620 ZM 150.590 200.000 L 105.320 200.000 C 108.704 209.600 117.776 216.021 127.955 216.021 C 138.134 216.021 147.206 209.600 150.590 200.000 Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
