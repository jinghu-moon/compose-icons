package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatAi3Fill: ImageVector
    get() {
        if (_chatAi3Fill != null) return _chatAi3Fill!!
        _chatAi3Fill = remixIcon(
            name = "ChatAi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.906 0 1.783 .122 2.617 .348C14.222 3.147 14 4.048 14 5 14 8.314 16.686 11 20 11c.669 0 1.311-.112 1.911-.314 .056 .43 .089 .868 .089 1.314 0 5.523-4.477 10-10 10C10.297 22 8.694 21.575 7.291 20.824L2 22 3.176 16.709C2.425 15.306 2 13.703 2 12 2 6.477 6.477 2 12 2ZM19.529 1.319c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.759 .338c-.988 .439-1.779 1.243-2.219 2.251l-.247 .565c-.181 .414-.753 .414-.934 0l-.247-.565C18.847 7.119 18.055 6.316 17.067 5.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _chatAi3Fill!!
    }

private var _chatAi3Fill: ImageVector? = null
