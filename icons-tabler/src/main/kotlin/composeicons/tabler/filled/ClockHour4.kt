package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour4: ImageVector
    get() {
        if (_clockHour4 != null) return _clockHour4!!
        _clockHour4 = tablerFilledIcon(
            name = "ClockHour4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M12 6c-.552 0-1 .448-1 1v5.026l.009 .105 .02 .107 .04 .129 .048 .102 .046 .078 .042 .06 .069 .08 .088 .083 .083 .062 3 2c.46 .307 1.08 .183 1.387-.277 .307-.46 .183-1.08-.277-1.387L13 11.464v-4.464c-0-.507-.38-.934-.883-.993Z"),
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
        return _clockHour4!!
    }

private var _clockHour4: ImageVector? = null
