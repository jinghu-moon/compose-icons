package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BrushAi3Line: ImageVector
    get() {
        if (_brushAi3Line != null) return _brushAi3Line!!
        _brushAi3Line = remixIcon(
            name = "BrushAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.997h-4v4h-6v3h16v-.997h2v2.997h-1v8c-0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-8h-1v-6c0-.552 .448-1 1-1h5v-3C8 2.445 8.448 1.996 9 1.996h5v2.001ZM5 19.997h3v-5h2v5h9v-7h-14v7ZM18.529 1.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C17.848 7.119 17.055 6.316 16.067 5.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _brushAi3Line!!
    }

private var _brushAi3Line: ImageVector? = null
