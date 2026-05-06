package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSmileAi3Line: ImageVector
    get() {
        if (_chatSmileAi3Line != null) return _chatSmileAi3Line!!
        _chatSmileAi3Line = remixIcon(
            name = "ChatSmileAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.863 0 1.701 .11 2.5 .315L14 4.252c-.639-.165-1.309-.252-2-.252C7.582 4 4 7.582 4 12c0 2.152 .851 4.165 2.343 5.657l1.415 1.414L6.828 20h5.172c4.418 0 8-3.582 8-8 0-.323-.019-.642-.057-.955l1.986-.235c.046 .39 .07 .788 .07 1.191 0 5.523-4.477 10-10 10h-10L4.929 19.071C3.119 17.262 2 14.761 2 12 2 6.477 6.477 2 12 2ZM16 13c0 2.209-1.791 4-4 4C9.791 17 8 15.209 8 13h8ZM19.529 1.319c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.759 .338c-.988 .439-1.779 1.243-2.219 2.251l-.247 .565c-.181 .414-.753 .414-.934 0l-.247-.565C18.847 7.119 18.055 6.316 17.067 5.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _chatSmileAi3Line!!
    }

private var _chatSmileAi3Line: ImageVector? = null
