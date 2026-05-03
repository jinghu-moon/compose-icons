package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TShirtFill: ImageVector
    get() {
        if (_tShirtFill != null) return _tShirtFill!!
        _tShirtFill = remixIcon(
            name = "TShirtFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.514 5.000 L 17.120 2.393 C 17.511 2.003 18.144 2.003 18.534 2.393 L 22.777 6.636 C 23.167 7.027 23.167 7.660 22.777 8.050 L 18.999 11.828 L 18.999 21.000 C 18.999 21.552 18.551 22.000 17.999 22.000 L 5.999 22.000 C 5.447 22.000 4.999 21.552 4.999 21.000 L 4.999 11.828 L 1.221 8.050 C 0.830 7.660 0.830 7.027 1.221 6.636 L 5.463 2.393 C 5.854 2.003 6.487 2.003 6.877 2.393 L 9.484 5.000 L 14.514 5.000 Z"),
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
        return _tShirtFill!!
    }

private var _tShirtFill: ImageVector? = null
