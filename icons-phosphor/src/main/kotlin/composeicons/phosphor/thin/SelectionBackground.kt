package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorThinIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 84h-112C41.373 84 36 89.373 36 96v112c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM164 208c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h112c2.209 0 4 1.791 4 4ZM140 40c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM220 48v8c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-8c0-2.209-1.791-4-4-4h-8c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h8c6.627 0 12 5.373 12 12ZM220 96v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM220 152v8c0 6.627-5.373 12-12 12h-8c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h8c2.209 0 4-1.791 4-4v-8c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM84 56v-8C84 41.373 89.373 36 96 36h8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-8c-2.209 0-4 1.791-4 4v8c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
