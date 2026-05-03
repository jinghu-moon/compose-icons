package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorLightIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 218.000 128.000 C 218.000 134.590 205.060 141.240 194.000 144.940 C 184.571 147.965 174.894 150.150 165.080 151.470 C 165.700 143.870 166.020 136.010 166.020 128.000 C 166.020 101.730 162.580 77.000 156.340 58.220 C 154.369 51.963 151.684 45.954 148.340 40.310 C 189.100 49.827 217.950 86.144 218.000 128.000 ZM 128.000 38.000 C 134.590 38.000 141.240 50.940 144.940 62.000 C 150.780 79.530 154.000 103.000 154.000 128.000 C 154.000 136.830 153.600 145.150 152.890 152.890 C 144.890 153.620 136.540 154.000 128.000 154.000 C 73.060 154.000 38.000 138.600 38.000 128.000 C 38.055 78.317 78.317 38.055 128.000 38.000 ZM 40.310 148.300 C 45.954 151.644 51.963 154.329 58.220 156.300 C 77.000 162.560 101.730 166.000 128.000 166.000 C 136.000 166.000 143.860 165.680 151.450 165.060 C 146.640 198.200 136.000 218.000 128.000 218.000 C 86.132 217.945 49.811 189.076 40.310 148.300 ZM 148.310 215.690 C 151.654 210.046 154.339 204.037 156.310 197.780 C 159.855 186.707 162.343 175.323 163.740 163.780 C 175.283 162.383 186.667 159.895 197.740 156.350 C 203.997 154.379 210.006 151.694 215.650 148.350 C 207.825 181.773 181.725 207.869 148.300 215.690 Z"),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
