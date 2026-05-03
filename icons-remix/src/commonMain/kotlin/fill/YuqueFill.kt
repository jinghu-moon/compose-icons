package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.YuqueFill: ImageVector
    get() {
        if (_yuqueFill != null) return _yuqueFill!!
        _yuqueFill = remixIcon(
            name = "YuqueFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.281 2.955 C 20.250 3.158 21.036 5.297 21.120 5.552 L 22.417 5.648 C 22.547 5.648 22.586 5.828 22.471 5.884 C 21.148 6.600 20.744 8.055 20.981 9.002 C 21.071 9.360 21.235 9.692 21.393 10.022 C 21.700 10.664 22.044 11.440 22.100 13.003 C 22.217 16.242 19.590 19.178 16.312 19.596 C 17.481 18.409 18.126 17.152 18.431 16.221 C 19.037 14.375 18.939 12.905 18.486 11.781 C 18.038 10.673 17.281 9.990 16.704 9.640 C 15.021 8.620 13.485 8.549 12.260 8.878 C 12.725 8.284 13.136 7.677 13.460 7.014 C 14.044 5.364 13.358 4.166 12.756 3.495 C 12.564 3.249 12.695 2.840 13.061 2.840 C 14.470 2.840 15.874 2.860 17.281 2.955 ZM 3.319 19.107 C 5.243 16.905 8.031 13.713 10.481 10.956 C 11.040 10.328 13.250 8.619 16.229 10.424 C 17.107 10.956 18.659 12.589 17.560 15.935 C 16.758 18.380 13.153 23.730 1.801 21.778 C 1.574 21.739 1.290 21.424 1.583 21.090 C 1.998 20.618 2.598 19.932 3.319 19.107 Z"),
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
        return _yuqueFill!!
    }

private var _yuqueFill: ImageVector? = null
