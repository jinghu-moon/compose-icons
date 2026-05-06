package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour10: ImageVector
    get() {
        if (_clockHour10 != null) return _clockHour10!!
        _clockHour10 = tablerFilledIcon(
            name = "ClockHour10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M11.599 12.916l.052 .021 .08 .026 .08 .019 .072 .011L12 13l.076-.003 .135-.02 .082-.02 .103-.039 .073-.035 .078-.046 .06-.042 .08-.069 .083-.088 .062-.083 .053-.09 .031-.064 .032-.081 .03-.109 .015-.094L13 12v-5C13 6.448 12.552 6 12 6c-.552 0-1 .448-1 1v3.131L9.555 9.168C9.133 8.886 8.567 8.965 8.238 9.352l-.07 .093c-.147 .221-.201 .491-.149 .751 .052 .26 .205 .489 .426 .636l3.038 2.024Z"),
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
        return _clockHour10!!
    }

private var _clockHour10: ImageVector? = null
