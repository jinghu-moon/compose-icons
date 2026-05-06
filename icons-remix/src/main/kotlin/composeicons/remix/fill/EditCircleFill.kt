package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EditCircleFill: ImageVector
    get() {
        if (_editCircleFill != null) return _editCircleFill!!
        _editCircleFill = remixIcon(
            name = "EditCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.626 3.128 9.291 10.463l.007 4.247 4.238-.007L20.868 7.371C21.591 8.754 22 10.328 22 11.997c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10C2 6.474 6.477 1.997 12 1.997c1.669 0 3.242 .409 4.626 1.132ZM20.485 2.097l1.414 1.414-9.192 9.192-1.412 .002-.002-1.417L20.485 2.097Z"),
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
        return _editCircleFill!!
    }

private var _editCircleFill: ImageVector? = null
