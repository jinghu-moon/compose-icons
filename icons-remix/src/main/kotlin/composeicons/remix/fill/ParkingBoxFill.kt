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
                pathData = parseSvgPathData("M11 14h1.5C14.433 14 16 12.433 16 10.5 16 8.567 14.433 7 12.5 7h-3.5v10h2v-3ZM4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3ZM11 9h1.5C13.328 9 14 9.672 14 10.5 14 11.328 13.328 12 12.5 12h-1.5v-3Z"),
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
