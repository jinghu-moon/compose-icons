package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShoppingCart2Fill: ImageVector
    get() {
        if (_shoppingCart2Fill != null) return _shoppingCart2Fill!!
        _shoppingCart2Fill = remixIcon(
            name = "ShoppingCart2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.004 6.417 .762 3.174 2.176 1.76 5.419 5.003h15.242c.552 0 1 .448 1 1 0 .097-.014 .194-.042 .287l-2.4 8c-.127 .423-.516 .713-.958 .713h-12.256v2h11v2h-12c-.552 0-1-.448-1-1v-11.586ZM5.504 23.003c-.828 0-1.5-.672-1.5-1.5 0-.829 .672-1.5 1.5-1.5 .828 0 1.5 .671 1.5 1.5 0 .828-.672 1.5-1.5 1.5ZM17.504 23.003c-.829 0-1.5-.672-1.5-1.5 0-.829 .671-1.5 1.5-1.5 .828 0 1.5 .671 1.5 1.5 0 .828-.672 1.5-1.5 1.5Z"),
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
        return _shoppingCart2Fill!!
    }

private var _shoppingCart2Fill: ImageVector? = null
