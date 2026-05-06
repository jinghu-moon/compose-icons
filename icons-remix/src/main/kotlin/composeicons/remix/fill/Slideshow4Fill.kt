package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Slideshow4Fill: ImageVector
    get() {
        if (_slideshow4Fill != null) return _slideshow4Fill!!
        _slideshow4Fill = remixIcon(
            name = "Slideshow4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.171 3C8.583 1.835 9.694 1 11 1h2c1.306 0 2.417 .835 2.829 2h5.171c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h5.171ZM10 9v6l5-3L10 9ZM11 3c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2c.552 0 1-.448 1-1C14 3.448 13.552 3 13 3h-2Z"),
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
        return _slideshow4Fill!!
    }

private var _slideshow4Fill: ImageVector? = null
