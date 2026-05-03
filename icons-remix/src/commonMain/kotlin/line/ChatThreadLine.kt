package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatThreadLine: ImageVector
    get() {
        if (_chatThreadLine != null) return _chatThreadLine!!
        _chatThreadLine = remixIcon(
            name = "ChatThreadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 22.000 L 7.291 20.824 C 8.694 21.575 10.297 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 13.703 2.425 15.306 3.176 16.709 L 2.000 22.000 ZM 8.234 19.060 L 7.581 18.711 L 4.634 19.366 L 5.289 16.419 L 4.939 15.766 C 4.325 14.618 4.000 13.335 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 10.665 20.000 9.382 19.674 8.234 19.060 ZM 15.449 7.000 L 13.441 7.000 L 13.266 9.000 L 11.258 9.000 L 11.433 7.000 L 9.426 7.000 L 9.251 9.000 L 7.000 9.000 L 7.000 11.000 L 9.076 11.000 L 8.901 13.000 L 7.000 13.000 L 7.000 15.000 L 8.726 15.000 L 8.551 17.000 L 10.559 17.000 L 10.733 15.000 L 12.741 15.000 L 12.566 17.000 L 14.574 17.000 L 14.749 15.000 L 17.000 15.000 L 17.000 13.000 L 14.924 13.000 L 15.099 11.000 L 17.000 11.000 L 17.000 9.000 L 15.274 9.000 L 15.449 7.000 ZM 11.083 11.000 L 13.091 11.000 L 12.916 13.000 L 10.908 13.000 L 11.083 11.000 Z"),
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
        return _chatThreadLine!!
    }

private var _chatThreadLine: ImageVector? = null
