package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) return _phoneIncoming!!
        _phoneIncoming = phosphorLightIcon(
            name = "PhoneIncoming",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.590 168.300 L 166.350 147.130 C 162.002 145.267 157.006 145.726 153.070 148.350 C 152.873 148.476 152.686 148.617 152.510 148.770 L 127.820 169.770 C 127.301 170.053 126.678 170.075 126.140 169.830 C 110.270 162.170 93.830 145.830 86.140 130.180 C 85.880 129.650 85.880 129.030 86.140 128.500 L 107.210 103.500 C 107.364 103.317 107.504 103.123 107.630 102.920 C 110.218 98.969 110.639 93.979 108.750 89.650 L 87.730 42.490 C 85.278 36.772 79.346 33.358 73.170 34.110 C 46.139 37.668 25.948 60.736 26.000 88.000 C 26.000 166.300 89.700 230.000 168.000 230.000 C 195.264 230.052 218.332 209.861 221.890 182.830 C 222.641 176.684 219.265 170.775 213.590 168.300 ZM 168.000 218.000 C 96.320 218.000 38.000 159.680 38.000 88.000 C 37.931 66.774 53.628 48.795 74.670 46.000 L 74.900 46.000 C 75.725 46.015 76.456 46.536 76.740 47.310 L 97.840 94.420 C 98.084 94.950 98.084 95.560 97.840 96.090 L 76.730 121.150 C 76.573 121.329 76.429 121.519 76.300 121.720 C 73.613 125.822 73.268 131.030 75.390 135.450 C 84.260 153.610 102.560 171.770 120.920 180.640 C 125.367 182.750 130.595 182.371 134.690 179.640 C 134.880 179.510 135.070 179.370 135.250 179.220 L 159.930 158.220 C 160.423 157.955 161.008 157.918 161.530 158.120 L 208.780 179.290 C 209.571 179.627 210.059 180.432 209.990 181.290 C 207.210 202.342 189.234 218.057 168.000 218.000 ZM 146.000 104.000 L 146.000 64.000 C 146.000 60.686 148.686 58.000 152.000 58.000 C 155.314 58.000 158.000 60.686 158.000 64.000 L 158.000 89.510 L 195.760 51.760 C 198.124 49.557 201.808 49.622 204.093 51.907 C 206.378 54.192 206.443 57.876 204.240 60.240 L 166.480 98.000 L 192.000 98.000 C 195.314 98.000 198.000 100.686 198.000 104.000 C 198.000 107.314 195.314 110.000 192.000 110.000 L 152.000 110.000 C 148.686 110.000 146.000 107.314 146.000 104.000 Z"),
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
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
