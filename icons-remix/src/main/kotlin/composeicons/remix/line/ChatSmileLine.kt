package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSmileLine: ImageVector
    get() {
        if (_chatSmileLine != null) return _chatSmileLine!!
        _chatSmileLine = remixIcon(
            name = "ChatSmileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.455 19 2 22.5v-18.5C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14.545ZM5.763 17h14.237v-12h-16v13.385L5.763 17ZM7 10h2c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3h2c0 2.761-2.239 5-5 5C9.239 15 7 12.761 7 10Z"),
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
        return _chatSmileLine!!
    }

private var _chatSmileLine: ImageVector? = null
