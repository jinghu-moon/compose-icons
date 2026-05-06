package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorThinIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 104c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-54.34l-73.16 73.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L206.34 44h-54.34c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM184 132c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-72C41.373 68 36 73.373 36 80v128c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-72c0-2.209-1.791-4-4-4Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
