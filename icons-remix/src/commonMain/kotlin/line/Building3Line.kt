package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Building3Line: ImageVector
    get() {
        if (_building3Line != null) return _building3Line!!
        _building3Line = remixIcon(
            name = "Building3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 10.111 L 10.000 1.000 L 21.000 7.000 L 21.000 21.000 L 3.000 21.000 L 3.000 7.000 L 10.000 10.111 ZM 12.000 4.369 L 12.000 13.189 L 5.000 10.078 L 5.000 19.000 L 19.000 19.000 L 19.000 8.187 L 12.000 4.369 Z"),
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
        return _building3Line!!
    }

private var _building3Line: ImageVector? = null
