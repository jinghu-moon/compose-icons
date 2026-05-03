package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = phosphorDuotoneIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 185.810 167.620 C 167.810 181.520 141.640 191.030 104.130 191.930 L 80.090 248.000 L 64.090 191.930 L 8.000 175.870 L 64.070 151.870 C 64.970 114.380 74.480 88.260 88.380 70.220 C 86.618 83.517 91.017 96.892 100.329 106.547 C 109.641 116.201 122.848 121.081 136.200 119.800 C 134.917 133.158 139.801 146.371 149.463 155.684 C 159.124 164.998 172.508 169.392 185.810 167.620 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 168.000 76.000 C 168.000 82.627 162.627 88.000 156.000 88.000 C 149.373 88.000 144.000 82.627 144.000 76.000 C 144.000 69.373 149.373 64.000 156.000 64.000 C 162.627 64.000 168.000 69.373 168.000 76.000 ZM 216.720 143.640 C 197.350 178.540 161.280 197.400 109.480 199.740 L 87.480 251.150 C 86.216 254.101 83.310 256.011 80.100 256.000 L 79.590 256.000 C 76.212 255.788 73.333 253.474 72.400 250.220 L 57.600 198.390 L 5.800 183.560 C 2.537 182.643 0.206 179.770 -0.019 176.388 C -0.244 173.007 1.687 169.850 4.800 168.510 L 56.210 146.510 C 58.560 94.730 77.420 58.670 112.300 39.290 C 137.050 25.550 165.040 23.450 184.180 24.110 C 202.820 24.750 220.180 28.380 223.040 30.110 C 224.208 30.798 225.182 31.772 225.870 32.940 C 227.560 35.790 231.200 53.150 231.870 71.790 C 232.550 90.890 230.460 118.890 216.720 143.640 ZM 161.540 172.640 C 142.670 165.446 129.656 147.998 128.140 127.860 C 108.007 126.347 90.561 113.336 83.370 94.470 Q 72.920 118.260 72.070 152.060 C 71.998 155.194 70.102 157.997 67.220 159.230 L 31.830 174.370 L 66.280 184.230 C 68.937 184.992 71.013 187.071 71.770 189.730 L 81.610 224.170 L 96.770 188.770 C 98.006 185.892 100.809 184.001 103.940 183.930 Q 137.710 183.120 161.540 172.640 ZM 212.420 43.570 C 198.270 40.570 148.320 32.570 112.120 58.320 C 106.128 62.595 100.746 67.665 96.120 73.390 C 95.353 83.964 99.285 94.339 106.869 101.747 C 114.453 109.155 124.917 112.844 135.470 111.830 C 137.848 111.601 140.204 112.447 141.894 114.136 C 143.583 115.826 144.429 118.182 144.200 120.560 C 143.188 131.117 146.882 141.584 154.297 149.166 C 161.712 156.749 172.093 160.676 182.670 159.900 C 188.374 155.273 193.420 149.890 197.670 143.900 C 223.420 107.730 215.420 57.740 212.420 43.570 Z"),
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
        return _fish!!
    }

private var _fish: ImageVector? = null
