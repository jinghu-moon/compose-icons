package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CalendarScheduleFill: ImageVector
    get() {
        if (_calendarScheduleFill != null) return _calendarScheduleFill!!
        _calendarScheduleFill = remixIcon(
            name = "CalendarScheduleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 1v2h-4C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h7.755C9.657 19.63 9 17.892 9 16 9 11.582 12.582 8 17 8c1.892 0 3.63 .657 5 1.755v-5.755C22 3.448 21.552 3 21 3h-4v-2h-2v2h-6v-2h-2ZM23 16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM16 12v4.414l2.293 2.293 1.414-1.414L18 15.586v-3.586h-2Z"),
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
        return _calendarScheduleFill!!
    }

private var _calendarScheduleFill: ImageVector? = null
