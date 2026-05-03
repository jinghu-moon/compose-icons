package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorThinIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 122.830 138.830 L 122.830 138.830 L 145.000 116.700 C 154.000 121.590 163.060 124.050 171.810 124.050 C 180.237 124.054 188.500 121.720 195.680 117.310 C 218.100 103.730 230.090 71.860 227.750 32.050 C 227.632 30.028 226.022 28.413 224.000 28.290 C 184.190 25.940 152.320 37.940 138.740 60.360 C 129.530 75.560 129.740 93.450 139.350 111.040 L 120.000 130.340 L 102.940 113.280 C 109.600 100.500 109.650 87.080 102.940 76.060 C 92.890 59.400 69.330 50.490 40.000 52.210 C 37.952 52.315 36.315 53.952 36.210 56.000 C 34.480 85.360 43.400 108.920 60.060 119.000 C 65.464 122.290 71.673 124.020 78.000 124.000 C 84.755 123.913 91.389 122.198 97.340 119.000 L 114.340 136.060 L 102.340 148.060 L 56.000 148.060 C 53.791 148.060 52.000 149.851 52.000 152.060 C 52.000 154.269 53.791 156.060 56.000 156.060 L 68.790 156.060 L 82.700 218.600 C 83.895 224.109 88.783 228.029 94.420 228.000 L 161.590 228.000 C 167.223 228.024 172.105 224.105 173.300 218.600 L 187.210 156.000 L 200.000 156.000 C 202.209 156.000 204.000 154.209 204.000 152.000 C 204.000 149.791 202.209 148.000 200.000 148.000 L 113.660 148.000 L 122.830 138.830 ZM 145.530 64.510 C 157.150 45.310 184.800 34.800 219.900 36.100 C 221.190 71.200 210.690 98.840 191.490 110.470 C 178.410 118.390 162.720 117.790 147.200 108.790 C 138.210 93.280 137.610 77.590 145.530 64.510 ZM 95.050 111.050 C 84.210 117.240 73.290 117.640 64.210 112.130 C 50.780 104.000 43.350 84.680 44.000 60.000 C 68.640 59.310 88.000 66.740 96.100 80.170 C 101.640 89.290 101.240 100.210 95.050 111.050 ZM 179.050 156.050 L 165.520 216.920 C 165.113 218.748 163.492 220.048 161.620 220.050 L 94.420 220.050 C 92.544 220.053 90.918 218.751 90.510 216.920 L 77.000 156.000 Z"),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
