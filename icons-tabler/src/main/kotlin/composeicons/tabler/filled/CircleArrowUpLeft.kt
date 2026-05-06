package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUpLeft: ImageVector
    get() {
        if (_circleArrowUpLeft != null) return _circleArrowUpLeft!!
        _circleArrowUpLeft = tablerFilledIcon(
            name = "CircleArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM15 8h-6l-.117 .007-.149 .029-.105 .035-.113 .054-.111 .071c-.04 .03-.077 .062-.112 .097l-.08 .09-.067 .096-.052 .098-.044 .11-.03 .112-.017 .126L8 15l.007 .117c.059 .503 .486 .883 .993 .883l.117-.007c.503-.059 .883-.486 .883-.993v-3.585l4.293 4.292 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367L11.415 10h3.585l.117-.007c.525-.062 .911-.523 .88-1.052C15.966 8.413 15.529 8.001 15 8Z"),
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
        return _circleArrowUpLeft!!
    }

private var _circleArrowUpLeft: ImageVector? = null
