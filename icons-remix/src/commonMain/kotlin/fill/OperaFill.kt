package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.OperaFill: ImageVector
    get() {
        if (_operaFill != null) return _operaFill!!
        _operaFill = remixIcon(
            name = "OperaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.710 6.365 C 7.603 7.670 6.888 9.601 6.838 11.765 L 6.838 12.235 C 6.889 14.400 7.603 16.328 8.710 17.634 C 10.144 19.497 12.276 20.679 14.659 20.679 C 16.123 20.679 17.493 20.232 18.665 19.453 C 16.900 21.038 14.563 22.000 12.001 22.000 C 11.841 22.000 11.682 21.997 11.526 21.988 C 6.221 21.741 2.001 17.363 2.001 12.000 C 2.001 6.476 6.478 2.000 12.001 2.000 L 12.038 2.000 C 14.584 2.010 16.905 2.972 18.666 4.546 C 17.493 3.771 16.124 3.320 14.658 3.320 C 12.276 3.320 10.144 4.503 8.708 6.365 L 8.710 6.365 ZM 22.001 12.000 C 22.001 14.963 20.713 17.623 18.666 19.454 C 16.101 20.704 13.711 19.830 12.919 19.283 C 15.439 18.730 17.342 15.683 17.342 12.000 C 17.342 8.315 15.439 5.271 12.919 4.717 C 13.710 4.172 16.101 3.297 18.666 4.546 C 20.713 6.375 22.001 9.038 22.001 12.000 Z"),
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
        return _operaFill!!
    }

private var _operaFill: ImageVector? = null
