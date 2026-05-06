package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorThinIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 69.17l-40-40C170.079 28.42 169.061 27.999 168 28h-80C81.373 28 76 33.373 76 40v20h-20C49.373 60 44 65.373 44 72v144c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12v-20h20c6.627 0 12-5.373 12-12v-112c.001-1.061-.42-2.079-1.17-2.83ZM172 216c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4h78.34L172 105.66ZM204 184c0 2.209-1.791 4-4 4h-20v-84c.001-1.061-.42-2.079-1.17-2.83l-40-40C138.079 60.42 137.061 59.999 136 60h-52v-20c0-2.209 1.791-4 4-4h78.34L204 73.66ZM140 152c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM140 184c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4Z"),
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
        return _files!!
    }

private var _files: ImageVector? = null
