package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorBoldIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.240 174.740 C 229.465 179.841 228.758 187.401 223.660 191.630 C 205.490 206.710 189.060 212.000 174.150 212.000 C 154.390 212.000 137.290 202.710 122.270 194.560 C 97.210 180.940 77.410 170.190 47.660 194.860 C 42.557 199.090 34.991 198.383 30.760 193.280 C 26.529 188.177 27.237 180.611 32.340 176.380 C 74.590 141.380 107.340 159.150 133.730 173.460 C 158.790 187.070 178.590 197.830 208.340 173.160 C 210.790 171.128 213.948 170.153 217.117 170.449 C 220.287 170.745 223.209 172.289 225.240 174.740 ZM 208.340 117.150 C 178.590 141.820 158.790 131.060 133.730 117.450 C 107.380 103.150 74.590 85.340 32.340 120.370 C 27.237 124.601 26.529 132.167 30.760 137.270 C 34.991 142.373 42.557 143.081 47.660 138.850 C 77.410 114.180 97.210 124.930 122.270 138.550 C 137.270 146.700 154.390 155.990 174.150 155.990 C 189.060 155.990 205.490 150.700 223.660 135.630 C 228.763 131.400 229.471 123.833 225.240 118.730 C 221.010 113.627 213.443 112.920 208.340 117.150 ZM 47.660 82.840 C 77.410 58.170 97.210 68.920 122.270 82.540 C 137.270 90.690 154.390 99.980 174.150 99.980 C 189.060 99.980 205.490 94.690 223.660 79.620 C 228.763 75.389 229.471 67.823 225.240 62.720 C 221.010 57.617 213.443 56.910 208.340 61.140 C 178.590 85.810 158.790 75.060 133.730 61.440 C 107.380 47.140 74.590 29.330 32.340 64.370 C 28.959 67.082 27.303 71.406 28.007 75.683 C 28.712 79.959 31.669 83.524 35.741 85.007 C 39.814 86.490 44.370 85.662 47.660 82.840 Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
