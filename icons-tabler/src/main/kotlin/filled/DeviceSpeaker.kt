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
                pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 12.000 11.000 C 9.869 11.000 8.112 12.671 8.005 14.800 L 8.000 15.000 C 8.000 17.209 9.791 19.000 12.000 19.000 C 14.209 19.000 16.000 17.209 16.000 15.000 C 16.000 12.791 14.209 11.000 12.000 11.000M 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 L 11.000 7.010 C 11.000 7.562 11.448 8.010 12.000 8.010 C 12.552 8.010 13.000 7.562 13.000 7.010 L 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000"),
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
