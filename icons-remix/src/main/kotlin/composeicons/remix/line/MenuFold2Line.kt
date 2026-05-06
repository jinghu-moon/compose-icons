package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuFold2Line: ImageVector
    get() {
        if (_menuFold2Line != null) return _menuFold2Line!!
        _menuFold2Line = remixIcon(
            name = "MenuFold2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.403 3.903 2.989 5.318 6.171 8.5 2.989 11.682l1.414 1.414L9 8.5 4.403 3.903ZM21 20v-2h-18v2h18ZM21 13v-2h-9v2h9ZM21 6v-2h-9v2h9Z"),
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
        return _menuFold2Line!!
    }

private var _menuFold2Line: ImageVector? = null
