package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Polaroid2Line: ImageVector
    get() {
        if (_polaroid2Line != null) return _polaroid2Line!!
        _polaroid2Line = remixIcon(
            name = "Polaroid2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 15v-10h-14v10h14ZM3 3.993C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .445 .993 .993v16.013c0 .549-.445 .993-.993 .993h-16.013C3.445 21 3 20.555 3 20.007v-16.013ZM12 12c1.105 0 2-.895 2-2C14 8.895 13.105 8 12 8c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM12 14C9.791 14 8 12.209 8 10 8 7.791 9.791 6 12 6c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM6 6h2v2h-2v-2ZM6 17v2h12v-2h-12Z"),
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
        return _polaroid2Line!!
    }

private var _polaroid2Line: ImageVector? = null
