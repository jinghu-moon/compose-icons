package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = phosphorThinIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 128c0 2.209-1.791 4-4 4h-28v28c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-28h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-28c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v28h28c2.209 0 4 1.791 4 4ZM220 56v56c0 51.16-24.73 82.12-45.47 99.1-22.4 18.32-44.55 24.5-45.48 24.76-.688 .187-1.412 .187-2.1 0-.93-.26-23.08-6.44-45.48-24.76C60.73 194.12 36 163.16 36 112v-56C36 49.373 41.373 44 48 44h160c6.627 0 12 5.373 12 12ZM212 56c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v56c0 38.44 14.23 69.63 42.29 92.71 12.388 10.167 26.521 17.998 41.71 23.11 15.187-5.117 29.319-12.947 41.71-23.11C197.77 181.63 212 150.44 212 112Z"),
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
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
