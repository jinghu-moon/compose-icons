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
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 10.298 22.000 8.695 21.575 7.292 20.825 L 2.000 22.000 L 3.176 16.710 C 2.426 15.306 2.000 13.703 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 13.335 4.326 14.618 4.940 15.766 L 5.290 16.420 L 4.634 19.366 L 7.582 18.712 L 8.235 19.061 C 9.383 19.675 10.666 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 12.000 7.000 C 13.657 7.000 15.000 8.343 15.000 10.000 L 15.000 11.000 L 16.000 11.000 L 16.000 16.000 L 8.000 16.000 L 8.000 11.000 L 9.000 11.000 L 9.000 10.000 C 9.000 8.343 10.343 7.000 12.000 7.000 ZM 14.000 13.000 L 10.000 13.000 L 10.000 14.000 L 14.000 14.000 L 14.000 13.000 ZM 12.000 9.000 C 11.448 9.000 11.000 9.450 11.000 10.000 L 11.000 11.000 L 13.000 11.000 L 13.000 10.000 C 13.000 9.448 12.552 9.000 12.000 9.000 Z"),
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
