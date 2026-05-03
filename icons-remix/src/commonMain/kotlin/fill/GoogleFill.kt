package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GoogleFill: ImageVector
    get() {
        if (_googleFill != null) return _googleFill!!
        _googleFill = remixIcon(
            name = "GoogleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.064 7.509 C 4.709 4.241 8.091 2.000 12.000 2.000 C 14.695 2.000 16.959 2.991 18.691 4.605 L 15.823 7.473 C 14.786 6.482 13.468 5.977 12.000 5.977 C 9.395 5.977 7.191 7.736 6.405 10.100 C 6.205 10.700 6.091 11.341 6.091 12.000 C 6.091 12.659 6.205 13.300 6.405 13.900 C 7.191 16.264 9.395 18.023 12.000 18.023 C 13.345 18.023 14.491 17.668 15.386 17.068 C 16.445 16.359 17.150 15.300 17.382 14.050 L 12.000 14.050 L 12.000 10.182 L 21.418 10.182 C 21.536 10.836 21.600 11.518 21.600 12.227 C 21.600 15.273 20.509 17.836 18.618 19.577 C 16.964 21.105 14.700 22.000 12.000 22.000 C 8.091 22.000 4.709 19.759 3.064 16.491 C 2.386 15.141 2.000 13.614 2.000 12.000 C 2.000 10.386 2.386 8.859 3.064 7.509 Z"),
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
        return _googleFill!!
    }

private var _googleFill: ImageVector? = null
