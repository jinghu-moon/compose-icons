package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailSendLine: ImageVector
    get() {
        if (_mailSendLine != null) return _mailSendLine!!
        _mailSendLine = remixIcon(
            name = "MailSendLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 19.000 L 20.000 19.000 L 20.000 7.300 L 12.000 14.500 L 2.000 5.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 ZM 8.000 15.000 L 8.000 17.000 L 0.000 17.000 L 0.000 15.000 L 8.000 15.000 ZM 5.000 10.000 L 5.000 12.000 L 0.000 12.000 L 0.000 10.000 L 5.000 10.000 ZM 19.566 5.000 L 4.434 5.000 L 12.000 11.809 L 19.566 5.000 Z"),
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
        return _mailSendLine!!
    }

private var _mailSendLine: ImageVector? = null
