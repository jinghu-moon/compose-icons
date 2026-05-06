package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorThinIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v124c0 2.209-1.791 4-4 4h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c6.627 0 12-5.373 12-12v-128c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34ZM64 148h-16c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h12c13.255 0 24-10.745 24-24C88 158.745 77.255 148 64 148ZM64 188h-12v-32h12c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM151.39 154.12l-19.39 31v22.88c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-22.85l-19.39-31c-1.094-1.867-.504-4.266 1.331-5.413 1.835-1.147 4.249-.628 5.449 1.173L128 176.45l16.61-26.57c.736-1.257 2.098-2.014 3.554-1.977 1.456 .037 2.777 .863 3.448 2.156 .671 1.293 .586 2.849-.222 4.061Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
