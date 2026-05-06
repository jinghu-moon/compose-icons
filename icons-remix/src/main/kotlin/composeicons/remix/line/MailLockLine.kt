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
                pathData = parseSvgPathData("M20 7.238l-7.928 7.1L4 7.216v11.784h9v2h-10C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v7h-2v-3.762ZM19.501 5h-14.99l7.55 6.662L19.501 5ZM22 17h1v5h-8v-5h1v-1c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3v1ZM20 17v-1c0-.552-.448-1-1-1-.552 0-1 .448-1 1v1h2Z"),
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
