package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorFillIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-24v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-80v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-24C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM72 64v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM178.55 124.7l-24.46 20.19L161.55 175c.388 1.563-.199 3.207-1.49 4.17-.693 .511-1.53 .787-2.39 .79-.703-.004-1.393-.194-2-.55L128 163.18l-27.64 16.27c-1.395 .827-3.15 .73-4.445-.246-1.295-.975-1.874-2.636-1.465-4.204l7.46-30.15L77.45 124.7c-1.263-1.037-1.768-2.739-1.275-4.298 .493-1.559 1.885-2.66 3.515-2.782l32.24-2.49L124.33 86.42c.634-1.463 2.076-2.409 3.67-2.409 1.594 0 3.036 .946 3.67 2.409l12.4 28.71 32.24 2.49c1.63 .122 3.022 1.224 3.515 2.782 .493 1.559-.012 3.26-1.275 4.298ZM184 64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
