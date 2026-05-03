package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatHistoryLine: ImageVector
    get() {
        if (_chatHistoryLine != null) return _chatHistoryLine!!
        _chatHistoryLine = remixIcon(
            name = "ChatHistoryLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 10.298 22.000 8.695 21.575 7.292 20.825 L 2.000 22.000 L 3.176 16.710 C 2.426 15.306 2.000 13.703 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 13.335 4.326 14.618 4.940 15.766 L 5.290 16.420 L 4.634 19.366 L 7.582 18.712 L 8.235 19.061 C 9.383 19.675 10.666 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 13.000 7.000 L 13.000 12.000 L 17.000 12.000 L 17.000 14.000 L 11.000 14.000 L 11.000 7.000 L 13.000 7.000 Z"),
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
        return _chatHistoryLine!!
    }

private var _chatHistoryLine: ImageVector? = null
