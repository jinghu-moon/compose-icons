package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorFillIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 152.000 L 240.000 176.000 C 240.000 184.837 232.837 192.000 224.000 192.000 L 115.930 192.000 C 114.426 192.001 113.048 191.158 112.364 189.818 C 111.680 188.478 111.806 186.867 112.690 185.650 L 174.270 101.000 C 176.922 97.477 176.317 92.487 172.900 89.700 C 171.191 88.374 169.017 87.796 166.874 88.100 C 164.732 88.403 162.804 89.561 161.530 91.310 L 89.530 190.370 C 88.764 191.411 87.542 192.019 86.250 192.000 L 32.000 192.000 C 23.163 192.000 16.000 184.837 16.000 176.000 L 16.000 153.130 C 16.000 151.340 16.000 149.560 16.130 147.800 C 16.237 145.669 17.997 143.997 20.130 144.000 L 48.000 144.000 C 50.217 144.005 52.336 143.090 53.853 141.473 C 55.369 139.856 56.147 137.682 56.000 135.470 C 55.633 131.195 52.021 127.932 47.730 128.000 L 23.920 128.000 C 22.683 127.999 21.517 127.426 20.760 126.448 C 20.003 125.470 19.741 124.197 20.050 123.000 C 32.050 79.160 69.710 45.870 115.570 40.720 C 116.703 40.597 117.835 40.964 118.681 41.728 C 119.527 42.492 120.007 43.580 120.000 44.720 L 120.000 72.000 C 119.995 74.217 120.910 76.336 122.527 77.853 C 124.144 79.369 126.318 80.147 128.530 80.000 C 132.805 79.633 136.068 76.021 136.000 71.730 L 136.000 44.670 C 135.993 43.530 136.473 42.442 137.319 41.678 C 138.165 40.914 139.297 40.547 140.430 40.670 C 186.248 45.819 224.250 78.477 236.230 123.000 C 236.540 124.199 236.276 125.474 235.517 126.452 C 234.758 127.431 233.588 128.002 232.350 128.000 L 208.270 128.000 C 203.987 127.942 200.387 131.202 200.020 135.470 C 199.873 137.682 200.651 139.856 202.167 141.473 C 203.684 143.090 205.803 144.005 208.020 144.000 L 235.940 144.000 C 238.096 143.999 239.865 145.706 239.940 147.860 C 240.000 149.230 240.000 150.610 240.000 152.000 Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
