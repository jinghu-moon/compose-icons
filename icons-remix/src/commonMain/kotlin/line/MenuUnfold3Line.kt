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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 4.000 L 3.000 4.000 L 3.000 6.000 L 17.000 6.000 L 17.000 4.000 ZM 13.000 11.000 L 3.000 11.000 L 3.000 13.000 L 13.000 13.000 L 13.000 11.000 ZM 17.000 18.000 L 3.000 18.000 L 3.000 20.000 L 17.000 20.000 L 17.000 18.000 ZM 15.990 8.814 L 17.404 7.400 L 22.000 11.996 L 17.404 16.592 L 15.990 15.178 L 19.172 11.996 L 15.990 8.814 Z"),
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
        return _menuUnfold3Line!!
    }

private var _menuUnfold3Line: ImageVector? = null
