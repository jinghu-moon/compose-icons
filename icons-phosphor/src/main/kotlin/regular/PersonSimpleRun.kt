package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorRegularIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 88.000 C 169.673 88.000 184.000 73.673 184.000 56.000 C 184.000 38.327 169.673 24.000 152.000 24.000 C 134.327 24.000 120.000 38.327 120.000 56.000 C 120.000 73.673 134.327 88.000 152.000 88.000 ZM 152.000 40.000 C 160.837 40.000 168.000 47.163 168.000 56.000 C 168.000 64.837 160.837 72.000 152.000 72.000 C 143.163 72.000 136.000 64.837 136.000 56.000 C 136.000 47.163 143.163 40.000 152.000 40.000 ZM 219.310 140.680 C 218.700 140.960 211.820 143.960 199.640 143.960 C 185.790 143.960 165.090 140.080 138.950 123.960 C 134.971 135.255 129.806 146.095 123.540 156.300 C 134.794 159.765 145.381 165.110 154.850 172.110 C 173.920 186.650 184.000 207.350 184.000 232.000 C 184.000 236.418 180.418 240.000 176.000 240.000 C 171.582 240.000 168.000 236.418 168.000 232.000 C 168.000 190.300 133.310 175.290 113.860 170.150 C 113.310 170.850 112.740 171.560 112.170 172.250 C 92.530 196.050 67.920 208.430 40.540 208.430 C 37.421 208.445 34.304 208.301 31.200 208.000 C 26.782 207.558 23.558 203.618 24.000 199.200 C 24.442 194.782 28.382 191.558 32.800 192.000 C 58.720 194.580 81.270 184.510 99.800 162.000 C 112.290 146.860 120.800 128.390 125.050 115.000 C 86.130 92.350 61.270 111.630 61.000 111.840 C 58.781 113.735 55.707 114.271 52.977 113.240 C 50.248 112.209 48.297 109.773 47.885 106.885 C 47.474 103.996 48.667 101.112 51.000 99.360 C 52.500 98.160 88.220 70.360 140.510 105.930 C 185.980 136.840 212.440 126.240 212.690 126.120 C 215.298 124.888 218.368 125.156 220.724 126.821 C 223.079 128.486 224.356 131.290 224.066 134.160 C 223.775 137.030 221.962 139.521 219.320 140.680 Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
