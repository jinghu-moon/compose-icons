package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatAi3Line: ImageVector
    get() {
        if (_chatAi3Line != null) return _chatAi3Line!!
        _chatAi3Line = remixIcon(
            name = "ChatAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.863 0 1.701 .11 2.5 .315L14 4.252c-.639-.165-1.309-.252-2-.252C7.582 4 4 7.582 4 12c0 1.334 .326 2.617 .939 3.766l.35 .653-.655 2.947 2.947-.655 .653 .35C9.383 19.674 10.666 20 12 20c4.418 0 8-3.582 8-8 0-.323-.02-.641-.057-.954l1.986-.236c.046 .39 .07 .788 .07 1.191 0 5.523-4.477 10-10 10C10.297 22 8.694 21.575 7.291 20.824L2 22 3.176 16.709C2.425 15.306 2 13.703 2 12 2 6.477 6.477 2 12 2ZM19.529 1.319c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.759 .338c-.988 .439-1.779 1.243-2.219 2.251l-.247 .565c-.181 .414-.753 .414-.934 0l-.247-.565C18.847 7.119 18.055 6.316 17.067 5.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _chatAi3Line!!
    }

private var _chatAi3Line: ImageVector? = null
