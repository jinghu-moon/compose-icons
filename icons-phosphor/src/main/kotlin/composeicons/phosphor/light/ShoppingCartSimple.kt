package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorLightIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.78 68.37C235.645 66.876 233.876 65.999 232 66h-176.33L45.78 30.39C45.057 27.795 42.694 26 40 26h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h19.44L71 165.89c2.666 9.492 11.301 16.066 21.16 16.11h98.84c9.874-.026 18.53-6.604 21.2-16.11L237.83 73.61c.49-1.815 .101-3.754-1.05-5.24ZM200.58 162.68c-1.198 4.307-5.109 7.296-9.58 7.32h-98.84c-4.489-.002-8.427-2.995-9.63-7.32L59 78h165.11ZM102 216c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM206 216c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14Z"),
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
