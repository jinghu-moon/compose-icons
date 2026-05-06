package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DragDropLine: ImageVector
    get() {
        if (_dragDropLine != null) return _dragDropLine!!
        _dragDropLine = remixIcon(
            name = "DragDropLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 13l6.964 4.062-2.973 .851 2.125 3.68-1.732 1L18.259 18.913l-2.223 2.149L16 13ZM14 6h2v2h5c.552 0 1 .448 1 1v4h-2v-3h-10v10h4v2h-5C8.448 22 8 21.552 8 21v-5h-2v-2h2v-5C8 8.448 8.448 8 9 8h5v-2ZM4 14v2h-2v-2h2ZM4 10v2h-2v-2h2ZM4 6v2h-2v-2h2ZM4 2v2h-2v-2h2ZM8 2v2h-2v-2h2ZM12 2v2h-2v-2h2ZM16 2v2h-2v-2h2Z"),
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
        return _dragDropLine!!
    }

private var _dragDropLine: ImageVector? = null
