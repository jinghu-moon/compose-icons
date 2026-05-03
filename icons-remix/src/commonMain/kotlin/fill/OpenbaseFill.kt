package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.OpenbaseFill: ImageVector
    get() {
        if (_openbaseFill != null) return _openbaseFill!!
        _openbaseFill = remixIcon(
            name = "OpenbaseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.760 L 21.999 5.996 L 21.100 15.464 L 12.000 22.323 L 2.900 15.460 L 2.011 6.000 L 12.000 2.760 ZM 12.000 3.585 L 3.189 6.435 L 12.000 20.793 L 20.806 6.435 L 12.000 3.585 Z"),
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
        return _openbaseFill!!
    }

private var _openbaseFill: ImageVector? = null
