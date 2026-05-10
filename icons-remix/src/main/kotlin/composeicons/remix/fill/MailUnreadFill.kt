package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailUnreadFill: ImageVector
    get() {
        if (_mailUnreadFill != null) return _mailUnreadFill!!
        _mailUnreadFill = remixIcon(
            name = "MailUnreadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.803 8.493C19.466 8.818 20.212 9 21 9c.343 0 .677-.034 1-.1v11.1c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h13.1C16.034 3.323 16 3.658 16 4c0 1.237 .449 2.369 1.193 3.241l-5.132 4.441L5.647 6.238 4.353 7.762l7.72 6.555L18.803 8.493ZM21 7C19.343 7 18 5.657 18 4 18 2.343 19.343 1 21 1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z"),
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
        return _mailUnreadFill!!
    }

private var _mailUnreadFill: ImageVector? = null
