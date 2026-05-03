package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorLightIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.590 160.300 L 174.350 139.130 C 170.002 137.267 165.006 137.726 161.070 140.350 C 160.873 140.476 160.686 140.617 160.510 140.770 L 135.820 161.770 C 135.301 162.053 134.678 162.075 134.140 161.830 C 118.270 154.170 101.830 137.830 94.140 122.180 C 93.880 121.650 93.880 121.030 94.140 120.500 L 115.210 95.500 C 115.361 95.315 115.501 95.121 115.630 94.920 C 118.218 90.969 118.639 85.979 116.750 81.650 L 95.730 34.490 C 93.278 28.772 87.346 25.358 81.170 26.110 C 54.137 29.664 33.943 52.734 34.000 80.000 C 34.000 158.300 97.700 222.000 176.000 222.000 C 203.264 222.052 226.332 201.861 229.890 174.830 C 230.641 168.684 227.265 162.775 221.590 160.300 ZM 176.000 210.000 C 104.320 210.000 46.000 151.680 46.000 80.000 C 45.931 58.774 61.628 40.795 82.670 38.000 L 82.900 38.000 C 83.725 38.015 84.456 38.536 84.740 39.310 L 105.840 86.420 C 106.084 86.950 106.084 87.560 105.840 88.090 L 84.730 113.150 C 84.573 113.329 84.429 113.519 84.300 113.720 C 81.613 117.822 81.268 123.030 83.390 127.450 C 92.260 145.610 110.560 163.770 128.920 172.640 C 133.367 174.750 138.595 174.371 142.690 171.640 C 142.880 171.510 143.070 171.370 143.250 171.220 L 167.930 150.220 C 168.423 149.955 169.008 149.918 169.530 150.120 L 216.780 171.290 C 217.571 171.627 218.059 172.432 217.990 173.290 C 215.210 194.342 197.234 210.057 176.000 210.000 Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
