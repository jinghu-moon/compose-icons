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
                pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 14.000 16.000 C 13.493 16.000 13.066 16.380 13.007 16.883 L 13.000 17.000 L 13.007 17.127 C 13.067 17.630 13.493 18.009 14.000 18.009 C 14.507 18.009 14.933 17.630 14.993 17.127 L 15.000 17.010 L 14.993 16.883 C 14.934 16.380 14.507 16.000 14.000 16.000 ZM 17.000 16.000 C 16.493 16.000 16.066 16.380 16.007 16.883 L 16.000 17.000 L 16.007 17.127 C 16.067 17.630 16.493 18.009 17.000 18.009 C 17.507 18.009 17.933 17.630 17.993 17.127 L 18.000 17.010 L 17.993 16.883 C 17.934 16.380 17.507 16.000 17.000 16.000 ZM 11.000 9.236 L 10.894 9.447 C 10.745 9.746 10.456 9.950 10.124 9.992 L 10.000 10.000 L 5.000 9.999 L 5.000 13.000 L 19.000 13.000 L 19.000 9.999 L 14.618 10.000 L 13.894 11.447 C 13.735 11.765 13.418 11.975 13.063 11.998 C 12.708 12.021 12.367 11.853 12.169 11.557 L 12.106 11.447 L 11.000 9.236 ZM 18.000 5.000 L 6.000 5.000 C 5.493 5.000 5.066 5.380 5.007 5.883 L 5.000 6.000 L 5.000 7.999 L 9.381 8.000 L 10.106 6.553 C 10.265 6.235 10.582 6.025 10.937 6.002 C 11.292 5.979 11.633 6.147 11.831 6.443 L 11.894 6.553 L 13.000 8.763 L 13.106 8.553 C 13.255 8.254 13.544 8.050 13.876 8.008 L 14.000 8.000 L 19.000 7.999 L 19.000 6.000 C 19.000 5.493 18.620 5.066 18.117 5.007 L 18.000 5.000 Z"),
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
