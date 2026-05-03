package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ParkingLine: ImageVector
    get() {
        if (_parkingLine != null) return _parkingLine!!
        _parkingLine = remixIcon(
            name = "ParkingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 3.000 L 13.000 3.000 C 16.314 3.000 19.000 5.686 19.000 9.000 C 19.000 12.314 16.314 15.000 13.000 15.000 L 8.000 15.000 L 8.000 21.000 L 6.000 21.000 L 6.000 3.000 ZM 8.000 5.000 L 8.000 13.000 L 13.000 13.000 C 15.209 13.000 17.000 11.209 17.000 9.000 C 17.000 6.791 15.209 5.000 13.000 5.000 L 8.000 5.000 Z"),
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
        return _parkingLine!!
    }

private var _parkingLine: ImageVector? = null
