package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShoppingBag2Line: ImageVector
    get() {
        if (_shoppingBag2Line != null) return _shoppingBag2Line!!
        _shoppingBag2Line = remixIcon(
            name = "ShoppingBag2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.005 22.000 L 4.005 22.000 C 3.453 22.000 3.005 21.552 3.005 21.000 L 3.005 3.000 C 3.005 2.448 3.453 2.000 4.005 2.000 L 20.005 2.000 C 20.557 2.000 21.005 2.448 21.005 3.000 L 21.005 21.000 C 21.005 21.552 20.557 22.000 20.005 22.000 ZM 19.005 20.000 L 19.005 4.000 L 5.005 4.000 L 5.005 20.000 L 19.005 20.000 ZM 9.005 6.000 L 9.005 8.000 C 9.005 9.657 10.348 11.000 12.005 11.000 C 13.662 11.000 15.005 9.657 15.005 8.000 L 15.005 6.000 L 17.005 6.000 L 17.005 8.000 C 17.005 10.761 14.766 13.000 12.005 13.000 C 9.243 13.000 7.005 10.761 7.005 8.000 L 7.005 6.000 L 9.005 6.000 Z"),
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
        return _shoppingBag2Line!!
    }

private var _shoppingBag2Line: ImageVector? = null
