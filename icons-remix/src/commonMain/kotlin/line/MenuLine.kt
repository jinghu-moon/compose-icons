package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuLine: ImageVector
    get() {
        if (_menuLine != null) return _menuLine!!
        _menuLine = remixIcon(
            name = "MenuLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 4.000 L 21.000 4.000 L 21.000 6.000 L 3.000 6.000 L 3.000 4.000 ZM 3.000 11.000 L 21.000 11.000 L 21.000 13.000 L 3.000 13.000 L 3.000 11.000 ZM 3.000 18.000 L 21.000 18.000 L 21.000 20.000 L 3.000 20.000 L 3.000 18.000 Z"),
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
        return _menuLine!!
    }

private var _menuLine: ImageVector? = null
