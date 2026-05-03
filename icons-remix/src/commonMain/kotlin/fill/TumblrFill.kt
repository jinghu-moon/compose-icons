package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TumblrFill: ImageVector
    get() {
        if (_tumblrFill != null) return _tumblrFill!!
        _tumblrFill = remixIcon(
            name = "TumblrFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.271 7.630 C 8.868 7.073 10.816 4.764 10.816 2.000 L 13.846 2.000 L 13.846 7.152 L 17.483 7.152 L 17.483 10.788 L 13.846 10.788 L 13.846 16.242 C 13.846 16.757 14.044 17.449 14.755 17.909 C 15.230 18.216 16.240 18.367 17.786 18.364 L 17.786 22.000 L 13.543 22.000 C 11.033 22.000 8.998 19.965 8.998 17.455 L 8.998 10.788 L 6.271 10.788 L 6.271 7.630 Z"),
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
        return _tumblrFill!!
    }

private var _tumblrFill: ImageVector? = null
