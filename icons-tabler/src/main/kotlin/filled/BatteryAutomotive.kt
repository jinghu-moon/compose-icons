package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BatteryAutomotive: ImageVector
    get() {
        if (_batteryAutomotive != null) return _batteryAutomotive!!
        _batteryAutomotive = tablerFilledIcon(
            name = "BatteryAutomotive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 2.000 C 18.552 2.000 19.000 2.448 19.000 3.000 L 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 L 5.000 3.000 C 5.000 2.448 5.448 2.000 6.000 2.000 C 6.552 2.000 7.000 2.448 7.000 3.000 L 7.000 4.000 L 17.000 4.000 L 17.000 3.000 C 17.000 2.448 17.448 2.000 18.000 2.000M 16.000 9.500 C 15.448 9.500 15.000 9.948 15.000 10.500 L 15.000 11.000 L 14.500 11.000 C 13.948 11.000 13.500 11.448 13.500 12.000 C 13.500 12.552 13.948 13.000 14.500 13.000 L 15.000 13.000 L 15.000 13.500 C 15.000 14.052 15.448 14.500 16.000 14.500 C 16.552 14.500 17.000 14.052 17.000 13.500 L 17.000 13.000 L 17.500 13.000 C 18.052 13.000 18.500 12.552 18.500 12.000 C 18.500 11.448 18.052 11.000 17.500 11.000 L 17.000 11.000 L 17.000 10.500 C 17.000 9.948 16.552 9.500 16.000 9.500M 9.500 11.000 L 6.500 11.000 C 5.948 11.000 5.500 11.448 5.500 12.000 C 5.500 12.552 5.948 13.000 6.500 13.000 L 9.500 13.000 C 10.052 13.000 10.500 12.552 10.500 12.000 C 10.500 11.448 10.052 11.000 9.500 11.000"),
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
        return _batteryAutomotive!!
    }

private var _batteryAutomotive: ImageVector? = null
