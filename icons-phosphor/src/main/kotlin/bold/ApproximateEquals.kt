package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorBoldIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.240 150.730 C 227.272 153.180 228.247 156.338 227.951 159.507 C 227.655 162.677 226.111 165.599 223.660 167.630 C 205.490 182.700 189.060 188.000 174.150 188.000 C 154.390 188.000 137.290 178.710 122.270 170.560 C 97.210 156.940 77.410 146.190 47.660 170.860 C 42.557 175.090 34.991 174.383 30.760 169.280 C 26.529 164.177 27.237 156.611 32.340 152.380 C 74.590 117.380 107.340 135.150 133.730 149.460 C 158.790 163.070 178.590 173.830 208.340 149.150 C 210.790 147.118 213.948 146.143 217.117 146.439 C 220.287 146.735 223.209 148.279 225.240 150.730 ZM 47.660 106.850 C 77.410 82.170 97.210 92.930 122.270 106.540 C 137.270 114.700 154.390 123.990 174.150 123.990 C 189.060 123.990 205.490 118.690 223.660 103.620 C 228.763 99.389 229.471 91.823 225.240 86.720 C 221.010 81.617 213.443 80.910 208.340 85.140 C 178.590 109.810 158.790 99.060 133.730 85.440 C 107.380 71.140 74.590 53.330 32.340 88.370 C 27.237 92.601 26.529 100.167 30.760 105.270 C 34.991 110.373 42.557 111.080 47.660 106.850 Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
