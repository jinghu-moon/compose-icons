package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingBasket2Fill: ImageVector
    get() {
        if (_shoppingBasket2Fill != null) return _shoppingBasket2Fill!!
        _shoppingBasket2Fill = remixIcon(
            name = "ShoppingBasket2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.371 3.44l3.211 5.562 3.423 0v2l-1.167-0-.757 9.083c-.043 .518-.477 .917-.997 .917h-14.16c-.52 0-.953-.399-.997-.917L3.171 11.002l-1.166 0v-2L5.427 9.002 8.639 3.44l1.732 1L7.737 9.002h8.535L13.639 4.44l1.732-1ZM13.005 13.002h-2v4h2v-4ZM9.005 13.002h-2v4h2v-4ZM17.005 13.002h-2v4h2v-4Z"),
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
        return _shoppingBasket2Fill!!
    }

private var _shoppingBasket2Fill: ImageVector? = null
