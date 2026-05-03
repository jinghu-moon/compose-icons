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
                pathData = parseSvgPathData("M 7.000 1.000 L 7.000 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 10.755 21.000 C 9.657 19.630 9.000 17.892 9.000 16.000 C 9.000 11.582 12.582 8.000 17.000 8.000 C 18.892 8.000 20.630 8.657 22.000 9.755 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 17.000 3.000 L 17.000 1.000 L 15.000 1.000 L 15.000 3.000 L 9.000 3.000 L 9.000 1.000 L 7.000 1.000 ZM 23.000 16.000 C 23.000 19.314 20.314 22.000 17.000 22.000 C 13.686 22.000 11.000 19.314 11.000 16.000 C 11.000 12.686 13.686 10.000 17.000 10.000 C 20.314 10.000 23.000 12.686 23.000 16.000 ZM 16.000 12.000 L 16.000 16.414 L 18.293 18.707 L 19.707 17.293 L 18.000 15.586 L 18.000 12.000 L 16.000 12.000 Z"),
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
