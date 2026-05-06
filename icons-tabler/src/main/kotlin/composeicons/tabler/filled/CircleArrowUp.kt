package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUp: ImageVector
    get() {
        if (_circleArrowUp != null) return _circleArrowUp!!
        _circleArrowUp = tablerFilledIcon(
            name = "CircleArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM12.02 7l-.163 .01-.086 .016-.142 .045-.113 .054-.07 .043-.095 .071-.058 .054-4 4-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042L11 10.414v5.586l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-5.585l2.293 2.292 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367l-4-4-.082-.073-.089-.064-.113-.062-.081-.034-.113-.034-.112-.02L12.019 7Z"),
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
        return _circleArrowUp!!
    }

private var _circleArrowUp: ImageVector? = null
