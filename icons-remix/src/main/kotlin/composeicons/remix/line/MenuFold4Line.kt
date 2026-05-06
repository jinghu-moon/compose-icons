package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuFold4Line: ImageVector
    get() {
        if (_menuFold4Line != null) return _menuFold4Line!!
        _menuFold4Line = remixIcon(
            name = "MenuFold4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 4h-14v2h14v-2ZM21 11h-10v2h10v-2ZM21 18h-14v2h14v-2ZM1.989 8.814 3.403 7.4l4.596 4.596L3.403 16.592 1.989 15.178 5.171 11.996 1.989 8.814Z"),
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
        return _menuFold4Line!!
    }

private var _menuFold4Line: ImageVector? = null
