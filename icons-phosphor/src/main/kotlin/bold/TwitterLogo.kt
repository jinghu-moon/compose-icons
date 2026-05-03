package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorBoldIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 251.090 67.410 C 249.233 62.924 244.855 59.999 240.000 60.000 L 211.820 60.000 C 202.200 45.193 185.807 36.183 168.150 36.000 C 154.447 35.816 141.251 41.170 131.550 50.850 C 121.575 60.634 115.968 74.028 116.000 88.000 L 116.000 88.780 C 79.170 77.210 49.620 47.880 49.300 47.550 C 46.013 44.237 41.103 43.131 36.712 44.714 C 32.322 46.297 29.247 50.282 28.830 54.930 C 22.520 125.100 53.480 162.720 70.890 178.050 C 56.400 192.830 36.000 200.680 35.800 200.760 C 32.364 202.039 29.701 204.819 28.571 208.307 C 27.440 211.795 27.967 215.609 30.000 218.660 C 32.000 221.550 43.440 236.000 80.000 236.000 C 152.250 236.000 212.700 180.740 219.600 109.370 L 248.480 80.490 C 251.916 77.060 252.946 71.897 251.090 67.410 ZM 199.520 95.520 C 197.451 97.580 196.210 100.326 196.030 103.240 C 192.140 164.230 141.180 212.000 80.000 212.000 C 75.823 212.024 71.650 211.760 67.510 211.210 C 78.000 204.550 89.720 195.070 98.000 182.660 C 99.831 179.914 100.450 176.536 99.712 173.320 C 98.974 170.104 96.944 167.333 94.100 165.660 C 93.980 165.590 81.770 158.170 70.670 141.240 C 59.570 124.310 53.410 104.240 52.210 81.460 C 69.370 94.400 96.000 110.790 126.000 115.840 C 129.484 116.429 133.051 115.452 135.749 113.170 C 138.447 110.889 140.002 107.534 140.000 104.000 L 140.000 88.000 C 139.983 80.450 143.015 73.212 148.410 67.930 C 153.562 62.777 160.574 59.918 167.860 60.000 C 178.990 60.149 189.040 66.692 193.680 76.810 C 195.592 81.180 199.910 84.002 204.680 84.000 L 211.000 84.000 Z"),
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
