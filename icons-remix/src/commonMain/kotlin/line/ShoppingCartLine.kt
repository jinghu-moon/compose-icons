package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShoppingCartLine: ImageVector
    get() {
        if (_shoppingCartLine != null) return _shoppingCartLine!!
        _shoppingCartLine = remixIcon(
            name = "ShoppingCartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.005 16.000 L 4.005 4.000 L 2.005 4.000 L 2.005 2.000 L 5.005 2.000 C 5.557 2.000 6.005 2.448 6.005 3.000 L 6.005 15.000 L 18.443 15.000 L 20.443 7.000 L 8.005 7.000 L 8.005 5.000 L 21.724 5.000 C 22.276 5.000 22.724 5.448 22.724 6.000 C 22.724 6.082 22.714 6.163 22.694 6.243 L 20.194 16.243 C 20.083 16.688 19.683 17.000 19.224 17.000 L 5.005 17.000 C 4.453 17.000 4.005 16.552 4.005 16.000 ZM 6.005 23.000 C 4.900 23.000 4.005 22.105 4.005 21.000 C 4.005 19.895 4.900 19.000 6.005 19.000 C 7.109 19.000 8.005 19.895 8.005 21.000 C 8.005 22.105 7.109 23.000 6.005 23.000 ZM 18.005 23.000 C 16.900 23.000 16.005 22.105 16.005 21.000 C 16.005 19.895 16.900 19.000 18.005 19.000 C 19.110 19.000 20.005 19.895 20.005 21.000 C 20.005 22.105 19.110 23.000 18.005 23.000 Z"),
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
        return _shoppingCartLine!!
    }

private var _shoppingCartLine: ImageVector? = null
