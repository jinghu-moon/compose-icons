package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalWifi1Line: ImageVector
    get() {
        if (_signalWifi1Line != null) return _signalWifi1Line!!
        _signalWifi1Line = remixIcon(
            name = "SignalWifi1Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 16.285 3.000 20.220 4.497 23.310 6.996 L 12.000 21.000 L 0.690 6.997 C 3.781 4.497 7.716 3.000 12.000 3.000 ZM 12.000 15.000 C 11.307 15.000 10.633 15.117 10.000 15.341 L 12.000 17.817 L 14.000 15.340 C 13.370 15.120 12.694 15.000 12.000 15.000 ZM 12.000 5.000 C 8.973 5.000 6.078 5.842 3.580 7.392 L 8.689 13.715 C 9.698 13.256 10.819 13.000 12.000 13.000 C 13.182 13.000 14.303 13.256 15.312 13.715 L 20.420 7.391 C 17.923 5.842 15.028 5.000 12.000 5.000 Z"),
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
        return _signalWifi1Line!!
    }

private var _signalWifi1Line: ImageVector? = null
