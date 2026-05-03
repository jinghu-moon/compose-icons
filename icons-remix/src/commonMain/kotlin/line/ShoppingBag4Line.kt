package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShoppingBag4Line: ImageVector
    get() {
        if (_shoppingBag4Line != null) return _shoppingBag4Line!!
        _shoppingBag4Line = remixIcon(
            name = "ShoppingBag4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 6.000 L 15.000 6.000 C 15.000 4.343 13.657 3.000 12.000 3.000 C 10.343 3.000 9.000 4.343 9.000 6.000 ZM 7.000 6.000 C 7.000 3.239 9.239 1.000 12.000 1.000 C 14.761 1.000 17.000 3.239 17.000 6.000 L 20.000 6.000 C 20.552 6.000 21.000 6.448 21.000 7.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 7.000 C 3.000 6.448 3.448 6.000 4.000 6.000 L 7.000 6.000 ZM 5.000 8.000 L 5.000 20.000 L 19.000 20.000 L 19.000 8.000 L 5.000 8.000 ZM 9.000 10.000 C 9.000 11.657 10.343 13.000 12.000 13.000 C 13.657 13.000 15.000 11.657 15.000 10.000 L 17.000 10.000 C 17.000 12.761 14.761 15.000 12.000 15.000 C 9.239 15.000 7.000 12.761 7.000 10.000 L 9.000 10.000 Z"),
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
        return _shoppingBag4Line!!
    }

private var _shoppingBag4Line: ImageVector? = null
