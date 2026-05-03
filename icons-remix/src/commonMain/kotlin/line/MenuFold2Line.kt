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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.403 3.903 L 2.989 5.318 L 6.171 8.500 L 2.989 11.682 L 4.403 13.096 L 9.000 8.500 L 4.403 3.903 ZM 21.000 20.000 L 21.000 18.000 L 3.000 18.000 L 3.000 20.000 L 21.000 20.000 ZM 21.000 13.000 L 21.000 11.000 L 12.000 11.000 L 12.000 13.000 L 21.000 13.000 ZM 21.000 6.000 L 21.000 4.000 L 12.000 4.000 L 12.000 6.000 L 21.000 6.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _menuFold2Line!!
    }

private var _menuFold2Line: ImageVector? = null
