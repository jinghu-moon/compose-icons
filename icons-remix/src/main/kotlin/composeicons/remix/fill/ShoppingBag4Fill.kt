package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingBag4Fill: ImageVector
    get() {
        if (_shoppingBag4Fill != null) return _shoppingBag4Fill!!
        _shoppingBag4Fill = remixIcon(
            name = "ShoppingBag4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 6C9 4.343 10.343 3 12 3c1.657 0 3 1.343 3 3h-6ZM7 6h-3C3.448 6 3 6.448 3 7v14c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-14C21 6.448 20.552 6 20 6h-3C17 3.239 14.761 1 12 1 9.239 1 7 3.239 7 6ZM9 10c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h2c0 2.761-2.239 5-5 5C9.239 15 7 12.761 7 10h2Z"),
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
        return _shoppingBag4Fill!!
    }

private var _shoppingBag4Fill: ImageVector? = null
