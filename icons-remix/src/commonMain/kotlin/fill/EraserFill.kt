package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EraserFill: ImageVector
    get() {
        if (_eraserFill != null) return _eraserFill!!
        _eraserFill = remixIcon(
            name = "EraserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 18.997 L 21.000 18.997 L 21.000 20.997 L 12.000 20.997 L 8.002 20.999 L 1.515 14.511 C 1.124 14.121 1.124 13.488 1.515 13.097 L 12.121 2.491 C 12.512 2.100 13.145 2.100 13.535 2.491 L 21.314 10.269 C 21.704 10.659 21.704 11.292 21.314 11.683 L 14.000 18.997 ZM 15.657 14.511 L 19.192 10.976 L 12.828 4.612 L 9.293 8.147 L 15.657 14.511 Z"),
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
        return _eraserFill!!
    }

private var _eraserFill: ImageVector? = null
