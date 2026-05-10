package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingBag3Fill: ImageVector
    get() {
        if (_shoppingBag3Fill != null) return _shoppingBag3Fill!!
        _shoppingBag3Fill = remixIcon(
            name = "ShoppingBag3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.505 2h11c.315 0 .611 .148 .8 .4L21.005 6v15c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-15L5.705 2.4C5.894 2.148 6.19 2 6.505 2ZM18.505 6 17.005 4h-10L5.505 6h13ZM9.005 10h-2v2c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5v-2h-2v2c0 1.657-1.343 3-3 3C10.348 15 9.005 13.657 9.005 12v-2Z"),
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
        return _shoppingBag3Fill!!
    }

private var _shoppingBag3Fill: ImageVector? = null
