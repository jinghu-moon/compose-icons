package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NurseFill: ImageVector
    get() {
        if (_nurseFill != null) return _nurseFill!!
        _nurseFill = remixIcon(
            name = "NurseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.957 15.564 C 17.615 16.622 19.573 19.064 19.939 22.000 L 4.062 22.000 C 4.429 19.064 6.386 16.622 9.044 15.564 L 12.001 20.000 L 14.957 15.564 ZM 18.001 2.000 L 18.001 8.000 C 18.001 11.314 15.314 14.000 12.001 14.000 C 8.687 14.000 6.001 11.314 6.001 8.000 L 6.001 2.000 L 18.001 2.000 ZM 16.001 8.000 L 8.001 8.000 C 8.001 10.209 9.791 12.000 12.001 12.000 C 14.210 12.000 16.001 10.209 16.001 8.000 Z"),
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
        return _nurseFill!!
    }

private var _nurseFill: ImageVector? = null
