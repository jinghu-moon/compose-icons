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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 7.238l-7.928 7.1L4 7.216v11.784h7.071c.101 .706 .307 1.378 .603 2h-8.674C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v8.255c-.604-.421-1.278-.75-2-.965v-4.052ZM19.501 5h-14.99l7.55 6.662L19.501 5ZM16.707 20.708c.392 .187 .83 .292 1.293 .292 1.657 0 3-1.343 3-3 0-.463-.105-.902-.292-1.293l-4.001 4.001ZM15.292 19.293l4.001-4.001C18.902 15.105 18.463 15 18 15c-1.657 0-3 1.343-3 3 0 .463 .105 .902 .292 1.293ZM18 23c-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5Z"),
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
        return _mailForbidLine!!
    }

private var _mailForbidLine: ImageVector? = null
