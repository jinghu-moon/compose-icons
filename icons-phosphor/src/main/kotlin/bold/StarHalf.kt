package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorBoldIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.900 117.880 L 231.840 122.240 C 227.071 126.397 219.894 126.137 215.437 121.647 C 210.981 117.156 210.777 109.977 214.970 105.240 C 208.365 104.688 203.458 98.885 204.010 92.280 C 204.562 85.675 210.365 80.768 216.970 81.320 L 225.240 81.990 C 233.450 82.671 240.450 88.213 242.997 96.048 C 245.544 103.883 243.140 112.481 236.900 117.860 ZM 172.530 141.700 C 169.136 144.626 167.655 149.200 168.690 153.560 L 172.770 170.780 C 173.716 174.997 176.857 178.380 180.993 179.635 C 185.129 180.891 189.620 179.825 192.751 176.845 C 195.882 173.866 197.169 169.433 196.120 165.240 L 193.720 155.120 L 199.840 149.840 C 204.679 145.470 205.143 138.035 200.884 133.097 C 196.626 128.160 189.204 127.526 184.170 131.670 ZM 205.600 205.250 C 204.197 199.285 198.526 195.335 192.445 196.088 C 186.364 196.840 181.826 202.053 181.920 208.180 C 176.232 205.001 169.046 206.942 165.732 212.553 C 162.419 218.164 164.189 225.394 169.720 228.840 L 176.430 232.970 C 183.463 237.287 192.404 236.939 199.081 232.089 C 205.757 227.239 208.851 218.843 206.920 210.820 ZM 175.000 102.000 L 159.360 100.740 C 154.865 100.379 150.952 97.528 149.230 93.360 L 140.000 70.940 L 140.000 182.390 L 145.530 185.790 C 150.904 189.364 152.488 196.548 149.117 202.051 C 145.745 207.554 138.625 209.405 133.000 206.240 L 128.000 203.190 L 79.570 233.000 C 72.537 237.317 63.596 236.969 56.919 232.119 C 50.243 227.269 47.149 218.873 49.080 210.850 L 62.280 155.150 L 19.100 117.880 C 12.853 112.504 10.444 103.903 12.990 96.065 C 15.535 88.226 22.537 82.681 30.750 82.000 L 87.350 77.430 L 109.170 24.610 C 112.309 16.976 119.746 11.993 128.000 11.993 C 136.254 11.993 143.691 16.976 146.830 24.610 L 168.650 77.430 L 176.970 78.100 C 183.364 78.884 187.999 84.576 187.469 90.997 C 186.940 97.417 181.436 102.274 175.000 102.000 ZM 116.000 182.360 L 116.000 70.940 L 106.730 93.390 C 105.008 97.558 101.095 100.409 96.600 100.770 L 41.200 105.240 L 83.470 141.700 C 86.864 144.626 88.345 149.200 87.310 153.560 L 74.420 208.000 Z"),
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
