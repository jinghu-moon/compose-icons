package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BasketballFill: ImageVector
    get() {
        if (_basketballFill != null) return _basketballFill!!
        _basketballFill = remixIcon(
            name = "BasketballFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.366 13.366 L 14.141 14.391 C 13.050 16.804 12.995 19.467 13.830 21.831 C 13.238 21.943 12.625 22.000 12.000 22.000 C 10.535 22.000 9.144 21.685 7.891 21.119 L 12.366 13.366 ZM 15.884 15.398 L 20.117 17.842 C 19.022 19.360 17.513 20.559 15.754 21.271 C 15.105 19.511 15.076 17.535 15.762 15.702 L 15.884 15.398 ZM 8.859 11.342 L 10.634 12.366 L 6.158 20.117 C 4.519 18.935 3.253 17.270 2.568 15.331 C 4.927 14.892 7.116 13.611 8.653 11.618 L 8.859 11.342 ZM 21.905 10.616 C 21.968 11.069 22.000 11.531 22.000 12.000 C 22.000 13.465 21.685 14.856 21.119 16.110 L 16.884 13.665 C 18.106 12.050 19.858 11.008 21.750 10.644 L 21.905 10.616 ZM 2.881 7.891 L 7.116 10.336 C 5.860 11.995 4.046 13.049 2.095 13.385 C 2.032 12.932 2.000 12.470 2.000 12.000 C 2.000 10.535 2.315 9.144 2.881 7.891 ZM 17.842 3.883 C 19.480 5.064 20.747 6.729 21.431 8.668 C 19.072 9.108 16.884 10.389 15.346 12.383 L 15.141 12.659 L 13.366 11.634 L 17.842 3.883 ZM 12.000 2.000 C 13.465 2.000 14.856 2.315 16.110 2.881 L 11.634 10.634 L 9.859 9.610 C 10.950 7.197 11.005 4.533 10.170 2.168 C 10.762 2.057 11.375 2.000 12.000 2.000 ZM 8.247 2.729 C 8.895 4.489 8.924 6.466 8.237 8.299 L 8.116 8.603 L 3.883 6.158 C 4.936 4.697 6.373 3.533 8.047 2.812 L 8.247 2.729 Z"),
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
        return _basketballFill!!
    }

private var _basketballFill: ImageVector? = null
