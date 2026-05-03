package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WifiLine: ImageVector
    get() {
        if (_wifiLine != null) return _wifiLine!!
        _wifiLine = remixIcon(
            name = "WifiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 0.689 6.997 C 3.780 4.497 7.715 3.000 12.000 3.000 C 16.285 3.000 20.219 4.497 23.310 6.997 L 22.054 8.553 C 19.306 6.331 15.809 5.000 12.000 5.000 C 8.191 5.000 4.694 6.331 1.946 8.553 L 0.689 6.997 ZM 3.831 10.886 C 6.063 9.081 8.905 8.000 12.000 8.000 C 15.094 8.000 17.936 9.081 20.169 10.886 L 18.912 12.442 C 17.023 10.915 14.618 10.000 12.000 10.000 C 9.382 10.000 6.977 10.915 5.088 12.442 L 3.831 10.886 ZM 6.973 14.776 C 8.347 13.665 10.096 13.000 12.000 13.000 C 13.904 13.000 15.653 13.665 17.027 14.776 L 15.770 16.332 C 14.740 15.499 13.428 15.000 12.000 15.000 C 10.572 15.000 9.260 15.499 8.230 16.332 L 6.973 14.776 ZM 10.115 18.666 C 10.630 18.250 11.286 18.000 12.000 18.000 C 12.714 18.000 13.370 18.250 13.885 18.666 L 12.000 21.000 L 10.115 18.666 Z"),
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
        return _wifiLine!!
    }

private var _wifiLine: ImageVector? = null
