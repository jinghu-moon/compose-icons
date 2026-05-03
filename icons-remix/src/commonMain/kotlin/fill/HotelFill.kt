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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 19.000 L 19.000 19.000 L 19.000 11.000 L 13.000 11.000 L 13.000 19.000 L 15.000 19.000 L 15.000 13.000 L 17.000 13.000 L 17.000 19.000 ZM 3.000 19.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 18.000 3.000 C 18.552 3.000 19.000 3.448 19.000 4.000 L 19.000 9.000 L 21.000 9.000 L 21.000 19.000 L 22.000 19.000 L 22.000 21.000 L 2.000 21.000 L 2.000 19.000 L 3.000 19.000 ZM 7.000 11.000 L 7.000 13.000 L 9.000 13.000 L 9.000 11.000 L 7.000 11.000 ZM 7.000 15.000 L 7.000 17.000 L 9.000 17.000 L 9.000 15.000 L 7.000 15.000 ZM 7.000 7.000 L 7.000 9.000 L 9.000 9.000 L 9.000 7.000 L 7.000 7.000 Z"),
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
        return _hotelFill!!
    }

private var _hotelFill: ImageVector? = null
