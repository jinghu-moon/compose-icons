package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MouseLine: ImageVector
    get() {
        if (_mouseLine != null) return _mouseLine!!
        _mouseLine = remixIcon(
            name = "MouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.141 4C9.559 4 8.754 4.169 8.013 4.565 7.383 4.902 6.902 5.383 6.565 6.013 6.169 6.754 6 7.559 6 9.141v5.718c0 1.582 .169 2.388 .565 3.128 .337 .629 .818 1.111 1.448 1.448 .741 .396 1.546 .565 3.128 .565h1.718c1.582 0 2.387-.169 3.128-.565 .629-.337 1.111-.818 1.448-1.448 .396-.741 .565-1.546 .565-3.128v-5.718C18 7.559 17.831 6.754 17.435 6.013 17.098 5.383 16.617 4.902 15.987 4.565 15.246 4.169 14.441 4 12.859 4h-1.718ZM11.141 2h1.718c2.014 0 3.094 .278 4.072 .801 .978 .523 1.745 1.29 2.268 2.268 .523 .978 .801 2.058 .801 4.072v5.718c0 2.014-.278 3.094-.801 4.072-.523 .978-1.29 1.745-2.268 2.268-.978 .523-2.058 .801-4.072 .801h-1.718C9.127 22 8.047 21.722 7.069 21.199 6.092 20.676 5.324 19.908 4.801 18.931 4.278 17.953 4 16.873 4 14.859v-5.718C4 7.127 4.278 6.047 4.801 5.069 5.324 4.092 6.092 3.324 7.069 2.801 8.047 2.278 9.127 2 11.141 2ZM11 6h2v5h-2v-5Z"),
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
        return _mouseLine!!
    }

private var _mouseLine: ImageVector? = null
