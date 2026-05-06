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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v16.007c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-1.007h18v-11.7l-8 7.2L2 5.5v-1.5C2 3.448 2.448 3 3 3h18ZM8 15v2h-8v-2h8ZM5 10v2h-5v-2h5ZM19.566 5h-15.132L12 11.809 19.566 5Z"),
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
        return _mailSendLine!!
    }

private var _mailSendLine: ImageVector? = null
