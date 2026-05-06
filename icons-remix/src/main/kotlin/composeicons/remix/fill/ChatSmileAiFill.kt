package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatSmileAiFill: ImageVector
    get() {
        if (_chatSmileAiFill != null) return _chatSmileAiFill!!
        _chatSmileAiFill = remixIcon(
            name = "ChatSmileAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM20 11c.67 0 1.313-.11 1.915-.312 .056 .429 .085 .867 .085 1.312 0 5.523-4.477 10-10 10C10.297 22 8.694 21.575 7.291 20.824L2 22 3.176 16.709C2.425 15.306 2 13.703 2 12 2 6.477 6.477 2 12 2c.906 0 1.783 .12 2.617 .346C14.222 3.146 14 4.047 14 5c0 3.314 2.686 6 6 6ZM7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5h-2c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12h-2Z"),
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
        return _chatSmileAiFill!!
    }

private var _chatSmileAiFill: ImageVector? = null
