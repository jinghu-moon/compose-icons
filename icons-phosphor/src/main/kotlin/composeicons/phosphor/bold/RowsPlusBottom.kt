package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RowsPlusBottom: ImageVector
    get() {
        if (_rowsPlusBottom != null) return _rowsPlusBottom!!
        _rowsPlusBottom = phosphorBoldIcon(
            name = "RowsPlusBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 112h-160c-11.046 0-20 8.954-20 20v24c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-24c0-11.046-8.954-20-20-20ZM204 152h-152v-16h152ZM208 36h-160C36.954 36 28 44.954 28 56v24c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-24C228 44.954 219.046 36 208 36ZM204 76h-152v-16h152ZM160 220c0 6.627-5.373 12-12 12h-8v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h8v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v8h8c6.627 0 12 5.373 12 12Z"),
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
