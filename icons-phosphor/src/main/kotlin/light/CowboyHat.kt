package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorLightIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 122.000 C 213.931 121.999 212.007 123.065 210.910 124.820 C 205.958 132.802 200.377 140.376 194.220 147.470 L 176.350 53.470 C 175.442 48.640 172.069 44.640 167.462 42.931 C 162.855 41.221 157.689 42.052 153.850 45.120 L 153.750 45.200 L 129.220 65.590 C 128.501 66.144 127.499 66.144 126.780 65.590 L 102.250 45.160 L 102.150 45.080 C 98.313 42.012 93.148 41.180 88.542 42.887 C 83.935 44.595 80.561 48.592 79.650 53.420 L 61.770 147.490 C 55.621 140.385 50.044 132.804 45.090 124.820 C 43.993 123.065 42.069 121.999 40.000 122.000 C 19.013 122.000 2.000 139.013 2.000 160.000 C 2.000 180.987 19.013 198.000 40.000 198.000 L 216.000 198.000 C 236.987 198.000 254.000 180.987 254.000 160.000 C 254.000 139.013 236.987 122.000 216.000 122.000 ZM 91.440 55.650 C 91.568 54.968 92.041 54.401 92.689 54.152 C 93.337 53.903 94.068 54.008 94.620 54.430 L 119.160 74.860 L 119.250 74.940 C 124.355 79.061 131.645 79.061 136.750 74.940 L 136.840 74.860 L 161.380 54.430 C 161.933 54.008 162.666 53.904 163.314 54.155 C 163.963 54.406 164.435 54.976 164.560 55.660 L 178.690 130.000 L 77.310 130.000 ZM 40.000 186.000 C 26.245 186.017 14.856 175.318 14.016 161.588 C 13.176 147.858 23.175 135.850 36.830 134.190 C 54.500 161.440 73.530 177.050 89.620 186.000 ZM 128.000 186.000 C 127.660 186.000 101.290 185.590 72.000 158.090 L 75.000 142.000 L 181.000 142.000 L 184.000 158.050 C 175.457 166.215 165.714 173.024 155.110 178.240 C 139.380 185.810 128.080 186.000 128.000 186.000 ZM 216.000 186.000 L 166.380 186.000 C 182.470 177.050 201.500 161.440 219.170 134.190 C 232.825 135.850 242.824 147.858 241.984 161.588 C 241.144 175.318 229.755 186.017 216.000 186.000 Z"),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
