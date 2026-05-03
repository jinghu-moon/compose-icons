package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorBoldIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 80.000 L 252.000 104.000 C 252.000 110.627 246.627 116.000 240.000 116.000 C 233.373 116.000 228.000 110.627 228.000 104.000 L 228.000 92.000 L 136.320 92.000 L 91.240 212.210 C 89.483 216.892 85.006 219.994 80.005 219.994 C 75.004 219.994 70.527 216.892 68.770 212.210 L 20.770 84.210 C 19.225 80.187 19.956 75.645 22.685 72.310 C 25.414 68.975 29.721 67.359 33.970 68.076 C 38.219 68.793 41.757 71.734 43.240 75.780 L 80.000 173.780 L 116.770 75.780 C 118.528 71.101 123.002 68.001 128.000 68.000 L 240.000 68.000 C 246.627 68.000 252.000 73.373 252.000 80.000 Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
