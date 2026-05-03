package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ParkingFill: ImageVector
    get() {
        if (_parkingFill != null) return _parkingFill!!
        _parkingFill = remixIcon(
            name = "ParkingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 3.000 L 13.000 3.000 C 16.314 3.000 19.000 5.686 19.000 9.000 C 19.000 12.314 16.314 15.000 13.000 15.000 L 10.000 15.000 L 10.000 21.000 L 6.000 21.000 L 6.000 3.000 ZM 10.000 7.000 L 10.000 11.000 L 13.000 11.000 C 14.105 11.000 15.000 10.105 15.000 9.000 C 15.000 7.895 14.105 7.000 13.000 7.000 L 10.000 7.000 Z"),
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
        return _parkingFill!!
    }

private var _parkingFill: ImageVector? = null
