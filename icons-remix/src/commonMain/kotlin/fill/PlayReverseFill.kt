package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlayReverseFill: ImageVector
    get() {
        if (_playReverseFill != null) return _playReverseFill!!
        _playReverseFill = remixIcon(
            name = "PlayReverseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.624 12.416 L 15.223 19.482 C 15.452 19.635 15.763 19.573 15.916 19.343 C 15.971 19.261 16.000 19.164 16.000 19.066 L 16.000 4.934 C 16.000 4.658 15.776 4.434 15.500 4.434 C 15.401 4.434 15.305 4.464 15.223 4.518 L 4.624 11.584 C 4.394 11.737 4.332 12.048 4.485 12.277 C 4.522 12.332 4.569 12.380 4.624 12.416 Z"),
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
        return _playReverseFill!!
    }

private var _playReverseFill: ImageVector? = null
