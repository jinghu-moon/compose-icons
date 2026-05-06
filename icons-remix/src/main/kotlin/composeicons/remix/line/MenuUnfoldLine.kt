package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuUnfoldLine: ImageVector
    get() {
        if (_menuUnfoldLine != null) return _menuUnfoldLine!!
        _menuUnfoldLine = remixIcon(
            name = "MenuUnfoldLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 18v2h-18v-2h18ZM17.404 3.903 22 8.5l-4.596 4.596L15.99 11.682 19.172 8.5 15.99 5.318 17.404 3.903ZM12 11v2h-9v-2h9ZM12 4v2h-9v-2h9Z"),
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
        return _menuUnfoldLine!!
    }

private var _menuUnfoldLine: ImageVector? = null
