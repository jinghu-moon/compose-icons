package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barcode: ImageVector
    get() {
        if (_barcode != null) return _barcode!!
        _barcode = phosphorThinIcon(
            name = "Barcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 48v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36h-36c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM72 204h-36v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM224 164c-2.209 0-4 1.791-4 4v36h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4ZM32 92c2.209 0 4-1.791 4-4v-36h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4ZM80 84c-2.209 0-4 1.791-4 4v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-2.209-1.791-4-4-4ZM180 88c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4ZM144 84c-2.209 0-4 1.791-4 4v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-2.209-1.791-4-4-4ZM112 84c-2.209 0-4 1.791-4 4v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-2.209-1.791-4-4-4Z"),
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
        return _barcode!!
    }

private var _barcode: ImageVector? = null
