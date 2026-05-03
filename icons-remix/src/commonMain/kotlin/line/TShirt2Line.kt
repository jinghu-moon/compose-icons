package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TShirt2Line: ImageVector
    get() {
        if (_tShirt2Line != null) return _tShirt2Line!!
        _tShirt2Line = remixIcon(
            name = "TShirt2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.998 3.000 C 8.998 4.657 10.341 6.000 11.998 6.000 C 13.655 6.000 14.998 4.657 14.998 3.000 L 20.998 3.000 C 21.550 3.000 21.998 3.448 21.998 4.000 L 21.998 11.000 C 21.998 11.552 21.550 12.000 20.998 12.000 L 18.997 12.000 L 18.998 20.000 C 18.998 20.552 18.550 21.000 17.998 21.000 L 5.998 21.000 C 5.446 21.000 4.998 20.552 4.998 20.000 L 4.997 11.999 L 2.998 12.000 C 2.446 12.000 1.998 11.552 1.998 11.000 L 1.998 4.000 C 1.998 3.448 2.446 3.000 2.998 3.000 L 8.998 3.000 ZM 19.998 4.999 L 16.581 4.999 L 16.564 5.040 C 15.811 6.722 14.157 7.913 12.215 7.995 L 11.998 8.000 C 9.963 8.000 8.212 6.785 7.432 5.040 L 7.414 4.999 L 3.998 4.999 L 3.998 9.999 L 6.997 9.998 L 6.997 19.000 L 16.998 19.000 L 16.997 10.000 L 19.998 9.999 L 19.998 4.999 Z"),
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
        return _tShirt2Line!!
    }

private var _tShirt2Line: ImageVector? = null
