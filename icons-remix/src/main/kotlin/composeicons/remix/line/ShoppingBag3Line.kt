package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShoppingBag3Line: ImageVector
    get() {
        if (_shoppingBag3Line != null) return _shoppingBag3Line!!
        _shoppingBag3Line = remixIcon(
            name = "ShoppingBag3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.505 2h11c.315 0 .611 .148 .8 .4L21.005 6v15c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-15L5.705 2.4C5.894 2.148 6.19 2 6.505 2ZM19.005 8h-14v12h14v-12ZM18.505 6 17.005 4h-10L5.505 6h13ZM9.005 10v2c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-2h2v2c0 2.761-2.239 5-5 5C9.243 17 7.005 14.761 7.005 12v-2h2Z"),
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
        return _shoppingBag3Line!!
    }

private var _shoppingBag3Line: ImageVector? = null
