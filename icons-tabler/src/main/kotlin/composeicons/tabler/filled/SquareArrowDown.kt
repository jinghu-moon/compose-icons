package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowDown: ImageVector
    get() {
        if (_squareArrowDown != null) return _squareArrowDown!!
        _squareArrowDown = tablerFilledIcon(
            name = "SquareArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM12 7c-.552 0-1 .448-1 1v5.585L8.707 11.293l-.094-.083c-.417-.323-1.013-.266-1.362 .13-.349 .395-.33 .994 .042 1.367l4 4 .094 .083 .092 .064 .098 .052 .11 .044 .112 .03 .126 .017L12 17l.117-.007 .149-.029 .105-.035 .113-.054 .111-.071c.04-.029 .077-.062 .112-.097l4-4 .083-.094c.309-.398 .273-.964-.083-1.32l-.094-.083c-.398-.309-.964-.273-1.32 .083L13 13.585v-5.585l-.007-.117C12.934 7.38 12.507 7 12 7Z"),
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
        return _squareArrowDown!!
    }

private var _squareArrowDown: ImageVector? = null
