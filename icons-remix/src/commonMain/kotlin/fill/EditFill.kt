package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EditFill: ImageVector
    get() {
        if (_editFill != null) return _editFill!!
        _editFill = remixIcon(
            name = "EditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.243 17.997 L 3.000 17.997 L 3.000 13.754 L 14.435 2.319 C 14.826 1.928 15.459 1.928 15.849 2.319 L 18.678 5.147 C 19.068 5.538 19.068 6.171 18.678 6.562 L 7.243 17.997 ZM 3.000 19.997 L 21.000 19.997 L 21.000 21.997 L 3.000 21.997 L 3.000 19.997 Z"),
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
        return _editFill!!
    }

private var _editFill: ImageVector? = null
