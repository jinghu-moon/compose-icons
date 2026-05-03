package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EarthquakeFill: ImageVector
    get() {
        if (_earthquakeFill != null) return _earthquakeFill!!
        _earthquakeFill = remixIcon(
            name = "EarthquakeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.327 1.612 C 11.677 1.294 12.196 1.267 12.573 1.532 L 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 20.000 C 20.000 20.513 19.614 20.935 19.117 20.993 L 19.000 21.000 L 12.500 21.000 L 15.000 17.000 L 11.500 14.000 L 15.500 11.000 L 13.000 9.000 L 13.500 6.000 L 10.500 9.000 L 13.000 11.000 L 8.000 14.000 L 11.750 17.500 L 8.500 21.000 L 5.000 21.000 C 4.487 21.000 4.064 20.614 4.007 20.117 L 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 Z"),
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
        return _earthquakeFill!!
    }

private var _earthquakeFill: ImageVector? = null
