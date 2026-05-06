package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceUsb: ImageVector
    get() {
        if (_deviceUsb != null) return _deviceUsb!!
        _deviceUsb = tablerFilledIcon(
            name = "DeviceUsb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2c.552 0 1 .448 1 1v4h1c.552 0 1 .448 1 1v8c0 3.314-2.686 6-6 6C8.686 22 6 19.314 6 16v-8C6 7.448 6.448 7 7 7h1v-4C8 2.448 8.448 2 9 2ZM14 4h-4v3h4Z"),
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
        return _deviceUsb!!
    }

private var _deviceUsb: ImageVector? = null
