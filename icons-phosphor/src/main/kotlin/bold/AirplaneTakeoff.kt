package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorBoldIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 216.000 C 180.000 222.627 174.627 228.000 168.000 228.000 L 24.000 228.000 C 17.373 228.000 12.000 222.627 12.000 216.000 C 12.000 209.373 17.373 204.000 24.000 204.000 L 168.000 204.000 C 174.627 204.000 180.000 209.373 180.000 216.000 ZM 251.790 89.880 C 251.159 93.264 249.105 96.214 246.150 97.980 L 98.750 186.000 L 98.620 186.070 C 81.836 195.924 60.561 193.503 46.420 180.130 L 46.230 179.950 L 10.230 144.700 C 5.415 140.112 3.196 133.431 4.309 126.874 C 5.422 120.317 9.721 114.742 15.780 112.000 L 18.720 110.560 C 21.563 109.168 24.841 108.956 27.840 109.970 L 54.340 118.910 L 68.490 110.350 L 50.420 92.780 C 45.454 88.180 43.151 81.379 44.302 74.708 C 45.453 68.037 49.900 62.401 56.120 59.730 L 56.600 59.530 L 63.750 56.830 C 66.459 55.818 69.441 55.818 72.150 56.830 L 124.290 76.000 L 174.220 46.200 C 192.903 35.058 216.933 39.316 230.650 56.200 C 230.712 56.269 230.769 56.342 230.820 56.420 L 249.460 80.300 C 251.580 83.009 252.430 86.500 251.790 89.880 ZM 222.180 84.340 L 212.000 71.290 C 205.764 63.690 194.911 61.786 186.460 66.810 L 131.690 99.510 C 128.584 101.383 124.798 101.750 121.390 100.510 L 75.390 83.570 L 96.390 103.970 C 99.055 106.561 100.369 110.240 99.948 113.933 C 99.528 117.626 97.420 120.915 94.240 122.840 L 62.000 142.290 C 58.989 144.104 55.334 144.506 52.000 143.390 L 38.650 138.890 L 62.960 162.690 C 69.378 168.688 78.971 169.765 86.560 165.340 Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
