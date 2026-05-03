package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) return _phoneIncoming!!
        _phoneIncoming = phosphorThinIcon(
            name = "PhoneIncoming",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.780 170.130 L 165.560 149.000 C 161.841 147.391 157.561 147.767 154.180 150.000 C 154.047 150.084 153.920 150.178 153.800 150.280 L 129.000 171.420 C 127.881 172.109 126.490 172.188 125.300 171.630 C 109.060 163.790 92.300 147.110 84.410 131.060 C 83.847 129.878 83.914 128.492 84.590 127.370 L 105.790 102.160 C 105.890 102.040 105.980 101.910 106.070 101.780 C 108.296 98.404 108.672 94.133 107.070 90.420 L 85.900 43.280 C 83.801 38.376 78.716 35.446 73.420 36.090 C 47.387 39.522 27.946 61.742 28.000 88.000 C 28.000 165.200 90.800 228.000 168.000 228.000 C 194.258 228.054 216.478 208.613 219.910 182.580 C 220.549 177.310 217.649 172.246 212.780 170.130 ZM 212.000 181.580 C 209.079 203.628 190.240 220.077 168.000 220.000 C 95.220 220.000 36.000 160.780 36.000 88.000 C 35.923 65.760 52.372 46.921 74.420 44.000 C 74.580 43.990 74.740 43.990 74.900 44.000 C 76.514 44.014 77.961 44.996 78.570 46.490 L 99.680 93.630 C 100.180 94.798 100.094 96.135 99.450 97.230 L 78.260 122.430 C 78.160 122.560 78.060 122.680 77.970 122.820 C 75.674 126.331 75.378 130.786 77.190 134.570 C 85.880 152.360 103.800 170.150 121.790 178.840 C 125.600 180.640 130.075 180.310 133.580 177.970 L 133.950 177.690 L 158.780 156.570 C 159.858 155.912 161.186 155.811 162.350 156.300 L 209.560 177.460 C 211.196 178.141 212.189 179.818 212.000 181.580 ZM 148.000 104.000 L 148.000 64.000 C 148.000 61.791 149.791 60.000 152.000 60.000 C 154.209 60.000 156.000 61.791 156.000 64.000 L 156.000 94.340 L 197.170 53.170 C 198.733 51.607 201.267 51.607 202.830 53.170 C 204.393 54.733 204.393 57.267 202.830 58.830 L 161.660 100.000 L 192.000 100.000 C 194.209 100.000 196.000 101.791 196.000 104.000 C 196.000 106.209 194.209 108.000 192.000 108.000 L 152.000 108.000 C 149.791 108.000 148.000 106.209 148.000 104.000 Z"),
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
