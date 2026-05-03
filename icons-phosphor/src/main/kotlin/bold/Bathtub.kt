package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorBoldIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 92.000 L 211.300 92.000 C 209.607 87.210 205.080 84.006 200.000 84.000 L 136.000 84.000 C 130.920 84.006 126.393 87.210 124.700 92.000 L 68.000 92.000 L 68.000 52.000 C 68.000 47.582 71.582 44.000 76.000 44.000 C 79.884 43.997 83.276 46.628 84.240 50.390 C 85.560 56.885 91.895 61.080 98.390 59.760 C 104.885 58.440 109.080 52.105 107.760 45.610 C 104.394 29.480 89.401 18.489 73.006 20.132 C 56.612 21.776 44.098 35.523 44.000 52.000 L 44.000 92.000 L 16.000 92.000 C 9.373 92.000 4.000 97.373 4.000 104.000 L 4.000 144.000 C 4.043 175.564 28.508 201.711 60.000 203.850 L 60.000 216.000 C 60.000 222.627 65.373 228.000 72.000 228.000 C 78.627 228.000 84.000 222.627 84.000 216.000 L 84.000 204.000 L 172.000 204.000 L 172.000 216.000 C 172.000 222.627 177.373 228.000 184.000 228.000 C 190.627 228.000 196.000 222.627 196.000 216.000 L 196.000 203.850 C 227.492 201.711 251.957 175.564 252.000 144.000 L 252.000 104.000 C 252.000 97.373 246.627 92.000 240.000 92.000 ZM 148.000 108.000 L 188.000 108.000 L 188.000 132.000 L 148.000 132.000 ZM 228.000 144.000 C 228.000 163.882 211.882 180.000 192.000 180.000 L 64.000 180.000 C 44.118 180.000 28.000 163.882 28.000 144.000 L 28.000 116.000 L 124.000 116.000 L 124.000 144.000 C 124.000 150.627 129.373 156.000 136.000 156.000 L 200.000 156.000 C 206.627 156.000 212.000 150.627 212.000 144.000 L 212.000 116.000 L 228.000 116.000 Z"),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
