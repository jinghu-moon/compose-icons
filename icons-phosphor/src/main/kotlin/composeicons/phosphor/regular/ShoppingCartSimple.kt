package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorRegularIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 216c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM192 200c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM239.71 74.14l-25.64 92.28C211.173 176.778 201.755 183.955 191 184h-98.84C81.372 183.995 71.906 176.81 69 166.42L33.92 40h-17.92C11.582 40 8 36.418 8 32c0-4.418 3.582-8 8-8h24c3.595-.001 6.748 2.396 7.71 5.86L57.19 64h174.81c2.5-0 4.857 1.168 6.37 3.158 1.513 1.99 2.009 4.573 1.34 6.982ZM221.47 80h-159.83l22.81 82.14c.962 3.464 4.115 5.861 7.71 5.86h98.84c3.595 .001 6.748-2.396 7.71-5.86Z"),
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
