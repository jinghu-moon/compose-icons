package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MarkupLine: ImageVector
    get() {
        if (_markupLine != null) return _markupLine!!
        _markupLine = remixIcon(
            name = "MarkupLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 10.497 11.038 6.862c.152-.531 .705-.839 1.236-.687 .332 .095 .592 .355 .687 .687L14 10.497v1.5h.719c.459 0 .859 .312 .97 .757l1.362 5.447C18.851 16.734 20 14.5 20 11.997 20 7.578 16.418 3.997 12 3.997c-4.418 0-8 3.582-8 8 0 2.503 1.149 4.737 2.949 6.204L8.311 12.754c.111-.445 .511-.757 .97-.757h.719v-1.5ZM12 19.997c.241 0 .481-.011 .719-.032 .9-.08 1.757-.309 2.546-.662L13.938 13.997h-3.877L8.735 19.302c.789 .353 1.646 .582 2.546 .662 .238 .021 .477 .032 .719 .032ZM12 21.997c-5.523 0-10-4.477-10-10C2 6.474 6.477 1.997 12 1.997c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _markupLine!!
    }

private var _markupLine: ImageVector? = null
