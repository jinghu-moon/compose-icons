package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LandscapeFill: ImageVector
    get() {
        if (_landscapeFill != null) return _landscapeFill!!
        _landscapeFill = remixIcon(
            name = "LandscapeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 21.000 L 11.238 12.270 L 15.000 6.000 L 23.000 21.000 L 16.000 21.000 ZM 8.000 10.000 L 14.000 21.000 L 2.000 21.000 L 8.000 10.000 ZM 5.500 8.000 C 4.119 8.000 3.000 6.881 3.000 5.500 C 3.000 4.119 4.119 3.000 5.500 3.000 C 6.881 3.000 8.000 4.119 8.000 5.500 C 8.000 6.881 6.881 8.000 5.500 8.000 Z"),
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
        return _landscapeFill!!
    }

private var _landscapeFill: ImageVector? = null
