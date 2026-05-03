package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CalendarMonth: ImageVector
    get() {
        if (_calendarMonth != null) return _calendarMonth!!
        _calendarMonth = tablerFilledIcon(
            name = "CalendarMonth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 12.000 C 8.552 12.000 9.000 12.448 9.000 13.000 L 9.000 17.000 C 9.000 17.552 8.552 18.000 8.000 18.000 C 7.448 18.000 7.000 17.552 7.000 17.000 L 7.000 13.000 C 7.000 12.448 7.448 12.000 8.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 12.000 C 12.552 12.000 13.000 12.448 13.000 13.000 L 13.000 17.000 C 13.000 17.552 12.552 18.000 12.000 18.000 C 11.448 18.000 11.000 17.552 11.000 17.000 L 11.000 13.000 C 11.000 12.448 11.448 12.000 12.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 16.000 12.000 C 16.552 12.000 17.000 12.448 17.000 13.000 L 17.000 17.000 C 17.000 17.552 16.552 18.000 16.000 18.000 C 15.448 18.000 15.000 17.552 15.000 17.000 L 15.000 13.000 C 15.000 12.448 15.448 12.000 16.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 16.000 2.000 C 16.507 2.000 16.934 2.380 16.993 2.883 L 17.000 3.000 L 17.000 4.000 L 18.000 4.000 C 19.589 4.000 20.902 5.238 20.995 6.824 L 21.000 7.000 L 21.000 19.000 C 21.000 20.589 19.762 21.902 18.176 21.995 L 18.000 22.000 L 6.000 22.000 C 4.411 22.000 3.098 20.762 3.005 19.176 L 3.000 19.000 L 3.000 7.000 C 3.000 5.411 4.238 4.098 5.824 4.005 L 6.000 4.000 L 7.000 4.000 L 7.000 3.000 C 7.001 2.471 7.413 2.034 7.941 2.003 C 8.470 1.972 8.931 2.358 8.993 2.883 L 9.000 3.000 L 9.000 4.000 L 15.000 4.000 L 15.000 3.000 C 15.000 2.448 15.448 2.000 16.000 2.000M 19.000 9.000 L 5.000 9.000 L 5.000 18.625 C 5.000 19.330 5.386 19.911 5.883 19.991 L 6.000 20.000 L 18.000 20.000 C 18.513 20.000 18.936 19.470 18.993 18.785 L 19.000 18.625 Z"),
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
        return _calendarMonth!!
    }

private var _calendarMonth: ImageVector? = null
