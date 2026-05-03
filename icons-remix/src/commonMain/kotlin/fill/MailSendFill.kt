package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailSendFill: ImageVector
    get() {
        if (_mailSendFill != null) return _mailSendFill!!
        _mailSendFill = remixIcon(
            name = "MailSendFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 5.500 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 19.000 L 20.000 19.000 L 20.000 7.300 L 12.000 14.500 L 2.000 5.500 ZM 0.000 10.000 L 5.000 10.000 L 5.000 12.000 L 0.000 12.000 L 0.000 10.000 ZM 0.000 15.000 L 8.000 15.000 L 8.000 17.000 L 0.000 17.000 L 0.000 15.000 Z"),
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
        return _mailSendFill!!
    }

private var _mailSendFill: ImageVector? = null
