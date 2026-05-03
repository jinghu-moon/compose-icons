package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorThinIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 72.000 C 140.000 69.791 141.791 68.000 144.000 68.000 L 206.340 68.000 L 181.170 42.830 C 179.607 41.267 179.607 38.733 181.170 37.170 C 182.733 35.607 185.267 35.607 186.830 37.170 L 218.830 69.170 C 219.581 69.920 220.003 70.938 220.003 72.000 C 220.003 73.062 219.581 74.080 218.830 74.830 L 186.830 106.830 C 185.267 108.393 182.733 108.393 181.170 106.830 C 179.607 105.267 179.607 102.733 181.170 101.170 L 206.340 76.000 L 144.000 76.000 C 141.791 76.000 140.000 74.209 140.000 72.000 ZM 219.910 182.580 C 216.473 208.611 194.256 228.050 168.000 228.000 C 90.800 228.000 28.000 165.200 28.000 88.000 C 27.950 61.744 47.389 39.527 73.420 36.090 C 78.716 35.446 83.801 38.376 85.900 43.280 L 107.000 90.420 C 108.602 94.133 108.226 98.404 106.000 101.780 C 105.912 101.913 105.815 102.040 105.710 102.160 L 84.560 127.370 C 83.884 128.492 83.817 129.878 84.380 131.060 C 92.210 147.110 109.030 163.790 125.270 171.630 C 126.460 172.188 127.851 172.109 128.970 171.420 L 153.800 150.300 C 153.917 150.198 154.040 150.104 154.170 150.020 C 157.550 147.777 161.835 147.393 165.560 149.000 L 212.780 170.160 C 217.637 172.273 220.535 177.320 219.910 182.580 ZM 209.560 177.460 L 162.350 156.300 C 161.186 155.811 159.858 155.912 158.780 156.570 L 134.000 177.690 L 133.630 177.970 C 130.125 180.310 125.650 180.640 121.840 178.840 C 103.840 170.150 85.930 152.360 77.240 134.570 C 75.422 130.790 75.710 126.335 78.000 122.820 L 78.290 122.430 L 99.480 97.230 C 100.124 96.135 100.210 94.798 99.710 93.630 L 78.570 46.500 C 77.964 45.002 76.516 44.015 74.900 44.000 C 74.740 43.990 74.580 43.990 74.420 44.000 C 52.372 46.921 35.923 65.760 36.000 88.000 C 36.077 160.870 95.130 219.923 168.000 220.000 C 190.240 220.077 209.079 203.628 212.000 181.580 C 212.189 179.818 211.196 178.141 209.560 177.460 Z"),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
