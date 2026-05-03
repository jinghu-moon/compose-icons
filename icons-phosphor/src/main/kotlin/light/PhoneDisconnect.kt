package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorLightIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.190 91.550 L 230.190 91.550 C 174.800 36.150 81.190 36.150 25.810 91.550 C 6.560 110.820 4.700 139.220 21.290 160.610 C 25.103 165.461 31.642 167.245 37.390 165.000 L 86.390 147.620 L 86.610 147.530 C 91.010 145.785 94.223 141.924 95.140 137.280 L 101.040 107.760 C 101.157 107.091 101.616 106.533 102.250 106.290 C 118.819 100.539 136.836 100.500 153.430 106.180 C 154.062 106.417 154.525 106.967 154.650 107.630 L 160.860 137.380 C 161.817 141.970 165.007 145.777 169.360 147.520 L 169.590 147.600 L 218.590 165.000 C 224.344 167.238 230.885 165.442 234.690 160.580 C 251.300 139.220 249.440 110.820 230.190 91.550 ZM 225.190 153.260 C 224.635 153.932 223.708 154.166 222.900 153.840 L 222.680 153.750 L 173.680 136.370 C 173.129 136.103 172.731 135.598 172.600 135.000 L 166.380 105.260 C 165.380 100.462 161.943 96.536 157.320 94.910 C 138.191 88.364 117.420 88.410 98.320 95.040 C 93.693 96.702 90.277 100.668 89.320 105.490 L 83.370 135.000 C 83.244 135.639 82.815 136.176 82.220 136.440 L 33.280 153.750 L 33.060 153.840 C 32.252 154.166 31.325 153.932 30.770 153.260 C 17.770 136.520 19.210 115.140 34.300 100.040 C 59.690 74.640 93.850 61.940 128.000 61.940 C 162.150 61.940 196.310 74.640 221.700 100.040 C 236.790 115.140 238.210 136.520 225.230 153.260 ZM 222.000 200.000 C 222.000 203.314 219.314 206.000 216.000 206.000 L 40.000 206.000 C 36.686 206.000 34.000 203.314 34.000 200.000 C 34.000 196.686 36.686 194.000 40.000 194.000 L 216.000 194.000 C 219.314 194.000 222.000 196.686 222.000 200.000 Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
