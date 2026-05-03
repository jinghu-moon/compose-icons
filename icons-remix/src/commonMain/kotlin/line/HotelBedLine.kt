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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 11.000 L 22.000 20.000 L 20.000 20.000 L 20.000 17.000 L 4.000 17.000 L 4.000 20.000 L 2.000 20.000 L 2.000 4.000 L 4.000 4.000 L 4.000 14.000 L 12.000 14.000 L 12.000 7.000 L 18.000 7.000 C 20.209 7.000 22.000 8.791 22.000 11.000 ZM 20.000 14.000 L 20.000 11.000 C 20.000 9.895 19.105 9.000 18.000 9.000 L 14.000 9.000 L 14.000 14.000 L 20.000 14.000 ZM 8.000 11.000 C 8.552 11.000 9.000 10.552 9.000 10.000 C 9.000 9.448 8.552 9.000 8.000 9.000 C 7.448 9.000 7.000 9.448 7.000 10.000 C 7.000 10.552 7.448 11.000 8.000 11.000 ZM 8.000 13.000 C 6.343 13.000 5.000 11.657 5.000 10.000 C 5.000 8.343 6.343 7.000 8.000 7.000 C 9.657 7.000 11.000 8.343 11.000 10.000 C 11.000 11.657 9.657 13.000 8.000 13.000 Z"),
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
        return _hotelBedLine!!
    }

private var _hotelBedLine: ImageVector? = null
