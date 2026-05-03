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
                pathData = parseSvgPathData("M 9.000 3.000 L 9.000 1.000 L 7.000 1.000 L 7.000 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 17.000 3.000 L 17.000 1.000 L 15.000 1.000 L 15.000 3.000 L 9.000 3.000 ZM 4.000 10.000 L 20.000 10.000 L 20.000 19.000 L 4.000 19.000 L 4.000 10.000 ZM 4.000 5.000 L 7.000 5.000 L 7.000 6.000 L 9.000 6.000 L 9.000 5.000 L 15.000 5.000 L 15.000 6.000 L 17.000 6.000 L 17.000 5.000 L 20.000 5.000 L 20.000 8.000 L 4.000 8.000 L 4.000 5.000 ZM 9.879 10.964 L 12.000 13.086 L 14.121 10.964 L 15.535 12.378 L 13.414 14.500 L 15.535 16.621 L 14.121 18.035 L 12.000 15.914 L 9.879 18.035 L 8.464 16.621 L 10.586 14.500 L 8.464 12.378 L 9.879 10.964 Z"),
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
