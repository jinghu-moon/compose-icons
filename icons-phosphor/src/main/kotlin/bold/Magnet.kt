package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorBoldIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 209.840 47.440 C 192.664 29.910 169.162 20.022 144.620 20.000 L 144.270 20.000 C 119.827 19.935 96.375 29.658 79.150 47.000 L 17.760 109.170 C 10.021 116.994 10.057 129.600 17.840 137.380 L 46.500 166.000 C 50.245 169.764 55.340 171.874 60.650 171.860 L 60.760 171.860 C 66.108 171.854 71.228 169.690 74.960 165.860 L 135.830 103.470 C 140.475 98.919 147.890 98.866 152.600 103.350 C 154.847 105.546 156.109 108.558 156.100 111.700 C 156.134 115.101 154.818 118.377 152.440 120.810 L 90.190 181.000 C 86.345 184.731 84.158 189.849 84.118 195.206 C 84.079 200.563 86.190 205.713 89.980 209.500 L 118.640 238.160 C 126.414 245.877 138.939 245.939 146.790 238.300 L 208.550 177.860 L 208.640 177.770 C 244.650 141.780 245.180 83.310 209.840 47.440 ZM 60.620 146.210 L 37.620 123.210 L 55.810 104.800 L 78.690 127.680 ZM 132.820 218.390 L 109.820 195.390 L 128.430 177.390 L 151.310 200.260 ZM 191.710 160.770 L 168.480 183.500 L 145.700 160.730 L 169.210 138.000 L 169.360 137.860 C 176.314 130.855 180.181 121.361 180.100 111.490 C 180.070 101.901 176.155 92.733 169.250 86.080 C 155.074 72.572 132.726 72.784 118.810 86.560 L 118.710 86.670 L 95.460 110.490 L 72.680 87.720 L 96.180 63.920 C 108.905 51.122 126.223 43.949 144.270 44.000 L 144.530 44.000 C 162.671 44.023 180.042 51.334 192.740 64.290 C 218.850 90.780 218.380 134.050 191.710 160.770 Z"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
