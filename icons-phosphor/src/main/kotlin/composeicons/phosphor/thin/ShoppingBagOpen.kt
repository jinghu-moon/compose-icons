package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShoppingBagOpen: ImageVector
    get() {
        if (_shoppingBagOpen != null) return _shoppingBagOpen!!
        _shoppingBagOpen = phosphorThinIcon(
            name = "ShoppingBagOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM40 52h176c2.209 0 4 1.791 4 4v20h-184v-20c0-2.209 1.791-4 4-4ZM216 204h-176c-2.209 0-4-1.791-4-4v-116h184v116c0 2.209-1.791 4-4 4ZM172 112c0 24.301-19.699 44-44 44C103.699 156 84 136.301 84 112c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _shoppingBagOpen!!
    }

private var _shoppingBagOpen: ImageVector? = null
