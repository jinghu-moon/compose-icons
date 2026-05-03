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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.005 22.000 L 4.005 22.000 C 3.453 22.000 3.005 21.552 3.005 21.000 L 3.005 3.000 C 3.005 2.448 3.453 2.000 4.005 2.000 L 20.005 2.000 C 20.557 2.000 21.005 2.448 21.005 3.000 L 21.005 21.000 C 21.005 21.552 20.557 22.000 20.005 22.000 ZM 9.005 6.000 L 7.005 6.000 L 7.005 8.000 C 7.005 10.761 9.243 13.000 12.005 13.000 C 14.766 13.000 17.005 10.761 17.005 8.000 L 17.005 6.000 L 15.005 6.000 L 15.005 8.000 C 15.005 9.657 13.662 11.000 12.005 11.000 C 10.348 11.000 9.005 9.657 9.005 8.000 L 9.005 6.000 Z"),
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
        return _shoppingBag2Fill!!
    }

private var _shoppingBag2Fill: ImageVector? = null
