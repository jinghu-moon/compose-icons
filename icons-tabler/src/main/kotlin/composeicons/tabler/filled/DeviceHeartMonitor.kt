package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceHeartMonitor: ImageVector
    get() {
        if (_deviceHeartMonitor != null) return _deviceHeartMonitor!!
        _deviceHeartMonitor = tablerFilledIcon(
            name = "DeviceHeartMonitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c1.589-0 2.902 1.238 2.995 2.824L21 6v12c0 1.589-1.238 2.902-2.824 2.995L18 21h-12C4.411 21 3.098 19.762 3.005 18.176L3 18v-12C3 4.411 4.238 3.098 5.824 3.005L6 3h12ZM14 16c-.507 0-.934 .38-.993 .883L13 17l.007 .127c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L15 17.01l-.007-.127C14.934 16.38 14.507 16 14 16ZM17 16c-.507 0-.934 .38-.993 .883L16 17l.007 .127c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L18 17.01l-.007-.127C17.934 16.38 17.507 16 17 16ZM11 9.236l-.106 .211c-.149 .299-.438 .503-.77 .545L10 10 5 9.999v3.001h14v-3.001L14.618 10l-.724 1.447c-.159 .318-.476 .528-.831 .551-.355 .023-.696-.145-.894-.441l-.063-.11L11 9.236ZM18 5h-12c-.507 0-.934 .38-.993 .883L5 6v1.999L9.381 8l.725-1.447c.159-.318 .476-.528 .831-.551 .355-.023 .696 .145 .894 .441l.063 .11L13 8.763l.106-.21c.149-.299 .438-.503 .77-.545L14 8l5-.001v-1.999c-0-.507-.38-.934-.883-.993L18 5Z"),
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
        return _deviceHeartMonitor!!
    }

private var _deviceHeartMonitor: ImageVector? = null
