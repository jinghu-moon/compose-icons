package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShoppingBasketLine: ImageVector
    get() {
        if (_shoppingBasketLine != null) return _shoppingBasketLine!!
        _shoppingBasketLine = remixIcon(
            name = "ShoppingBasketLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 2c3.314 0 6 2.686 6 6v1h4v2h-1.167l-.757 9.083c-.043 .518-.477 .917-.997 .917h-14.16c-.52 0-.953-.399-.997-.917L3.171 11h-1.166v-2h4v-1c0-3.314 2.686-6 6-6ZM18.831 11h-13.653l.667 8h12.319l.667-8ZM13.005 13v4h-2v-4h2ZM9.005 13v4h-2v-4h2ZM17.005 13v4h-2v-4h2ZM12.005 4C9.863 4 8.114 5.684 8.01 7.8L8.005 8v1h8v-1c0-2.142-1.684-3.891-3.8-3.995L12.005 4Z"),
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
        return _shoppingBasketLine!!
    }

private var _shoppingBasketLine: ImageVector? = null
