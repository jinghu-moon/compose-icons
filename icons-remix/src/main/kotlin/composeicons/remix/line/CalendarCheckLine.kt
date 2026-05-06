package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CalendarCheckLine: ImageVector
    get() {
        if (_calendarCheckLine != null) return _calendarCheckLine!!
        _calendarCheckLine = remixIcon(
            name = "CalendarCheckLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 1v2h6v-2h2v2h4c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h4v-2h2ZM20 10h-16v9h16v-9ZM15.035 11.136l1.414 1.414-4.95 4.95L7.964 13.965 9.379 12.55l2.121 2.121 3.535-3.536ZM7 5h-3v3h16v-3h-3v1h-2v-1h-6v1h-2v-1Z"),
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
        return _calendarCheckLine!!
    }

private var _calendarCheckLine: ImageVector? = null
