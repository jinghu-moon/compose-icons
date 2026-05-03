package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorBoldIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 120.000 L 212.000 200.000 C 212.000 206.627 206.627 212.000 200.000 212.000 C 193.373 212.000 188.000 206.627 188.000 200.000 L 188.000 120.000 C 188.000 86.863 161.137 60.000 128.000 60.000 C 94.863 60.000 68.000 86.863 68.000 120.000 L 68.000 200.000 C 68.000 206.627 62.627 212.000 56.000 212.000 C 49.373 212.000 44.000 206.627 44.000 200.000 L 44.000 120.000 C 44.000 73.608 81.608 36.000 128.000 36.000 C 174.392 36.000 212.000 73.608 212.000 120.000 Z"),
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
        return _intersection!!
    }

private var _intersection: ImageVector? = null
