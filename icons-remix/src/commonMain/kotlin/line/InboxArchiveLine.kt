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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 3.000 L 22.000 7.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 7.004 L 4.000 3.000 L 20.000 3.000 ZM 20.000 9.000 L 4.000 9.000 L 4.000 19.000 L 20.000 19.000 L 20.000 9.000 ZM 13.000 10.000 L 13.000 14.000 L 16.000 14.000 L 12.000 18.000 L 8.000 14.000 L 11.000 14.000 L 11.000 10.000 L 13.000 10.000 ZM 18.764 5.000 L 5.237 5.000 L 4.237 7.000 L 19.764 7.000 L 18.764 5.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _inboxArchiveLine!!
    }

private var _inboxArchiveLine: ImageVector? = null
