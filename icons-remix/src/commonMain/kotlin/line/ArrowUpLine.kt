package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowUpLine: ImageVector
    get() {
        if (_arrowUpLine != null) return _arrowUpLine!!
        _arrowUpLine = remixIcon(
            name = "ArrowUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 7.828 L 13.000 20.000 L 11.000 20.000 L 11.000 7.828 L 5.636 13.192 L 4.222 11.778 L 12.000 4.000 L 19.778 11.778 L 18.364 13.192 L 13.000 7.828 Z"),
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
        return _arrowUpLine!!
    }

private var _arrowUpLine: ImageVector? = null
