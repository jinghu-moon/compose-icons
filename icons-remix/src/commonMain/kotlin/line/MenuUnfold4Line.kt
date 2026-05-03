package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuUnfold4Line: ImageVector
    get() {
        if (_menuUnfold4Line != null) return _menuUnfold4Line!!
        _menuUnfold4Line = remixIcon(
            name = "MenuUnfold4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 4.000 L 3.000 4.000 L 3.000 6.000 L 17.000 6.000 L 17.000 4.000 ZM 13.000 11.000 L 3.000 11.000 L 3.000 13.000 L 13.000 13.000 L 13.000 11.000 ZM 17.000 18.000 L 3.000 18.000 L 3.000 20.000 L 17.000 20.000 L 17.000 18.000 ZM 22.010 8.814 L 20.596 7.400 L 16.000 11.996 L 20.596 16.592 L 22.010 15.178 L 18.828 11.996 L 22.010 8.814 Z"),
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
        return _menuUnfold4Line!!
    }

private var _menuUnfold4Line: ImageVector? = null
