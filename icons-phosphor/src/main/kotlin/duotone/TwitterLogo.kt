package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorDuotoneIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 72.000 L 208.000 104.000 C 203.740 170.840 147.920 224.000 80.000 224.000 C 48.000 224.000 40.000 212.000 40.000 212.000 C 40.000 212.000 72.000 200.000 88.000 176.000 C 88.000 176.000 32.850 144.000 40.780 56.000 C 40.780 56.000 80.440 96.000 128.000 104.000 L 128.000 88.000 C 128.000 66.000 146.000 47.730 168.000 48.000 C 183.852 48.184 198.157 57.547 204.670 72.000 Z"),
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
        pathData = parseSvgPathData("M 247.390 68.940 C 246.152 65.950 243.236 64.001 240.000 64.000 L 209.570 64.000 C 200.917 49.276 185.178 40.166 168.100 40.000 C 155.467 39.832 143.300 44.772 134.360 53.700 C 125.147 62.731 119.969 75.099 120.000 88.000 L 120.000 94.090 C 79.740 83.470 46.810 50.720 46.460 50.370 C 44.269 48.159 40.994 47.420 38.066 48.476 C 35.137 49.531 33.087 52.190 32.810 55.290 C 28.510 103.080 42.380 135.060 54.810 153.470 C 60.874 162.572 68.250 170.727 76.700 177.670 C 61.430 195.200 37.450 204.410 37.200 204.510 C 34.913 205.367 33.143 207.221 32.393 209.545 C 31.643 211.869 31.995 214.408 33.350 216.440 C 34.090 217.560 37.100 221.490 44.430 225.160 C 53.510 229.700 65.480 232.000 80.000 232.000 C 150.680 232.000 209.720 177.580 215.760 107.560 L 245.660 77.660 C 247.947 75.371 248.630 71.929 247.390 68.940 ZM 202.390 98.350 C 201.018 99.725 200.194 101.552 200.070 103.490 C 196.000 166.580 143.280 216.000 80.000 216.000 C 69.440 216.000 62.000 214.600 56.780 212.920 C 68.300 206.670 84.340 195.920 94.660 180.440 C 95.882 178.608 96.294 176.353 95.800 174.207 C 95.306 172.061 93.950 170.214 92.050 169.100 C 91.920 169.020 79.190 161.360 67.570 143.810 C 54.540 124.110 48.000 100.380 48.000 73.090 C 64.000 86.090 93.250 106.270 126.690 111.890 C 129.009 112.275 131.379 111.621 133.172 110.101 C 134.965 108.582 135.999 106.350 136.000 104.000 L 136.000 88.000 C 135.982 79.379 139.443 71.115 145.600 65.080 C 151.499 59.162 159.544 55.886 167.900 56.000 C 180.560 56.160 192.390 63.880 197.340 75.210 C 198.615 78.121 201.492 80.001 204.670 80.000 L 220.670 80.000 Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
