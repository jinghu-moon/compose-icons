package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorThinIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 76.520 77.320 C 58.001 84.220 41.183 95.024 27.210 109.000 C 8.690 127.530 6.900 154.830 22.850 175.400 C 26.121 179.575 31.743 181.107 36.680 179.170 L 85.680 161.780 L 85.830 161.730 C 89.595 160.224 92.345 156.917 93.140 152.940 L 99.040 123.430 C 99.282 122.054 100.239 120.911 101.550 120.430 C 105.270 119.149 109.081 118.146 112.950 117.430 L 205.020 218.690 C 205.976 219.768 207.437 220.248 208.846 219.948 C 210.255 219.647 211.394 218.613 211.827 217.239 C 212.260 215.865 211.922 214.364 210.940 213.310 ZM 99.000 112.910 C 95.021 114.340 92.088 117.759 91.280 121.910 L 85.380 151.420 C 85.119 152.720 84.232 153.806 83.010 154.320 L 34.010 171.700 L 33.860 171.760 C 32.225 172.416 30.352 171.925 29.250 170.550 C 15.830 153.260 17.350 130.300 32.940 114.710 C 46.846 100.775 63.733 90.179 82.330 83.720 L 106.770 110.600 Q 102.800 111.580 98.940 112.910 ZM 233.150 175.400 C 229.879 179.575 224.257 181.107 219.320 179.170 L 210.010 175.870 C 207.928 175.130 206.840 172.842 207.580 170.760 C 208.320 168.678 210.608 167.590 212.690 168.330 L 222.060 171.650 L 222.210 171.710 C 223.845 172.366 225.718 171.875 226.820 170.500 C 240.240 153.210 238.720 130.250 223.130 114.660 C 196.660 88.200 159.340 74.180 120.720 76.190 C 118.511 76.303 116.628 74.604 116.515 72.395 C 116.402 70.186 118.101 68.303 120.310 68.190 C 161.170 66.070 200.720 80.930 228.790 108.990 C 247.310 127.530 249.100 154.830 233.150 175.400 Z"),
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
