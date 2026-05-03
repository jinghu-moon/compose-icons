package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RectangleFill: ImageVector
    get() {
        if (_rectangleFill != null) return _rectangleFill!!
        _rectangleFill = remixIcon(
            name = "RectangleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 4.000 L 21.000 4.000 C 21.552 4.000 22.000 4.448 22.000 5.000 L 22.000 19.000 C 22.000 19.552 21.552 20.000 21.000 20.000 L 3.000 20.000 C 2.448 20.000 2.000 19.552 2.000 19.000 L 2.000 5.000 C 2.000 4.448 2.448 4.000 3.000 4.000 Z"),
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
        return _rectangleFill!!
    }

private var _rectangleFill: ImageVector? = null
