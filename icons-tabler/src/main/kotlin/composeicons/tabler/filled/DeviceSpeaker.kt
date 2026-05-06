package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceSpeaker: ImageVector
    get() {
        if (_deviceSpeaker != null) return _deviceSpeaker!!
        _deviceSpeaker = tablerFilledIcon(
            name = "DeviceSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM12 11C9.869 11 8.112 12.671 8.005 14.8L8 15c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4M12 6c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C13 6.448 12.552 6 12 6"),
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
        return _deviceSpeaker!!
    }

private var _deviceSpeaker: ImageVector? = null
