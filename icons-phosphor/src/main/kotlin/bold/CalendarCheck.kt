package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) return _calendarCheck!!
        _calendarCheck = phosphorBoldIcon(
            name = "CalendarCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 188.000 28.000 L 188.000 24.000 C 188.000 17.373 182.627 12.000 176.000 12.000 C 169.373 12.000 164.000 17.373 164.000 24.000 L 164.000 28.000 L 92.000 28.000 L 92.000 24.000 C 92.000 17.373 86.627 12.000 80.000 12.000 C 73.373 12.000 68.000 17.373 68.000 24.000 L 68.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 68.000 52.000 C 68.000 58.627 73.373 64.000 80.000 64.000 C 86.627 64.000 92.000 58.627 92.000 52.000 L 164.000 52.000 C 164.000 58.627 169.373 64.000 176.000 64.000 C 182.627 64.000 188.000 58.627 188.000 52.000 L 204.000 52.000 L 204.000 76.000 L 52.000 76.000 L 52.000 52.000 ZM 52.000 204.000 L 52.000 100.000 L 204.000 100.000 L 204.000 204.000 ZM 172.490 119.510 C 174.749 121.762 176.019 124.820 176.019 128.010 C 176.019 131.200 174.749 134.258 172.490 136.510 L 124.490 184.510 C 122.238 186.769 119.180 188.039 115.990 188.039 C 112.800 188.039 109.742 186.769 107.490 184.510 L 83.490 160.510 C 78.796 155.816 78.796 148.204 83.490 143.510 C 88.184 138.816 95.796 138.816 100.490 143.510 L 116.000 159.000 L 155.510 119.480 C 157.765 117.231 160.821 115.970 164.006 115.976 C 167.191 115.981 170.243 117.253 172.490 119.510 Z"),
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
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
