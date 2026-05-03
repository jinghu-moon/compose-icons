package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NotificationBadgeLine: ImageVector
    get() {
        if (_notificationBadgeLine != null) return _notificationBadgeLine!!
        _notificationBadgeLine = remixIcon(
            name = "NotificationBadgeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.341 4.000 C 13.120 4.626 13.000 5.299 13.000 6.000 L 5.000 6.000 L 5.000 20.000 L 19.000 20.000 L 19.000 12.000 C 19.701 12.000 20.374 11.880 21.000 11.659 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 5.000 C 3.000 4.448 3.448 4.000 4.000 4.000 L 13.341 4.000 ZM 19.000 8.000 C 20.105 8.000 21.000 7.105 21.000 6.000 C 21.000 4.895 20.105 4.000 19.000 4.000 C 17.895 4.000 17.000 4.895 17.000 6.000 C 17.000 7.105 17.895 8.000 19.000 8.000 ZM 19.000 10.000 C 16.791 10.000 15.000 8.209 15.000 6.000 C 15.000 3.791 16.791 2.000 19.000 2.000 C 21.209 2.000 23.000 3.791 23.000 6.000 C 23.000 8.209 21.209 10.000 19.000 10.000 Z"),
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
        return _notificationBadgeLine!!
    }

private var _notificationBadgeLine: ImageVector? = null
