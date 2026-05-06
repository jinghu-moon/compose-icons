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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 1c2.761 0 5 2.239 5 5v2h3c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-12c0-.552 .448-1 1-1h3v-2C7.005 3.238 9.243 1 12.005 1ZM17.005 11h-2v1c0 .552 .448 1 1 1 .513 0 .935-.386 .993-.883l.007-.117v-1ZM9.005 11h-2v1c0 .552 .448 1 1 1 .513 0 .936-.386 .993-.883l.007-.117v-1ZM12.005 3c-1.598 0-2.904 1.249-2.995 2.824l-.005 .176v2h6v-2c0-1.598-1.249-2.904-2.824-2.995l-.176-.005Z"),
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
        return _shoppingBagFill!!
    }

private var _shoppingBagFill: ImageVector? = null
