package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PulseFill: ImageVector
    get() {
        if (_pulseFill != null) return _pulseFill!!
        _pulseFill = remixIcon(
            name = "PulseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 7.539 L 15.000 21.539 L 18.659 13.000 L 23.000 13.000 L 23.000 11.000 L 17.341 11.000 L 15.000 16.461 L 9.000 2.461 L 5.341 11.000 L 1.000 11.000 L 1.000 13.000 L 6.659 13.000 L 9.000 7.539 Z"),
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
        return _pulseFill!!
    }

private var _pulseFill: ImageVector? = null
