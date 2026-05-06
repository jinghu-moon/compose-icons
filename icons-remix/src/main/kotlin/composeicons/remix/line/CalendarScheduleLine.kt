package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CalendarScheduleLine: ImageVector
    get() {
        if (_calendarScheduleLine != null) return _calendarScheduleLine!!
        _calendarScheduleLine = remixIcon(
            name = "CalendarScheduleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 3v-2h2v2h6v-2h2v2h4c.552 0 1 .448 1 1v5h-2v-4h-3v2h-2v-2h-6v2h-2v-2h-3v14h6v2h-7C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h4ZM17 12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM11 16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM16 13v3.414l2.293 2.293 1.414-1.414L18 15.586v-2.586h-2Z"),
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
        return _calendarScheduleLine!!
    }

private var _calendarScheduleLine: ImageVector? = null
