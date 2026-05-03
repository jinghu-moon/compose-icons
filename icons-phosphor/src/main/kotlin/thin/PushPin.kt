package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorThinIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.490 84.200 L 171.800 23.510 C 169.548 21.251 166.490 19.981 163.300 19.981 C 160.110 19.981 157.052 21.251 154.800 23.510 L 99.450 79.070 C 91.370 76.070 66.660 69.620 40.450 90.740 C 37.788 92.871 36.159 96.033 35.968 99.437 C 35.777 102.841 37.043 106.165 39.450 108.580 L 90.580 159.710 L 45.170 205.170 C 43.607 206.733 43.607 209.267 45.170 210.830 C 46.733 212.393 49.267 212.393 50.830 210.830 L 96.290 165.360 L 147.410 216.480 C 149.661 218.734 152.715 220.000 155.900 220.000 C 156.180 220.000 156.470 220.000 156.750 220.000 C 160.208 219.755 163.391 218.027 165.480 215.260 C 185.310 188.900 181.990 168.080 177.190 156.690 L 232.490 101.200 C 234.749 98.948 236.019 95.890 236.019 92.700 C 236.019 89.510 234.749 86.452 232.490 84.200 ZM 226.830 95.510 L 226.830 95.510 L 169.560 153.000 C 168.346 154.216 168.044 156.072 168.810 157.610 C 179.240 178.460 167.190 199.610 159.080 210.440 C 158.380 211.354 157.320 211.922 156.171 211.999 C 155.022 212.075 153.895 211.653 153.080 210.840 L 45.170 102.930 C 44.349 102.124 43.914 101.004 43.978 99.855 C 44.041 98.707 44.595 97.641 45.500 96.930 C 58.440 86.530 70.860 83.740 80.440 83.740 C 86.683 83.648 92.874 84.889 98.600 87.380 C 100.141 88.151 102.002 87.849 103.220 86.630 L 160.490 29.170 C 161.240 28.419 162.258 27.997 163.320 27.997 C 164.382 27.997 165.400 28.419 166.150 29.170 L 226.830 89.860 C 228.388 91.421 228.388 93.949 226.830 95.510 Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
