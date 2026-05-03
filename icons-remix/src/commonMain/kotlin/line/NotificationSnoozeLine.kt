package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NotificationSnoozeLine: ImageVector
    get() {
        if (_notificationSnoozeLine != null) return _notificationSnoozeLine!!
        _notificationSnoozeLine = remixIcon(
            name = "NotificationSnoozeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 17.000 L 20.000 17.000 L 20.000 10.000 C 20.000 5.582 16.418 2.000 12.000 2.000 C 7.582 2.000 4.000 5.582 4.000 10.000 L 4.000 17.000 L 2.000 17.000 L 2.000 19.000 L 22.000 19.000 L 22.000 17.000 ZM 18.000 10.000 L 18.000 17.000 L 6.000 17.000 L 6.000 10.000 C 6.000 6.686 8.686 4.000 12.000 4.000 C 15.314 4.000 18.000 6.686 18.000 10.000 ZM 15.000 23.000 L 15.000 21.000 L 9.000 21.000 L 9.000 23.000 L 15.000 23.000 ZM 9.000 9.000 L 12.586 9.000 L 9.000 12.586 L 9.000 15.000 L 15.000 15.000 L 15.000 13.000 L 11.414 13.000 L 15.000 9.414 L 15.000 7.000 L 9.000 7.000 L 9.000 9.000 Z"),
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
        return _notificationSnoozeLine!!
    }

private var _notificationSnoozeLine: ImageVector? = null
