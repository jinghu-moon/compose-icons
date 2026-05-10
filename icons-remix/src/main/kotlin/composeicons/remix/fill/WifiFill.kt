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
                pathData = parseSvgPathData("M.689 6.997C3.78 4.497 7.715 3 12 3c4.285 0 8.22 1.497 11.311 3.997L21.425 9.33C18.85 7.248 15.57 6 12 6 8.429 6 5.15 7.248 2.575 9.33L.689 6.997ZM3.831 10.886C6.063 9.081 8.905 8 12 8c3.095 0 5.936 1.081 8.169 2.886l-1.885 2.334C16.566 11.832 14.38 11 12 11c-2.38 0-4.566 .832-6.284 2.22L3.831 10.886ZM6.973 14.776C8.347 13.665 10.096 13 12 13c1.904 0 3.653 .665 5.027 1.776l-1.885 2.334C14.283 16.416 13.19 16 12 16c-1.19 0-2.283 .416-3.142 1.11L6.973 14.776ZM10.115 18.666c.515-.417 1.171-.666 1.885-.666 .714 0 1.37 .25 1.885 .666L12 21 10.115 18.666Z"),
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
