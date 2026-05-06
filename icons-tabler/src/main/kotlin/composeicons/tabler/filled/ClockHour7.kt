package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour7: ImageVector
    get() {
        if (_clockHour7 != null) return _clockHour7!!
        _clockHour7 = tablerFilledIcon(
            name = "ClockHour7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M12.993 12.117 13 12v-5C13 6.448 12.552 6 12 6c-.552 0-1 .448-1 1v4.696L9.168 14.446c-.281 .422-.202 .987 .184 1.316l.093 .07c.221 .147 .491 .201 .751 .149 .26-.052 .489-.205 .636-.426l2.024-3.038 .06-.116 .032-.081 .03-.109Z"),
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
        return _clockHour7!!
    }

private var _clockHour7: ImageVector? = null
