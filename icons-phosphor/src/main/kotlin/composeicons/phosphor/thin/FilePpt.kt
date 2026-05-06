package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilePpt: ImageVector
    get() {
        if (_filePpt != null) return _filePpt!!
        _filePpt = phosphorThinIcon(
            name = "FilePpt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 152c0 2.209-1.791 4-4 4h-16v52c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-52h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM88 172c0 13.255-10.745 24-24 24h-12v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4h16c13.255 0 24 10.745 24 24ZM80 172c0-8.837-7.163-16-16-16h-12v32h12c8.837 0 16-7.163 16-16ZM156 172c0 13.255-10.745 24-24 24h-12v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4h16c13.255 0 24 10.745 24 24ZM148 172c0-8.837-7.163-16-16-16h-12v32h12c8.837 0 16-7.163 16-16ZM44 112v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM156 84h42.34L156 41.65Z"),
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
        return _filePpt!!
    }

private var _filePpt: ImageVector? = null
