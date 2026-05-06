package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuUnfold2Line: ImageVector
    get() {
        if (_menuUnfold2Line != null) return _menuUnfold2Line!!
        _menuUnfold2Line = remixIcon(
            name = "MenuUnfold2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.596 3.903 15.999 8.5l4.596 4.596 1.414-1.414L18.828 8.5 22.01 5.318 20.596 3.903ZM21 20v-2h-18v2h18ZM12 13v-2h-9v2h9ZM12 6v-2h-9v2h9Z"),
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
        return _menuUnfold2Line!!
    }

private var _menuUnfold2Line: ImageVector? = null
