package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuUnfold3Line: ImageVector
    get() {
        if (_menuUnfold3Line != null) return _menuUnfold3Line!!
        _menuUnfold3Line = remixIcon(
            name = "MenuUnfold3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 4h-14v2h14v-2ZM13 11h-10v2h10v-2ZM17 18h-14v2h14v-2ZM15.99 8.814 17.404 7.4 22 11.996l-4.596 4.596L15.99 15.178l3.182-3.182L15.99 8.814Z"),
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
        return _menuUnfold3Line!!
    }

private var _menuUnfold3Line: ImageVector? = null
