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
                pathData = parseSvgPathData("M 7.005 8.000 L 7.005 6.000 C 7.005 3.238 9.243 1.000 12.005 1.000 C 14.766 1.000 17.005 3.238 17.005 6.000 L 17.005 8.000 L 20.005 8.000 C 20.557 8.000 21.005 8.447 21.005 9.000 L 21.005 21.000 C 21.005 21.552 20.557 22.000 20.005 22.000 L 4.005 22.000 C 3.453 22.000 3.005 21.552 3.005 21.000 L 3.005 9.000 C 3.005 8.447 3.453 8.000 4.005 8.000 L 7.005 8.000 ZM 7.005 10.000 L 5.005 10.000 L 5.005 20.000 L 19.005 20.000 L 19.005 10.000 L 17.005 10.000 L 17.005 12.000 L 15.005 12.000 L 15.005 10.000 L 9.005 10.000 L 9.005 12.000 L 7.005 12.000 L 7.005 10.000 ZM 9.005 8.000 L 15.005 8.000 L 15.005 6.000 C 15.005 4.343 13.662 3.000 12.005 3.000 C 10.348 3.000 9.005 4.343 9.005 6.000 L 9.005 8.000 Z"),
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
