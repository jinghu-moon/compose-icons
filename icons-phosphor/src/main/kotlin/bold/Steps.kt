package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorBoldIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 56.000 C 252.000 62.627 246.627 68.000 240.000 68.000 L 196.000 68.000 L 196.000 104.000 C 196.000 110.627 190.627 116.000 184.000 116.000 L 140.000 116.000 L 140.000 152.000 C 140.000 158.627 134.627 164.000 128.000 164.000 L 84.000 164.000 L 84.000 200.000 C 84.000 206.627 78.627 212.000 72.000 212.000 L 16.000 212.000 C 9.373 212.000 4.000 206.627 4.000 200.000 C 4.000 193.373 9.373 188.000 16.000 188.000 L 60.000 188.000 L 60.000 152.000 C 60.000 145.373 65.373 140.000 72.000 140.000 L 116.000 140.000 L 116.000 104.000 C 116.000 97.373 121.373 92.000 128.000 92.000 L 172.000 92.000 L 172.000 56.000 C 172.000 49.373 177.373 44.000 184.000 44.000 L 240.000 44.000 C 246.627 44.000 252.000 49.373 252.000 56.000 Z"),
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
