package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarX: ImageVector
    get() {
        if (_calendarX != null) return _calendarX!!
        _calendarX = phosphorBoldIcon(
            name = "CalendarX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.490 136.490 L 145.000 152.000 L 160.520 167.510 C 165.214 172.204 165.214 179.816 160.520 184.510 C 155.826 189.204 148.214 189.204 143.520 184.510 L 128.000 169.000 L 112.490 184.520 C 107.796 189.214 100.184 189.214 95.490 184.520 C 90.796 179.826 90.796 172.214 95.490 167.520 L 111.000 152.000 L 95.510 136.490 C 90.816 131.796 90.816 124.184 95.510 119.490 C 100.204 114.796 107.816 114.796 112.510 119.490 L 128.000 135.000 L 143.510 119.480 C 148.204 114.786 155.816 114.786 160.510 119.480 C 165.204 124.174 165.204 131.786 160.510 136.480 ZM 228.000 48.000 L 228.000 208.000 C 228.000 219.046 219.046 228.000 208.000 228.000 L 48.000 228.000 C 36.954 228.000 28.000 219.046 28.000 208.000 L 28.000 48.000 C 28.000 36.954 36.954 28.000 48.000 28.000 L 68.000 28.000 L 68.000 24.000 C 68.000 17.373 73.373 12.000 80.000 12.000 C 86.627 12.000 92.000 17.373 92.000 24.000 L 92.000 28.000 L 164.000 28.000 L 164.000 24.000 C 164.000 17.373 169.373 12.000 176.000 12.000 C 182.627 12.000 188.000 17.373 188.000 24.000 L 188.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 52.000 52.000 L 52.000 76.000 L 204.000 76.000 L 204.000 52.000 L 188.000 52.000 C 188.000 58.627 182.627 64.000 176.000 64.000 C 169.373 64.000 164.000 58.627 164.000 52.000 L 92.000 52.000 C 92.000 58.627 86.627 64.000 80.000 64.000 C 73.373 64.000 68.000 58.627 68.000 52.000 ZM 204.000 204.000 L 204.000 100.000 L 52.000 100.000 L 52.000 204.000 Z"),
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
        return _calendarX!!
    }

private var _calendarX: ImageVector? = null
