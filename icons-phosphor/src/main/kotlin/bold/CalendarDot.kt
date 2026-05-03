package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarDot: ImageVector
    get() {
        if (_calendarDot != null) return _calendarDot!!
        _calendarDot = phosphorBoldIcon(
            name = "CalendarDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 152.000 C 148.000 163.046 139.046 172.000 128.000 172.000 C 116.954 172.000 108.000 163.046 108.000 152.000 C 108.000 140.954 116.954 132.000 128.000 132.000 C 139.046 132.000 148.000 140.954 148.000 152.000 ZM 228.000 48.000 L 228.000 208.000 C 228.000 219.046 219.046 228.000 208.000 228.000 L 48.000 228.000 C 36.954 228.000 28.000 219.046 28.000 208.000 L 28.000 48.000 C 28.000 36.954 36.954 28.000 48.000 28.000 L 68.000 28.000 L 68.000 24.000 C 68.000 17.373 73.373 12.000 80.000 12.000 C 86.627 12.000 92.000 17.373 92.000 24.000 L 92.000 28.000 L 164.000 28.000 L 164.000 24.000 C 164.000 17.373 169.373 12.000 176.000 12.000 C 182.627 12.000 188.000 17.373 188.000 24.000 L 188.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 52.000 52.000 L 52.000 76.000 L 204.000 76.000 L 204.000 52.000 L 188.000 52.000 C 188.000 58.627 182.627 64.000 176.000 64.000 C 169.373 64.000 164.000 58.627 164.000 52.000 L 92.000 52.000 C 92.000 58.627 86.627 64.000 80.000 64.000 C 73.373 64.000 68.000 58.627 68.000 52.000 ZM 204.000 204.000 L 204.000 100.000 L 52.000 100.000 L 52.000 204.000 Z"),
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
        return _calendarDot!!
    }

private var _calendarDot: ImageVector? = null
