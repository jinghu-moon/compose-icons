package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorDuotoneIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 128.000 C 99.640 113.880 71.270 99.760 32.000 129.610 C 32.000 129.080 32.000 128.540 32.000 128.000 C 31.994 94.277 49.684 63.023 78.600 45.670 C 124.090 64.750 126.000 96.380 128.000 128.000 ZM 81.400 212.000 C 110.887 228.365 146.798 228.057 176.000 211.190 C 176.470 210.920 176.940 210.660 177.400 210.380 C 131.910 191.250 130.000 159.620 128.000 128.000 C 101.590 145.500 75.180 163.000 81.400 212.000 ZM 224.000 126.390 C 223.432 92.669 205.211 61.718 176.000 44.860 L 174.600 44.050 C 180.820 93.000 154.410 110.500 128.000 128.000 C 156.360 142.120 184.730 156.240 224.000 126.390 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 215.820 122.460 C 187.480 142.460 166.250 137.140 143.950 126.850 C 164.020 112.660 182.810 94.640 183.480 59.740 C 202.545 75.213 214.271 97.955 215.820 122.460 ZM 167.110 49.190 C 170.240 83.710 155.000 99.440 135.000 113.610 C 132.750 89.130 126.560 63.810 96.630 45.790 C 119.573 37.023 145.137 38.256 167.130 49.190 ZM 79.320 54.730 C 110.770 69.280 116.790 90.310 119.030 114.730 C 96.700 104.440 71.680 97.140 41.100 114.050 C 45.028 89.819 58.879 68.322 79.320 54.730 ZM 40.180 133.540 C 68.520 113.540 89.750 118.860 112.050 129.150 C 92.000 143.340 73.190 161.360 72.520 196.260 C 53.455 180.787 41.729 158.045 40.180 133.540 ZM 88.890 206.810 C 85.760 172.290 101.000 156.560 121.000 142.390 C 123.250 166.870 129.440 192.190 159.370 210.210 C 136.427 218.977 110.863 217.744 88.870 206.810 ZM 176.680 201.270 C 145.230 186.720 139.210 165.690 136.970 141.270 C 149.690 147.130 163.280 152.020 178.270 152.020 C 189.600 152.020 201.730 149.220 214.900 141.940 C 210.972 166.174 197.122 187.674 176.680 201.270 Z"),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
