package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HandCoinFill: ImageVector
    get() {
        if (_handCoinFill != null) return _handCoinFill!!
        _handCoinFill = remixIcon(
            name = "HandCoinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.335 11.502 L 11.505 11.503 C 13.990 11.503 16.005 13.517 16.005 16.003 L 9.004 16.003 L 9.005 17.003 L 17.005 17.002 L 17.005 16.003 C 17.005 14.920 16.687 13.900 16.119 13.002 L 19.005 13.003 C 20.997 13.003 22.717 14.168 23.521 15.854 C 21.156 18.975 17.327 21.003 13.005 21.003 C 10.244 21.003 7.904 20.412 6.005 19.378 L 6.006 10.074 C 7.251 10.252 8.391 10.759 9.335 11.502 ZM 5.005 19.003 C 5.005 19.555 4.557 20.003 4.005 20.003 L 2.005 20.003 C 1.453 20.003 1.005 19.555 1.005 19.003 L 1.005 10.003 C 1.005 9.451 1.453 9.003 2.005 9.003 L 4.005 9.003 C 4.557 9.003 5.005 9.451 5.005 10.003 L 5.005 19.003 ZM 18.005 5.003 C 19.662 5.003 21.005 6.346 21.005 8.003 C 21.005 9.660 19.662 11.003 18.005 11.003 C 16.348 11.003 15.005 9.660 15.005 8.003 C 15.005 6.346 16.348 5.003 18.005 5.003 ZM 11.005 2.003 C 12.662 2.003 14.005 3.346 14.005 5.003 C 14.005 6.660 12.662 8.003 11.005 8.003 C 9.348 8.003 8.005 6.660 8.005 5.003 C 8.005 3.346 9.348 2.003 11.005 2.003 Z"),
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
        return _handCoinFill!!
    }

private var _handCoinFill: ImageVector? = null
