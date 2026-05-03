package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartPulseFill: ImageVector
    get() {
        if (_heartPulseFill != null) return _heartPulseFill!!
        _heartPulseFill = remixIcon(
            name = "HeartPulseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.500 3.000 C 19.538 3.000 22.000 5.500 22.000 9.000 C 22.000 16.000 14.500 20.000 12.000 21.500 C 10.022 20.313 4.916 17.563 2.868 13.000 L 7.566 13.000 L 8.500 11.444 L 11.500 16.444 L 13.566 13.000 L 17.000 13.000 L 17.000 11.000 L 12.434 11.000 L 11.500 12.556 L 8.500 7.556 L 6.434 11.000 L 2.210 11.000 C 2.074 10.363 2.000 9.696 2.000 9.000 C 2.000 5.500 4.500 3.000 7.500 3.000 C 9.360 3.000 11.000 4.000 12.000 5.000 C 13.000 4.000 14.640 3.000 16.500 3.000 Z"),
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
        return _heartPulseFill!!
    }

private var _heartPulseFill: ImageVector? = null
