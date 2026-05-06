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
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12l.004-.28C2.152 6.327 6.57 2 12 2M13.334 7h-3.334C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-3h2.334C14.85 13 16 11.62 16 10 16 8.38 14.85 7 13.334 7M13.334 9c.323 0 .666 .411 .666 1 0 .589-.343 1-.666 1h-2.334v-2Z"),
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
