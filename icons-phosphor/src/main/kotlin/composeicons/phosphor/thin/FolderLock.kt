package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorThinIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 164h-12v-8c0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24v8h-12c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4ZM172 156c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v8h-32ZM220 204h-64v-32h64ZM216 76h-86.34L101.17 47.51C98.92 45.263 95.87 44 92.69 44h-52.69C33.373 44 28 49.373 28 56v144.62c.011 6.28 5.1 11.369 11.38 11.38h73.18c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-73.18c-1.864-.005-3.375-1.516-3.38-3.38v-116.62h180c2.209 0 4 1.791 4 4v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16c0-6.627-5.373-12-12-12ZM40 52h52.69c1.058 .002 2.072 .422 2.82 1.17L118.34 76h-82.34v-20c0-2.209 1.791-4 4-4Z"),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
