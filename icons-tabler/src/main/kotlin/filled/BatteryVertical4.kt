package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BatteryVertical4: ImageVector
    get() {
        if (_batteryVertical4 != null) return _batteryVertical4!!
        _batteryVertical4 = tablerFilledIcon(
            name = "BatteryVertical4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.500 3.000 C 14.115 3.000 14.669 3.376 14.895 3.948 L 14.913 4.000 L 15.000 4.000 C 16.589 4.000 17.902 5.238 17.995 6.824 L 18.000 7.000 L 18.000 18.000 C 18.000 19.657 16.657 21.000 15.000 21.000 L 9.000 21.000 C 7.343 21.000 6.000 19.657 6.000 18.000 L 6.000 7.000 C 6.000 5.343 7.343 4.000 9.000 4.000 L 9.086 4.000 L 9.105 3.948 C 9.312 3.425 9.795 3.061 10.355 3.007 L 10.500 3.000 ZM 14.000 16.000 L 10.000 16.000 C 9.448 16.000 9.000 16.448 9.000 17.000 C 9.000 17.552 9.448 18.000 10.000 18.000 L 14.000 18.000 C 14.552 18.000 15.000 17.552 15.000 17.000 C 15.000 16.448 14.552 16.000 14.000 16.000M 14.000 13.000 L 10.000 13.000 C 9.448 13.000 9.000 13.448 9.000 14.000 C 9.000 14.552 9.448 15.000 10.000 15.000 L 14.000 15.000 C 14.552 15.000 15.000 14.552 15.000 14.000 C 15.000 13.448 14.552 13.000 14.000 13.000M 14.000 10.000 L 10.000 10.000 C 9.448 10.000 9.000 10.448 9.000 11.000 C 9.000 11.552 9.448 12.000 10.000 12.000 L 14.000 12.000 C 14.552 12.000 15.000 11.552 15.000 11.000 C 15.000 10.448 14.552 10.000 14.000 10.000M 14.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 C 9.000 8.552 9.448 9.000 10.000 9.000 L 14.000 9.000 C 14.552 9.000 15.000 8.552 15.000 8.000 C 15.000 7.448 14.552 7.000 14.000 7.000"),
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
        return _batteryVertical4!!
    }

private var _batteryVertical4: ImageVector? = null
