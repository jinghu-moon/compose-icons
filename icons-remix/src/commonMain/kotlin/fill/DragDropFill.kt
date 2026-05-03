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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 6.000 L 16.000 6.000 L 16.000 8.000 L 21.000 8.000 C 21.552 8.000 22.000 8.448 22.000 9.000 L 22.000 16.500 L 16.000 13.000 L 16.036 21.062 L 18.259 18.913 L 20.041 22.000 L 9.000 22.000 C 8.448 22.000 8.000 21.552 8.000 21.000 L 8.000 16.000 L 6.000 16.000 L 6.000 14.000 L 8.000 14.000 L 8.000 9.000 C 8.000 8.448 8.448 8.000 9.000 8.000 L 14.000 8.000 L 14.000 6.000 ZM 22.000 17.338 L 22.000 21.000 C 22.000 21.107 21.983 21.210 21.952 21.307 L 19.991 17.913 L 22.000 17.338 ZM 4.000 14.000 L 4.000 16.000 L 2.000 16.000 L 2.000 14.000 L 4.000 14.000 ZM 4.000 10.000 L 4.000 12.000 L 2.000 12.000 L 2.000 10.000 L 4.000 10.000 ZM 4.000 6.000 L 4.000 8.000 L 2.000 8.000 L 2.000 6.000 L 4.000 6.000 ZM 4.000 2.000 L 4.000 4.000 L 2.000 4.000 L 2.000 2.000 L 4.000 2.000 ZM 8.000 2.000 L 8.000 4.000 L 6.000 4.000 L 6.000 2.000 L 8.000 2.000 ZM 12.000 2.000 L 12.000 4.000 L 10.000 4.000 L 10.000 2.000 L 12.000 2.000 ZM 16.000 2.000 L 16.000 4.000 L 14.000 4.000 L 14.000 2.000 L 16.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dragDropFill!!
    }

private var _dragDropFill: ImageVector? = null
