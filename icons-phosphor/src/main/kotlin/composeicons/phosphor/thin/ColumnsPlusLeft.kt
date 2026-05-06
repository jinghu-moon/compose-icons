package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorThinIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 36h-24C97.373 36 92 41.373 92 48v160c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM132 208c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4ZM200 36h-24c-6.627 0-12 5.373-12 12v160c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM204 208c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4ZM68 128c0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4Z"),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
