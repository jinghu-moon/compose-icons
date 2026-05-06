package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatAiLine: ImageVector
    get() {
        if (_chatAiLine != null) return _chatAiLine!!
        _chatAiLine = remixIcon(
            name = "ChatAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM10 3h4v2h-4C6.686 5 4 7.686 4 11c0 3.61 2.462 5.966 8 8.48v-2.48h2c3.314 0 6-2.686 6-6h2c0 4.418-3.582 8-8 8v3.5C9 20.5 2 17.5 2 11 2 6.582 5.582 3 10 3Z"),
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
        return _chatAiLine!!
    }

private var _chatAiLine: ImageVector? = null
