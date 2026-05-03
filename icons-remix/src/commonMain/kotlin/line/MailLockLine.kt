package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailLockLine: ImageVector
    get() {
        if (_mailLockLine != null) return _mailLockLine!!
        _mailLockLine = remixIcon(
            name = "MailLockLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 7.238 L 12.072 14.338 L 4.000 7.216 L 4.000 19.000 L 13.000 19.000 L 13.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 11.000 L 20.000 11.000 L 20.000 7.238 ZM 19.501 5.000 L 4.511 5.000 L 12.062 11.662 L 19.501 5.000 ZM 22.000 17.000 L 23.000 17.000 L 23.000 22.000 L 15.000 22.000 L 15.000 17.000 L 16.000 17.000 L 16.000 16.000 C 16.000 14.343 17.343 13.000 19.000 13.000 C 20.657 13.000 22.000 14.343 22.000 16.000 L 22.000 17.000 ZM 20.000 17.000 L 20.000 16.000 C 20.000 15.448 19.552 15.000 19.000 15.000 C 18.448 15.000 18.000 15.448 18.000 16.000 L 18.000 17.000 L 20.000 17.000 Z"),
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
        return _mailLockLine!!
    }

private var _mailLockLine: ImageVector? = null
