package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorBoldIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.850 148.740 L 173.290 104.000 L 51.850 59.260 C 45.631 56.968 42.448 50.069 44.740 43.850 C 47.032 37.631 53.931 34.448 60.150 36.740 L 212.150 92.740 C 216.867 94.478 220.001 98.973 220.001 104.000 C 220.001 109.027 216.867 113.522 212.150 115.260 L 60.150 171.260 C 53.931 173.552 47.032 170.369 44.740 164.150 C 42.448 157.931 45.631 151.032 51.850 148.740 ZM 208.000 188.000 L 56.000 188.000 C 49.373 188.000 44.000 193.373 44.000 200.000 C 44.000 206.627 49.373 212.000 56.000 212.000 L 208.000 212.000 C 214.627 212.000 220.000 206.627 220.000 200.000 C 220.000 193.373 214.627 188.000 208.000 188.000 Z"),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
