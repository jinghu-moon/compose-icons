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
                pathData = parseSvgPathData("M 8.171 3.000 C 8.583 1.835 9.694 1.000 11.000 1.000 L 13.000 1.000 C 14.306 1.000 15.417 1.835 15.829 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 8.171 3.000 ZM 10.000 9.000 L 10.000 15.000 L 15.000 12.000 L 10.000 9.000 ZM 11.000 3.000 C 10.448 3.000 10.000 3.448 10.000 4.000 C 10.000 4.552 10.448 5.000 11.000 5.000 L 13.000 5.000 C 13.552 5.000 14.000 4.552 14.000 4.000 C 14.000 3.448 13.552 3.000 13.000 3.000 L 11.000 3.000 Z"),
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
