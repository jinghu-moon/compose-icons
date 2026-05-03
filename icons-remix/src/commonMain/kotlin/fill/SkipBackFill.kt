package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkipBackFill: ImageVector
    get() {
        if (_skipBackFill != null) return _skipBackFill!!
        _skipBackFill = remixIcon(
            name = "SkipBackFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 11.333 L 18.223 4.518 C 18.452 4.365 18.763 4.427 18.916 4.657 C 18.971 4.739 19.000 4.836 19.000 4.934 L 19.000 19.066 C 19.000 19.342 18.776 19.566 18.500 19.566 C 18.401 19.566 18.305 19.537 18.223 19.482 L 8.000 12.667 L 8.000 19.000 C 8.000 19.552 7.552 20.000 7.000 20.000 C 6.448 20.000 6.000 19.552 6.000 19.000 L 6.000 5.000 C 6.000 4.448 6.448 4.000 7.000 4.000 C 7.552 4.000 8.000 4.448 8.000 5.000 L 8.000 11.333 Z"),
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
        return _skipBackFill!!
    }

private var _skipBackFill: ImageVector? = null
