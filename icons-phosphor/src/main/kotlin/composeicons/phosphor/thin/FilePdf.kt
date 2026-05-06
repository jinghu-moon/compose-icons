package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilePdf: ImageVector
    get() {
        if (_filePdf != null) return _filePdf!!
        _filePdf = phosphorThinIcon(
            name = "FilePdf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 152c0 2.209-1.791 4-4 4h-28v24h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM88 172c0 13.255-10.745 24-24 24h-12v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4h16c13.255 0 24 10.745 24 24ZM80 172c0-8.837-7.163-16-16-16h-12v32h12c8.837 0 16-7.163 16-16ZM160 180c0 17.673-14.327 32-32 32h-16c-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4h16c17.673 0 32 14.327 32 32ZM152 180c0-13.255-10.745-24-24-24h-12v48h12c13.255 0 24-10.745 24-24ZM44 112v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM156 84h42.34L156 41.65Z"),
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
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
