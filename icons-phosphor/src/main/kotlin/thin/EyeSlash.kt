package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorThinIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 67.590 67.500 C 29.340 89.000 13.000 124.810 12.340 126.380 C 11.890 127.417 11.890 128.593 12.340 129.630 C 12.680 130.400 20.860 148.520 39.170 166.830 C 56.170 183.830 85.310 204.000 128.000 204.000 C 146.338 204.121 164.470 200.126 181.060 192.310 L 205.060 218.690 C 206.016 219.768 207.477 220.248 208.886 219.948 C 210.295 219.647 211.434 218.613 211.867 217.239 C 212.300 215.865 211.962 214.364 210.980 213.310 ZM 149.100 157.160 C 134.246 167.831 113.751 165.668 101.451 152.131 C 89.152 138.594 88.958 117.986 101.000 104.220 ZM 128.000 196.000 C 96.000 196.000 68.110 184.350 45.000 161.380 C 35.154 151.575 26.871 140.318 20.440 128.000 C 24.090 120.770 40.530 91.190 73.120 73.570 L 95.570 98.270 C 80.126 115.041 80.050 140.830 95.395 157.692 C 110.740 174.553 136.423 176.900 154.570 163.100 L 175.460 186.100 C 160.524 192.737 144.344 196.112 128.000 196.000 ZM 134.780 92.640 C 132.614 92.224 131.193 90.134 131.604 87.967 C 132.014 85.799 134.102 84.374 136.270 84.780 C 155.466 88.502 169.927 104.408 171.810 123.870 C 172.013 126.068 170.397 128.014 168.200 128.220 L 167.820 128.220 C 165.748 128.229 164.012 126.653 163.820 124.590 C 162.277 108.687 150.464 95.690 134.780 92.640 ZM 243.660 129.640 C 243.250 130.550 233.460 152.220 211.280 172.090 C 210.543 172.740 209.593 173.096 208.610 173.090 C 206.942 173.100 205.443 172.074 204.848 170.516 C 204.254 168.957 204.689 167.193 205.940 166.090 C 217.994 155.250 228.023 142.352 235.560 128.000 C 229.126 115.685 220.843 104.427 211.000 94.620 C 187.890 71.650 160.000 60.000 128.000 60.000 C 121.300 59.993 114.611 60.538 108.000 61.630 C 105.832 61.972 103.794 60.503 103.431 58.339 C 103.069 56.174 104.519 54.122 106.680 53.740 C 113.726 52.572 120.857 51.990 128.000 52.000 C 170.700 52.000 199.870 72.220 216.830 89.180 C 235.140 107.490 243.320 125.620 243.660 126.380 C 244.110 127.417 244.110 128.593 243.660 129.630 Z"),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
