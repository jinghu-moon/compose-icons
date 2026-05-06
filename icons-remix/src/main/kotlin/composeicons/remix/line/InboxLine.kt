package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InboxLine: ImageVector
    get() {
        if (_inboxLine != null) return _inboxLine!!
        _inboxLine = remixIcon(
            name = "InboxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18ZM7.416 14h-3.416v5h16v-5h-3.416c-.772 1.766-2.534 3-4.584 3C9.95 17 8.188 15.766 7.416 14ZM20 5h-16v7h5c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h5v-7Z"),
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
        return _inboxLine!!
    }

private var _inboxLine: ImageVector? = null
