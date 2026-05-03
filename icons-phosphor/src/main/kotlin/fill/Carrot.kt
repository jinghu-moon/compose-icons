package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorFillIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 80.000 L 199.440 80.000 C 213.921 105.091 209.741 136.781 189.250 157.260 C 180.730 165.950 169.640 174.180 157.400 181.770 C 155.823 182.730 153.794 182.486 152.490 181.180 L 117.650 146.340 C 116.119 144.808 114.032 143.963 111.867 143.997 C 109.701 144.031 107.642 144.941 106.160 146.520 C 103.227 149.811 103.408 154.829 106.570 157.900 L 136.450 187.780 C 137.355 188.684 137.774 189.966 137.576 191.229 C 137.378 192.493 136.588 193.586 135.450 194.170 C 95.740 214.790 53.000 228.540 46.780 230.480 C 40.685 233.320 33.464 232.045 28.710 227.290 C 23.955 222.536 22.680 215.315 25.520 209.220 C 28.250 200.510 54.520 118.950 90.380 75.870 C 91.101 75.008 92.150 74.489 93.273 74.440 C 94.395 74.390 95.486 74.815 96.280 75.610 L 138.330 117.670 C 139.902 119.241 142.057 120.088 144.279 120.006 C 146.500 119.924 148.587 118.922 150.040 117.240 C 152.766 113.950 152.505 109.117 149.440 106.140 L 108.080 64.780 C 107.226 63.929 106.801 62.739 106.923 61.540 C 107.045 60.341 107.702 59.261 108.710 58.600 C 128.947 45.242 154.995 44.467 175.990 56.600 L 175.990 24.000 C 175.985 21.781 176.902 19.660 178.521 18.143 C 180.140 16.626 182.316 15.850 184.530 16.000 C 188.807 16.372 192.069 19.987 192.000 24.280 L 192.000 52.690 L 218.340 26.340 C 221.466 23.214 226.534 23.214 229.660 26.340 C 232.786 29.466 232.786 34.534 229.660 37.660 L 203.310 64.000 L 231.720 64.000 C 236.013 63.931 239.628 67.193 240.000 71.470 C 240.147 73.682 239.369 75.856 237.853 77.473 C 236.336 79.090 234.217 80.005 232.000 80.000 Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
