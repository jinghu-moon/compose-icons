package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalWifi2Line: ImageVector
    get() {
        if (_signalWifi2Line != null) return _signalWifi2Line!!
        _signalWifi2Line = remixIcon(
            name = "SignalWifi2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 16.285 3.000 20.220 4.497 23.310 6.996 L 12.000 21.000 L 0.690 6.997 C 3.781 4.497 7.716 3.000 12.000 3.000 ZM 12.000 12.000 C 10.580 12.000 9.236 12.329 8.042 12.915 L 12.000 17.817 L 15.959 12.915 C 14.764 12.329 13.421 12.000 12.000 12.000 ZM 12.000 5.000 C 8.973 5.000 6.078 5.842 3.580 7.392 L 6.759 11.327 C 8.317 10.481 10.103 10.000 12.000 10.000 C 13.898 10.000 15.684 10.481 17.242 11.327 L 20.420 7.391 C 17.923 5.842 15.028 5.000 12.000 5.000 Z"),
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
        return _signalWifi2Line!!
    }

private var _signalWifi2Line: ImageVector? = null
