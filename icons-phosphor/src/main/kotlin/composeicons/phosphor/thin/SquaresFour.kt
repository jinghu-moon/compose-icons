package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) return _squaresFour!!
        _squaresFour = phosphorThinIcon(
            name = "SquaresFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 44h-48C49.373 44 44 49.373 44 56v48c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM108 104c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM200 44h-48c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM204 104c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM104 140h-48c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM108 200c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM200 140h-48c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM204 200c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4Z"),
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
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
