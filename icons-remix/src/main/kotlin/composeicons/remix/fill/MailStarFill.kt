package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailStarFill: ImageVector
    get() {
        if (_mailStarFill != null) return _mailStarFill!!
        _mailStarFill = remixIcon(
            name = "MailStarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 14.044c-.761-.349-1.608-.544-2.5-.544-3.314 0-6 2.686-6 6 0 .518 .066 1.021 .189 1.5h-10.689C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v10.044ZM12.061 11.683 5.647 6.238 4.353 7.762l7.72 6.555L19.654 7.756 18.346 6.244l-6.285 5.439ZM19.5 21.75l-2.645 1.391 .505-2.945L15.22 18.109l2.957-.43L19.5 15l1.323 2.68 2.957 .43-2.14 2.086 .505 2.945L19.5 21.75Z"),
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
        return _mailStarFill!!
    }

private var _mailStarFill: ImageVector? = null
