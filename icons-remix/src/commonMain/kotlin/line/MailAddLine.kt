package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailAddLine: ImageVector
    get() {
        if (_mailAddLine != null) return _mailAddLine!!
        _mailAddLine = remixIcon(
            name = "MailAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 13.000 L 20.000 13.000 L 20.000 7.238 L 12.072 14.338 L 4.000 7.216 L 4.000 19.000 L 14.000 19.000 L 14.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 13.000 ZM 4.511 5.000 L 12.062 11.662 L 19.501 5.000 L 4.511 5.000 ZM 21.000 18.000 L 24.000 18.000 L 24.000 20.000 L 21.000 20.000 L 21.000 23.000 L 19.000 23.000 L 19.000 20.000 L 16.000 20.000 L 16.000 18.000 L 19.000 18.000 L 19.000 15.000 L 21.000 15.000 L 21.000 18.000 Z"),
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
        return _mailAddLine!!
    }

private var _mailAddLine: ImageVector? = null
