package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeedFill: ImageVector
    get() {
        if (_speedFill != null) return _speedFill!!
        _speedFill = remixIcon(
            name = "SpeedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 13.333 L 2.777 19.482 C 2.548 19.635 2.237 19.573 2.084 19.343 C 2.029 19.261 2.000 19.164 2.000 19.066 L 2.000 4.934 C 2.000 4.658 2.224 4.434 2.500 4.434 C 2.599 4.434 2.695 4.464 2.777 4.518 L 12.000 10.667 L 12.000 4.934 C 12.000 4.658 12.224 4.434 12.500 4.434 C 12.599 4.434 12.695 4.464 12.777 4.518 L 23.376 11.584 C 23.606 11.737 23.668 12.048 23.515 12.277 C 23.478 12.332 23.431 12.380 23.376 12.416 L 12.777 19.482 C 12.548 19.635 12.237 19.573 12.084 19.343 C 12.029 19.261 12.000 19.164 12.000 19.066 L 12.000 13.333 Z"),
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
        return _speedFill!!
    }

private var _speedFill: ImageVector? = null
