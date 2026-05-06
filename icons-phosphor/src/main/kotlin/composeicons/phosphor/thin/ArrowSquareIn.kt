package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorThinIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 136v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-54.34L42.83 218.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L110.34 140h-54.34c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM208 36h-128C73.373 36 68 41.373 68 48v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4v128c0 2.209-1.791 4-4 4h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12Z"),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
