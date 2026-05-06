package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorThinIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 148h-16c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h12c13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM184 188h-12v-32h12c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM132 152v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM91.47 154 62.89 204h25.11c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-32c-1.43 .002-2.753-.759-3.469-1.997-.716-1.238-.717-2.764-.001-4.003L81.11 156h-25.11c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c1.43-.002 2.753 .759 3.469 1.997 .716 1.238 .717 2.764 .001 4.003ZM210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c.001-1.061-.42-2.079-1.17-2.83ZM156 84v-42.35L198.34 84Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
