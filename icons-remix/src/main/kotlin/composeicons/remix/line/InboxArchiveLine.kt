package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InboxArchiveLine: ImageVector
    get() {
        if (_inboxArchiveLine != null) return _inboxArchiveLine!!
        _inboxArchiveLine = remixIcon(
            name = "InboxArchiveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3l2 4v13c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-12.996L4 3h16ZM20 9h-16v10h16v-10ZM13 10v4h3l-4 4L8 14h3v-4h2ZM18.764 5h-13.527L4.237 7h15.526l-1-2Z"),
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
        return _inboxArchiveLine!!
    }

private var _inboxArchiveLine: ImageVector? = null
