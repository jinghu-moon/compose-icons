package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarDots: ImageVector
    get() {
        if (_calendarDots != null) return _calendarDots!!
        _calendarDots = phosphorThinIcon(
            name = "CalendarDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-28v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-88v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-28C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM48 44h28v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h88v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h28c2.209 0 4 1.791 4 4v36h-168v-36c0-2.209 1.791-4 4-4ZM208 212h-160c-2.209 0-4-1.791-4-4v-116h168v116c0 2.209-1.791 4-4 4ZM136 132c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM180 132c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM92 172c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM136 172c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM180 172c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _calendarDots!!
    }

private var _calendarDots: ImageVector? = null
