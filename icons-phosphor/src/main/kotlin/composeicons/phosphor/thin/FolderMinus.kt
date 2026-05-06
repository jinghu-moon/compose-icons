package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) return _folderMinus!!
        _folderMinus = phosphorThinIcon(
            name = "FolderMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 76h-86.34L101.17 47.52C98.928 45.26 95.874 43.992 92.69 44h-52.69C33.373 44 28 49.373 28 56v144.62c.011 6.28 5.1 11.369 11.38 11.38h177.51c6.134-.006 11.104-4.976 11.11-11.11v-112.89c0-6.627-5.373-12-12-12ZM40 52h52.69c1.058 .002 2.072 .422 2.82 1.17L118.34 76h-82.34v-20c0-2.209 1.791-4 4-4ZM220 200.89c-.005 1.715-1.395 3.105-3.11 3.11h-177.51c-1.864-.005-3.375-1.516-3.38-3.38v-116.62h180c2.209 0 4 1.791 4 4ZM156 144c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4Z"),
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
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
