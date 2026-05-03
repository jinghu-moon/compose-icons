package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WifiFill: ImageVector
    get() {
        if (_wifiFill != null) return _wifiFill!!
        _wifiFill = remixIcon(
            name = "WifiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 0.689 6.997 C 3.780 4.497 7.715 3.000 12.000 3.000 C 16.285 3.000 20.219 4.497 23.310 6.997 L 21.425 9.330 C 18.850 7.248 15.570 6.000 12.000 6.000 C 8.429 6.000 5.150 7.248 2.575 9.330 L 0.689 6.997 ZM 3.831 10.886 C 6.063 9.081 8.905 8.000 12.000 8.000 C 15.094 8.000 17.936 9.081 20.169 10.886 L 18.284 13.220 C 16.566 11.832 14.380 11.000 12.000 11.000 C 9.620 11.000 7.433 11.832 5.716 13.220 L 3.831 10.886 ZM 6.973 14.776 C 8.347 13.665 10.096 13.000 12.000 13.000 C 13.904 13.000 15.653 13.665 17.027 14.776 L 15.142 17.110 C 14.283 16.416 13.190 16.000 12.000 16.000 C 10.810 16.000 9.717 16.416 8.858 17.110 L 6.973 14.776 ZM 10.115 18.666 C 10.630 18.250 11.286 18.000 12.000 18.000 C 12.714 18.000 13.370 18.250 13.885 18.666 L 12.000 21.000 L 10.115 18.666 Z"),
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
        return _wifiFill!!
    }

private var _wifiFill: ImageVector? = null
