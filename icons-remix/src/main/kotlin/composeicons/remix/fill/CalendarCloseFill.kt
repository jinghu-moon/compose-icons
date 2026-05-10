package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CalendarCloseFill: ImageVector
    get() {
        if (_calendarCloseFill != null) return _calendarCloseFill!!
        _calendarCloseFill = remixIcon(
            name = "CalendarCloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3v-2h-2v2h-4C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-16C22 3.448 21.552 3 21 3h-4v-2h-2v2h-6ZM4 8h16v11h-16v-11ZM9.879 9.964l2.121 2.122L14.121 9.964l1.414 1.414-2.121 2.122 2.121 2.121-1.414 1.414L12 14.914 9.878 17.035 8.464 15.621l2.121-2.121L8.464 11.378 9.879 9.964Z"),
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
        return _calendarCloseFill!!
    }

private var _calendarCloseFill: ImageVector? = null
