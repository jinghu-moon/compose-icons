package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorBoldIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 84.000 C 171.882 84.000 188.000 67.882 188.000 48.000 C 188.000 28.118 171.882 12.000 152.000 12.000 C 132.118 12.000 116.000 28.118 116.000 48.000 C 116.000 67.882 132.118 84.000 152.000 84.000 ZM 152.000 36.000 C 158.627 36.000 164.000 41.373 164.000 48.000 C 164.000 54.627 158.627 60.000 152.000 60.000 C 145.373 60.000 140.000 54.627 140.000 48.000 C 140.000 41.373 145.373 36.000 152.000 36.000 ZM 204.000 144.000 L 204.000 232.000 C 204.000 238.627 198.627 244.000 192.000 244.000 C 185.373 244.000 180.000 238.627 180.000 232.000 L 180.000 155.240 C 155.080 151.870 146.060 137.950 138.620 126.480 C 137.070 124.090 135.570 121.770 133.950 119.600 L 124.410 141.600 L 159.000 166.230 C 162.146 168.489 164.007 172.127 164.000 176.000 L 164.000 232.000 C 164.000 238.627 158.627 244.000 152.000 244.000 C 145.373 244.000 140.000 238.627 140.000 232.000 L 140.000 182.170 L 114.630 164.050 L 83.000 236.780 C 81.367 240.827 77.666 243.669 73.335 244.201 C 69.003 244.733 64.724 242.872 62.161 239.340 C 59.597 235.809 59.152 231.164 61.000 227.210 L 118.520 94.900 C 119.841 91.859 122.361 89.499 125.482 88.382 C 128.604 87.264 132.049 87.488 135.000 89.000 C 138.172 90.646 141.139 92.660 143.840 95.000 C 150.620 100.890 154.930 107.530 158.730 113.390 C 166.270 125.000 170.800 132.000 192.000 132.000 C 198.627 132.000 204.000 137.373 204.000 144.000 ZM 64.600 153.880 L 39.270 143.000 C 33.206 140.377 30.403 133.345 33.000 127.270 L 57.000 71.270 C 59.623 65.206 66.655 62.403 72.730 65.000 L 98.340 76.000 C 102.571 77.483 105.622 81.202 106.251 85.641 C 106.880 90.080 104.981 94.500 101.329 97.100 C 97.676 99.700 92.879 100.047 88.890 98.000 L 74.300 91.760 L 59.760 125.700 L 74.050 131.820 C 78.033 133.481 80.817 137.151 81.342 141.434 C 81.868 145.717 80.054 149.952 76.591 152.526 C 73.128 155.100 68.550 155.617 64.600 153.880 Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
