package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) return _phonePlus!!
        _phonePlus = phosphorLightIcon(
            name = "PhonePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.590 168.300 L 166.350 147.130 C 162.002 145.267 157.006 145.726 153.070 148.350 C 152.873 148.476 152.686 148.617 152.510 148.770 L 127.820 169.770 C 127.301 170.053 126.678 170.075 126.140 169.830 C 110.270 162.170 93.830 145.830 86.140 130.180 C 85.881 129.654 85.881 129.036 86.140 128.510 L 107.210 103.450 C 107.361 103.265 107.501 103.071 107.630 102.870 C 110.218 98.919 110.639 93.929 108.750 89.600 L 87.730 42.490 C 85.278 36.772 79.346 33.358 73.170 34.110 C 46.139 37.668 25.948 60.736 26.000 88.000 C 26.000 166.300 89.700 230.000 168.000 230.000 C 195.264 230.052 218.332 209.861 221.890 182.830 C 222.641 176.684 219.265 170.775 213.590 168.300 ZM 168.000 218.000 C 96.320 218.000 38.000 159.680 38.000 88.000 C 37.931 66.774 53.628 48.795 74.670 46.000 L 74.900 46.000 C 75.725 46.015 76.456 46.536 76.740 47.310 L 97.840 94.420 C 98.084 94.950 98.084 95.560 97.840 96.090 L 76.730 121.150 C 76.573 121.329 76.429 121.519 76.300 121.720 C 73.613 125.822 73.268 131.030 75.390 135.450 C 84.260 153.610 102.560 171.770 120.920 180.640 C 125.367 182.750 130.595 182.371 134.690 179.640 C 134.880 179.510 135.070 179.370 135.250 179.220 L 159.930 158.220 C 160.423 157.955 161.008 157.918 161.530 158.120 L 208.780 179.290 C 209.571 179.627 210.059 180.432 209.990 181.290 C 207.210 202.342 189.234 218.057 168.000 218.000 ZM 138.000 80.000 C 138.000 76.686 140.686 74.000 144.000 74.000 L 170.000 74.000 L 170.000 48.000 C 170.000 44.686 172.686 42.000 176.000 42.000 C 179.314 42.000 182.000 44.686 182.000 48.000 L 182.000 74.000 L 208.000 74.000 C 211.314 74.000 214.000 76.686 214.000 80.000 C 214.000 83.314 211.314 86.000 208.000 86.000 L 182.000 86.000 L 182.000 112.000 C 182.000 115.314 179.314 118.000 176.000 118.000 C 172.686 118.000 170.000 115.314 170.000 112.000 L 170.000 86.000 L 144.000 86.000 C 140.686 86.000 138.000 83.314 138.000 80.000 Z"),
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
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
