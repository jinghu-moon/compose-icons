package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MenuFold2Fill: ImageVector
    get() {
        if (_menuFold2Fill != null) return _menuFold2Fill!!
        _menuFold2Fill = remixIcon(
            name = "MenuFold2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 3.500 L 9.000 8.500 L 4.000 13.500 L 4.000 3.500 ZM 21.000 20.000 L 21.000 18.000 L 3.000 18.000 L 3.000 20.000 L 21.000 20.000 ZM 21.000 13.000 L 21.000 11.000 L 12.000 11.000 L 12.000 13.000 L 21.000 13.000 ZM 21.000 6.000 L 21.000 4.000 L 12.000 4.000 L 12.000 6.000 L 21.000 6.000 Z"),
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
        return _menuFold2Fill!!
    }

private var _menuFold2Fill: ImageVector? = null
