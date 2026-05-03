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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.100 3.000 C 16.034 3.323 16.000 3.658 16.000 4.000 C 16.000 4.342 16.034 4.677 16.100 5.000 L 4.511 5.000 L 12.062 11.662 L 17.110 7.141 C 17.536 7.669 18.068 8.108 18.673 8.427 L 12.072 14.338 L 4.000 7.216 L 4.000 19.000 L 20.000 19.000 L 20.000 8.900 C 20.323 8.966 20.657 9.000 21.000 9.000 C 21.343 9.000 21.677 8.966 22.000 8.900 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 16.100 3.000 ZM 21.000 1.000 C 22.657 1.000 24.000 2.343 24.000 4.000 C 24.000 5.657 22.657 7.000 21.000 7.000 C 19.343 7.000 18.000 5.657 18.000 4.000 C 18.000 2.343 19.343 1.000 21.000 1.000 Z"),
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
        return _mailUnreadLine!!
    }

private var _mailUnreadLine: ImageVector? = null
