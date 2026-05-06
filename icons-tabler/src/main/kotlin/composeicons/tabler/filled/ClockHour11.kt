package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour11: ImageVector
    get() {
        if (_clockHour11 != null) return _clockHour11!!
        _clockHour11 = tablerFilledIcon(
            name = "ClockHour11",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M12.048 12.999l.069-.006 .096-.016 .089-.023 .099-.038 .082-.04 .113-.073 .073-.06 .074-.074 .075-.094 .052-.08 .035-.07 .051-.132 .031-.135 .01-.082L13 12v-5C13 6.448 12.552 6 12 6c-.552 0-1 .448-1 1v1.697l-.168-.252C10.551 8.023 9.998 7.879 9.546 8.109l-.1 .059c-.221 .147-.374 .376-.426 .636-.052 .26 .001 .53 .148 .751l2.018 3.027 .07 .087 .075 .074 .094 .075 .08 .052 .07 .035 .132 .051 .135 .031 .082 .01Z"),
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
        return _clockHour11!!
    }

private var _clockHour11: ImageVector? = null
