package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CloudWindyFill: ImageVector
    get() {
        if (_cloudWindyFill != null) return _cloudWindyFill!!
        _cloudWindyFill = remixIcon(
            name = "CloudWindyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 19.000 L 14.000 15.007 L 2.074 15.007 C 1.391 13.829 1.000 12.460 1.000 11.000 C 1.000 6.582 4.582 3.000 9.000 3.000 C 12.395 3.000 15.296 5.115 16.458 8.099 C 16.795 8.034 17.144 8.000 17.500 8.000 C 20.538 8.000 23.000 10.462 23.000 13.500 C 23.000 16.538 20.538 19.000 17.500 19.000 L 14.000 19.000 ZM 6.000 21.000 L 16.000 21.000 L 16.000 23.000 L 6.000 23.000 L 6.000 21.000 ZM 2.000 17.000 L 12.000 17.000 L 12.000 19.000 L 2.000 19.000 L 2.000 17.000 Z"),
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
        return _cloudWindyFill!!
    }

private var _cloudWindyFill: ImageVector? = null
