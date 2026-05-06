package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingCartFill: ImageVector
    get() {
        if (_shoppingCartFill != null) return _shoppingCartFill!!
        _shoppingCartFill = remixIcon(
            name = "ShoppingCartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.005 9h13.938l.5-2h-12.438v-2h13.719c.552 0 1 .448 1 1 0 .082-.01 .163-.03 .243l-2.5 10c-.111 .445-.511 .757-.97 .757h-14.219c-.552 0-1-.448-1-1v-12h-2v-2h3c.552 0 1 .448 1 1v6ZM6.005 23c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM18.005 23c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _shoppingCartFill!!
    }

private var _shoppingCartFill: ImageVector? = null
