package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Slideshow4Line: ImageVector
    get() {
        if (_slideshow4Line != null) return _slideshow4Line!!
        _slideshow4Line = remixIcon(
            name = "Slideshow4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.171 3C8.583 1.835 9.694 1 11 1h2c1.306 0 2.417 .835 2.829 2h5.171c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h5.171ZM4 5v14h16v-14h-4.171C15.417 6.165 14.306 7 13 7h-2C9.694 7 8.583 6.165 8.171 5h-4.171ZM11 3c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2c.552 0 1-.448 1-1C14 3.448 13.552 3 13 3h-2ZM10 9l5 3-5 3v-6Z"),
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
        return _slideshow4Line!!
    }

private var _slideshow4Line: ImageVector? = null
