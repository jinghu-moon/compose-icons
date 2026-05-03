package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorThinIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 172.000 L 57.320 172.000 C 61.320 164.170 65.500 155.890 69.530 147.440 C 84.670 150.990 103.660 139.380 126.070 112.850 C 129.740 125.350 138.600 147.680 155.150 148.000 L 155.500 148.000 C 164.210 148.000 173.140 141.750 182.660 128.940 C 187.170 137.140 199.310 148.000 232.000 148.000 C 234.209 148.000 236.000 146.209 236.000 144.000 C 236.000 141.791 234.209 140.000 232.000 140.000 C 189.120 140.000 188.000 120.760 188.000 120.000 C 187.997 118.231 186.833 116.674 185.137 116.171 C 183.442 115.668 181.617 116.339 180.650 117.820 C 168.740 136.100 160.420 140.000 155.480 140.000 L 155.300 140.000 C 142.300 139.750 134.010 113.480 131.920 103.390 C 131.595 101.891 130.441 100.710 128.950 100.350 C 127.459 99.991 125.893 100.515 124.920 101.700 C 103.980 127.970 85.860 141.250 73.120 139.900 C 97.310 87.500 105.190 53.160 96.490 37.770 C 94.000 33.310 88.700 28.000 77.910 28.000 C 64.090 28.000 52.540 42.410 47.000 66.540 C 43.531 81.787 43.008 97.557 45.460 113.000 C 48.100 128.290 53.850 139.050 62.150 144.350 C 57.570 153.950 52.850 163.350 48.310 172.030 L 24.000 172.030 C 21.791 172.030 20.000 173.821 20.000 176.030 C 20.000 178.239 21.791 180.030 24.000 180.030 L 44.100 180.030 C 31.230 204.200 20.730 221.710 20.570 221.970 C 20.023 222.880 19.861 223.969 20.118 224.999 C 20.375 226.029 21.030 226.914 21.940 227.460 C 22.564 227.826 23.277 228.013 24.000 228.000 C 25.405 228.000 26.707 227.264 27.430 226.060 C 27.590 225.790 39.280 206.310 53.150 180.000 L 232.000 180.000 C 234.209 180.000 236.000 178.209 236.000 176.000 C 236.000 173.791 234.209 172.000 232.000 172.000 ZM 53.340 111.610 C 51.085 97.216 51.591 82.525 54.830 68.320 C 58.400 52.700 66.340 36.000 77.910 36.000 C 85.430 36.000 88.140 39.260 89.520 41.700 C 99.000 58.400 79.920 106.000 65.600 137.000 C 59.760 132.690 55.460 123.830 53.340 111.610 Z"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
