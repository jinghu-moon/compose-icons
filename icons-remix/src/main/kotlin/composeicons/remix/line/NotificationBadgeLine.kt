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
                pathData = parseSvgPathData("M13.341 4C13.12 4.626 13 5.299 13 6h-8v14h14v-8c.701 0 1.374-.12 2-.341v9.341c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-16C3 4.448 3.448 4 4 4h9.341ZM19 8c1.105 0 2-.895 2-2C21 4.895 20.105 4 19 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM19 10C16.791 10 15 8.209 15 6 15 3.791 16.791 2 19 2c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4Z"),
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
