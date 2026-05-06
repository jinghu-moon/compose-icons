package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SlideshowLine: ImageVector
    get() {
        if (_slideshowLine != null) return _slideshowLine!!
        _slideshowLine = remixIcon(
            name = "SlideshowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 21v2h-2v-2h-8C2.448 21 2 20.552 2 20v-14h20v14c0 .552-.448 1-1 1h-8ZM4 19h16v-11h-16v11ZM13 10h5v2h-5v-2ZM13 14h5v2h-5v-2ZM9 10v3h3c0 1.657-1.343 3-3 3C7.343 16 6 14.657 6 13 6 11.343 7.343 10 9 10ZM2 3h20v2h-20v-2Z"),
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
        return _slideshowLine!!
    }

private var _slideshowLine: ImageVector? = null
