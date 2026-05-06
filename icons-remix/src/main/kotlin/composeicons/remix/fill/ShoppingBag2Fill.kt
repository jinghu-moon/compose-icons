package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingBag2Fill: ImageVector
    get() {
        if (_shoppingBag2Fill != null) return _shoppingBag2Fill!!
        _shoppingBag2Fill = remixIcon(
            name = "ShoppingBag2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.005 22h-16c-.552 0-1-.448-1-1v-18c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1ZM9.005 6h-2v2c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5v-2h-2v2c0 1.657-1.343 3-3 3C10.348 11 9.005 9.657 9.005 8v-2Z"),
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
        return _shoppingBag2Fill!!
    }

private var _shoppingBag2Fill: ImageVector? = null
