package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TumblrLine: ImageVector
    get() {
        if (_tumblrLine != null) return _tumblrLine!!
        _tumblrLine = remixIcon(
            name = "TumblrLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.001 8.000 C 9.076 8.000 11.498 7.327 11.498 3.500 L 11.498 2.000 L 12.998 2.000 L 12.998 8.000 L 18.001 8.000 L 18.001 10.000 L 12.998 10.000 L 12.998 12.909 C 13.001 15.391 13.001 16.596 13.001 17.000 C 12.999 19.208 14.616 20.400 17.786 20.400 L 17.786 22.000 C 17.151 21.999 16.403 21.999 15.544 22.000 C 13.142 22.002 10.998 19.965 10.998 17.455 L 10.998 10.000 L 7.001 10.000 L 7.001 8.000 L 8.001 8.000 Z"),
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
        return _tumblrLine!!
    }

private var _tumblrLine: ImageVector? = null
