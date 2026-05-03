package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorRegularIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.500 171.470 C 212.991 154.258 224.575 128.685 224.000 101.930 C 223.000 56.220 186.390 18.530 140.760 16.130 C 116.973 14.835 93.678 23.240 76.196 39.422 C 58.715 55.605 48.541 78.184 48.000 102.000 L 25.550 145.180 C 25.460 145.360 25.370 145.540 25.290 145.720 C 21.949 153.508 25.260 162.551 32.840 166.340 L 33.090 166.450 L 56.000 176.940 L 56.000 208.000 C 56.000 216.837 63.163 224.000 72.000 224.000 L 120.000 224.000 C 124.418 224.000 128.000 220.418 128.000 216.000 C 128.000 211.582 124.418 208.000 120.000 208.000 L 72.000 208.000 L 72.000 171.810 C 72.002 168.678 70.177 165.833 67.330 164.530 L 40.000 152.000 L 63.070 107.660 C 63.671 106.533 63.990 105.277 64.000 104.000 C 63.995 70.396 87.236 41.258 120.000 33.790 L 120.000 49.380 C 108.980 53.276 102.369 64.545 104.346 76.066 C 106.322 87.586 116.311 96.007 128.000 96.007 C 139.689 96.007 149.678 87.586 151.654 76.066 C 153.631 64.545 147.020 53.276 136.000 49.380 L 136.000 32.000 C 137.300 32.000 138.600 32.000 139.900 32.100 C 168.904 33.761 194.094 52.632 203.840 80.000 L 184.000 80.000 C 181.624 79.999 179.371 81.054 177.850 82.880 L 152.340 113.500 C 141.355 109.407 129.020 113.826 123.133 123.963 C 117.246 134.101 119.522 147.005 128.521 154.517 C 137.521 162.029 150.624 161.961 159.546 154.357 C 168.468 146.753 170.611 133.826 164.620 123.750 L 187.750 96.000 L 207.540 96.000 Q 207.900 99.120 207.980 102.300 C 208.486 125.546 197.775 147.615 179.200 161.600 C 176.903 163.322 175.705 166.142 176.060 168.990 L 184.060 232.990 C 184.564 236.987 187.961 239.986 191.990 239.990 C 192.324 239.990 192.658 239.970 192.990 239.930 C 195.096 239.668 197.011 238.580 198.315 236.905 C 199.618 235.230 200.203 233.106 199.940 231.000 ZM 128.000 80.000 C 123.582 80.000 120.000 76.418 120.000 72.000 C 120.000 67.582 123.582 64.000 128.000 64.000 C 132.418 64.000 136.000 67.582 136.000 72.000 C 136.000 76.418 132.418 80.000 128.000 80.000 ZM 144.000 144.000 C 139.582 144.000 136.000 140.418 136.000 136.000 C 136.000 131.582 139.582 128.000 144.000 128.000 C 148.418 128.000 152.000 131.582 152.000 136.000 C 152.000 140.418 148.418 144.000 144.000 144.000 Z"),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
