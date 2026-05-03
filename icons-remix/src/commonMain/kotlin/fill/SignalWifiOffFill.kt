package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignalWifiOffFill: ImageVector
    get() {
        if (_signalWifiOffFill != null) return _signalWifiOffFill!!
        _signalWifiOffFill = remixIcon(
            name = "SignalWifiOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.808 1.393 L 20.486 19.071 L 19.072 20.485 L 15.389 16.802 L 12.000 21.000 L 0.690 6.997 C 1.604 6.257 2.592 5.606 3.641 5.055 L 1.394 2.808 L 2.808 1.393 ZM 12.000 3.000 C 16.285 3.000 20.220 4.497 23.310 6.996 L 17.904 13.689 L 7.725 3.511 C 9.095 3.177 10.527 3.000 12.000 3.000 Z"),
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
        return _signalWifiOffFill!!
    }

private var _signalWifiOffFill: ImageVector? = null
