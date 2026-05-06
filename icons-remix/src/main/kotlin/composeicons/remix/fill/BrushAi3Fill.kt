package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BrushAi3Fill: ImageVector
    get() {
        if (_brushAi3Fill != null) return _brushAi3Fill!!
        _brushAi3Fill = remixIcon(
            name = "BrushAi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 3.997h-3v4h-6v3h16v-.997h2v2.997h-1v8c-0 .552-.448 1-1 1h-10v-6h-2v6h-4c-.552 0-1-.448-1-1v-8h-1v-6C2 6.445 2.448 5.997 3 5.997h5v-3c0-.552 .448-1 1-1h4v2ZM18.529 1.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C17.848 7.119 17.055 6.316 16.067 5.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _brushAi3Fill!!
    }

private var _brushAi3Fill: ImageVector? = null
