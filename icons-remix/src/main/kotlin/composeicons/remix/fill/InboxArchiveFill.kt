package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InboxArchiveFill: ImageVector
    get() {
        if (_inboxArchiveFill != null) return _inboxArchiveFill!!
        _inboxArchiveFill = remixIcon(
            name = "InboxArchiveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3h16l2 4v13c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-12.996L4 3ZM13 14v-4h-2v4h-3l4 4 4-4h-3ZM19.764 7l-1-2h-13.527L4.237 7h15.526Z"),
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
        return _inboxArchiveFill!!
    }

private var _inboxArchiveFill: ImageVector? = null
