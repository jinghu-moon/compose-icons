package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorDuotoneIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 79.760 C 216.070 151.180 192.520 207.990 172.000 222.540 C 169.639 224.168 166.587 224.408 164.001 223.168 C 161.415 221.929 159.690 219.400 159.480 216.540 C 158.000 196.310 152.000 160.000 128.000 160.000 C 104.000 160.000 98.000 196.310 96.490 216.530 C 96.280 219.390 94.555 221.919 91.969 223.158 C 89.383 224.398 86.331 224.158 83.970 222.530 C 63.480 208.000 39.930 151.180 40.000 79.760 C 40.099 53.330 61.570 31.967 88.000 32.000 L 168.000 32.000 C 194.430 31.967 215.901 53.330 216.000 79.760 Z"),
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
                pathData = parseSvgPathData("M 171.000 71.420 L 149.540 80.000 L 171.000 88.570 C 175.101 90.227 177.082 94.894 175.425 98.995 C 173.768 103.096 169.101 105.077 165.000 103.420 L 128.000 88.610 L 91.000 103.420 C 86.899 105.077 82.232 103.096 80.575 98.995 C 78.918 94.894 80.899 90.227 85.000 88.570 L 106.460 80.000 L 85.000 71.420 C 80.899 69.763 78.918 65.096 80.575 60.995 C 82.232 56.894 86.899 54.913 91.000 56.570 L 128.000 71.380 L 165.000 56.570 C 169.101 54.913 173.768 56.894 175.425 60.995 C 177.082 65.096 175.101 69.763 171.000 71.420 ZM 224.000 79.750 C 224.000 122.470 216.000 155.150 209.300 175.030 C 200.580 200.830 188.680 220.520 176.660 229.030 C 172.001 232.382 165.884 232.922 160.710 230.440 C 155.466 227.966 151.959 222.862 151.530 217.080 C 150.680 205.580 146.480 168.000 128.000 168.000 C 109.520 168.000 105.320 205.590 104.470 217.110 C 103.848 225.494 96.877 231.986 88.470 232.010 C 85.193 232.005 82.000 230.974 79.340 229.060 C 67.340 220.530 55.420 200.840 46.700 175.060 C 40.000 155.150 32.000 122.470 32.000 79.750 C 32.138 48.920 57.169 24.000 88.000 24.000 L 168.000 24.000 C 198.831 24.000 223.862 48.920 224.000 79.750 ZM 208.000 79.750 C 207.863 57.756 189.994 40.000 168.000 40.000 L 88.000 40.000 C 66.002 40.000 48.132 57.762 48.000 79.760 C 48.000 120.310 55.510 151.160 61.850 169.900 C 72.900 202.560 84.850 213.270 88.460 215.900 C 91.570 174.670 105.590 152.000 128.000 152.000 C 150.410 152.000 164.450 174.710 167.490 215.940 L 167.490 215.940 C 171.090 213.350 183.060 202.680 194.150 169.940 C 200.490 151.160 208.000 120.310 208.000 79.760 Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
