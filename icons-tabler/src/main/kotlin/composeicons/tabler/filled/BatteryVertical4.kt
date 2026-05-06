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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.5 3c.615-0 1.169 .376 1.395 .948L14.913 4h.087c1.589-0 2.902 1.238 2.995 2.824L18 7v11c0 1.657-1.343 3-3 3h-6C7.343 21 6 19.657 6 18v-11C6 5.343 7.343 4 9 4h.086l.019-.052c.207-.523 .69-.887 1.25-.941L10.5 3ZM14 16h-4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h4c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14 13h-4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h4c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14 10h-4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h4c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14 7h-4C9.448 7 9 7.448 9 8c0 .552 .448 1 1 1h4c.552 0 1-.448 1-1C15 7.448 14.552 7 14 7"),
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
        return _batteryVertical4!!
    }

private var _batteryVertical4: ImageVector? = null
