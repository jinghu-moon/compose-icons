package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ParkingBoxLine: ImageVector
    get() {
        if (_parkingBoxLine != null) return _parkingBoxLine!!
        _parkingBoxLine = remixIcon(
            name = "ParkingBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 5.000 5.000 L 5.000 19.000 L 19.000 19.000 L 19.000 5.000 L 5.000 5.000 ZM 9.000 7.000 L 12.500 7.000 C 14.433 7.000 16.000 8.567 16.000 10.500 C 16.000 12.433 14.433 14.000 12.500 14.000 L 11.000 14.000 L 11.000 17.000 L 9.000 17.000 L 9.000 7.000 ZM 11.000 9.000 L 11.000 12.000 L 12.500 12.000 C 13.328 12.000 14.000 11.328 14.000 10.500 C 14.000 9.672 13.328 9.000 12.500 9.000 L 11.000 9.000 Z"),
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
        return _parkingBoxLine!!
    }

private var _parkingBoxLine: ImageVector? = null
