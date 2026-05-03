package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Forbid2Fill: ImageVector
    get() {
        if (_forbid2Fill != null) return _forbid2Fill!!
        _forbid2Fill = remixIcon(
            name = "Forbid2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 16.891 8.523 C 16.700 8.255 16.484 7.998 16.243 7.757 C 16.002 7.516 15.745 7.300 15.477 7.109 L 7.109 15.477 C 7.300 15.745 7.516 16.002 7.757 16.243 C 7.998 16.484 8.255 16.700 8.523 16.891 L 16.891 8.523 Z"),
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
        return _forbid2Fill!!
    }

private var _forbid2Fill: ImageVector? = null
