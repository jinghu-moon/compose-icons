package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorRegularIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 247.390 68.940 C 246.152 65.950 243.236 64.001 240.000 64.000 L 209.570 64.000 C 200.916 49.277 185.177 40.168 168.100 40.000 C 155.464 39.834 143.295 44.774 134.350 53.700 C 125.143 62.735 119.970 75.101 120.000 88.000 L 120.000 94.090 C 79.740 83.470 46.810 50.720 46.460 50.370 C 44.269 48.159 40.994 47.420 38.066 48.476 C 35.137 49.531 33.087 52.190 32.810 55.290 C 28.500 103.080 42.380 135.060 54.810 153.470 C 60.871 162.571 68.244 170.726 76.690 177.670 C 61.460 195.200 37.480 204.410 37.220 204.510 C 34.933 205.367 33.163 207.221 32.413 209.545 C 31.663 211.869 32.015 214.408 33.370 216.440 C 34.120 217.560 37.120 221.490 44.450 225.160 C 53.510 229.700 65.480 232.000 80.000 232.000 C 150.670 232.000 209.720 177.580 215.750 107.560 L 245.660 77.660 C 247.947 75.371 248.630 71.929 247.390 68.940 ZM 202.390 98.350 C 201.018 99.725 200.194 101.552 200.070 103.490 C 196.000 166.580 143.280 216.000 80.000 216.000 C 69.440 216.000 62.000 214.600 56.780 212.920 C 68.290 206.670 84.340 195.920 94.660 180.440 C 95.884 178.600 96.293 176.336 95.789 174.184 C 95.285 172.032 93.914 170.185 92.000 169.080 C 91.530 168.810 48.090 142.740 48.000 73.080 C 64.000 86.080 93.250 106.250 126.670 111.870 C 128.988 112.261 131.361 111.612 133.158 110.096 C 134.955 108.581 135.995 106.351 136.000 104.000 L 136.000 88.000 C 135.982 79.379 139.443 71.115 145.600 65.080 C 151.502 59.167 159.546 55.892 167.900 56.000 C 180.560 56.160 192.390 63.880 197.340 75.210 C 198.615 78.121 201.492 80.001 204.670 80.000 L 220.670 80.000 Z"),
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
