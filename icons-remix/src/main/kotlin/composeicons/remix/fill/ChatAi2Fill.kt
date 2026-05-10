package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatAi2Fill: ImageVector
    get() {
        if (_chatAi2Fill != null) return _chatAi2Fill!!
        _chatAi2Fill = remixIcon(
            name = "ChatAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.343 3C14.122 3.626 14 4.299 14 5 14 8.314 16.686 11 20 11c.701 0 1.374-.122 2-.343v7.343c0 .552-.448 1-1 1h-6.55L12 22.5 9.55 19h-6.55C2.448 19 2 18.552 2 18v-14C2 3.448 2.448 3 3 3h11.343ZM19.529 1.319c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.759 .338c-.988 .439-1.779 1.243-2.219 2.251l-.247 .565c-.181 .414-.753 .414-.934 0l-.247-.565C18.847 7.119 18.055 6.316 17.067 5.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _chatAi2Fill!!
    }

private var _chatAi2Fill: ImageVector? = null
