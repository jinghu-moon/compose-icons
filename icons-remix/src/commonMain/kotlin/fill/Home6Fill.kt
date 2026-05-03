package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Home6Fill: ImageVector
    get() {
        if (_home6Fill != null) return _home6Fill!!
        _home6Fill = remixIcon(
            name = "Home6Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 9.489 C 3.000 9.180 3.142 8.889 3.386 8.700 L 11.386 2.477 C 11.747 2.197 12.253 2.197 12.614 2.477 L 20.614 8.700 C 20.858 8.889 21.000 9.180 21.000 9.489 L 21.000 20.000 ZM 7.000 15.000 L 7.000 17.000 L 17.000 17.000 L 17.000 15.000 L 7.000 15.000 Z"),
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
        return _home6Fill!!
    }

private var _home6Fill: ImageVector? = null
