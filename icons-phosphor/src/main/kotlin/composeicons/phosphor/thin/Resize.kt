package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorThinIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 116h-88c-2.209 0-4 1.791-4 4v88c0 2.209 1.791 4 4 4h88c2.209 0 4-1.791 4-4v-88c0-2.209-1.791-4-4-4ZM132 204h-80v-80h80ZM212 184v16c0 6.627-5.373 12-12 12h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24c2.209 0 4-1.791 4-4v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM212 112v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM212 56v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209-1.791-4-4-4h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c6.627 0 12 5.373 12 12ZM148 48c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM44 80v-24C44 49.373 49.373 44 56 44h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4 1.791-4 4v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4Z"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
