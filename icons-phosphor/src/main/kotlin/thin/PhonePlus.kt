package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) return _phonePlus!!
        _phonePlus = phosphorThinIcon(
            name = "PhonePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.780 170.130 L 165.560 149.000 C 161.841 147.391 157.561 147.767 154.180 150.000 C 154.047 150.084 153.920 150.178 153.800 150.280 L 129.000 171.420 C 127.881 172.109 126.490 172.188 125.300 171.630 C 109.060 163.790 92.300 147.110 84.410 131.060 C 83.847 129.878 83.914 128.492 84.590 127.370 L 105.790 102.160 C 105.890 102.040 105.980 101.910 106.070 101.780 C 108.296 98.404 108.672 94.133 107.070 90.420 L 85.900 43.280 C 83.801 38.376 78.716 35.446 73.420 36.090 C 47.387 39.522 27.946 61.742 28.000 88.000 C 28.000 165.200 90.800 228.000 168.000 228.000 C 194.258 228.054 216.478 208.613 219.910 182.580 C 220.549 177.310 217.649 172.246 212.780 170.130 ZM 212.000 181.570 C 209.083 203.622 190.243 220.076 168.000 220.000 C 95.220 220.000 36.000 160.780 36.000 88.000 C 35.923 65.760 52.372 46.921 74.420 44.000 C 74.580 43.990 74.740 43.990 74.900 44.000 C 76.514 44.014 77.961 44.996 78.570 46.490 L 99.680 93.630 C 100.180 94.798 100.094 96.135 99.450 97.230 L 78.260 122.430 C 78.160 122.560 78.060 122.680 77.970 122.820 C 75.674 126.331 75.378 130.786 77.190 134.570 C 85.880 152.360 103.800 170.150 121.790 178.840 C 125.600 180.640 130.075 180.310 133.580 177.970 L 133.950 177.690 L 158.780 156.570 C 159.858 155.912 161.186 155.811 162.350 156.300 L 209.560 177.460 C 211.192 178.140 212.185 179.811 212.000 181.570 ZM 140.000 80.000 C 140.000 77.791 141.791 76.000 144.000 76.000 L 172.000 76.000 L 172.000 48.000 C 172.000 45.791 173.791 44.000 176.000 44.000 C 178.209 44.000 180.000 45.791 180.000 48.000 L 180.000 76.000 L 208.000 76.000 C 210.209 76.000 212.000 77.791 212.000 80.000 C 212.000 82.209 210.209 84.000 208.000 84.000 L 180.000 84.000 L 180.000 112.000 C 180.000 114.209 178.209 116.000 176.000 116.000 C 173.791 116.000 172.000 114.209 172.000 112.000 L 172.000 84.000 L 144.000 84.000 C 141.791 84.000 140.000 82.209 140.000 80.000 Z"),
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
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
