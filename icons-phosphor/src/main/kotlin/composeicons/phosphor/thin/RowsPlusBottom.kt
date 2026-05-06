package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RowsPlusBottom: ImageVector
    get() {
        if (_rowsPlusBottom != null) return _rowsPlusBottom!!
        _rowsPlusBottom = phosphorThinIcon(
            name = "RowsPlusBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 116h-160c-6.627 0-12 5.373-12 12v24c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12ZM212 152c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM208 44h-160C41.373 44 36 49.373 36 56v24c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12ZM212 80c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM156 216c0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4Z"),
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
        return _rowsPlusBottom!!
    }

private var _rowsPlusBottom: ImageVector? = null
