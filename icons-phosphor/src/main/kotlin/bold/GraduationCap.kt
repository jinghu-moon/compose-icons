package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorBoldIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 249.800 85.490 L 133.800 21.490 C 130.190 19.497 125.810 19.497 122.200 21.490 L 6.200 85.490 C 2.380 87.603 0.009 91.625 0.009 95.990 C 0.009 100.355 2.380 104.377 6.200 106.490 L 28.000 118.490 L 28.000 166.250 C 27.992 171.166 29.805 175.912 33.090 179.570 C 46.630 194.700 77.000 220.000 128.000 220.000 C 141.544 220.073 155.025 218.135 168.000 214.250 L 168.000 240.000 C 168.000 246.627 173.373 252.000 180.000 252.000 C 186.627 252.000 192.000 246.627 192.000 240.000 L 192.000 204.120 C 203.590 197.718 214.035 189.436 222.910 179.610 C 226.195 175.952 228.008 171.206 228.000 166.290 L 228.000 118.530 L 249.800 106.530 C 253.620 104.417 255.991 100.395 255.991 96.030 C 255.991 91.665 253.620 87.643 249.800 85.530 ZM 128.000 45.710 L 219.160 96.000 L 186.000 114.300 C 185.938 114.263 185.878 114.223 185.820 114.180 L 133.820 85.490 C 128.047 82.506 120.948 84.660 117.806 90.348 C 114.664 96.036 116.621 103.192 122.220 106.490 L 161.220 127.980 L 128.000 146.300 L 36.840 96.000 ZM 128.000 196.000 C 87.580 196.000 63.350 176.930 52.000 164.730 L 52.000 131.730 L 122.200 170.470 C 125.810 172.463 130.190 172.463 133.800 170.470 L 168.000 151.640 L 168.000 188.870 C 155.222 193.700 141.660 196.117 128.000 196.000 ZM 204.000 164.730 C 200.320 168.674 196.305 172.291 192.000 175.540 L 192.000 138.390 L 204.000 131.770 Z"),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
