package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) return _pencilSimpleLine!!
        _pencilSimpleLine = phosphorBoldIcon(
            name = "PencilSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.150 70.540 L 185.460 25.860 C 177.650 18.052 164.990 18.052 157.180 25.860 L 33.860 149.170 C 30.096 152.911 27.986 158.003 28.000 163.310 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 C 228.000 209.373 222.627 204.000 216.000 204.000 L 125.000 204.000 L 230.150 98.830 C 233.902 95.079 236.011 89.991 236.011 84.685 C 236.011 79.379 233.902 74.291 230.150 70.540 ZM 91.000 204.000 L 52.000 204.000 L 52.000 165.000 L 136.000 81.000 L 175.000 120.000 ZM 192.000 103.000 L 153.000 64.000 L 171.340 45.660 L 210.340 84.660 Z"),
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
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null
