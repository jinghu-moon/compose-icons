package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BookAiLine: ImageVector
    get() {
        if (_bookAiLine != null) return _bookAiLine!!
        _bookAiLine = remixIcon(
            name = "BookAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 4h-7c-.552 0-1 .448-1 1v10.337C5.455 15.121 5.963 15 6.5 15h12.5v-5h2v11c0 .552-.448 1-1 1h-13.5C4.567 22 3 20.433 3 18.5v-13.5c0-1.657 1.343-3 3-3h7v2ZM6.5 17C5.672 17 5 17.672 5 18.5 5 19.328 5.672 20 6.5 20h12.5v-3h-12.5ZM18.529 .329c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C17.848 6.129 17.055 5.326 16.067 4.887l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319C17.038 2.816 17.844 1.983 18.276 .941l.253-.611Z"),
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
        return _bookAiLine!!
    }

private var _bookAiLine: ImageVector? = null
