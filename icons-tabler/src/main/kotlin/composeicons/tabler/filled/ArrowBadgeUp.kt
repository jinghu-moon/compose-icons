package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeUp: ImageVector
    get() {
        if (_arrowBadgeUp != null) return _arrowBadgeUp!!
        _arrowBadgeUp = tablerFilledIcon(
            name = "ArrowBadgeUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.375 6.22l-5 4C6.138 10.41 6 10.697 6 11v6l.006 .112c.041 .362 .275 .674 .612 .813 .337 .139 .723 .084 1.007-.144L12 14.28l4.375 3.5c.3 .24 .711 .287 1.058 .121 .347-.166 .567-.517 .567-.901v-6c-0-.303-.138-.59-.375-.78l-5-4c-.365-.293-.885-.293-1.25 0Z"),
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
        return _arrowBadgeUp!!
    }

private var _arrowBadgeUp: ImageVector? = null
