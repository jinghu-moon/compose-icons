package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EjectLine: ImageVector
    get() {
        if (_ejectLine != null) return _ejectLine!!
        _ejectLine = remixIcon(
            name = "EjectLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.737 13.000 L 16.263 13.000 L 12.000 6.606 L 7.737 13.000 ZM 12.416 3.624 L 19.482 14.223 C 19.635 14.452 19.573 14.763 19.343 14.916 C 19.261 14.971 19.164 15.000 19.066 15.000 L 4.934 15.000 C 4.658 15.000 4.434 14.776 4.434 14.500 C 4.434 14.401 4.463 14.305 4.518 14.223 L 11.584 3.624 C 11.737 3.394 12.048 3.332 12.277 3.485 C 12.332 3.522 12.379 3.569 12.416 3.624 ZM 5.000 17.000 L 19.000 17.000 C 19.552 17.000 20.000 17.448 20.000 18.000 C 20.000 18.552 19.552 19.000 19.000 19.000 L 5.000 19.000 C 4.448 19.000 4.000 18.552 4.000 18.000 C 4.000 17.448 4.448 17.000 5.000 17.000 Z"),
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
        return _ejectLine!!
    }

private var _ejectLine: ImageVector? = null
