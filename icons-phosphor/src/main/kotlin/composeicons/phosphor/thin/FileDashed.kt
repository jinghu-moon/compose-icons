package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileDashed: ImageVector
    get() {
        if (_fileDashed != null) return _fileDashed!!
        _fileDashed = phosphorThinIcon(
            name = "FileDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 224c0 2.209-1.791 4-4 4h-16c-6.627 0-12-5.373-12-12v-32c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v32c0 2.209 1.791 4 4 4h16c2.209 0 4 1.791 4 4ZM212 88v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-44h-52c-2.209 0-4-1.791-4-4v-52h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83ZM156 84h42.34L156 41.66ZM80 28h-24C49.373 28 44 33.373 44 40v24c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c0-2.209 1.791-4 4-4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM208 172c-2.209 0-4 1.791-4 4v40c0 2.209-1.791 4-4 4h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c6.627 0 12-5.373 12-12v-40c0-2.209-1.791-4-4-4ZM48 148c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4ZM152 220h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _fileDashed!!
    }

private var _fileDashed: ImageVector? = null
