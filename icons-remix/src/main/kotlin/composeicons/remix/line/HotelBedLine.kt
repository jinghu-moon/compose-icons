package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HotelBedLine: ImageVector
    get() {
        if (_hotelBedLine != null) return _hotelBedLine!!
        _hotelBedLine = remixIcon(
            name = "HotelBedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 11v9h-2v-3h-16v3h-2v-16h2v10h8v-7h6c2.209 0 4 1.791 4 4ZM20 14v-3C20 9.895 19.105 9 18 9h-4v5h6ZM8 11c.552 0 1-.448 1-1C9 9.448 8.552 9 8 9 7.448 9 7 9.448 7 10c0 .552 .448 1 1 1ZM8 13C6.343 13 5 11.657 5 10 5 8.343 6.343 7 8 7c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z"),
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
        return _hotelBedLine!!
    }

private var _hotelBedLine: ImageVector? = null
