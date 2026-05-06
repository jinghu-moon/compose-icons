package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour8: ImageVector
    get() {
        if (_clockHour8 != null) return _clockHour8!!
        _clockHour8 = tablerFilledIcon(
            name = "ClockHour8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M12 6c-.552 0-1 .448-1 1v4.464L8.445 13.168c-.422 .281-.566 .834-.336 1.286l.059 .1c.147 .221 .376 .374 .636 .426 .26 .052 .53-.001 .751-.148l3.027-2.018 .087-.07 .074-.075 .075-.094 .052-.08 .035-.07 .051-.132 .031-.135 .01-.082L13 12v-5C13 6.448 12.552 6 12 6"),
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
        return _clockHour8!!
    }

private var _clockHour8: ImageVector? = null
