package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RewindStartFill: ImageVector
    get() {
        if (_rewindStartFill != null) return _rewindStartFill!!
        _rewindStartFill = remixIcon(
            name = "RewindStartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 4.000 C 1.448 4.000 1.000 4.448 1.000 5.000 L 1.000 19.000 C 1.000 19.552 1.448 20.000 2.000 20.000 C 2.552 20.000 3.000 19.552 3.000 19.000 L 3.000 13.333 L 12.223 19.482 C 12.305 19.536 12.401 19.566 12.500 19.566 C 12.776 19.566 13.000 19.342 13.000 19.066 L 13.000 13.333 L 22.223 19.482 C 22.305 19.536 22.401 19.566 22.500 19.566 C 22.776 19.566 23.000 19.342 23.000 19.066 L 23.000 4.934 C 23.000 4.835 22.971 4.739 22.916 4.657 C 22.763 4.427 22.452 4.365 22.223 4.518 L 13.000 10.667 L 13.000 4.934 C 13.000 4.835 12.971 4.739 12.916 4.657 C 12.763 4.427 12.452 4.365 12.223 4.518 L 3.000 10.667 L 3.000 5.000 C 3.000 4.448 2.552 4.000 2.000 4.000 Z"),
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
        return _rewindStartFill!!
    }

private var _rewindStartFill: ImageVector? = null
