package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Menu4Line: ImageVector
    get() {
        if (_menu4Line != null) return _menu4Line!!
        _menu4Line = remixIcon(
            name = "Menu4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 18.000 L 16.000 20.000 L 5.000 20.000 L 5.000 18.000 L 16.000 18.000 ZM 21.000 11.000 L 21.000 13.000 L 3.000 13.000 L 3.000 11.000 L 21.000 11.000 ZM 19.000 4.000 L 19.000 6.000 L 8.000 6.000 L 8.000 4.000 L 19.000 4.000 Z"),
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
        return _menu4Line!!
    }

private var _menu4Line: ImageVector? = null
