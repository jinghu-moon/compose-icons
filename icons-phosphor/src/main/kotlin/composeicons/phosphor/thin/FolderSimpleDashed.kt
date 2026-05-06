package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) return _folderSimpleDashed!!
        _folderSimpleDashed = phosphorThinIcon(
            name = "FolderSimpleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M125.6 83.2 95.73 60.8C95.038 60.281 94.195 60 93.33 60h-53.33c-2.209 0-4 1.791-4 4v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16C28 57.373 33.373 52 40 52h53.33c2.596 .004 5.121 .845 7.2 2.4l29.87 22.4c1.767 1.325 2.125 3.833 .8 5.6-1.325 1.767-3.833 2.125-5.6 .8ZM88 204h-48.62c-1.864-.005-3.375-1.516-3.38-3.38v-8.62c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v8.62c.011 6.28 5.1 11.369 11.38 11.38h48.62c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM160 204h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM224 148c-2.209 0-4 1.791-4 4v48.89c-.005 1.715-1.395 3.105-3.11 3.11h-16.89c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16.89c6.134-.006 11.104-4.976 11.11-11.11v-48.89c0-2.209-1.791-4-4-4ZM216 76h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4 1.791 4 4v24c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c0-6.627-5.373-12-12-12ZM32 156c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4Z"),
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
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
