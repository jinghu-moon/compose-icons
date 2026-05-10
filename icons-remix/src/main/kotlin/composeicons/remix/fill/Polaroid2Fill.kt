package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Polaroid2Fill: ImageVector
    get() {
        if (_polaroid2Fill != null) return _polaroid2Fill!!
        _polaroid2Fill = remixIcon(
            name = "Polaroid2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3.993C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .445 .993 .993v16.013c0 .549-.445 .993-.993 .993h-16.013C3.445 21 3 20.555 3 20.007v-16.013ZM6 17v2h12v-2h-12ZM5 5v2h2v-2h-2ZM12 12c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM12 14c2.209 0 4-1.791 4-4C16 7.791 14.209 6 12 6 9.791 6 8 7.791 8 10c0 2.209 1.791 4 4 4Z"),
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
        return _polaroid2Fill!!
    }

private var _polaroid2Fill: ImageVector? = null
