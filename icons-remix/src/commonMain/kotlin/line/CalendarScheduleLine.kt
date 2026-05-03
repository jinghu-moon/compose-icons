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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 3.000 L 7.000 1.000 L 9.000 1.000 L 9.000 3.000 L 15.000 3.000 L 15.000 1.000 L 17.000 1.000 L 17.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 9.000 L 20.000 9.000 L 20.000 5.000 L 17.000 5.000 L 17.000 7.000 L 15.000 7.000 L 15.000 5.000 L 9.000 5.000 L 9.000 7.000 L 7.000 7.000 L 7.000 5.000 L 4.000 5.000 L 4.000 19.000 L 10.000 19.000 L 10.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 7.000 3.000 ZM 17.000 12.000 C 14.791 12.000 13.000 13.791 13.000 16.000 C 13.000 18.209 14.791 20.000 17.000 20.000 C 19.209 20.000 21.000 18.209 21.000 16.000 C 21.000 13.791 19.209 12.000 17.000 12.000 ZM 11.000 16.000 C 11.000 12.686 13.686 10.000 17.000 10.000 C 20.314 10.000 23.000 12.686 23.000 16.000 C 23.000 19.314 20.314 22.000 17.000 22.000 C 13.686 22.000 11.000 19.314 11.000 16.000 ZM 16.000 13.000 L 16.000 16.414 L 18.293 18.707 L 19.707 17.293 L 18.000 15.586 L 18.000 13.000 L 16.000 13.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _calendarScheduleLine!!
    }

private var _calendarScheduleLine: ImageVector? = null
