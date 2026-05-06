package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceIpad: ImageVector
    get() {
        if (_deviceIpad != null) return _deviceIpad!!
        _deviceIpad = tablerFilledIcon(
            name = "DeviceIpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-12C4.343 22 3 20.657 3 19v-14C3 3.343 4.343 2 6 2ZM15 18h-6c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _deviceIpad!!
    }

private var _deviceIpad: ImageVector? = null
