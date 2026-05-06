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
                pathData = parseSvgPathData("M6 3h7c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-5v6h-2v-18ZM8 5v8h5c2.209 0 4-1.791 4-4C17 6.791 15.209 5 13 5h-5Z"),
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
