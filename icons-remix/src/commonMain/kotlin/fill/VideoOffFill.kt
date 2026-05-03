package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VideoOffFill: ImageVector
    get() {
        if (_videoOffFill != null) return _videoOffFill!!
        _videoOffFill = remixIcon(
            name = "VideoOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 18.414 L 21.192 22.607 L 22.607 21.192 L 2.808 1.393 L 1.393 2.808 L 2.586 4.000 L 2.000 4.000 C 1.448 4.000 1.000 4.448 1.000 5.000 L 1.000 19.000 C 1.000 19.552 1.448 20.000 2.000 20.000 L 16.000 20.000 C 16.552 20.000 17.000 19.552 17.000 19.000 L 17.000 18.414 ZM 16.000 4.000 L 8.214 4.000 L 22.708 18.494 C 22.881 18.415 23.000 18.242 23.000 18.040 L 23.000 5.960 C 23.000 5.858 22.968 5.758 22.910 5.674 C 22.751 5.447 22.440 5.392 22.213 5.551 L 17.000 9.200 L 17.000 5.000 C 17.000 4.448 16.552 4.000 16.000 4.000 Z"),
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
        return _videoOffFill!!
    }

private var _videoOffFill: ImageVector? = null
