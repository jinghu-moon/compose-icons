package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowLeftLine: ImageVector
    get() {
        if (_arrowLeftLine != null) return _arrowLeftLine!!
        _arrowLeftLine = remixIcon(
            name = "ArrowLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.828 11.000 L 20.000 11.000 L 20.000 13.000 L 7.828 13.000 L 13.192 18.364 L 11.778 19.778 L 4.000 12.000 L 11.778 4.222 L 13.192 5.636 L 7.828 11.000 Z"),
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
        return _arrowLeftLine!!
    }

private var _arrowLeftLine: ImageVector? = null
