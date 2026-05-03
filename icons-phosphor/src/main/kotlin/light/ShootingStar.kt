package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorLightIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.450 70.690 C 236.033 66.269 232.079 63.146 227.450 62.790 L 189.290 59.790 L 174.590 25.000 C 172.782 20.755 168.614 17.999 164.000 17.999 C 159.386 17.999 155.218 20.755 153.410 25.000 L 138.730 59.780 L 100.580 62.780 C 95.961 63.114 92.005 66.211 90.571 70.615 C 89.138 75.018 90.513 79.851 94.050 82.840 L 123.050 107.320 L 114.190 143.910 C 113.114 148.368 114.826 153.036 118.530 155.740 C 122.280 158.501 127.325 158.730 131.310 156.320 L 164.000 136.660 L 196.690 156.330 C 200.672 158.738 205.713 158.509 209.460 155.750 C 213.168 153.049 214.882 148.378 213.800 143.920 L 205.000 107.330 L 234.000 82.850 C 237.517 79.876 238.881 75.068 237.450 70.690 ZM 194.370 100.560 C 192.618 102.018 191.843 104.342 192.370 106.560 L 201.780 145.420 L 167.100 124.520 C 165.196 123.374 162.814 123.374 160.910 124.520 L 126.190 145.410 L 135.600 106.550 C 136.127 104.332 135.352 102.008 133.600 100.550 L 102.940 74.650 L 143.310 71.460 C 145.546 71.285 147.498 69.877 148.370 67.810 L 164.000 30.810 L 179.630 67.810 C 180.502 69.877 182.454 71.285 184.690 71.460 L 225.060 74.650 ZM 86.690 121.790 L 28.240 180.240 C 25.876 182.443 22.192 182.378 19.907 180.093 C 17.622 177.808 17.557 174.124 19.760 171.760 L 78.210 113.310 C 80.574 111.107 84.258 111.172 86.543 113.457 C 88.828 115.742 88.893 119.426 86.690 121.790 ZM 97.510 174.490 C 98.637 175.615 99.270 177.143 99.270 178.735 C 99.270 180.327 98.637 181.855 97.510 182.980 L 44.240 236.240 C 41.876 238.443 38.192 238.378 35.907 236.093 C 33.622 233.808 33.557 230.124 35.760 227.760 L 89.000 174.490 C 90.126 173.357 91.658 172.720 93.255 172.720 C 94.852 172.720 96.384 173.357 97.510 174.490 ZM 170.510 173.490 C 172.850 175.833 172.850 179.627 170.510 181.970 L 116.220 236.250 C 113.856 238.453 110.172 238.388 107.887 236.103 C 105.602 233.818 105.537 230.134 107.740 227.770 L 162.000 173.480 C 163.127 172.341 164.663 171.700 166.265 171.700 C 167.867 171.700 169.403 172.341 170.530 173.480 Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
