package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TShirt2Fill: ImageVector
    get() {
        if (_tShirt2Fill != null) return _tShirt2Fill!!
        _tShirt2Fill = remixIcon(
            name = "TShirt2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.998 3.000 C 21.550 3.000 21.998 3.448 21.998 4.000 L 21.998 11.000 C 21.998 11.552 21.550 12.000 20.998 12.000 L 18.997 12.000 L 18.998 20.000 C 18.998 20.552 18.550 21.000 17.998 21.000 L 5.998 21.000 C 5.446 21.000 4.998 20.552 4.998 20.000 L 4.997 11.999 L 2.998 12.000 C 2.446 12.000 1.998 11.552 1.998 11.000 L 1.998 4.000 C 1.998 3.448 2.446 3.000 2.998 3.000 L 8.998 3.000 C 8.998 4.657 10.341 6.000 11.998 6.000 C 13.655 6.000 14.998 4.657 14.998 3.000 L 20.998 3.000 Z"),
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
        return _tShirt2Fill!!
    }

private var _tShirt2Fill: ImageVector? = null
