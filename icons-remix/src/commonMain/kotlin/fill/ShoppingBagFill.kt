package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingBagFill: ImageVector
    get() {
        if (_shoppingBagFill != null) return _shoppingBagFill!!
        _shoppingBagFill = remixIcon(
            name = "ShoppingBagFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.005 1.000 C 14.766 1.000 17.005 3.238 17.005 6.000 L 17.005 8.000 L 20.005 8.000 C 20.557 8.000 21.005 8.447 21.005 9.000 L 21.005 21.000 C 21.005 21.552 20.557 22.000 20.005 22.000 L 4.005 22.000 C 3.453 22.000 3.005 21.552 3.005 21.000 L 3.005 9.000 C 3.005 8.447 3.453 8.000 4.005 8.000 L 7.005 8.000 L 7.005 6.000 C 7.005 3.238 9.243 1.000 12.005 1.000 ZM 17.005 11.000 L 15.005 11.000 L 15.005 12.000 C 15.005 12.552 15.453 13.000 16.005 13.000 C 16.518 13.000 16.940 12.614 16.998 12.116 L 17.005 12.000 L 17.005 11.000 ZM 9.005 11.000 L 7.005 11.000 L 7.005 12.000 C 7.005 12.552 7.453 13.000 8.005 13.000 C 8.518 13.000 8.940 12.614 8.998 12.116 L 9.005 12.000 L 9.005 11.000 ZM 12.005 3.000 C 10.407 3.000 9.101 4.249 9.010 5.823 L 9.005 6.000 L 9.005 8.000 L 15.005 8.000 L 15.005 6.000 C 15.005 4.402 13.756 3.096 12.181 3.005 L 12.005 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _shoppingBagFill!!
    }

private var _shoppingBagFill: ImageVector? = null
