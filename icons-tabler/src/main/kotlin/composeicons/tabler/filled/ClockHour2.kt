package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour2: ImageVector
    get() {
        if (_clockHour2 != null) return _clockHour2!!
        _clockHour2 = tablerFilledIcon(
            name = "ClockHour2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M11 7v5.022l.003 .054 .02 .135 .005 .025c.014 .057 .033 .112 .056 .165l.04 .082 .062 .099 .07 .087 .075 .074 .094 .075 .08 .052 .07 .035 .132 .051 .135 .031 .082 .01 .124 .002 .113-.012 .108-.024 .106-.036 .108-.051 .065-.04 3.007-2.004c.46-.307 .584-.927 .277-1.387-.307-.46-.927-.584-1.387-.277L13 10.13v-3.13c-0-.507-.38-.934-.883-.993L12 6c-.552 0-1 .448-1 1"),
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
        return _clockHour2!!
    }

private var _clockHour2: ImageVector? = null
