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
                pathData = parseSvgPathData("M.689 6.997C3.78 4.497 7.715 3 12 3c4.285 0 8.22 1.497 11.311 3.997L22.054 8.553C19.306 6.331 15.809 5 12 5 8.191 5 4.694 6.331 1.946 8.553L.689 6.997ZM3.831 10.886C6.063 9.081 8.905 8 12 8c3.095 0 5.936 1.081 8.169 2.886l-1.257 1.556C17.023 10.915 14.618 10 12 10c-2.618 0-5.023 .915-6.912 2.442L3.831 10.886ZM6.973 14.776C8.347 13.665 10.096 13 12 13c1.904 0 3.653 .665 5.027 1.776l-1.257 1.556C14.74 15.499 13.428 15 12 15c-1.428 0-2.74 .499-3.77 1.332L6.973 14.776ZM10.115 18.666c.515-.417 1.171-.666 1.885-.666 .714 0 1.37 .25 1.885 .666L12 21 10.115 18.666Z"),
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
