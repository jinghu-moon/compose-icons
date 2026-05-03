package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CalendarLine: ImageVector
    get() {
        if (_calendarLine != null) return _calendarLine!!
        _calendarLine = remixIcon(
            name = "CalendarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 1.000 L 9.000 3.000 L 15.000 3.000 L 15.000 1.000 L 17.000 1.000 L 17.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 7.000 3.000 L 7.000 1.000 L 9.000 1.000 ZM 20.000 11.000 L 4.000 11.000 L 4.000 19.000 L 20.000 19.000 L 20.000 11.000 ZM 7.000 5.000 L 4.000 5.000 L 4.000 9.000 L 20.000 9.000 L 20.000 5.000 L 17.000 5.000 L 17.000 7.000 L 15.000 7.000 L 15.000 5.000 L 9.000 5.000 L 9.000 7.000 L 7.000 7.000 L 7.000 5.000 Z"),
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
        return _calendarLine!!
    }

private var _calendarLine: ImageVector? = null
