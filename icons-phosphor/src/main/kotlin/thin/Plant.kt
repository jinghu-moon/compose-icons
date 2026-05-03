package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorThinIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.630 48.120 C 243.507 46.098 241.892 44.488 239.870 44.370 C 189.620 41.370 149.430 56.470 132.350 84.660 C 120.710 103.880 121.180 126.580 133.590 148.870 C 124.832 158.491 119.049 170.442 116.940 183.280 L 93.450 159.790 C 102.080 143.790 102.260 127.460 93.870 113.600 C 81.450 93.090 52.350 82.130 16.000 84.260 C 13.989 84.387 12.387 85.989 12.260 88.000 C 10.130 124.330 21.090 153.430 41.600 165.850 C 48.183 169.891 55.756 172.030 63.480 172.030 C 72.006 171.885 80.361 169.617 87.790 165.430 L 116.000 193.670 C 116.000 193.950 116.000 194.230 116.000 194.510 L 116.000 224.000 C 116.000 226.209 117.791 228.000 120.000 228.000 C 122.209 228.000 124.000 226.209 124.000 224.000 L 124.000 194.510 C 123.962 179.742 129.411 165.487 139.290 154.510 C 150.780 160.870 162.360 164.070 173.530 164.070 C 184.052 164.072 194.370 161.161 203.340 155.660 C 231.520 138.570 246.590 98.380 243.630 48.120 ZM 45.740 159.000 C 28.470 148.560 19.000 123.690 20.080 92.080 C 51.690 90.990 76.560 100.470 87.080 117.740 C 93.560 128.450 93.670 141.110 87.540 153.830 L 58.820 125.170 C 57.240 123.738 54.814 123.798 53.306 125.306 C 51.798 126.814 51.738 129.240 53.170 130.820 L 81.840 159.490 C 69.110 165.620 56.450 165.510 45.740 159.000 ZM 199.190 148.800 C 183.140 158.520 164.100 158.390 145.110 148.550 L 202.830 90.820 C 204.326 89.249 204.296 86.772 202.763 85.236 C 201.231 83.701 198.754 83.667 197.180 85.160 L 139.450 142.890 C 129.610 123.890 129.450 104.890 139.200 88.810 C 154.310 63.810 190.280 50.280 235.830 52.170 C 237.730 97.720 224.150 133.690 199.190 148.800 Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
