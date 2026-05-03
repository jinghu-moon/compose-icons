package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalWifiErrorLine: ImageVector
    get() {
        if (_signalWifiErrorLine != null) return _signalWifiErrorLine!!
        _signalWifiErrorLine = remixIcon(
            name = "SignalWifiErrorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 16.285 3.000 20.220 4.497 23.310 6.996 L 22.054 8.552 C 19.307 6.331 15.809 5.000 12.000 5.000 C 8.912 5.000 6.027 5.875 3.582 7.392 L 12.000 17.817 L 18.000 10.388 L 18.000 13.571 L 12.000 21.000 L 0.690 6.997 C 3.781 4.497 7.716 3.000 12.000 3.000 ZM 22.000 19.000 L 22.000 21.000 L 20.000 21.000 L 20.000 19.000 L 22.000 19.000 ZM 22.000 10.000 L 22.000 17.000 L 20.000 17.000 L 20.000 10.000 L 22.000 10.000 Z"),
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
        return _signalWifiErrorLine!!
    }

private var _signalWifiErrorLine: ImageVector? = null
