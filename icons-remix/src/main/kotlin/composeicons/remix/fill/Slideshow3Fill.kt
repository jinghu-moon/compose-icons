package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Slideshow3Fill: ImageVector
    get() {
        if (_slideshow3Fill != null) return _slideshow3Fill!!
        _slideshow3Fill = remixIcon(
            name = "Slideshow3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 18v2h4v2h-10v-2h4v-2h-8C2.448 18 2 17.552 2 17v-13C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v13c0 .552-.448 1-1 1h-8ZM10 7.5v6l5-3-5-3Z"),
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
        return _slideshow3Fill!!
    }

private var _slideshow3Fill: ImageVector? = null
