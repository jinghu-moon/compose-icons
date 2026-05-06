package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BookShelfLine: ImageVector
    get() {
        if (_bookShelfLine != null) return _bookShelfLine!!
        _bookShelfLine = remixIcon(
            name = "BookShelfLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3C3.448 3 3 3.448 3 4v16c0 .552 .448 1 1 1h10c.552 0 1-.448 1-1v-4.703l1 4.702c.115 .54 .646 .885 1.186 .77l3.913-.832c.54-.115 .885-.646 .77-1.186L18.958 5.058c-.115-.54-.646-.885-1.186-.77l-2.779 .591C14.933 4.384 14.511 4 14 4h-4C10 3.448 9.552 3 9 3h-5ZM10 6h3v8h-3v-8ZM10 19v-3h3v3h-3ZM8 5v10h-3v-10h3ZM8 17v2h-3v-2h3ZM17.332 16.65l1.956-.416 .416 1.956-1.956 .416-.416-1.956ZM16.916 14.693 15.253 6.868l1.956-.416 1.663 7.825-1.956 .416Z"),
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
        return _bookShelfLine!!
    }

private var _bookShelfLine: ImageVector? = null
