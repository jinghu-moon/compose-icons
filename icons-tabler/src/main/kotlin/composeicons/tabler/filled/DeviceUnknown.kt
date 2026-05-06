package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceUnknown: ImageVector
    get() {
        if (_deviceUnknown != null) return _deviceUnknown!!
        _deviceUnknown = tablerFilledIcon(
            name = "DeviceUnknown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM12 15c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M13.368 8.327C12.135 7.697 10.631 7.998 9.737 9.055c-.342 .423-.283 1.041 .131 1.392 .415 .351 1.034 .307 1.395-.1 .294-.348 .79-.447 1.195-.239 .413 .209 .629 .675 .52 1.126-.108 .45-.512 .768-.975 .766-.552-.002-1.001 .445-1.003 .997-.002 .552 .445 1.001 .997 1.003 1.389 .004 2.599-.945 2.925-2.295 .326-1.35-.317-2.747-1.554-3.378"),
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
        return _deviceUnknown!!
    }

private var _deviceUnknown: ImageVector? = null
