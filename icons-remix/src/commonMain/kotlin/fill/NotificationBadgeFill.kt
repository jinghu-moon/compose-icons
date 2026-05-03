package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NotificationBadgeFill: ImageVector
    get() {
        if (_notificationBadgeFill != null) return _notificationBadgeFill!!
        _notificationBadgeFill = remixIcon(
            name = "NotificationBadgeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.341 4.000 C 13.120 4.626 13.000 5.299 13.000 6.000 C 13.000 9.314 15.686 12.000 19.000 12.000 C 19.701 12.000 20.374 11.880 21.000 11.659 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 5.000 C 3.000 4.448 3.448 4.000 4.000 4.000 L 13.341 4.000 ZM 19.000 10.000 C 16.791 10.000 15.000 8.209 15.000 6.000 C 15.000 3.791 16.791 2.000 19.000 2.000 C 21.209 2.000 23.000 3.791 23.000 6.000 C 23.000 8.209 21.209 10.000 19.000 10.000 Z"),
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
        return _notificationBadgeFill!!
    }

private var _notificationBadgeFill: ImageVector? = null
