package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorRegularIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 215.820 122.460 C 187.480 142.460 166.250 137.140 143.950 126.850 C 164.010 112.660 182.810 94.640 183.480 59.740 C 202.545 75.213 214.271 97.955 215.820 122.460 ZM 167.110 49.190 C 170.240 83.710 155.000 99.440 135.000 113.610 C 132.750 89.130 126.560 63.810 96.630 45.790 C 119.573 37.023 145.137 38.256 167.130 49.190 ZM 79.320 54.730 C 110.770 69.280 116.790 90.310 119.030 114.730 C 96.700 104.440 71.680 97.140 41.100 114.050 C 45.028 89.819 58.879 68.322 79.320 54.730 ZM 40.180 133.540 C 68.520 113.540 89.750 118.860 112.050 129.150 C 92.000 143.340 73.190 161.360 72.520 196.260 C 53.455 180.787 41.729 158.045 40.180 133.540 ZM 88.890 206.810 C 85.760 172.290 101.000 156.560 121.000 142.390 C 123.250 166.870 129.440 192.190 159.370 210.210 C 136.427 218.977 110.863 217.744 88.870 206.810 ZM 176.680 201.270 C 145.230 186.720 139.210 165.690 136.970 141.270 C 149.690 147.130 163.280 152.020 178.270 152.020 C 189.600 152.020 201.730 149.220 214.900 141.940 C 210.972 166.174 197.122 187.674 176.680 201.270 Z"),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
