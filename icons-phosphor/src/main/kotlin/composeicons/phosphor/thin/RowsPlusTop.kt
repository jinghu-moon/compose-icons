package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorThinIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 164h-160c-6.627 0-12 5.373-12 12v24c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12ZM212 200c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM208 92h-160c-6.627 0-12 5.373-12 12v24c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12ZM212 128c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM100 40c0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
