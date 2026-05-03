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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.803 8.493 C 19.466 8.818 20.212 9.000 21.000 9.000 C 21.343 9.000 21.677 8.966 22.000 8.900 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 16.100 3.000 C 16.034 3.323 16.000 3.658 16.000 4.000 C 16.000 5.237 16.449 6.369 17.193 7.241 L 12.061 11.683 L 5.647 6.238 L 4.353 7.762 L 12.073 14.317 L 18.803 8.493 ZM 21.000 7.000 C 19.343 7.000 18.000 5.657 18.000 4.000 C 18.000 2.343 19.343 1.000 21.000 1.000 C 22.657 1.000 24.000 2.343 24.000 4.000 C 24.000 5.657 22.657 7.000 21.000 7.000 Z"),
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
        return _mailUnreadFill!!
    }

private var _mailUnreadFill: ImageVector? = null
