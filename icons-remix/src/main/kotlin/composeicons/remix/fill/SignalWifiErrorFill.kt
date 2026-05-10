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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c4.284 0 8.219 1.497 11.31 3.996L22.499 8h-4.498l-.001 5.571L12 21 .69 6.997C3.781 4.497 7.716 3 12 3ZM22 19v2h-2v-2h2ZM22 10v7h-2v-7h2Z"),
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
        return _signalWifiErrorFill!!
    }

private var _signalWifiErrorFill: ImageVector? = null
