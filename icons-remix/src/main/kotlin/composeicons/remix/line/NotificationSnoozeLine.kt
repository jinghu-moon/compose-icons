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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 17h-2v-7C20 5.582 16.418 2 12 2 7.582 2 4 5.582 4 10v7h-2v2h20v-2ZM18 10v7h-12v-7C6 6.686 8.686 4 12 4c3.314 0 6 2.686 6 6ZM15 23v-2h-6v2h6ZM9 9h3.586L9 12.586v2.414h6v-2h-3.586L15 9.414v-2.414h-6v2Z"),
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
        return _notificationSnoozeLine!!
    }

private var _notificationSnoozeLine: ImageVector? = null
