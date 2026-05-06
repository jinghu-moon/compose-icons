package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Movie2AiLine: ImageVector
    get() {
        if (_movie2AiLine != null) return _movie2AiLine!!
        _movie2AiLine = remixIcon(
            name = "Movie2AiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10h8v-2h-1.999c.757-.569 1.431-1.243 2-2C21.256 16.329 22 14.251 22 12c0-.403-.024-.8-.07-1.191l-1.986 .236c.037 .313 .056 .631 .056 .955 0 2.389-1.048 4.534-2.708 6C15.881 19.245 14.029 20 12 20 7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c.692 0 1.362 .088 2 .252l.498-1.937C13.699 2.109 12.861 2 12 2ZM10 8c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 6.895 13.105 6 12 6c-1.105 0-2 .895-2 2ZM6 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 10.895 9.105 10 8 10c-1.105 0-2 .895-2 2ZM14 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2ZM10 16c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2Z"),
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
        return _movie2AiLine!!
    }

private var _movie2AiLine: ImageVector? = null
