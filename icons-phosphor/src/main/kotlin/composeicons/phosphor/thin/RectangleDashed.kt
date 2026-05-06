package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorThinIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 48c0 2.209-1.791 4-4 4h-32c-2.209 0-4 1.791-4 4v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16C28 49.373 33.373 44 40 44h32c2.209 0 4 1.791 4 4ZM32 148c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4ZM72 204h-32c-2.209 0-4-1.791-4-4v-16c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v16c0 6.627 5.373 12 12 12h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM144 204h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM224 180c-2.209 0-4 1.791-4 4v16c0 2.209-1.791 4-4 4h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c6.627 0 12-5.373 12-12v-16c0-2.209-1.791-4-4-4ZM224 108c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM216 44h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4 1.791 4 4v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16c0-6.627-5.373-12-12-12ZM144 44h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
