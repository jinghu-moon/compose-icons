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
                pathData = parseSvgPathData("M 15.371 3.440 L 18.582 9.002 L 22.005 9.002 L 22.005 11.002 L 20.838 11.002 L 20.081 20.085 C 20.038 20.604 19.605 21.002 19.085 21.002 L 4.925 21.002 C 4.405 21.002 3.972 20.604 3.928 20.085 L 3.171 11.002 L 2.005 11.002 L 2.005 9.002 L 5.427 9.002 L 8.639 3.440 L 10.371 4.440 L 7.737 9.002 L 16.272 9.002 L 13.639 4.440 L 15.371 3.440 ZM 18.831 11.002 L 5.178 11.002 L 5.845 19.002 L 18.164 19.002 L 18.831 11.002 ZM 13.005 13.002 L 13.005 17.002 L 11.005 17.002 L 11.005 13.002 L 13.005 13.002 ZM 9.005 13.002 L 9.005 17.002 L 7.005 17.002 L 7.005 13.002 L 9.005 13.002 ZM 17.005 13.002 L 17.005 17.002 L 15.005 17.002 L 15.005 13.002 L 17.005 13.002 Z"),
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
