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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 6h6C15 4.343 13.657 3 12 3 10.343 3 9 4.343 9 6ZM7 6C7 3.239 9.239 1 12 1c2.761 0 5 2.239 5 5h3c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-14C3 6.448 3.448 6 4 6h3ZM5 8v12h14v-12h-14ZM9 10c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h2c0 2.761-2.239 5-5 5C9.239 15 7 12.761 7 10h2Z"),
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
        return _shoppingBag4Line!!
    }

private var _shoppingBag4Line: ImageVector? = null
