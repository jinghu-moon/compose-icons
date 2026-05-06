package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorThinIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v176c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-128c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34ZM200 220h-92v-24h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-24h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-24h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v24h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v24h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v24h-44c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v124c0 2.209-1.791 4-4 4Z"),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
