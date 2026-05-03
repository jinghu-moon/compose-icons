package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerUpLeftLine: ImageVector
    get() {
        if (_cornerUpLeftLine != null) return _cornerUpLeftLine!!
        _cornerUpLeftLine = remixIcon(
            name = "CornerUpLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 10.000 L 19.000 19.000 L 17.000 19.000 L 17.000 12.000 L 6.828 12.000 L 10.778 15.950 L 9.364 17.364 L 3.000 11.000 L 9.364 4.636 L 10.778 6.050 L 6.828 10.000 L 19.000 10.000 Z"),
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
        return _cornerUpLeftLine!!
    }

private var _cornerUpLeftLine: ImageVector? = null
