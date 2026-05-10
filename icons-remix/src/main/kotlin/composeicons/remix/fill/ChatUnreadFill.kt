package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatUnreadFill: ImageVector
    get() {
        if (_chatUnreadFill != null) return _chatUnreadFill!!
        _chatUnreadFill = remixIcon(
            name = "ChatUnreadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 7c1.657 0 3-1.343 3-3C24 2.343 22.657 1 21 1 19.343 1 18 2.343 18 4c0 1.657 1.343 3 3 3ZM21 9c.343 0 .677-.034 1-.1v9.1c0 .552-.448 1-1 1h-14.545L2 22.5v-18.5C2 3.448 2.448 3 3 3h13.1C16.034 3.323 16 3.658 16 4c0 2.761 2.239 5 5 5Z"),
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
        return _chatUnreadFill!!
    }

private var _chatUnreadFill: ImageVector? = null
