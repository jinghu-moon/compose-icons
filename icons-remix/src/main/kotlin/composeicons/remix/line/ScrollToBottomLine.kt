package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ScrollToBottomLine: ImageVector
    get() {
        if (_scrollToBottomLine != null) return _scrollToBottomLine!!
        _scrollToBottomLine = remixIcon(
            name = "ScrollToBottomLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.013 4.565C8.754 4.169 9.559 4 11.141 4h1.718c1.582 0 2.387 .169 3.128 .565 .629 .337 1.111 .818 1.448 1.448 .396 .741 .565 1.546 .565 3.128v5.718c0 1.582-.169 2.388-.565 3.128-.337 .629-.818 1.111-1.448 1.448-.741 .396-1.546 .565-3.128 .565h-1.718C9.559 20 8.754 19.831 8.013 19.435 7.383 19.098 6.902 18.617 6.565 17.987 6.169 17.246 6 16.441 6 14.859v-5.718C6 7.559 6.169 6.754 6.565 6.013 6.902 5.383 7.383 4.902 8.013 4.565ZM12.859 2h-1.718C9.127 2 8.047 2.278 7.069 2.801 6.092 3.324 5.324 4.092 4.801 5.069 4.278 6.047 4 7.127 4 9.141v5.718c0 2.014 .278 3.094 .801 4.072 .523 .978 1.29 1.745 2.268 2.268 .978 .523 2.058 .801 4.072 .801h1.718c2.014 0 3.094-.278 4.072-.801 .978-.523 1.745-1.29 2.268-2.268 .523-.978 .801-2.058 .801-4.072v-5.718C20 7.127 19.722 6.047 19.199 5.069 18.676 4.092 17.908 3.324 16.931 2.801 15.953 2.278 14.873 2 12.859 2ZM13 6h-2v5h2v-5ZM7.758 13.758l4.243 4.243 4.243-4.243L14.829 12.344l-2.828 2.828L9.172 12.344 7.758 13.758Z"),
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
        return _scrollToBottomLine!!
    }

private var _scrollToBottomLine: ImageVector? = null
