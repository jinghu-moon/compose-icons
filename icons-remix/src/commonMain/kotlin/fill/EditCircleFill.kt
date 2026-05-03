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
                pathData = parseSvgPathData("M 16.626 3.128 L 9.291 10.463 L 9.299 14.710 L 13.537 14.702 L 20.868 7.371 C 21.591 8.754 22.000 10.328 22.000 11.997 C 22.000 17.520 17.523 21.997 12.000 21.997 C 6.477 21.997 2.000 17.520 2.000 11.997 C 2.000 6.474 6.477 1.997 12.000 1.997 C 13.669 1.997 15.242 2.406 16.626 3.128 ZM 20.485 2.097 L 21.899 3.511 L 12.707 12.704 L 11.295 12.706 L 11.293 11.290 L 20.485 2.097 Z"),
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
