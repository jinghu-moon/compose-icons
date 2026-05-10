package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DragDropFill: ImageVector
    get() {
        if (_dragDropFill != null) return _dragDropFill!!
        _dragDropFill = remixIcon(
            name = "DragDropFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 6h2v2h5c.552 0 1 .448 1 1v7.5L16 13l.036 8.062 2.223-2.149L20.041 22h-11.041C8.448 22 8 21.552 8 21v-5h-2v-2h2v-5C8 8.448 8.448 8 9 8h5v-2ZM22 17.338v3.662c0 .107-.017 .21-.048 .307L19.991 17.913 22 17.338ZM4 14v2h-2v-2h2ZM4 10v2h-2v-2h2ZM4 6v2h-2v-2h2ZM4 2v2h-2v-2h2ZM8 2v2h-2v-2h2ZM12 2v2h-2v-2h2ZM16 2v2h-2v-2h2Z"),
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
        return _dragDropFill!!
    }

private var _dragDropFill: ImageVector? = null
