package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowUp: ImageVector
    get() {
        if (_squareArrowUp != null) return _squareArrowUp!!
        _squareArrowUp = tablerFilledIcon(
            name = "SquareArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM12 7l-.09 .004-.058 .007-.118 .025-.105 .035-.113 .054-.111 .071c-.04 .03-.077 .062-.112 .097l-4 4-.083 .094c-.309 .398-.273 .964 .083 1.32l.094 .083c.398 .309 .964 .273 1.32-.083L11 10.415v5.585l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-5.585l2.293 2.292 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367l-4-4-.082-.073-.104-.074-.098-.052-.11-.044-.112-.03-.126-.017L12 7Z"),
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
        return _squareArrowUp!!
    }

private var _squareArrowUp: ImageVector? = null
