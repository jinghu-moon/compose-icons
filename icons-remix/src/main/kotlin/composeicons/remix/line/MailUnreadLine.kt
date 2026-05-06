package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailUnreadLine: ImageVector
    get() {
        if (_mailUnreadLine != null) return _mailUnreadLine!!
        _mailUnreadLine = remixIcon(
            name = "MailUnreadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.1 3C16.034 3.323 16 3.658 16 4c0 .342 .034 .677 .1 1h-11.589l7.55 6.662L17.11 7.141c.427 .527 .958 .966 1.563 1.285l-6.601 5.911L4 7.216v11.784h16v-10.1c.323 .066 .657 .1 1 .1 .343 0 .677-.034 1-.1v11.1c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h13.1ZM21 1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C19.343 7 18 5.657 18 4 18 2.343 19.343 1 21 1Z"),
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
        return _mailUnreadLine!!
    }

private var _mailUnreadLine: ImageVector? = null
