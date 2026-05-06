package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorThinIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.18 69.58C234.425 68.586 233.248 68.002 232 68h-177.85L43.85 30.93C43.37 29.2 41.795 28.002 40 28h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h21L72.89 165.35c2.421 8.645 10.292 14.629 19.27 14.65h98.84c8.978-.021 16.849-6.005 19.27-14.65L235.9 73.07c.32-1.212 .054-2.504-.72-3.49ZM202.51 163.21c-1.437 5.176-6.138 8.766-11.51 8.79h-98.84c-5.39-.001-10.118-3.596-11.56-8.79L56.37 76h170.37ZM100 216c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM204 216c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
