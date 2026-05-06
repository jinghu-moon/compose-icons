package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowRight: ImageVector
    get() {
        if (_squareArrowRight != null) return _squareArrowRight!!
        _squareArrowRight = tablerFilledIcon(
            name = "SquareArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM12.613 7.21c-.398-.309-.964-.273-1.32 .083l-.083 .094c-.309 .398-.273 .964 .083 1.32L13.585 11h-5.585l-.117 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941h5.585l-2.292 2.293-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042l4-4 .073-.082 .074-.104 .052-.098 .044-.11 .03-.112 .017-.126L17 12l-.007-.118-.029-.148-.035-.105-.054-.113-.071-.111c-.03-.04-.062-.077-.097-.112l-4-4Z"),
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
        return _squareArrowRight!!
    }

private var _squareArrowRight: ImageVector? = null
