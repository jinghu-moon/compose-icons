package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorThinIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-28v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-88v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-28C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h28v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h88v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h28c2.209 0 4 1.791 4 4ZM176.31 117.62l-32.24-2.49L131.67 86.42c-.634-1.463-2.076-2.409-3.67-2.409-1.594 0-3.036 .946-3.67 2.409l-12.4 28.71-32.24 2.49c-1.63 .122-3.022 1.224-3.515 2.782-.493 1.559 .012 3.26 1.275 4.298l24.46 20.19L94.45 175c-.387 1.563 .2 3.205 1.49 4.168 1.29 .963 3.032 1.058 4.42 .242L128 163.18l27.64 16.27c.607 .356 1.297 .546 2 .55 .86-.003 1.697-.279 2.39-.79 1.291-.963 1.878-2.607 1.49-4.17l-7.46-30.15 24.46-20.19c1.263-1.037 1.768-2.739 1.275-4.298-.493-1.559-1.885-2.66-3.515-2.782ZM147.05 140.33c-1.167 .973-1.682 2.522-1.33 4l5.78 23.36L130 155.09c-1.253-.738-2.807-.738-4.06 0l-21.44 12.64 5.78-23.36c.352-1.478-.163-3.027-1.33-4L90.19 124.84 115 122.92c1.478-.115 2.771-1.039 3.36-2.4L128 98.1l9.68 22.42c.589 1.361 1.882 2.285 3.36 2.4l24.77 1.92Z"),
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
