package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUpRight: ImageVector
    get() {
        if (_circleArrowUpRight != null) return _circleArrowUpRight!!
        _circleArrowUpRight = tablerFilledIcon(
            name = "CircleArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM15 8h-6l-.117 .007C8.38 8.066 8 8.493 8 9l.007 .117c.059 .503 .486 .883 .993 .883h3.584L8.293 14.293l-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042L14 11.414v3.586l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-6l-.007-.117-.029-.149-.035-.105-.054-.113-.071-.111c-.03-.04-.062-.077-.097-.112l-.09-.08-.096-.067-.098-.052-.11-.044-.112-.03-.126-.017L15 8Z"),
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
        return _circleArrowUpRight!!
    }

private var _circleArrowUpRight: ImageVector? = null
