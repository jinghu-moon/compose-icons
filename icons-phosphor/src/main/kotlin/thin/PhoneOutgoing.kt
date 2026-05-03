package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorThinIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 149.170 106.830 C 148.419 106.080 147.997 105.062 147.997 104.000 C 147.997 102.938 148.419 101.920 149.170 101.170 L 190.340 60.000 L 160.000 60.000 C 157.791 60.000 156.000 58.209 156.000 56.000 C 156.000 53.791 157.791 52.000 160.000 52.000 L 200.000 52.000 C 202.209 52.000 204.000 53.791 204.000 56.000 L 204.000 96.000 C 204.000 98.209 202.209 100.000 200.000 100.000 C 197.791 100.000 196.000 98.209 196.000 96.000 L 196.000 65.660 L 154.830 106.830 C 154.080 107.581 153.062 108.003 152.000 108.003 C 150.938 108.003 149.920 107.581 149.170 106.830 ZM 219.910 182.580 C 216.478 208.613 194.258 228.054 168.000 228.000 C 90.800 228.000 28.000 165.200 28.000 88.000 C 27.946 61.742 47.387 39.522 73.420 36.090 C 78.716 35.446 83.801 38.376 85.900 43.280 L 107.000 90.420 C 108.602 94.133 108.226 98.404 106.000 101.780 C 105.910 101.910 105.820 102.040 105.720 102.160 L 84.520 127.370 C 83.844 128.492 83.777 129.878 84.340 131.060 C 92.180 147.110 108.990 163.790 125.230 171.630 C 126.420 172.188 127.811 172.109 128.930 171.420 L 153.800 150.300 C 153.920 150.198 154.047 150.104 154.180 150.020 C 157.558 147.780 161.838 147.396 165.560 149.000 L 212.780 170.160 C 217.637 172.273 220.535 177.320 219.910 182.580 ZM 209.560 177.460 L 162.350 156.300 C 161.186 155.811 159.858 155.912 158.780 156.570 L 134.000 177.690 L 133.630 177.970 C 130.125 180.310 125.650 180.640 121.840 178.840 C 103.840 170.150 85.930 152.360 77.240 134.570 C 75.422 130.790 75.710 126.335 78.000 122.820 C 78.090 122.680 78.190 122.560 78.290 122.430 L 99.480 97.230 C 100.124 96.135 100.210 94.798 99.710 93.630 L 78.570 46.490 C 77.961 44.996 76.514 44.014 74.900 44.000 C 74.740 43.990 74.580 43.990 74.420 44.000 C 52.372 46.921 35.923 65.760 36.000 88.000 C 36.000 160.780 95.220 220.000 168.000 220.000 C 190.240 220.077 209.079 203.628 212.000 181.580 C 212.189 179.818 211.196 178.141 209.560 177.460 Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
