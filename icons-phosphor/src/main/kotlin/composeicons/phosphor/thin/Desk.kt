package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorThinIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 68h-240C5.791 68 4 69.791 4 72c0 2.209 1.791 4 4 4h12v116c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-52h200v52c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-116h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM28 76h96v56h-96ZM228 132h-96v-56h96ZM92 104c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4ZM164 104c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4Z"),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
