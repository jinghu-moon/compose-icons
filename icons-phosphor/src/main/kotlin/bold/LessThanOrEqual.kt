package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorBoldIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 36.000 104.000 C 36.000 98.973 39.133 94.479 43.850 92.740 L 195.850 36.740 C 202.069 34.448 208.968 37.631 211.260 43.850 C 213.552 50.069 210.369 56.968 204.150 59.260 L 82.710 104.000 L 204.150 148.740 C 209.606 150.750 212.836 156.383 211.815 162.108 C 210.793 167.832 205.815 172.001 200.000 172.000 C 198.584 172.003 197.178 171.753 195.850 171.260 L 43.850 115.260 C 39.133 113.521 36.000 109.027 36.000 104.000 ZM 200.000 188.000 L 48.000 188.000 C 41.373 188.000 36.000 193.373 36.000 200.000 C 36.000 206.627 41.373 212.000 48.000 212.000 L 200.000 212.000 C 206.627 212.000 212.000 206.627 212.000 200.000 C 212.000 193.373 206.627 188.000 200.000 188.000 Z"),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
