package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkipForwardFill: ImageVector
    get() {
        if (_skipForwardFill != null) return _skipForwardFill!!
        _skipForwardFill = remixIcon(
            name = "SkipForwardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 12.667 L 5.777 19.482 C 5.548 19.635 5.237 19.573 5.084 19.343 C 5.029 19.261 5.000 19.164 5.000 19.066 L 5.000 4.934 C 5.000 4.658 5.224 4.434 5.500 4.434 C 5.599 4.434 5.695 4.463 5.777 4.518 L 16.000 11.333 L 16.000 5.000 C 16.000 4.448 16.448 4.000 17.000 4.000 C 17.552 4.000 18.000 4.448 18.000 5.000 L 18.000 19.000 C 18.000 19.552 17.552 20.000 17.000 20.000 C 16.448 20.000 16.000 19.552 16.000 19.000 L 16.000 12.667 Z"),
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
        return _skipForwardFill!!
    }

private var _skipForwardFill: ImageVector? = null
