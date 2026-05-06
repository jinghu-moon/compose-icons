package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CalendarCloseLine: ImageVector
    get() {
        if (_calendarCloseLine != null) return _calendarCloseLine!!
        _calendarCloseLine = remixIcon(
            name = "CalendarCloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3v-2h-2v2h-4C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-16C22 3.448 21.552 3 21 3h-4v-2h-2v2h-6ZM4 10h16v9h-16v-9ZM4 5h3v1h2v-1h6v1h2v-1h3v3h-16v-3ZM9.879 10.964 12 13.086l2.121-2.121 1.414 1.414-2.121 2.122 2.121 2.121-1.414 1.414L12 15.914 9.879 18.035 8.464 16.621l2.121-2.121L8.464 12.378 9.879 10.964Z"),
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
        return _calendarCloseLine!!
    }

private var _calendarCloseLine: ImageVector? = null
