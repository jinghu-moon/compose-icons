package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShoppingCart2Line: ImageVector
    get() {
        if (_shoppingCart2Line != null) return _shoppingCart2Line!!
        _shoppingCart2Line = remixIcon(
            name = "ShoppingCart2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.004 6.417 .762 3.174 2.176 1.76 5.419 5.003h15.242c.552 0 1 .448 1 1 0 .097-.014 .194-.042 .287l-2.4 8c-.127 .423-.516 .713-.958 .713h-12.256v2h11v2h-12c-.552 0-1-.448-1-1v-11.586ZM6.004 7.003v6h11.512L19.316 7.003h-13.312ZM5.504 23.003c-.828 0-1.5-.672-1.5-1.5 0-.829 .672-1.5 1.5-1.5 .828 0 1.5 .671 1.5 1.5 0 .828-.672 1.5-1.5 1.5ZM17.504 23.003c-.829 0-1.5-.672-1.5-1.5 0-.829 .671-1.5 1.5-1.5 .828 0 1.5 .671 1.5 1.5 0 .828-.672 1.5-1.5 1.5Z"),
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
        return _shoppingCart2Line!!
    }

private var _shoppingCart2Line: ImageVector? = null
