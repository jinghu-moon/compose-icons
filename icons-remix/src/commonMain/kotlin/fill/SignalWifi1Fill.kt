package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignalWifi1Fill: ImageVector
    get() {
        if (_signalWifi1Fill != null) return _signalWifi1Fill!!
        _signalWifi1Fill = remixIcon(
            name = "SignalWifi1Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 16.285 3.000 20.220 4.497 23.310 6.996 L 12.000 21.000 L 0.690 6.997 C 3.781 4.497 7.716 3.000 12.000 3.000 ZM 12.000 5.000 C 8.973 5.000 6.078 5.842 3.580 7.392 L 8.689 13.715 C 9.698 13.256 10.819 13.000 12.000 13.000 C 13.182 13.000 14.303 13.256 15.312 13.715 L 20.420 7.391 C 17.923 5.842 15.028 5.000 12.000 5.000 Z"),
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
        return _signalWifi1Fill!!
    }

private var _signalWifi1Fill: ImageVector? = null
