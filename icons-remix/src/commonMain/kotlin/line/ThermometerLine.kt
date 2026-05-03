package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ThermometerLine: ImageVector
    get() {
        if (_thermometerLine != null) return _thermometerLine!!
        _thermometerLine = remixIcon(
            name = "ThermometerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.556 3.444 C 22.119 5.006 22.119 7.538 20.556 9.101 L 12.356 17.301 C 11.714 17.943 10.872 18.348 9.970 18.448 L 6.591 18.822 L 4.293 21.121 C 3.903 21.512 3.269 21.512 2.879 21.121 C 2.488 20.731 2.488 20.098 2.879 19.707 L 5.177 17.408 L 5.552 14.031 C 5.653 13.128 6.057 12.286 6.699 11.644 L 14.900 3.444 C 16.462 1.882 18.994 1.882 20.556 3.444 ZM 16.314 4.858 L 8.114 13.058 C 7.793 13.379 7.590 13.800 7.540 14.252 L 7.264 16.736 L 9.749 16.460 C 10.200 16.410 10.621 16.208 10.942 15.887 L 11.364 15.464 L 9.950 14.050 L 11.364 12.636 L 12.778 14.050 L 14.192 12.636 L 12.778 11.222 L 14.193 9.808 L 15.607 11.222 L 17.021 9.807 L 15.607 8.393 L 17.021 6.979 L 18.435 8.393 L 19.142 7.686 C 19.923 6.905 19.923 5.639 19.142 4.858 C 18.361 4.077 17.095 4.077 16.314 4.858 Z"),
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
        return _thermometerLine!!
    }

private var _thermometerLine: ImageVector? = null
