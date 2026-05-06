package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorThinIcon(
            name = "SelectionForeground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 216c0 2.209-1.791 4-4 4h-8c-6.627 0-12-5.373-12-12v-8c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v8c0 2.209 1.791 4 4 4h8c2.209 0 4 1.791 4 4ZM112 212h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM40 164c2.209 0 4-1.791 4-4v-16c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v16c0 2.209 1.791 4 4 4ZM168 196c-2.209 0-4 1.791-4 4v8c0 2.209-1.791 4-4 4h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c6.627 0 12-5.373 12-12v-8c0-2.209-1.791-4-4-4ZM168 108c2.209 0 4-1.791 4-4v-8c0-6.627-5.373-12-12-12h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c2.209 0 4 1.791 4 4v8c0 2.209 1.791 4 4 4ZM56 84h-8C41.373 84 36 89.373 36 96v8c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-8c0-2.209 1.791-4 4-4h8c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM208 36h-112C89.373 36 84 41.373 84 48v40h0c0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-36c0-2.209 1.791-4 4-4h112c2.209 0 4 1.791 4 4v112c0 2.209-1.791 4-4 4h-36v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v24c.01 2.012 1.513 3.704 3.51 3.95 .161 .035 .325 .052 .49 .05h40c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12Z"),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
