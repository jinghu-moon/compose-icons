package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) return _bellSimpleSlash!!
        _bellSimpleSlash = phosphorFillIcon(
            name = "BellSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.840 192.000 L 221.840 192.000 C 221.540 192.517 221.008 192.857 220.412 192.913 C 219.817 192.968 219.231 192.733 218.840 192.280 L 83.270 43.190 C 82.499 42.321 82.144 41.159 82.297 40.007 C 82.451 38.855 83.098 37.827 84.070 37.190 C 97.432 28.352 113.151 23.755 129.170 24.000 C 173.000 24.660 207.800 61.100 208.000 104.920 C 208.140 139.800 216.310 166.460 221.820 175.920 C 224.738 180.881 224.746 187.032 221.840 192.000 ZM 160.000 216.000 L 96.220 216.000 C 91.952 215.968 88.375 219.219 88.000 223.470 C 87.853 225.682 88.631 227.856 90.147 229.473 C 91.664 231.090 93.783 232.005 96.000 232.000 L 159.740 232.000 C 164.023 232.053 167.624 228.797 168.000 224.530 C 168.147 222.318 167.369 220.144 165.853 218.527 C 164.336 216.910 162.217 215.995 160.000 216.000 ZM 53.840 34.620 C 51.928 32.465 49.005 31.504 46.187 32.105 C 43.370 32.706 41.093 34.775 40.226 37.522 C 39.359 40.270 40.037 43.271 42.000 45.380 L 58.790 63.850 C 51.668 76.031 47.919 89.890 47.930 104.000 C 47.930 139.090 39.780 166.000 34.230 175.730 C 31.223 180.892 31.258 187.280 34.320 192.410 C 37.200 197.154 42.361 200.036 47.910 200.000 L 182.620 200.000 L 202.070 221.380 C 205.041 224.652 210.103 224.896 213.375 221.925 C 216.647 218.954 216.891 213.892 213.920 210.620 Z"),
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
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
