package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatUnreadLine: ImageVector
    get() {
        if (_chatUnreadLine != null) return _chatUnreadLine!!
        _chatUnreadLine = remixIcon(
            name = "ChatUnreadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 7c1.657 0 3-1.343 3-3C24 2.343 22.657 1 21 1 19.343 1 18 2.343 18 4c0 1.657 1.343 3 3 3ZM22 18v-9.1C21.677 8.966 21.343 9 21 9c-.343 0-.677-.034-1-.1v8.1h-14.237L4 18.385v-13.385h12.1C16.034 4.677 16 4.342 16 4c0-.342 .034-.677 .1-1h-13.1C2.448 3 2 3.448 2 4v18.5L6.455 19h14.545c.552 0 1-.448 1-1Z"),
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
        return _chatUnreadLine!!
    }

private var _chatUnreadLine: ImageVector? = null
