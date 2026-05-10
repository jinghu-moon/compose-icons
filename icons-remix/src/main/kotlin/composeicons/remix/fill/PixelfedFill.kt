package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PixelfedFill: ImageVector
    get() {
        if (_pixelfedFill != null) return _pixelfedFill!!
        _pixelfedFill = remixIcon(
            name = "PixelfedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2ZM13.032 8.099h-2.624c-.988 0-1.789 .776-1.789 1.734v6.748l2.595-2.471h1.818c1.713 0 3.101-1.345 3.101-3.005 0-1.66-1.388-3.005-3.101-3.005Z"),
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
        return _pixelfedFill!!
    }

private var _pixelfedFill: ImageVector? = null
