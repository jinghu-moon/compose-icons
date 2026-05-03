package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorFillIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.110 60.680 C 237.460 47.490 217.260 44.520 186.610 52.020 C 155.868 28.340 113.893 25.497 80.238 44.815 C 46.583 64.132 27.868 101.811 32.810 140.300 C 5.090 169.000 5.490 186.000 10.900 195.320 C 16.000 204.160 26.640 208.000 40.640 208.000 C 50.360 207.799 60.023 206.456 69.430 204.000 C 100.168 227.660 142.125 230.496 175.768 211.189 C 209.411 191.882 228.130 154.226 223.210 115.750 C 235.720 102.750 244.040 90.400 246.870 79.830 C 248.830 72.510 248.240 66.070 245.110 60.680 ZM 231.420 75.680 C 225.310 98.460 182.770 132.990 143.900 155.320 C 76.090 194.320 30.280 196.840 24.740 187.320 C 23.280 184.810 24.090 180.080 26.960 174.320 C 29.803 168.928 33.252 163.879 37.240 159.270 C 38.929 164.158 41.013 168.900 43.470 173.450 C 44.237 174.916 45.827 175.758 47.470 175.570 C 53.191 174.865 58.855 173.755 64.420 172.250 C 85.650 166.700 111.050 155.770 135.940 141.470 C 160.830 127.170 182.940 110.810 198.390 95.320 C 202.455 91.299 206.234 86.998 209.700 82.450 C 210.685 81.123 210.752 79.327 209.870 77.930 C 207.175 73.540 204.132 69.373 200.770 65.470 C 214.980 63.120 228.140 63.300 231.270 68.710 C 232.190 70.280 232.240 72.630 231.420 75.690 Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
