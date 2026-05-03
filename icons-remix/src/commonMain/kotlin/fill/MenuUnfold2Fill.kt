package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MenuUnfold2Fill: ImageVector
    get() {
        if (_menuUnfold2Fill != null) return _menuUnfold2Fill!!
        _menuUnfold2Fill = remixIcon(
            name = "MenuUnfold2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 3.500 L 21.000 13.500 L 16.000 8.500 L 21.000 3.500 ZM 21.000 20.000 L 21.000 18.000 L 3.000 18.000 L 3.000 20.000 L 21.000 20.000 ZM 12.000 13.000 L 12.000 11.000 L 3.000 11.000 L 3.000 13.000 L 12.000 13.000 ZM 12.000 6.000 L 12.000 4.000 L 3.000 4.000 L 3.000 6.000 L 12.000 6.000 Z"),
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
        return _menuUnfold2Fill!!
    }

private var _menuUnfold2Fill: ImageVector? = null
