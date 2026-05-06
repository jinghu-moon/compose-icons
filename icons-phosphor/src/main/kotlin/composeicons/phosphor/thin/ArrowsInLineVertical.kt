package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorThinIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM125.17 98.83c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l32-32c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L132 86.34v-70.34c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v70.34L98.83 61.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66ZM130.83 157.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-32 32c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L124 169.66v70.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-70.34l25.17 25.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66Z"),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
