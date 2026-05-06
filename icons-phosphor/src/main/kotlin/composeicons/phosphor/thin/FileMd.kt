package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorThinIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v132c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-136c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34ZM144 148h-16c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4h16c17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32ZM144 204h-12v-48h12c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM100 152v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-43.31L71.28 194.29c-.748 1.072-1.973 1.711-3.28 1.711-1.307 0-2.532-.639-3.28-1.711L44 164.69v43.31c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c-0-1.747 1.133-3.292 2.8-3.816 1.666-.524 3.48 .094 4.48 1.526L68 185 92.72 149.69c1.002-1.436 2.821-2.053 4.49-1.523 1.669 .529 2.799 2.083 2.79 3.833Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
