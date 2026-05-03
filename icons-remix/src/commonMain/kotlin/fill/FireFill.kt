package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FireFill: ImageVector
    get() {
        if (_fireFill != null) return _fireFill!!
        _fireFill = remixIcon(
            name = "FireFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 23.000 C 7.858 23.000 4.500 19.642 4.500 15.500 C 4.500 13.346 5.408 11.405 6.862 10.037 C 8.204 8.774 11.500 6.500 11.000 1.500 C 17.000 5.500 20.000 9.500 14.000 15.500 C 15.000 15.500 16.500 15.500 19.000 13.030 C 19.270 13.803 19.500 14.634 19.500 15.500 C 19.500 19.642 16.142 23.000 12.000 23.000 Z"),
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
        return _fireFill!!
    }

private var _fireFill: ImageVector? = null
