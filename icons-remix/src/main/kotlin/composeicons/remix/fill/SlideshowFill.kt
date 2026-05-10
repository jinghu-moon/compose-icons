package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SlideshowFill: ImageVector
    get() {
        if (_slideshowFill != null) return _slideshowFill!!
        _slideshowFill = remixIcon(
            name = "SlideshowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 21v2h-2v-2h-8C2.448 21 2 20.552 2 20v-14h20v14c0 .552-.448 1-1 1h-8ZM8 10C6.343 10 5 11.343 5 13c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h-3v-3ZM13 10v2h6v-2h-6ZM13 14v2h6v-2h-6ZM2 3h20v2h-20v-2Z"),
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
        return _slideshowFill!!
    }

private var _slideshowFill: ImageVector? = null
