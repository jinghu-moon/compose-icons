package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorLightIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.860 210.490 C 212.839 210.424 212.813 210.361 212.780 210.300 L 166.840 112.440 L 187.920 79.340 L 188.010 79.200 C 190.668 74.768 190.668 69.232 188.010 64.800 C 187.940 64.680 187.860 64.560 187.780 64.440 L 166.000 33.330 L 166.000 8.000 C 166.000 4.686 163.314 2.000 160.000 2.000 C 156.686 2.000 154.000 4.686 154.000 8.000 L 154.000 33.120 L 148.300 40.240 C 143.366 46.406 135.897 49.995 128.000 49.995 C 120.103 49.995 112.634 46.406 107.700 40.240 L 102.000 33.120 L 102.000 8.000 C 102.000 4.686 99.314 2.000 96.000 2.000 C 92.686 2.000 90.000 4.686 90.000 8.000 L 90.000 33.330 L 68.220 64.440 C 68.140 64.560 68.060 64.680 67.990 64.800 C 65.332 69.232 65.332 74.768 67.990 79.200 L 68.080 79.340 L 89.160 112.440 L 43.220 210.300 C 43.187 210.361 43.161 210.424 43.140 210.490 C 41.289 214.814 41.733 219.778 44.321 223.705 C 46.909 227.632 51.297 229.997 56.000 230.000 L 200.000 230.000 C 204.705 230.000 209.095 227.637 211.686 223.709 C 214.277 219.782 214.722 214.815 212.870 210.490 ZM 78.260 73.000 C 77.928 72.418 77.909 71.709 78.210 71.110 L 96.320 45.230 L 98.320 47.740 C 105.531 56.752 116.448 61.998 127.990 61.998 C 139.532 61.998 150.449 56.752 157.660 47.740 L 159.660 45.230 L 177.770 71.090 C 178.086 71.680 178.086 72.390 177.770 72.980 L 156.770 105.980 L 99.290 105.980 ZM 201.660 217.100 C 201.299 217.672 200.666 218.013 199.990 218.000 L 56.000 218.000 C 55.340 218.001 54.722 217.677 54.348 217.133 C 53.974 216.589 53.892 215.896 54.130 215.280 L 99.810 118.000 L 156.190 118.000 L 201.860 215.280 C 202.106 215.881 202.030 216.566 201.660 217.100 Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
