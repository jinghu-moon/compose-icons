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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.808 1.393 20.486 19.071l-1.414 1.414L15.389 16.802 12 21 .69 6.997C1.604 6.257 2.592 5.606 3.641 5.055L1.394 2.808 2.808 1.393ZM12 3c4.284 0 8.219 1.497 11.31 3.996l-5.406 6.693L7.725 3.511c1.37-.334 2.802-.511 4.275-.511Z"),
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
        return _signalWifiOffFill!!
    }

private var _signalWifiOffFill: ImageVector? = null
