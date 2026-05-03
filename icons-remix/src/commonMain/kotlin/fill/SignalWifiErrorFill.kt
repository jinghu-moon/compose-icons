package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignalWifiErrorFill: ImageVector
    get() {
        if (_signalWifiErrorFill != null) return _signalWifiErrorFill!!
        _signalWifiErrorFill = remixIcon(
            name = "SignalWifiErrorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 16.285 3.000 20.220 4.497 23.310 6.996 L 22.499 8.000 L 18.000 8.000 L 18.000 13.571 L 12.000 21.000 L 0.690 6.997 C 3.781 4.497 7.716 3.000 12.000 3.000 ZM 22.000 19.000 L 22.000 21.000 L 20.000 21.000 L 20.000 19.000 L 22.000 19.000 ZM 22.000 10.000 L 22.000 17.000 L 20.000 17.000 L 20.000 10.000 L 22.000 10.000 Z"),
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
        return _signalWifiErrorFill!!
    }

private var _signalWifiErrorFill: ImageVector? = null
