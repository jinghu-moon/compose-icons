package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NotificationOffLine: ImageVector
    get() {
        if (_notificationOffLine != null) return _notificationOffLine!!
        _notificationOffLine = remixIcon(
            name = "NotificationOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.586 20.000 L 4.000 20.000 C 3.724 20.000 3.500 19.776 3.500 19.500 C 3.500 19.392 3.535 19.287 3.600 19.200 L 4.000 18.667 L 4.000 10.000 C 4.000 8.670 4.325 7.416 4.899 6.313 L 1.394 2.808 L 2.808 1.393 L 22.607 21.192 L 21.192 22.607 L 18.586 20.000 ZM 6.408 7.822 C 6.145 8.497 6.000 9.232 6.000 10.000 L 6.000 18.000 L 16.586 18.000 L 6.408 7.822 ZM 20.000 15.786 L 18.000 13.786 L 18.000 10.000 C 18.000 6.686 15.314 4.000 12.000 4.000 C 10.912 4.000 9.891 4.290 9.011 4.797 L 7.559 3.345 C 8.830 2.495 10.357 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 L 20.000 15.786 ZM 9.500 21.000 L 14.500 21.000 C 14.500 22.381 13.381 23.500 12.000 23.500 C 10.619 23.500 9.500 22.381 9.500 21.000 Z"),
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
        return _notificationOffLine!!
    }

private var _notificationOffLine: ImageVector? = null
