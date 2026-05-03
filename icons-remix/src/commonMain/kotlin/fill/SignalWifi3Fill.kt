package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignalWifi3Fill: ImageVector
    get() {
        if (_signalWifi3Fill != null) return _signalWifi3Fill!!
        _signalWifi3Fill = remixIcon(
            name = "SignalWifi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 16.285 3.000 20.220 4.497 23.310 6.996 L 12.000 21.000 L 0.690 6.997 C 3.781 4.497 7.716 3.000 12.000 3.000 ZM 12.000 5.000 C 8.973 5.000 6.078 5.842 3.580 7.392 L 5.484 9.749 C 7.400 8.637 9.626 8.000 12.000 8.000 C 14.375 8.000 16.601 8.637 18.517 9.749 L 20.420 7.391 C 17.923 5.842 15.028 5.000 12.000 5.000 Z"),
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
        return _signalWifi3Fill!!
    }

private var _signalWifi3Fill: ImageVector? = null
