package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Spinner: ImageVector
    get() {
        if (_spinner != null) return _spinner!!
        _spinner = phosphorThinIcon(
            name = "Spinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 32v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM173.25 86.75c1.063-.002 2.081-.426 2.83-1.18L198.71 63c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L170.43 79.92c-1.144 1.143-1.488 2.862-.87 4.357 .617 1.495 2.073 2.471 3.69 2.473ZM224 124h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM176.08 170.43c-.991-1.094-2.504-1.553-3.936-1.194-1.432 .359-2.55 1.477-2.908 2.908-.359 1.432 .101 2.945 1.194 3.936l22.62 22.63c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM128 188c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM79.92 170.43 57.29 193.05c-1.563 1.577-1.552 4.122 .025 5.685 1.577 1.563 4.122 1.552 5.685-.025L85.62 176.08c1.094-.991 1.553-2.504 1.194-3.936-.359-1.432-1.477-2.55-2.908-2.908-1.432-.359-2.945 .101-3.936 1.194ZM68 128c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4ZM63 57.29c-1.577-1.577-4.133-1.577-5.71 0-1.577 1.577-1.577 4.133 0 5.71L79.92 85.57c.991 1.094 2.504 1.553 3.936 1.194 1.432-.359 2.55-1.477 2.908-2.908 .359-1.432-.101-2.945-1.194-3.936Z"),
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
        return _spinner!!
    }

private var _spinner: ImageVector? = null
