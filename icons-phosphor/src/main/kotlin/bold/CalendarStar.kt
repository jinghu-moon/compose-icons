package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorBoldIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 188.000 28.000 L 188.000 24.000 C 188.000 17.373 182.627 12.000 176.000 12.000 C 169.373 12.000 164.000 17.373 164.000 24.000 L 164.000 28.000 L 92.000 28.000 L 92.000 24.000 C 92.000 17.373 86.627 12.000 80.000 12.000 C 73.373 12.000 68.000 17.373 68.000 24.000 L 68.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 68.000 52.000 C 68.000 58.627 73.373 64.000 80.000 64.000 C 86.627 64.000 92.000 58.627 92.000 52.000 L 164.000 52.000 C 164.000 58.627 169.373 64.000 176.000 64.000 C 182.627 64.000 188.000 58.627 188.000 52.000 L 204.000 52.000 ZM 176.920 109.650 L 149.500 107.530 L 139.000 83.250 C 137.092 78.875 132.773 76.046 128.000 76.046 C 123.227 76.046 118.908 78.875 117.000 83.250 L 106.500 107.530 L 79.080 109.650 C 74.200 110.025 70.036 113.326 68.558 117.992 C 67.080 122.658 68.585 127.754 72.360 130.870 L 92.940 147.870 L 86.690 173.130 C 85.534 177.816 87.298 182.739 91.168 185.624 C 95.037 188.509 100.259 188.795 104.420 186.350 L 128.000 172.460 L 151.580 186.340 C 155.741 188.785 160.963 188.499 164.832 185.614 C 168.702 182.729 170.466 177.806 169.310 173.120 L 163.060 147.860 L 183.640 130.860 C 187.415 127.744 188.920 122.648 187.442 117.982 C 185.964 113.316 181.800 110.015 176.920 109.640 ZM 141.920 134.160 C 138.367 137.099 136.812 141.814 137.920 146.290 L 139.130 151.180 L 134.060 148.180 C 130.298 145.979 125.642 145.979 121.880 148.180 L 116.810 151.180 L 118.020 146.290 C 119.128 141.814 117.573 137.099 114.020 134.160 L 110.550 131.290 L 115.550 130.900 C 119.991 130.555 123.875 127.780 125.640 123.690 L 127.970 118.290 L 130.300 123.690 C 132.065 127.780 135.949 130.555 140.390 130.900 L 145.390 131.290 Z"),
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
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
