package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorThinIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 208c0 2.209-1.791 4-4 4h-48.62C33.1 211.989 28.011 206.9 28 200.62v-8.62c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v8.62c.005 1.864 1.516 3.375 3.38 3.38h48.62c2.209 0 4 1.791 4 4ZM160 204h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM224 148c-2.209 0-4 1.791-4 4v48.89c-.005 1.715-1.395 3.105-3.11 3.11h-16.89c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16.89c6.134-.006 11.104-4.976 11.11-11.11v-48.89c0-2.209-1.791-4-4-4ZM216 76h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4 1.791 4 4v24c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c0-6.627-5.373-12-12-12ZM28 80v-24C28 49.373 33.373 44 40 44h52.69c3.184-.008 6.238 1.26 8.48 3.52l29.66 29.65c1.145 1.144 1.488 2.866 .868 4.361-.62 1.496-2.08 2.47-3.698 2.469h-96c-2.209 0-4-1.791-4-4ZM36 76h82.34L95.51 53.17C94.762 52.422 93.748 52.002 92.69 52h-52.69c-2.209 0-4 1.791-4 4ZM32 156c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4Z"),
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
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
