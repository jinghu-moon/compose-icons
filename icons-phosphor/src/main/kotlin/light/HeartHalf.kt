package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorLightIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 169.100 54.820 C 172.364 54.212 174.518 51.074 173.910 47.810 C 173.302 44.546 170.164 42.392 166.900 43.000 C 150.300 46.130 136.650 54.820 128.000 67.400 C 117.300 51.500 99.000 42.000 78.000 42.000 C 44.879 42.039 18.039 68.879 18.000 102.000 C 18.000 131.200 36.200 161.590 72.100 192.310 C 88.550 206.328 106.320 218.719 125.160 229.310 C 126.930 230.276 129.070 230.276 130.840 229.310 L 130.840 229.310 C 145.097 221.335 158.742 212.310 171.660 202.310 C 174.286 200.289 174.776 196.521 172.755 193.895 C 170.734 191.269 166.966 190.779 164.340 192.800 C 154.606 200.259 144.478 207.189 134.000 213.560 L 134.000 81.280 C 140.000 67.500 152.760 57.880 169.100 54.820 ZM 122.000 213.540 C 97.400 198.510 30.000 152.700 30.000 102.000 C 30.028 75.502 51.502 54.028 78.000 54.000 C 97.870 54.000 114.620 64.400 122.000 81.220 ZM 232.330 102.000 C 232.107 102.015 231.883 102.015 231.660 102.000 C 228.607 101.993 226.046 99.695 225.710 96.660 C 224.150 82.588 216.443 69.928 204.660 62.080 C 201.899 60.235 201.155 56.501 203.000 53.740 C 204.845 50.979 208.579 50.235 211.340 52.080 C 226.063 61.895 235.688 77.722 237.630 95.310 C 237.824 96.902 237.373 98.505 236.377 99.762 C 235.381 101.019 233.924 101.825 232.330 102.000 ZM 228.670 138.720 C 223.090 149.920 214.920 161.370 204.410 172.720 C 202.159 175.156 198.361 175.306 195.925 173.055 C 193.489 170.804 193.339 167.006 195.590 164.570 C 205.340 154.030 212.860 143.520 217.940 133.330 C 218.857 131.344 220.782 130.013 222.964 129.859 C 225.147 129.705 227.240 130.750 228.428 132.588 C 229.615 134.426 229.708 136.764 228.670 138.690 Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
