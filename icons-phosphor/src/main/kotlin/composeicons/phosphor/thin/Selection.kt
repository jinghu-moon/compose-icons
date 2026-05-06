package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Selection: ImageVector
    get() {
        if (_selection != null) return _selection!!
        _selection = phosphorThinIcon(
            name = "Selection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 40c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM144 212h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM208 36h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4 1.791 4 4v24c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c0-6.627-5.373-12-12-12ZM216 108c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM216 180c-2.209 0-4 1.791-4 4v24c0 2.209-1.791 4-4 4h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c6.627 0 12-5.373 12-12v-24c0-2.209-1.791-4-4-4ZM40 148c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4ZM72 212h-24c-2.209 0-4-1.791-4-4v-24c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v24c0 6.627 5.373 12 12 12h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM72 36h-24C41.373 36 36 41.373 36 48v24c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c0-2.209 1.791-4 4-4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _selection!!
    }

private var _selection: ImageVector? = null
