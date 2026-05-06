package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HotelFill: ImageVector
    get() {
        if (_hotelFill != null) return _hotelFill!!
        _hotelFill = remixIcon(
            name = "HotelFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 19h2v-8h-6v8h2v-6h2v6ZM3 19v-15C3 3.448 3.448 3 4 3h14c.552 0 1 .448 1 1v5h2v10h1v2h-20v-2h1ZM7 11v2h2v-2h-2ZM7 15v2h2v-2h-2ZM7 7v2h2v-2h-2Z"),
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
        return _hotelFill!!
    }

private var _hotelFill: ImageVector? = null
