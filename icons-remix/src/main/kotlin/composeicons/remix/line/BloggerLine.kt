package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BloggerLine: ImageVector
    get() {
        if (_bloggerLine != null) return _bloggerLine!!
        _bloggerLine = remixIcon(
            name = "BloggerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 9.009C3 5.69 5.691 3 9.009 3h2.991c3.309 0 5.994 2.676 6.009 5.981h.944c1.15 0 2.047 .896 2.047 2.047v3.963c0 3.319-2.691 6.009-6.009 6.009h-5.981C5.691 21 3 18.309 3 14.99v-5.981ZM9.009 5C6.795 5 5 6.795 5 9.009v5.981c0 2.214 1.795 4.009 4.009 4.009h5.981c2.214 0 4.009-1.795 4.009-4.009v-3.99h-1c-1.076 0-2-.924-2-2C16 6.786 14.214 5 12 5h-2.991ZM8 9C8 8.448 8.448 8 9 8h3.5c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-3.5C8.448 10 8 9.552 8 9ZM9 14c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h6c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-6Z"),
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
        return _bloggerLine!!
    }

private var _bloggerLine: ImageVector? = null
