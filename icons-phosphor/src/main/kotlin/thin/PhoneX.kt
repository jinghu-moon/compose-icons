package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = phosphorThinIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 149.170 101.170 L 170.340 80.000 L 149.170 58.830 C 147.607 57.267 147.607 54.733 149.170 53.170 C 150.733 51.607 153.267 51.607 154.830 53.170 L 176.000 74.340 L 197.170 53.170 C 198.733 51.607 201.267 51.607 202.830 53.170 C 204.393 54.733 204.393 57.267 202.830 58.830 L 181.660 80.000 L 202.830 101.170 C 204.393 102.733 204.393 105.267 202.830 106.830 C 201.267 108.393 198.733 108.393 197.170 106.830 L 176.000 85.660 L 154.830 106.830 C 153.267 108.393 150.733 108.393 149.170 106.830 C 147.607 105.267 147.607 102.733 149.170 101.170 ZM 219.910 182.580 C 216.478 208.613 194.258 228.054 168.000 228.000 C 90.800 228.000 28.000 165.200 28.000 88.000 C 27.946 61.742 47.387 39.522 73.420 36.090 C 78.716 35.446 83.801 38.376 85.900 43.280 L 107.000 90.420 C 108.602 94.133 108.226 98.404 106.000 101.780 C 105.910 101.910 105.820 102.040 105.720 102.160 L 84.520 127.370 C 83.844 128.492 83.777 129.878 84.340 131.060 C 92.180 147.110 108.990 163.790 125.230 171.630 C 126.421 172.182 127.809 172.104 128.930 171.420 L 153.800 150.300 C 153.920 150.198 154.047 150.104 154.180 150.020 C 157.558 147.780 161.838 147.396 165.560 149.000 L 212.780 170.160 C 217.637 172.273 220.535 177.320 219.910 182.580 ZM 209.560 177.460 L 162.350 156.300 C 161.186 155.811 159.858 155.912 158.780 156.570 L 134.000 177.690 L 133.630 177.970 C 130.125 180.310 125.650 180.640 121.840 178.840 C 103.840 170.150 85.930 152.360 77.240 134.570 C 75.422 130.790 75.710 126.335 78.000 122.820 C 78.090 122.680 78.190 122.560 78.290 122.430 L 99.480 97.230 C 100.124 96.135 100.210 94.798 99.710 93.630 L 78.570 46.490 C 77.961 44.996 76.514 44.014 74.900 44.000 C 74.740 43.990 74.580 43.990 74.420 44.000 C 52.372 46.921 35.923 65.760 36.000 88.000 C 36.000 160.780 95.220 220.000 168.000 220.000 C 190.240 220.077 209.079 203.628 212.000 181.580 C 212.189 179.818 211.196 178.141 209.560 177.460 Z"),
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
