package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorThinIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.700 70.470 C 243.080 68.974 241.620 67.998 240.000 68.000 L 207.200 68.000 C 199.593 53.376 184.534 44.144 168.050 44.000 C 156.483 43.834 145.342 48.362 137.170 56.550 C 128.717 64.827 123.968 76.169 124.000 88.000 L 124.000 99.160 C 80.350 89.770 44.000 53.560 43.610 53.160 C 42.516 52.056 40.883 51.686 39.420 52.210 C 37.954 52.737 36.928 54.068 36.790 55.620 C 32.590 102.240 46.060 133.330 58.100 151.210 C 64.645 161.133 72.848 169.857 82.350 177.000 C 66.670 197.490 38.890 208.130 38.600 208.240 C 37.445 208.665 36.549 209.598 36.172 210.770 C 35.795 211.941 35.979 213.221 36.670 214.240 C 36.940 214.640 39.460 218.240 46.210 221.600 C 54.730 225.840 66.100 228.000 80.000 228.000 C 149.090 228.000 206.730 174.440 211.890 105.770 L 242.830 74.830 C 243.975 73.687 244.319 71.966 243.700 70.470 ZM 205.170 101.170 C 204.482 101.860 204.070 102.777 204.010 103.750 C 199.850 168.940 145.380 220.000 80.000 220.000 C 62.150 220.000 52.370 216.110 47.500 213.130 C 57.870 208.310 78.950 196.790 91.330 178.220 C 91.938 177.301 92.141 176.173 91.890 175.100 C 91.647 174.022 90.960 173.096 90.000 172.550 C 89.870 172.470 76.610 164.550 64.480 146.400 C 54.000 130.710 42.390 104.110 44.190 64.650 C 57.360 76.270 89.670 101.650 127.340 107.950 C 128.510 108.146 129.706 107.812 130.606 107.040 C 131.506 106.268 132.016 105.136 132.000 103.950 L 132.000 88.000 C 131.984 78.311 135.873 69.025 142.790 62.240 C 149.468 55.566 158.559 51.873 168.000 52.000 C 182.200 52.180 195.490 60.860 201.060 73.610 C 201.691 75.045 203.102 75.980 204.670 76.000 L 230.340 76.000 Z"),
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
