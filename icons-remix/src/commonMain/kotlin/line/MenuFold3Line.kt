package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuFold3Line: ImageVector
    get() {
        if (_menuFold3Line != null) return _menuFold3Line!!
        _menuFold3Line = remixIcon(
            name = "MenuFold3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 4.000 L 7.000 4.000 L 7.000 6.000 L 21.000 6.000 L 21.000 4.000 ZM 21.000 11.000 L 11.000 11.000 L 11.000 13.000 L 21.000 13.000 L 21.000 11.000 ZM 21.000 18.000 L 7.000 18.000 L 7.000 20.000 L 21.000 20.000 L 21.000 18.000 ZM 9.010 8.814 L 7.596 7.400 L 3.000 11.996 L 7.596 16.592 L 9.010 15.178 L 5.828 11.996 L 9.010 8.814 Z"),
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
        return _menuFold3Line!!
    }

private var _menuFold3Line: ImageVector? = null
