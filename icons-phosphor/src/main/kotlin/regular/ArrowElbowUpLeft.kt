package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorRegularIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 80.000 L 200.000 224.000 C 200.000 228.418 196.418 232.000 192.000 232.000 C 187.582 232.000 184.000 228.418 184.000 224.000 L 184.000 88.000 L 67.310 88.000 L 101.660 122.340 C 104.786 125.466 104.786 130.534 101.660 133.660 C 98.534 136.786 93.466 136.786 90.340 133.660 L 42.340 85.660 L 42.280 85.590 C 42.120 85.430 41.960 85.250 41.810 85.070 L 41.580 84.760 C 41.498 84.657 41.421 84.551 41.350 84.440 L 41.120 84.070 C 41.057 83.973 41.001 83.873 40.950 83.770 C 40.880 83.650 40.820 83.520 40.760 83.390 C 40.700 83.260 40.660 83.180 40.610 83.060 C 40.560 82.940 40.520 82.810 40.470 82.690 L 40.340 82.330 L 40.250 81.940 C 40.250 81.810 40.180 81.690 40.150 81.570 C 40.120 81.450 40.150 81.260 40.090 81.110 C 40.030 80.960 40.090 80.900 40.040 80.790 C 39.990 80.265 39.990 79.735 40.040 79.210 C 40.040 79.100 40.040 79.000 40.090 78.890 C 40.140 78.780 40.090 78.580 40.150 78.430 C 40.210 78.280 40.210 78.190 40.250 78.060 L 40.340 77.670 L 40.470 77.310 C 40.520 77.190 40.560 77.060 40.610 76.940 C 40.660 76.820 40.710 76.720 40.760 76.610 C 40.810 76.500 40.880 76.350 40.950 76.230 C 41.001 76.127 41.057 76.027 41.120 75.930 L 41.350 75.560 C 41.421 75.449 41.498 75.343 41.580 75.240 L 41.810 74.930 C 41.960 74.750 42.120 74.570 42.280 74.410 L 42.340 74.340 L 90.340 26.340 C 93.466 23.214 98.534 23.214 101.660 26.340 C 104.786 29.466 104.786 34.534 101.660 37.660 L 67.310 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 Z"),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
