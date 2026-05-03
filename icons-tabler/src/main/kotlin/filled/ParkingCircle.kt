package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ParkingCircle: ImageVector
    get() {
        if (_parkingCircle != null) return _parkingCircle!!
        _parkingCircle = tablerFilledIcon(
            name = "ParkingCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 2.004 11.720 C 2.152 6.327 6.570 2.000 12.000 2.000M 13.334 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 10.117 16.993 C 10.620 16.934 11.000 16.507 11.000 16.000 L 11.000 13.000 L 13.334 13.000 C 14.850 13.000 16.000 11.620 16.000 10.000 C 16.000 8.380 14.850 7.000 13.334 7.000M 13.334 9.000 C 13.657 9.000 14.000 9.411 14.000 10.000 C 14.000 10.589 13.657 11.000 13.334 11.000 L 11.000 11.000 L 11.000 9.000 Z"),
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
        return _parkingCircle!!
    }

private var _parkingCircle: ImageVector? = null
