package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CodeLine: ImageVector
    get() {
        if (_codeLine != null) return _codeLine!!
        _codeLine = remixIcon(
            name = "CodeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 23.000 12.000 L 15.929 19.071 L 14.515 17.657 L 20.172 12.000 L 14.515 6.343 L 15.929 4.929 L 23.000 12.000 ZM 3.828 12.000 L 9.485 17.657 L 8.071 19.071 L 1.000 12.000 L 8.071 4.929 L 9.485 6.343 L 3.828 12.000 Z"),
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
        return _codeLine!!
    }

private var _codeLine: ImageVector? = null
