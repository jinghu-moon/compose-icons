package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoopRightAiLine: ImageVector
    get() {
        if (_loopRightAiLine != null) return _loopRightAiLine!!
        _loopRightAiLine = remixIcon(
            name = "LoopRightAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c0 5.523-4.477 10-10 10C8.728 22 5.824 20.429 4 18.001v2.499h-2v-6h6v2h-2.615C6.825 18.614 9.252 20 12 20c4.418 0 8-3.582 8-8h2ZM11.529 8.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.18 .414-.753 .414-.934 0l-.246-.566C10.848 14.119 10.055 13.316 9.067 12.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM12 2c3.272 0 6.176 1.571 8 3.999v-2.499h2v6h-6v-2h2.615C17.175 5.386 14.748 4 12 4 7.582 4 4 7.582 4 12h-2C2 6.477 6.477 2 12 2Z"),
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
        return _loopRightAiLine!!
    }

private var _loopRightAiLine: ImageVector? = null
