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
                pathData = parseSvgPathData("M20.005 22h-16c-.552 0-1-.448-1-1v-18c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1ZM19.005 20v-16h-14v16h14ZM9.005 6v2c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-2h2v2c0 2.761-2.239 5-5 5C9.243 13 7.005 10.761 7.005 8v-2h2Z"),
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
