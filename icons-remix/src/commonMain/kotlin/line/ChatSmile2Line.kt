package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSmile2Line: ImageVector
    get() {
        if (_chatSmile2Line != null) return _chatSmile2Line!!
        _chatSmile2Line = remixIcon(
            name = "ChatSmile2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.291 20.824 L 2.000 22.000 L 3.176 16.709 C 2.425 15.306 2.000 13.703 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 10.297 22.000 8.694 21.575 7.291 20.824 ZM 7.581 18.711 L 8.234 19.060 C 9.382 19.674 10.665 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 13.335 4.325 14.618 4.939 15.766 L 5.289 16.419 L 4.634 19.366 L 7.581 18.711 ZM 7.000 12.000 L 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 L 17.000 12.000 C 17.000 14.761 14.761 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 Z"),
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
        return _chatSmile2Line!!
    }

private var _chatSmile2Line: ImageVector? = null
