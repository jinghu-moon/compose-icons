package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) return _bookmark!!
        _bookmark = tablerFilledIcon(
            name = "Bookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2c2.761 0 5 2.239 5 5v14c0 .369-.203 .708-.528 .882-.325 .174-.72 .155-1.027-.05L12 18.202 6.556 21.832c-.29 .194-.661 .223-.977 .076-.317-.147-.534-.449-.573-.796L5 21v-14C5 4.239 7.239 2 10 2h4Z"),
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
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
