package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorLightIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 126.790 C 234.340 84.831 207.130 48.608 167.852 33.404 C 128.574 18.199 84.067 26.661 53.110 55.220 C 32.849 73.826 20.333 99.377 18.050 126.790 C 17.711 130.699 19.028 134.571 21.680 137.463 C 24.332 140.355 28.076 142.001 32.000 142.000 L 122.000 142.000 L 122.000 200.000 C 122.000 216.569 135.431 230.000 152.000 230.000 C 168.569 230.000 182.000 216.569 182.000 200.000 C 182.000 196.686 179.314 194.000 176.000 194.000 C 172.686 194.000 170.000 196.686 170.000 200.000 C 170.000 209.941 161.941 218.000 152.000 218.000 C 142.059 218.000 134.000 209.941 134.000 200.000 L 134.000 142.000 L 224.000 142.000 C 227.933 142.015 231.690 140.375 234.353 137.481 C 237.016 134.588 238.340 130.708 238.000 126.790 ZM 94.110 130.000 C 95.800 78.790 118.810 49.840 128.000 40.270 C 137.200 49.850 160.200 78.800 161.890 130.000 ZM 30.540 129.350 C 30.147 128.930 29.954 128.362 30.010 127.790 C 33.881 82.655 68.142 46.034 112.920 39.170 C 100.920 54.170 83.490 83.610 82.090 130.000 L 32.000 130.000 C 31.444 129.996 30.915 129.760 30.540 129.350 ZM 225.460 129.350 C 225.085 129.760 224.556 129.996 224.000 130.000 L 173.910 130.000 C 172.510 83.610 155.100 54.130 143.080 39.170 C 187.861 46.030 222.128 82.652 226.000 127.790 C 226.053 128.363 225.856 128.932 225.460 129.350 Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
