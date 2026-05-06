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
                pathData = parseSvgPathData("M22 17h-2v-7C20 5.582 16.418 2 12 2 7.582 2 4 5.582 4 10v7h-2v2h20v-2ZM15 23v-2h-6v2h6ZM9 9v-2h6v2.414L11.414 13h3.586v2h-6v-2.414L12.586 9h-3.586Z"),
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
