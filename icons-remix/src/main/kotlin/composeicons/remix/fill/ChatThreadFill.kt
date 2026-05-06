package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatThreadFill: ImageVector
    get() {
        if (_chatThreadFill != null) return _chatThreadFill!!
        _chatThreadFill = remixIcon(
            name = "ChatThreadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 22 7.291 20.824C8.694 21.575 10.297 22 12 22c5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12c0 1.703 .425 3.306 1.176 4.709L2 22ZM15.449 7l-.175 2h1.726v2h-1.901l-.175 2h2.076v2h-2.251L14.574 17h-2.008l.175-2h-2.008L10.559 17h-2.008l.175-2h-1.726v-2h1.901l.175-2h-2.076v-2h2.251L9.426 7h2.008l-.175 2h2.008L13.441 7h2.008ZM11.083 11l-.175 2h2.008l.175-2h-2.008Z"),
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
        return _chatThreadFill!!
    }

private var _chatThreadFill: ImageVector? = null
