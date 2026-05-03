package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ParkingBoxFill: ImageVector
    get() {
        if (_parkingBoxFill != null) return _parkingBoxFill!!
        _parkingBoxFill = remixIcon(
            name = "ParkingBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 14.000 L 12.500 14.000 C 14.433 14.000 16.000 12.433 16.000 10.500 C 16.000 8.567 14.433 7.000 12.500 7.000 L 9.000 7.000 L 9.000 17.000 L 11.000 17.000 L 11.000 14.000 ZM 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 11.000 9.000 L 12.500 9.000 C 13.328 9.000 14.000 9.672 14.000 10.500 C 14.000 11.328 13.328 12.000 12.500 12.000 L 11.000 12.000 L 11.000 9.000 Z"),
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
        return _parkingBoxFill!!
    }

private var _parkingBoxFill: ImageVector? = null
