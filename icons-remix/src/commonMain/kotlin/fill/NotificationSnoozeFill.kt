package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NotificationSnoozeFill: ImageVector
    get() {
        if (_notificationSnoozeFill != null) return _notificationSnoozeFill!!
        _notificationSnoozeFill = remixIcon(
            name = "NotificationSnoozeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 17.000 L 20.000 17.000 L 20.000 10.000 C 20.000 5.582 16.418 2.000 12.000 2.000 C 7.582 2.000 4.000 5.582 4.000 10.000 L 4.000 17.000 L 2.000 17.000 L 2.000 19.000 L 22.000 19.000 L 22.000 17.000 ZM 15.000 23.000 L 15.000 21.000 L 9.000 21.000 L 9.000 23.000 L 15.000 23.000 ZM 9.000 9.000 L 9.000 7.000 L 15.000 7.000 L 15.000 9.414 L 11.414 13.000 L 15.000 13.000 L 15.000 15.000 L 9.000 15.000 L 9.000 12.586 L 12.586 9.000 L 9.000 9.000 Z"),
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
        return _notificationSnoozeFill!!
    }

private var _notificationSnoozeFill: ImageVector? = null
