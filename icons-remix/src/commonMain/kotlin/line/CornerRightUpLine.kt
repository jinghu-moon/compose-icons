package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerRightUpLine: ImageVector
    get() {
        if (_cornerRightUpLine != null) return _cornerRightUpLine!!
        _cornerRightUpLine = remixIcon(
            name = "CornerRightUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 19.000 L 5.000 19.000 L 5.000 17.000 L 12.000 17.000 L 12.000 6.828 L 8.050 10.778 L 6.636 9.364 L 13.000 3.000 L 19.364 9.364 L 17.950 10.778 L 14.000 6.828 L 14.000 19.000 Z"),
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
        return _cornerRightUpLine!!
    }

private var _cornerRightUpLine: ImageVector? = null
