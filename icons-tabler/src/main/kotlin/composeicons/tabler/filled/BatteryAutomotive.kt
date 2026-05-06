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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c.552 0 1 .448 1 1v1c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4v-1C5 2.448 5.448 2 6 2c.552 0 1 .448 1 1v1h10v-1c0-.552 .448-1 1-1M16 9.5c-.552 0-1 .448-1 1v.5h-.5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.5v.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.5h.5c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-.5v-.5c0-.552-.448-1-1-1M9.5 11h-3c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h3c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _batteryAutomotive!!
    }

private var _batteryAutomotive: ImageVector? = null
