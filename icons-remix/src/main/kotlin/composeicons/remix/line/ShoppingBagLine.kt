package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShoppingBagLine: ImageVector
    get() {
        if (_shoppingBagLine != null) return _shoppingBagLine!!
        _shoppingBagLine = remixIcon(
            name = "ShoppingBagLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.005 8v-2C7.005 3.238 9.243 1 12.005 1c2.761 0 5 2.239 5 5v2h3c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-12c0-.552 .448-1 1-1h3ZM7.005 10h-2v10h14v-10h-2v2h-2v-2h-6v2h-2v-2ZM9.005 8h6v-2c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3v2Z"),
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
        return _shoppingBagLine!!
    }

private var _shoppingBagLine: ImageVector? = null
