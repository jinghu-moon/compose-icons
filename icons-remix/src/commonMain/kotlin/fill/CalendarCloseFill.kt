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
                pathData = parseSvgPathData("M 9.000 3.000 L 9.000 1.000 L 7.000 1.000 L 7.000 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 17.000 3.000 L 17.000 1.000 L 15.000 1.000 L 15.000 3.000 L 9.000 3.000 ZM 4.000 8.000 L 20.000 8.000 L 20.000 19.000 L 4.000 19.000 L 4.000 8.000 ZM 9.879 9.964 L 12.000 12.086 L 14.121 9.964 L 15.535 11.378 L 13.414 13.500 L 15.535 15.621 L 14.121 17.035 L 12.000 14.914 L 9.878 17.035 L 8.464 15.621 L 10.586 13.500 L 8.464 11.378 L 9.879 9.964 Z"),
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
