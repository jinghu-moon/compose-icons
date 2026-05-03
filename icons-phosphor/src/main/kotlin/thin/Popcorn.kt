package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorThinIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.760 77.110 C 225.743 76.113 224.273 75.733 222.900 76.110 L 219.410 77.110 C 217.353 65.337 210.139 55.100 199.744 49.203 C 189.349 43.305 176.861 42.365 165.700 46.640 C 160.039 30.676 144.938 20.008 128.000 20.008 C 111.062 20.008 95.961 30.676 90.300 46.640 C 79.133 42.365 66.640 43.310 56.243 49.216 C 45.846 55.122 38.637 65.369 36.590 77.150 L 33.100 76.150 C 31.733 75.756 30.259 76.117 29.230 77.099 C 28.201 78.081 27.770 79.536 28.100 80.920 L 58.660 210.750 C 59.916 216.182 64.765 220.022 70.340 220.000 L 185.660 220.000 C 191.236 220.022 196.084 216.182 197.340 210.750 L 227.890 80.920 C 228.215 79.539 227.786 78.090 226.760 77.110 ZM 76.000 52.000 C 81.228 51.999 86.378 53.276 91.000 55.720 C 92.102 56.305 93.415 56.343 94.549 55.821 C 95.682 55.299 96.508 54.278 96.780 53.060 C 100.039 38.425 113.022 28.015 128.015 28.015 C 143.008 28.015 155.991 38.425 159.250 53.060 C 159.525 54.269 160.345 55.283 161.471 55.804 C 162.597 56.324 163.900 56.293 165.000 55.720 C 174.190 50.849 185.174 50.748 194.452 55.449 C 203.730 60.151 210.144 69.068 211.650 79.360 L 168.220 91.780 L 132.460 77.470 C 129.597 76.324 126.403 76.324 123.540 77.470 L 87.780 91.780 L 44.330 79.360 C 46.633 63.644 60.116 51.996 76.000 52.000 ZM 70.340 212.000 C 68.483 212.003 66.867 210.728 66.440 208.920 L 37.440 85.720 L 84.380 99.130 L 99.430 212.000 ZM 107.500 212.000 L 92.380 98.560 L 126.520 84.900 C 127.482 84.511 128.558 84.511 129.520 84.900 L 163.650 98.560 L 148.500 212.000 ZM 189.560 208.920 C 189.133 210.728 187.517 212.003 185.660 212.000 L 156.570 212.000 L 171.620 99.130 L 218.540 85.720 Z"),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
