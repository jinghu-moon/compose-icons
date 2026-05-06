package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InboxUnarchiveFill: ImageVector
    get() {
        if (_inboxUnarchiveFill != null) return _inboxUnarchiveFill!!
        _inboxUnarchiveFill = remixIcon(
            name = "InboxUnarchiveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3l2 4v13c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-12.996L4 3h16ZM12 10 8 14h3v4h2v-4h3L12 10ZM18.764 5h-13.528L4.237 7h15.527l-1-2Z"),
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
        return _inboxUnarchiveFill!!
    }

private var _inboxUnarchiveFill: ImageVector? = null
