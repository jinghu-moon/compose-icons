package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour1: ImageVector
    get() {
        if (_clockHour1 != null) return _clockHour1!!
        _clockHour1 = tablerFilledIcon(
            name = "ClockHour1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M11.599 12.916l.052 .021 .08 .026 .08 .019 .072 .011L12 13l.076-.003 .135-.02 .082-.02 .103-.039 .073-.035 .078-.046 .06-.042 .08-.069 .083-.088 .062-.083 2-3c.307-.46 .183-1.08-.277-1.387-.46-.307-1.08-.183-1.387 .277L13 8.696v-1.696c-0-.507-.38-.934-.883-.993L12 6c-.552 0-1 .448-1 1v5.026l.009 .105 .02 .107 .04 .129 .048 .102 .046 .078 .042 .06 .069 .08 .088 .083 .083 .062 .09 .053Z"),
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
        return _clockHour1!!
    }

private var _clockHour1: ImageVector? = null
