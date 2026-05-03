package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayLine: ImageVector
    get() {
        if (_playLine != null) return _playLine!!
        _playLine = remixIcon(
            name = "PlayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.394 12.000 L 10.000 7.737 L 10.000 16.263 L 16.394 12.000 ZM 19.376 12.416 L 8.777 19.482 C 8.548 19.635 8.237 19.573 8.084 19.343 C 8.029 19.261 8.000 19.164 8.000 19.066 L 8.000 4.934 C 8.000 4.658 8.224 4.434 8.500 4.434 C 8.599 4.434 8.695 4.464 8.777 4.518 L 19.376 11.584 C 19.606 11.737 19.668 12.048 19.515 12.277 C 19.478 12.332 19.431 12.380 19.376 12.416 Z"),
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
        return _playLine!!
    }

private var _playLine: ImageVector? = null
