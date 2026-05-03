package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorBoldIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 207.830 56.530 C 186.320 43.290 158.000 36.000 128.000 36.000 C 98.000 36.000 69.680 43.290 48.170 56.530 C 24.850 70.890 12.000 90.600 12.000 112.000 C 12.000 133.400 24.850 153.140 48.170 167.500 C 66.650 178.870 90.170 185.840 115.460 187.580 C 113.460 198.650 106.370 205.330 100.240 209.120 C 86.760 217.430 67.490 218.300 53.380 211.220 C 47.448 208.249 40.231 210.648 37.260 216.580 C 34.289 222.512 36.688 229.729 42.620 232.700 C 52.579 237.573 63.533 240.072 74.620 240.000 C 88.063 240.095 101.273 236.487 112.800 229.570 C 128.250 220.030 137.800 204.990 139.630 187.670 C 165.230 186.030 189.100 179.020 207.790 167.520 C 231.150 153.160 244.000 133.450 244.000 112.000 C 244.000 90.550 231.150 70.890 207.830 56.530 ZM 73.390 153.530 C 77.775 146.822 85.596 143.194 93.550 144.180 C 103.910 145.570 110.090 153.610 113.270 163.310 C 99.558 162.107 86.110 158.820 73.390 153.560 ZM 138.260 163.670 C 136.549 154.704 132.874 146.228 127.500 138.850 C 120.164 128.797 109.072 122.138 96.750 120.390 C 78.750 117.980 62.230 126.280 52.650 141.390 C 42.200 133.000 36.000 122.840 36.000 112.000 C 36.000 83.810 78.130 60.000 128.000 60.000 C 177.870 60.000 220.000 83.820 220.000 112.000 C 220.000 138.260 183.510 160.710 138.260 163.700 Z"),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
