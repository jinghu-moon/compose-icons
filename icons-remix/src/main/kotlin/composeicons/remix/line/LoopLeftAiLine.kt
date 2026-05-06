package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoopLeftAiLine: ImageVector
    get() {
        if (_loopLeftAiLine != null) return _loopLeftAiLine!!
        _loopLeftAiLine = remixIcon(
            name = "LoopLeftAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 12c0 4.418 3.582 8 8 8 2.748 0 5.175-1.386 6.615-3.5h-2.615v-2h6v6h-2v-2.499C18.176 20.429 15.272 22 12 22 6.477 22 2 17.523 2 12h2ZM11.529 8.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.18 .414-.753 .414-.934 0l-.246-.566C10.848 14.119 10.055 13.316 9.067 12.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM12 2c5.523 0 10 4.477 10 10h-2C20 7.582 16.418 4 12 4 9.252 4 6.825 5.386 5.385 7.5h2.615v2h-6v-6h2v2.499C5.824 3.571 8.728 2 12 2Z"),
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
        return _loopLeftAiLine!!
    }

private var _loopLeftAiLine: ImageVector? = null
