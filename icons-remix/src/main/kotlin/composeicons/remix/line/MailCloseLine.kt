package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailCloseLine: ImageVector
    get() {
        if (_mailCloseLine != null) return _mailCloseLine!!
        _mailCloseLine = remixIcon(
            name = "MailCloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 14h-2v-6.762l-7.928 7.1L4 7.216v11.784h11v2h-12C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v10ZM4.511 5l7.55 6.662L19.501 5h-14.99ZM21.414 19l2.121 2.121-1.414 1.414L20 20.414l-2.121 2.121L16.465 21.121 18.586 19 16.465 16.879l1.414-1.414L20 17.586l2.121-2.121 1.414 1.414L21.414 19Z"),
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
        return _mailCloseLine!!
    }

private var _mailCloseLine: ImageVector? = null
