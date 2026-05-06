package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorThinIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.58 70.21l-16-32C202.902 36.855 201.516 35.999 200 36h-144c-1.516-.001-2.902 .855-3.58 2.21l-16 32c-.277 .556-.421 1.169-.42 1.79v136c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-136c.001-.621-.143-1.234-.42-1.79ZM58.47 44h139.06l12 24h-163.06ZM208 212h-160c-2.209 0-4-1.791-4-4v-132h168v132c0 2.209-1.791 4-4 4ZM162.83 133.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L132 113.66v70.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-70.34L98.83 138.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173Z"),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
