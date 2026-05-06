package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorThinIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 180h-12v-8C108 158.745 97.255 148 84 148c-13.255 0-24 10.745-24 24v8h-12c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4ZM68 172c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v8h-32ZM116 220h-64v-32h64ZM210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v88c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-88c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v124c0 2.209-1.791 4-4 4h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c6.627 0 12-5.373 12-12v-128c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34Z"),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
