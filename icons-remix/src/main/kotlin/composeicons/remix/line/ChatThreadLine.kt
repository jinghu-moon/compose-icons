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
                pathData = parseSvgPathData("M2 22 7.291 20.824C8.694 21.575 10.297 22 12 22c5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12c0 1.703 .425 3.306 1.176 4.709L2 22ZM8.234 19.06l-.654-.349-2.947 .655 .655-2.947-.349-.654C4.325 14.618 4 13.335 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-1.335 0-2.618-.326-3.766-.94ZM15.449 7h-2.008l-.175 2h-2.008L11.433 7h-2.008L9.251 9h-2.251v2h2.076l-.175 2h-1.901v2h1.726L8.551 17h2.008l.175-2h2.008L12.566 17h2.008l.175-2h2.251v-2h-2.076l.175-2h1.901v-2h-1.726L15.449 7ZM11.083 11h2.008l-.175 2h-2.008l.175-2Z"),
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
