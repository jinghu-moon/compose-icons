package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorBoldIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 90.440 108.600 L 96.680 102.360 C 84.294 95.540 70.380 91.975 56.240 92.000 L 40.000 92.000 C 33.373 92.000 28.000 86.627 28.000 80.000 C 28.000 73.373 33.373 68.000 40.000 68.000 L 56.240 68.000 C 84.898 67.924 112.394 79.318 132.600 99.640 L 172.850 139.890 C 183.590 140.160 194.960 136.250 208.340 125.160 C 211.630 122.338 216.186 121.510 220.259 122.993 C 224.331 124.476 227.288 128.041 227.993 132.317 C 228.697 136.594 227.041 140.918 223.660 143.630 C 205.490 158.700 189.060 164.000 174.150 164.000 C 154.390 164.000 137.290 154.710 122.270 146.550 C 97.210 132.940 77.410 122.190 47.660 146.860 C 42.557 151.090 34.991 150.383 30.760 145.280 C 26.529 140.177 27.237 132.611 32.340 128.380 C 54.070 110.360 73.300 106.320 90.440 108.600 ZM 140.000 72.000 C 140.000 52.118 156.118 36.000 176.000 36.000 C 195.882 36.000 212.000 52.118 212.000 72.000 C 212.000 91.882 195.882 108.000 176.000 108.000 C 156.118 108.000 140.000 91.882 140.000 72.000 ZM 164.000 72.000 C 164.000 78.627 169.373 84.000 176.000 84.000 C 182.627 84.000 188.000 78.627 188.000 72.000 C 188.000 65.373 182.627 60.000 176.000 60.000 C 169.373 60.000 164.000 65.373 164.000 72.000 ZM 208.340 181.160 C 178.590 205.830 158.790 195.080 133.730 181.460 C 107.380 167.160 74.590 149.350 32.340 184.390 C 28.959 187.102 27.303 191.426 28.007 195.703 C 28.712 199.979 31.669 203.544 35.741 205.027 C 39.814 206.510 44.370 205.682 47.660 202.860 C 77.410 178.200 97.210 188.940 122.270 202.560 C 137.270 210.710 154.390 220.000 174.150 220.000 C 189.060 220.000 205.490 214.710 223.660 199.640 C 228.763 195.410 229.471 187.843 225.240 182.740 C 221.010 177.637 213.443 176.930 208.340 181.160 Z"),
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
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
