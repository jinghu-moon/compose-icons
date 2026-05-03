package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorBoldIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 64.000 L 212.000 144.000 C 212.000 190.392 174.392 228.000 128.000 228.000 C 81.608 228.000 44.000 190.392 44.000 144.000 L 44.000 64.000 C 44.000 57.373 49.373 52.000 56.000 52.000 C 62.627 52.000 68.000 57.373 68.000 64.000 L 68.000 144.000 C 68.000 177.137 94.863 204.000 128.000 204.000 C 161.137 204.000 188.000 177.137 188.000 144.000 L 188.000 64.000 C 188.000 57.373 193.373 52.000 200.000 52.000 C 206.627 52.000 212.000 57.373 212.000 64.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _union!!
    }

private var _union: ImageVector? = null
