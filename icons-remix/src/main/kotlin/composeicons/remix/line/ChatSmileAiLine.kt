package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSmileAiLine: ImageVector
    get() {
        if (_chatSmileAiLine != null) return _chatSmileAiLine!!
        _chatSmileAiLine = remixIcon(
            name = "ChatSmileAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM12 2C6.477 2 2 6.477 2 12c0 1.703 .425 3.306 1.176 4.709L2 22 7.291 20.824C8.694 21.575 10.297 22 12 22c5.523 0 10-4.477 10-10 0-.403-.024-.8-.07-1.191l-1.986 .236c.037 .313 .056 .631 .056 .955 0 4.418-3.582 8-8 8-1.335 0-2.618-.326-3.766-.94l-.654-.349-2.947 .655 .655-2.947-.349-.654C4.325 14.618 4 13.335 4 12 4 7.582 7.582 4 12 4c.692 0 1.362 .088 2 .252l.498-1.937C13.699 2.109 12.861 2 12 2ZM9 12h-2c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5h-2c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12Z"),
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
        return _chatSmileAiLine!!
    }

private var _chatSmileAiLine: ImageVector? = null
