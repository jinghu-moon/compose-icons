package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorThinIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.140 47.000 C 148.694 44.869 150.866 43.586 153.000 44.130 C 181.836 51.641 204.354 74.162 211.860 103.000 C 212.426 105.131 211.160 107.319 209.030 107.890 C 208.705 107.983 208.368 108.030 208.030 108.030 C 206.211 108.024 204.625 106.791 204.170 105.030 C 197.376 78.990 177.040 58.654 151.000 51.860 C 148.873 51.302 147.595 49.131 148.140 47.000 ZM 143.000 83.860 C 158.000 87.890 168.110 98.000 172.140 113.000 C 172.595 114.761 174.181 115.994 176.000 116.000 C 176.338 116.000 176.675 115.953 177.000 115.860 C 179.130 115.289 180.396 113.101 179.830 110.970 C 175.030 92.970 162.980 80.970 145.000 76.130 C 142.926 75.729 140.897 77.010 140.368 79.055 C 139.839 81.101 140.992 83.205 143.000 83.860 ZM 219.940 182.580 C 216.506 208.624 194.269 228.070 168.000 228.000 C 90.800 228.000 28.000 165.200 28.000 88.000 C 27.946 61.742 47.387 39.522 73.420 36.090 C 78.716 35.446 83.801 38.376 85.900 43.280 L 107.000 90.420 C 108.602 94.133 108.226 98.404 106.000 101.780 C 105.910 101.910 105.820 102.040 105.720 102.160 L 84.520 127.370 C 83.844 128.492 83.777 129.878 84.340 131.060 C 92.180 147.110 108.990 163.790 125.230 171.630 C 126.421 172.182 127.809 172.104 128.930 171.420 L 153.800 150.300 L 154.180 150.010 C 157.561 147.777 161.841 147.401 165.560 149.010 L 212.780 170.170 C 217.633 172.282 220.530 177.324 219.910 182.580 ZM 209.590 177.460 L 162.350 156.300 C 161.186 155.811 159.858 155.912 158.780 156.570 L 134.000 177.690 L 133.630 177.970 C 130.125 180.310 125.650 180.640 121.840 178.840 C 103.840 170.150 85.930 152.360 77.240 134.570 C 75.422 130.790 75.710 126.335 78.000 122.820 C 78.090 122.680 78.190 122.560 78.290 122.430 L 99.480 97.230 C 100.124 96.135 100.210 94.798 99.710 93.630 L 78.570 46.490 C 77.961 44.996 76.514 44.014 74.900 44.000 C 74.740 43.990 74.580 43.990 74.420 44.000 C 52.372 46.921 35.923 65.760 36.000 88.000 C 36.000 160.780 95.220 220.000 168.000 220.000 C 190.240 220.077 209.079 203.628 212.000 181.580 C 212.189 179.818 211.196 178.141 209.560 177.460 Z"),
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
