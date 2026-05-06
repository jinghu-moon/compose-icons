package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailStarLine: ImageVector
    get() {
        if (_mailStarLine != null) return _mailStarLine!!
        _mailStarLine = remixIcon(
            name = "MailStarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 13h-2v-5.762l-7.928 7.1L4 7.216v11.784h10v2h-11C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v9ZM4.511 5l7.55 6.662L19.501 5h-14.99ZM19.5 21.75l-2.645 1.391 .505-2.945L15.22 18.109l2.957-.43L19.5 15l1.323 2.68 2.957 .43-2.14 2.086 .505 2.945L19.5 21.75Z"),
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
        return _mailStarLine!!
    }

private var _mailStarLine: ImageVector? = null
