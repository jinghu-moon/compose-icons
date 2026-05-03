package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorBoldIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.790 48.000 C 231.520 42.520 223.390 36.000 208.910 36.000 C 191.050 36.000 168.410 47.700 148.340 67.300 C 145.340 70.190 142.600 73.150 140.000 76.140 L 140.000 56.000 C 140.000 49.373 134.627 44.000 128.000 44.000 C 121.373 44.000 116.000 49.373 116.000 56.000 L 116.000 76.140 C 113.400 73.140 110.620 70.140 107.660 67.300 C 87.590 47.700 65.000 36.000 47.090 36.000 C 32.610 36.000 24.480 42.540 20.210 48.000 C 7.000 65.000 12.000 93.910 19.280 122.660 C 25.030 145.300 37.080 155.660 48.160 160.350 C 41.560 175.212 42.913 192.403 51.756 206.049 C 60.600 219.696 75.738 227.953 92.000 228.000 C 105.784 228.010 118.904 222.077 128.000 211.720 C 141.201 226.688 162.286 231.926 180.957 224.876 C 199.628 217.826 211.988 199.958 212.000 180.000 C 212.006 173.233 210.595 166.540 207.860 160.350 C 218.940 155.680 230.990 145.350 236.740 122.660 C 244.000 93.910 249.000 65.000 235.790 48.000 ZM 92.000 204.000 C 78.745 204.000 68.000 193.255 68.000 180.000 C 68.049 167.763 77.169 157.462 89.310 155.930 C 95.899 155.201 100.649 149.269 99.920 142.680 C 99.191 136.091 93.259 131.341 86.670 132.070 C 78.965 132.924 71.585 135.646 65.170 140.000 C 56.980 139.710 47.170 135.080 42.540 116.760 C 35.130 87.580 33.990 69.410 39.150 62.760 C 39.740 62.000 41.300 60.000 47.090 60.000 C 58.300 60.000 75.910 69.830 90.900 84.470 C 106.150 99.370 116.000 116.330 116.000 127.670 L 116.000 180.000 C 116.000 193.255 105.255 204.000 92.000 204.000 ZM 213.450 116.750 C 208.810 135.070 199.000 139.700 190.820 140.000 C 184.403 135.645 177.019 132.926 169.310 132.080 C 162.721 131.351 156.789 136.101 156.060 142.690 C 155.331 149.279 160.081 155.211 166.670 155.940 C 178.815 157.462 187.944 167.760 188.000 180.000 C 188.000 193.255 177.255 204.000 164.000 204.000 C 150.745 204.000 140.000 193.255 140.000 180.000 L 140.000 127.670 C 140.000 116.330 149.850 99.370 165.100 84.470 C 180.090 69.830 197.700 60.000 208.910 60.000 C 214.700 60.000 216.260 62.000 216.850 62.760 C 222.000 69.400 220.870 87.570 213.460 116.750 Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
