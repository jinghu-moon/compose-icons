package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuFoldLine: ImageVector
    get() {
        if (_menuFoldLine != null) return _menuFoldLine!!
        _menuFoldLine = remixIcon(
            name = "MenuFoldLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 18.000 L 21.000 20.000 L 3.000 20.000 L 3.000 18.000 L 21.000 18.000 ZM 6.596 3.903 L 8.010 5.318 L 4.828 8.500 L 8.010 11.682 L 6.596 13.096 L 2.000 8.500 L 6.596 3.903 ZM 21.000 11.000 L 21.000 13.000 L 12.000 13.000 L 12.000 11.000 L 21.000 11.000 ZM 21.000 4.000 L 21.000 6.000 L 12.000 6.000 L 12.000 4.000 L 21.000 4.000 Z"),
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
        return _menuFoldLine!!
    }

private var _menuFoldLine: ImageVector? = null
