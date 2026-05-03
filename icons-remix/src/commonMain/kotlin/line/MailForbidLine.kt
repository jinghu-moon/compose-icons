package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailForbidLine: ImageVector
    get() {
        if (_mailForbidLine != null) return _mailForbidLine!!
        _mailForbidLine = remixIcon(
            name = "MailForbidLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 7.238 L 12.072 14.338 L 4.000 7.216 L 4.000 19.000 L 11.071 19.000 C 11.172 19.706 11.378 20.378 11.674 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 12.255 C 21.396 11.833 20.722 11.505 20.000 11.290 L 20.000 7.238 ZM 19.501 5.000 L 4.511 5.000 L 12.062 11.662 L 19.501 5.000 ZM 16.707 20.708 C 17.098 20.895 17.537 21.000 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 C 21.000 17.537 20.895 17.098 20.708 16.707 L 16.707 20.708 ZM 15.292 19.293 L 19.293 15.292 C 18.902 15.105 18.463 15.000 18.000 15.000 C 16.343 15.000 15.000 16.343 15.000 18.000 C 15.000 18.463 15.105 18.902 15.292 19.293 ZM 18.000 23.000 C 15.239 23.000 13.000 20.761 13.000 18.000 C 13.000 15.239 15.239 13.000 18.000 13.000 C 20.761 13.000 23.000 15.239 23.000 18.000 C 23.000 20.761 20.761 23.000 18.000 23.000 Z"),
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
        return _mailForbidLine!!
    }

private var _mailForbidLine: ImageVector? = null
