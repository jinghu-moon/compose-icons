package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkipBackLine: ImageVector
    get() {
        if (_skipBackLine != null) return _skipBackLine!!
        _skipBackLine = remixIcon(
            name = "SkipBackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 4.000 C 7.552 4.000 8.000 4.448 8.000 5.000 L 8.000 11.333 L 18.223 4.518 C 18.452 4.365 18.763 4.427 18.916 4.657 C 18.971 4.739 19.000 4.836 19.000 4.934 L 19.000 19.066 C 19.000 19.342 18.776 19.566 18.500 19.566 C 18.401 19.566 18.305 19.537 18.223 19.482 L 8.000 12.667 L 8.000 19.000 C 8.000 19.552 7.552 20.000 7.000 20.000 C 6.448 20.000 6.000 19.552 6.000 19.000 L 6.000 5.000 C 6.000 4.448 6.448 4.000 7.000 4.000 ZM 17.000 7.737 L 10.606 12.000 L 17.000 16.263 L 17.000 7.737 Z"),
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
        return _skipBackLine!!
    }

private var _skipBackLine: ImageVector? = null
