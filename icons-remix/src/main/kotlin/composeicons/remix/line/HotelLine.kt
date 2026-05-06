package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HotelLine: ImageVector
    get() {
        if (_hotelLine != null) return _hotelLine!!
        _hotelLine = remixIcon(
            name = "HotelLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 21h-20v-2h1v-15C3 3.448 3.448 3 4 3h14c.552 0 1 .448 1 1v5h2v10h1v2ZM17 19h2v-8h-6v8h2v-6h2v6ZM17 9v-4h-12v14h6v-10h6ZM7 11h2v2h-2v-2ZM7 15h2v2h-2v-2ZM7 7h2v2h-2v-2Z"),
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
        return _hotelLine!!
    }

private var _hotelLine: ImageVector? = null
