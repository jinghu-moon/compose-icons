package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RewindFill: ImageVector
    get() {
        if (_rewindFill != null) return _rewindFill!!
        _rewindFill = remixIcon(
            name = "RewindFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 10.667 L 21.223 4.518 C 21.452 4.365 21.763 4.427 21.916 4.657 C 21.971 4.739 22.000 4.836 22.000 4.934 L 22.000 19.066 C 22.000 19.342 21.776 19.566 21.500 19.566 C 21.401 19.566 21.305 19.537 21.223 19.482 L 12.000 13.333 L 12.000 19.066 C 12.000 19.342 11.776 19.566 11.500 19.566 C 11.401 19.566 11.305 19.537 11.223 19.482 L 0.624 12.416 C 0.394 12.263 0.332 11.952 0.485 11.723 C 0.522 11.668 0.569 11.621 0.624 11.584 L 11.223 4.518 C 11.452 4.365 11.763 4.427 11.916 4.657 C 11.971 4.739 12.000 4.836 12.000 4.934 L 12.000 10.667 Z"),
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
        return _rewindFill!!
    }

private var _rewindFill: ImageVector? = null
