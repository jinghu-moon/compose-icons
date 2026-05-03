package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingBasketFill: ImageVector
    get() {
        if (_shoppingBasketFill != null) return _shoppingBasketFill!!
        _shoppingBasketFill = remixIcon(
            name = "ShoppingBasketFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.005 2.000 C 15.319 2.000 18.005 4.686 18.005 8.000 L 18.005 9.000 L 22.005 9.000 L 22.005 11.000 L 20.838 11.000 L 20.081 20.083 C 20.038 20.601 19.605 21.000 19.085 21.000 L 4.925 21.000 C 4.405 21.000 3.972 20.601 3.928 20.083 L 3.171 11.000 L 2.005 11.000 L 2.005 9.000 L 6.005 9.000 L 6.005 8.000 C 6.005 4.686 8.691 2.000 12.005 2.000 ZM 13.005 13.000 L 11.005 13.000 L 11.005 17.000 L 13.005 17.000 L 13.005 13.000 ZM 9.005 13.000 L 7.005 13.000 L 7.005 17.000 L 9.005 17.000 L 9.005 13.000 ZM 17.005 13.000 L 15.005 13.000 L 15.005 17.000 L 17.005 17.000 L 17.005 13.000 ZM 12.005 4.000 C 9.863 4.000 8.114 5.684 8.010 7.800 L 8.005 8.000 L 8.005 9.000 L 16.005 9.000 L 16.005 8.000 C 16.005 5.858 14.321 4.109 12.205 4.005 L 12.005 4.000 Z"),
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
        return _shoppingBasketFill!!
    }

private var _shoppingBasketFill: ImageVector? = null
