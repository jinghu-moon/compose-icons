package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerDownLeftLine: ImageVector
    get() {
        if (_cornerDownLeftLine != null) return _cornerDownLeftLine!!
        _cornerDownLeftLine = remixIcon(
            name = "CornerDownLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 14.000 L 19.000 5.000 L 17.000 5.000 L 17.000 12.000 L 6.828 12.000 L 10.778 8.050 L 9.364 6.636 L 3.000 13.000 L 9.364 19.364 L 10.778 17.950 L 6.828 14.000 L 19.000 14.000 Z"),
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
        return _cornerDownLeftLine!!
    }

private var _cornerDownLeftLine: ImageVector? = null
