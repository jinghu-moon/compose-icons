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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 21 11.238 12.27 15 6l8 15h-7ZM8 10l6 11h-12L8 10ZM5.5 8C4.119 8 3 6.881 3 5.5 3 4.119 4.119 3 5.5 3 6.881 3 8 4.119 8 5.5 8 6.881 6.881 8 5.5 8Z"),
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
        return _landscapeFill!!
    }

private var _landscapeFill: ImageVector? = null
