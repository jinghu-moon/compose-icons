package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorFillIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 56.000 L 240.000 200.000 C 240.000 204.418 236.418 208.000 232.000 208.000 L 8.000 208.000 C 3.582 208.000 0.000 204.418 0.000 200.000 C 0.000 195.582 3.582 192.000 8.000 192.000 L 56.000 192.000 L 56.000 152.000 C 56.000 147.582 59.582 144.000 64.000 144.000 L 112.000 144.000 L 112.000 104.000 C 112.000 99.582 115.582 96.000 120.000 96.000 L 168.000 96.000 L 168.000 56.000 C 168.000 51.582 171.582 48.000 176.000 48.000 L 232.000 48.000 C 236.418 48.000 240.000 51.582 240.000 56.000 Z"),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
