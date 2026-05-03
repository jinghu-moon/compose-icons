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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.505 2.000 L 17.505 2.000 C 17.820 2.000 18.116 2.148 18.305 2.400 L 21.005 6.000 L 21.005 21.000 C 21.005 21.552 20.557 22.000 20.005 22.000 L 4.005 22.000 C 3.453 22.000 3.005 21.552 3.005 21.000 L 3.005 6.000 L 5.705 2.400 C 5.894 2.148 6.190 2.000 6.505 2.000 ZM 18.505 6.000 L 17.005 4.000 L 7.005 4.000 L 5.505 6.000 L 18.505 6.000 ZM 9.005 10.000 L 7.005 10.000 L 7.005 12.000 C 7.005 14.761 9.243 17.000 12.005 17.000 C 14.766 17.000 17.005 14.761 17.005 12.000 L 17.005 10.000 L 15.005 10.000 L 15.005 12.000 C 15.005 13.657 13.662 15.000 12.005 15.000 C 10.348 15.000 9.005 13.657 9.005 12.000 L 9.005 10.000 Z"),
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
        return _shoppingBag3Fill!!
    }

private var _shoppingBag3Fill: ImageVector? = null
