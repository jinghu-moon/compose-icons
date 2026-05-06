package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorBoldIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.55 64.74C239.282 61.755 235.749 60.001 232 60h-171.77L51.56 28.79C50.118 23.596 45.39 20.001 40 20h-20C13.373 20 8 25.373 8 32c0 6.627 5.373 12 12 12h10.88L65.18 167.49c3.394 12.11 14.423 20.489 27 20.51h98.82c12.577-.021 23.606-8.4 27-20.51L243.63 75.21c.983-3.623 .213-7.497-2.08-10.47ZM194.8 161.07c-.475 1.712-2.023 2.906-3.8 2.93h-98.84c-1.795-.002-3.37-1.2-3.85-2.93L66.9 84h149.31ZM108 220c0 11.046-8.954 20-20 20C76.954 240 68 231.046 68 220c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM212 220c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
