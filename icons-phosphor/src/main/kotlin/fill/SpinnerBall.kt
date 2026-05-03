package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorFillIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 167.110 49.190 C 170.240 83.710 155.000 99.440 135.000 113.610 C 132.750 89.130 126.560 63.810 96.630 45.790 C 119.573 37.023 145.137 38.256 167.130 49.190 ZM 40.180 133.540 C 68.520 113.540 89.750 118.860 112.050 129.150 C 92.000 143.340 73.190 161.360 72.520 196.260 C 53.455 180.787 41.729 158.045 40.180 133.540 ZM 176.680 201.270 C 145.230 186.720 139.210 165.690 136.970 141.270 C 149.690 147.130 163.280 152.020 178.270 152.020 C 189.600 152.020 201.730 149.220 214.900 141.940 C 210.972 166.174 197.122 187.674 176.680 201.270 Z"),
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
