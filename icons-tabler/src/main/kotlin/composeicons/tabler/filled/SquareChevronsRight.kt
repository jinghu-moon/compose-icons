package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsRight: ImageVector
    get() {
        if (_squareChevronsRight != null) return _squareChevronsRight!!
        _squareChevronsRight = tablerFilledIcon(
            name = "SquareChevronsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM8.613 8.21C8.215 7.901 7.649 7.937 7.293 8.293l-.083 .094c-.309 .398-.273 .964 .083 1.32L9.585 12 7.293 14.293l-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042l3-3 .083-.094c.309-.398 .273-.964-.083-1.32l-3-3ZM13.613 8.21c-.398-.309-.964-.273-1.32 .083l-.083 .094c-.309 .398-.273 .964 .083 1.32L14.585 12l-2.292 2.293-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042l3-3 .083-.094c.309-.398 .273-.964-.083-1.32l-3-3Z"),
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
        return _squareChevronsRight!!
    }

private var _squareChevronsRight: ImageVector? = null
