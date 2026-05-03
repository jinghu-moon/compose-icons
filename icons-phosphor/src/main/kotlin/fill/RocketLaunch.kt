package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorFillIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 101.850 191.140 C 97.340 201.000 82.290 224.000 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 173.710 55.000 158.660 64.860 154.150 C 68.881 152.316 73.626 154.089 75.460 158.110 C 77.294 162.131 75.521 166.876 71.500 168.710 C 65.070 171.640 50.880 181.070 48.380 207.620 C 74.930 205.120 84.380 190.930 87.290 184.500 C 89.124 180.479 93.869 178.706 97.890 180.540 C 101.911 182.374 103.684 187.119 101.850 191.140 ZM 223.850 47.140 C 223.359 39.068 216.922 32.631 208.850 32.140 C 196.270 31.390 164.120 32.540 137.450 59.210 L 137.450 59.210 L 88.000 108.700 C 84.877 111.829 79.809 111.833 76.680 108.710 C 73.551 105.587 73.547 100.519 76.670 97.390 L 103.230 70.820 C 104.367 69.676 104.706 67.962 104.090 66.472 C 103.473 64.981 102.023 64.007 100.410 64.000 L 74.350 64.000 C 70.093 63.978 66.004 65.663 63.000 68.680 L 28.700 103.000 C 24.410 107.287 22.912 113.632 24.834 119.386 C 26.755 125.139 31.764 129.311 37.770 130.160 L 76.240 135.530 L 120.450 179.740 L 125.820 218.230 C 126.662 224.237 130.841 229.245 136.600 231.150 C 138.244 231.699 139.966 231.980 141.700 231.980 C 145.940 231.988 150.007 230.303 153.000 227.300 L 187.320 193.000 C 190.327 189.990 192.011 185.905 192.000 181.650 L 192.000 155.590 C 191.997 153.973 191.021 152.517 189.527 151.900 C 188.032 151.282 186.313 151.626 185.170 152.770 L 158.600 179.330 C 157.029 180.902 154.875 181.751 152.654 181.671 C 150.432 181.591 148.344 180.591 146.890 178.910 C 144.169 175.618 144.430 170.789 147.490 167.810 L 196.760 118.540 L 196.760 118.540 C 223.450 91.860 224.600 59.710 223.850 47.120 Z"),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
