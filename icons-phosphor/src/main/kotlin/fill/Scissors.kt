package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorFillIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.520 187.090 L 93.520 89.220 C 100.029 72.776 93.630 54.039 78.421 45.012 C 63.212 35.986 43.699 39.343 32.382 52.935 C 21.065 66.526 21.297 86.324 32.928 99.647 C 44.560 112.970 64.146 115.870 79.140 106.490 L 100.530 128.180 L 79.150 149.540 L 79.150 149.540 C 64.191 140.199 44.663 143.103 33.069 156.393 C 21.476 169.683 21.249 189.424 32.534 202.977 C 43.819 216.530 63.275 219.882 78.445 210.887 C 93.615 201.893 100.007 183.213 93.530 166.810 L 120.440 148.400 L 170.000 198.640 C 176.035 204.634 184.194 208.001 192.700 208.010 C 194.074 208.010 195.447 207.920 196.810 207.740 L 197.090 207.740 L 233.360 201.630 C 236.582 201.092 239.154 198.649 239.856 195.458 C 240.558 192.268 239.249 188.971 236.550 187.130 ZM 74.140 90.090 C 67.389 96.839 56.809 97.876 48.875 92.566 C 40.942 87.256 37.868 77.080 41.533 68.265 C 45.199 59.451 54.584 54.456 63.943 56.338 C 73.302 58.220 80.026 66.454 80.000 76.000 C 79.996 81.300 77.889 86.383 74.140 90.130 ZM 74.140 194.090 C 67.389 200.839 56.809 201.876 48.875 196.566 C 40.942 191.256 37.868 181.080 41.533 172.265 C 45.199 163.451 54.584 158.456 63.943 160.338 C 73.302 162.220 80.026 170.454 80.000 180.000 C 80.002 185.307 77.893 190.398 74.140 194.150 ZM 135.140 92.590 L 169.940 57.400 C 176.991 50.365 186.901 46.990 196.780 48.260 L 197.060 48.260 L 233.060 54.330 C 235.685 54.732 237.954 56.378 239.150 58.750 C 240.896 62.318 239.759 66.628 236.480 68.870 L 166.550 116.720 C 165.190 117.648 163.400 117.648 162.040 116.720 L 135.730 98.720 C 134.771 98.044 134.158 96.981 134.052 95.812 C 133.946 94.644 134.358 93.488 135.180 92.650 Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
