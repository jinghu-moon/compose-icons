package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarSad: ImageVector
    get() {
        if (_calendarSad != null) return _calendarSad!!
        _calendarSad = tablerOutlineIcon(
            name = "CalendarSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 7.000 C 4.000 5.895 4.895 5.000 6.000 5.000 L 18.000 5.000 C 19.105 5.000 20.000 5.895 20.000 7.000 L 20.000 19.000 C 20.000 20.105 19.105 21.000 18.000 21.000 L 6.000 21.000 C 4.895 21.000 4.000 20.105 4.000 19.000 L 4.000 7.000M 16.000 3.000 L 16.000 7.000M 8.000 3.000 L 8.000 7.000M 4.000 11.000 L 20.000 11.000M 10.005 14.000 L 10.015 14.000M 14.005 14.000 L 14.015 14.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.000 18.000 C 11.202 17.163 12.798 17.163 14.000 18.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _calendarSad!!
    }

private var _calendarSad: ImageVector? = null
