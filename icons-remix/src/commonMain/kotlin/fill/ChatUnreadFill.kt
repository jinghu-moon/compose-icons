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
                pathData = parseSvgPathData("M 21.000 7.000 C 22.657 7.000 24.000 5.657 24.000 4.000 C 24.000 2.343 22.657 1.000 21.000 1.000 C 19.343 1.000 18.000 2.343 18.000 4.000 C 18.000 5.657 19.343 7.000 21.000 7.000 ZM 21.000 9.000 C 21.343 9.000 21.677 8.966 22.000 8.900 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 16.100 3.000 C 16.034 3.323 16.000 3.658 16.000 4.000 C 16.000 6.761 18.239 9.000 21.000 9.000 Z"),
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
