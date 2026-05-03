package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EraserLine: ImageVector
    get() {
        if (_eraserLine != null) return _eraserLine!!
        _eraserLine = remixIcon(
            name = "EraserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.586 8.854 L 3.636 13.804 L 8.830 18.999 L 10.000 18.998 L 10.000 18.997 L 11.171 18.997 L 14.950 15.218 L 8.586 8.854 ZM 10.000 7.440 L 16.364 13.804 L 19.192 10.976 L 12.828 4.612 L 10.000 7.440 ZM 14.000 18.997 L 21.000 18.997 L 21.000 20.997 L 12.000 20.997 L 8.002 20.999 L 1.515 14.511 C 1.124 14.121 1.124 13.488 1.515 13.097 L 12.121 2.491 C 12.512 2.100 13.145 2.100 13.535 2.491 L 21.314 10.269 C 21.704 10.659 21.704 11.292 21.314 11.683 L 14.000 18.997 Z"),
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
        return _eraserLine!!
    }

private var _eraserLine: ImageVector? = null
