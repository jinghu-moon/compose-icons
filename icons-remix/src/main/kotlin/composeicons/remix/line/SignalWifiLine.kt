package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalWifiLine: ImageVector
    get() {
        if (_signalWifiLine != null) return _signalWifiLine!!
        _signalWifiLine = remixIcon(
            name = "SignalWifiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c4.284 0 8.219 1.497 11.31 3.996L12 21 .69 6.997C3.781 4.497 7.716 3 12 3ZM12 5C8.973 5 6.078 5.842 3.58 7.392l8.421 10.425L20.42 7.391C17.923 5.842 15.028 5 12 5Z"),
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
        return _signalWifiLine!!
    }

private var _signalWifiLine: ImageVector? = null
