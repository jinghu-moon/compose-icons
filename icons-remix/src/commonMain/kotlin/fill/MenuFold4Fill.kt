package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MenuFold4Fill: ImageVector
    get() {
        if (_menuFold4Fill != null) return _menuFold4Fill!!
        _menuFold4Fill = remixIcon(
            name = "MenuFold4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 4.000 L 7.000 4.000 L 7.000 6.000 L 21.000 6.000 L 21.000 4.000 ZM 21.000 11.000 L 11.000 11.000 L 11.000 13.000 L 21.000 13.000 L 21.000 11.000 ZM 21.000 18.000 L 7.000 18.000 L 7.000 20.000 L 21.000 20.000 L 21.000 18.000 ZM 3.000 17.000 L 3.000 7.000 L 8.000 12.000 L 3.000 17.000 Z"),
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
        return _menuFold4Fill!!
    }

private var _menuFold4Fill: ImageVector? = null
