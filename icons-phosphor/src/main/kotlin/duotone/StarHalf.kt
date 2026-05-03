package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorDuotoneIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 128.000 24.000 L 128.000 189.090 L 73.280 222.740 C 70.377 224.503 66.698 224.343 63.958 222.336 C 61.217 220.329 59.956 216.870 60.760 213.570 L 75.640 150.780 L 26.940 108.780 C 24.402 106.552 23.433 103.027 24.474 99.815 C 25.515 96.602 28.368 94.316 31.730 94.000 L 95.640 88.800 L 120.260 29.200 C 121.521 26.037 124.595 23.972 128.000 24.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 239.180 97.260 C 237.135 90.973 231.510 86.531 224.920 86.000 L 165.920 81.240 L 143.140 26.150 C 140.620 20.010 134.641 16.001 128.005 16.001 C 121.369 16.001 115.390 20.010 112.870 26.150 L 90.110 81.230 L 31.080 86.000 C 24.480 86.558 18.857 91.018 16.812 97.319 C 14.766 103.619 16.696 110.531 21.710 114.860 L 66.710 153.690 L 53.000 211.750 C 51.453 218.196 53.939 224.940 59.301 228.840 C 64.662 232.739 71.843 233.027 77.500 229.570 L 128.000 198.490 L 178.530 229.570 C 184.185 233.007 191.352 232.708 196.702 228.813 C 202.052 224.917 204.536 218.187 203.000 211.750 L 189.240 153.680 L 234.240 114.850 C 239.295 110.527 241.246 103.583 239.180 97.260 ZM 69.090 215.940 C 68.940 216.030 68.890 216.060 68.710 215.940 C 68.535 215.851 68.460 215.640 68.540 215.460 L 83.420 152.660 C 84.111 149.752 83.124 146.701 80.860 144.750 L 32.160 102.750 C 31.991 102.639 31.935 102.418 32.030 102.240 C 32.120 101.970 32.210 101.970 32.360 101.950 L 96.280 96.790 C 99.267 96.535 101.861 94.633 103.000 91.860 L 120.000 50.780 L 120.000 184.630 ZM 223.840 102.730 L 175.140 144.730 C 172.876 146.681 171.889 149.732 172.580 152.640 L 187.460 215.440 C 187.540 215.620 187.465 215.831 187.290 215.920 C 187.110 216.060 187.060 216.030 186.910 215.920 L 136.000 184.630 L 136.000 50.780 L 153.000 91.860 C 154.147 94.638 156.754 96.538 159.750 96.780 L 223.660 101.940 C 223.820 101.940 223.910 101.940 224.000 102.230 C 224.090 102.520 224.000 102.630 223.840 102.730 Z"),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
