package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorThinIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 48v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36h-36c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM72 204h-36v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM224 164c-2.209 0-4 1.791-4 4v36h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4ZM32 92c2.209 0 4-1.791 4-4v-36h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4ZM186 163.47l-56 32c-1.238 .715-2.762 .715-4 0l-56-32c-1.239-.716-2.002-2.039-2-3.47v-64c-.002-1.431 .761-2.754 2-3.47l56-32c1.238-.715 2.762-.715 4 0l56 32c1.239 .716 2.002 2.039 2 3.47v64c.002 1.431-.761 2.754-2 3.47ZM80.06 96 128 123.39 175.94 96 128 68.61ZM76 157.68l48 27.43v-54.79L76 102.89ZM180 157.68v-54.79l-48 27.43v54.79Z"),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
