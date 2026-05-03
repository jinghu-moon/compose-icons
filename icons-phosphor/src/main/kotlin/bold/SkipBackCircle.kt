package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorBoldIcon(
            name = "SkipBackCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 165.820 77.500 C 162.004 75.384 157.340 75.507 153.640 77.820 L 108.000 106.350 L 108.000 88.000 C 108.000 81.373 102.627 76.000 96.000 76.000 C 89.373 76.000 84.000 81.373 84.000 88.000 L 84.000 168.000 C 84.000 174.627 89.373 180.000 96.000 180.000 C 102.627 180.000 108.000 174.627 108.000 168.000 L 108.000 149.650 L 153.640 178.180 C 157.340 180.492 162.003 180.614 165.819 178.499 C 169.635 176.383 172.001 172.363 172.000 168.000 L 172.000 88.000 C 172.002 83.637 169.636 79.616 165.820 77.500 ZM 148.000 146.350 L 118.640 128.000 L 148.000 109.650 Z"),
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
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
