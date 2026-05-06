package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorThinIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M93.17 58.83C92.419 58.08 91.997 57.062 91.997 56c0-1.062 .422-2.08 1.173-2.83l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l32 32c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L132 33.66v62.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-62.34L98.83 58.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173ZM157.17 197.17 132 222.34v-62.34c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v62.34L98.83 197.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l32 32c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l32-32c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0ZM234.83 125.17l-32-32c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L222.34 124h-62.34c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h62.34l-25.17 25.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l32-32c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM33.66 132h62.34c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-62.34L58.83 98.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-32 32c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l32 32c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
