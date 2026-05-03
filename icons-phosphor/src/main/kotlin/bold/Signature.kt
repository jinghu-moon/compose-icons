package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorBoldIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 164.000 L 70.380 164.000 C 72.580 159.580 74.790 155.060 76.970 150.480 L 77.760 148.820 C 91.280 147.170 106.450 137.520 123.140 119.950 C 128.450 131.950 137.140 144.680 150.730 147.240 C 155.990 148.240 164.240 148.030 173.660 141.420 C 176.926 139.102 179.942 136.451 182.660 133.510 C 190.900 141.200 205.680 148.000 232.000 148.000 C 238.627 148.000 244.000 142.627 244.000 136.000 C 244.000 129.373 238.627 124.000 232.000 124.000 C 201.000 124.000 196.580 113.510 196.000 111.620 C 196.490 106.250 193.250 101.860 188.120 99.990 C 182.990 98.120 176.950 100.770 173.900 105.450 C 163.900 120.770 157.280 124.070 155.150 123.660 C 150.270 122.750 142.760 108.120 139.710 93.570 C 138.752 89.022 135.254 85.437 130.731 84.367 C 126.209 83.297 121.475 84.934 118.580 88.570 C 108.280 101.490 99.420 110.360 92.110 116.130 C 113.300 63.190 109.110 43.910 103.480 33.880 C 98.480 24.910 89.410 20.000 78.000 20.000 C 59.920 20.000 45.360 36.550 39.000 64.260 C 35.550 79.360 35.000 96.070 37.540 110.110 C 40.190 124.820 45.900 135.810 54.220 142.340 C 50.690 149.780 47.000 157.060 43.470 164.000 L 24.000 164.000 C 17.373 164.000 12.000 169.373 12.000 176.000 C 12.000 182.627 17.373 188.000 24.000 188.000 L 30.700 188.000 C 21.000 205.670 13.850 217.600 13.700 217.810 C 11.457 221.484 11.353 226.078 13.429 229.850 C 15.505 233.621 19.441 235.992 23.746 236.062 C 28.050 236.132 32.062 233.892 34.260 230.190 C 34.910 229.150 45.230 212.000 58.000 188.000 L 232.000 188.000 C 238.627 188.000 244.000 182.627 244.000 176.000 C 244.000 169.373 238.627 164.000 232.000 164.000 ZM 62.430 69.600 C 65.770 55.000 72.450 44.000 78.000 44.000 C 81.710 44.000 82.290 45.000 82.640 45.640 C 84.070 48.170 89.190 62.710 65.200 118.420 C 63.252 114.454 61.904 110.222 61.200 105.860 C 59.230 94.890 59.680 81.670 62.430 69.600 Z"),
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
