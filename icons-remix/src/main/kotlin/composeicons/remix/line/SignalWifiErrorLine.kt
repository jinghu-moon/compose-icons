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
                pathData = parseSvgPathData("M12 3c4.284 0 8.219 1.497 11.31 3.996L22.054 8.552C19.307 6.331 15.809 5 12 5 8.912 5 6.027 5.875 3.582 7.392l8.419 10.425 5.999-7.429v3.183L12 21 .69 6.997C3.781 4.497 7.716 3 12 3ZM22 19v2h-2v-2h2ZM22 10v7h-2v-7h2Z"),
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
