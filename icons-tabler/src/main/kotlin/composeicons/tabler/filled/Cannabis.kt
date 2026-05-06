package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cannabis: ImageVector
    get() {
        if (_cannabis != null) return _cannabis!!
        _cannabis = tablerFilledIcon(
            name = "Cannabis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.894 1.553c1.472 2.945 2.17 5.028 2.244 6.812l.001 .091 .032-.022c.835-.551 1.758-.954 2.73-1.191l.352-.079c.514-.107 1.037-.164 1.562-.169l.253 .007c.324 .022 .618 .2 .787 .478 .169 .278 .193 .62 .063 .918-.949 2.187-1.818 3.595-2.902 4.664l-.061 .058 .25 .055q.45 .108 .869 .259l.276 .104c.586 .235 1.006 .479 1.25 .662 .259 .194 .408 .502 .4 .826-.008 .324-.173 .623-.442 .804l-.199 .112-1.133 .587c-.567 .289-1.166 .584-1.404 .67q-.123 .045-.244 .083l-.074 .019 .016 .042c.327 .912 .456 1.789 .477 2.462L18 20c0 .552-.448 1-1 1-1.257 0-2.77-.729-4.001-1.647L13 22c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2.647c-1.16 .866-2.57 1.563-3.781 1.64L7 21C6.448 21 6 20.552 6 20c0-.624 .098-1.464 .379-2.358l.116-.341-.073-.02-.244-.081C5.835 17.075 4.736 16.514 4.072 16.168l-.52-.274c-.31-.155-.517-.46-.548-.805-.031-.345 .119-.681 .396-.889 .244-.183 .664-.427 1.25-.662 .372-.15 .755-.271 1.145-.363l.249-.055-.06-.058C4.96 12.052 4.128 10.74 3.24 8.755L3.083 8.398c-.121-.278-.109-.595 .032-.863 .141-.268 .395-.458 .692-.517l.149-.017 .058-.003c.586-.015 1.171 .038 1.744 .159 .962 .19 1.884 .544 2.727 1.045l.27 .169v-.037C8.727 6.74 9.13 5.154 9.85 3.63l.139-.285c.455-.908 .914-1.586 1.238-1.98 .215-.261 .548-.396 .884-.357 .336 .038 .63 .244 .782 .546"),
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
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
