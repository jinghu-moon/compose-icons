package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorLightIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 73.080 76.510 C 55.364 83.528 39.275 94.106 25.810 107.590 C 6.560 126.850 4.700 155.240 21.290 176.590 C 25.098 181.449 31.638 183.240 37.390 181.000 L 86.390 163.630 L 86.610 163.540 C 91.010 161.795 94.223 157.934 95.140 153.290 L 101.040 123.780 C 101.169 123.117 101.624 122.564 102.250 122.310 C 105.520 121.178 108.861 120.260 112.250 119.560 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 98.290 111.000 C 93.663 112.662 90.247 116.628 89.290 121.450 L 83.370 151.000 C 83.241 151.635 82.812 152.168 82.220 152.430 L 33.280 169.770 L 33.060 169.850 C 32.252 170.176 31.325 169.942 30.770 169.270 C 17.770 152.540 19.210 131.160 34.300 116.080 C 47.692 102.661 63.900 92.386 81.750 86.000 L 103.090 109.480 C 101.470 110.000 99.870 110.470 98.290 111.000 ZM 234.710 176.610 C 230.902 181.469 224.362 183.260 218.610 181.020 L 209.330 177.730 C 207.260 177.054 205.718 175.308 205.303 173.170 C 204.888 171.032 205.665 168.836 207.332 167.435 C 208.999 166.033 211.295 165.644 213.330 166.420 L 222.710 169.750 L 222.930 169.830 C 223.738 170.156 224.665 169.922 225.220 169.250 C 238.220 152.520 236.780 131.140 221.690 116.060 C 195.640 90.000 158.860 76.200 120.830 78.190 C 117.516 78.364 114.689 75.819 114.515 72.505 C 114.341 69.191 116.886 66.364 120.200 66.190 C 161.640 64.040 201.720 79.120 230.200 107.580 C 249.440 126.850 251.300 155.240 234.710 176.630 Z"),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
