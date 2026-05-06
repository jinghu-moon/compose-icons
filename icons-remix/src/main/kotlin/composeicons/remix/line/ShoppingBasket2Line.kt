package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShoppingBasket2Line: ImageVector
    get() {
        if (_shoppingBasket2Line != null) return _shoppingBasket2Line!!
        _shoppingBasket2Line = remixIcon(
            name = "ShoppingBasket2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.371 3.44l3.211 5.562 3.423 0v2l-1.167-0-.757 9.083c-.043 .518-.477 .917-.997 .917h-14.16c-.52 0-.953-.399-.997-.917L3.171 11.002l-1.166 0v-2L5.427 9.002 8.639 3.44l1.732 1L7.737 9.002h8.535L13.639 4.44l1.732-1ZM18.831 11.002 5.178 11.002l.667 8h12.319l.667-8ZM13.005 13.002v4h-2v-4h2ZM9.005 13.002v4h-2v-4h2ZM17.005 13.002v4h-2v-4h2Z"),
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
        return _shoppingBasket2Line!!
    }

private var _shoppingBasket2Line: ImageVector? = null
