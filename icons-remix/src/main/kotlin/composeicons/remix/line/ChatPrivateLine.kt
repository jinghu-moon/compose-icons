package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatPrivateLine: ImageVector
    get() {
        if (_chatPrivateLine != null) return _chatPrivateLine!!
        _chatPrivateLine = remixIcon(
            name = "ChatPrivateLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C10.298 22 8.695 21.575 7.292 20.825L2 22 3.176 16.71C2.426 15.306 2 13.703 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 1.335 .326 2.618 .94 3.766l.35 .654-.655 2.946 2.947-.655 .653 .349C9.383 19.675 10.666 20 12 20c4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM12 7c1.657 0 3 1.343 3 3v1h1v5h-8v-5h1v-1C9 8.343 10.343 7 12 7ZM14 13h-4v1h4v-1ZM12 9c-.552 0-1 .45-1 1v1h2v-1C13 9.448 12.552 9 12 9Z"),
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
        return _chatPrivateLine!!
    }

private var _chatPrivateLine: ImageVector? = null
