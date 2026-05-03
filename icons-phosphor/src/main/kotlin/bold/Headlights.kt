package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorBoldIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 80.000 C 164.000 73.373 169.373 68.000 176.000 68.000 L 240.000 68.000 C 246.627 68.000 252.000 73.373 252.000 80.000 C 252.000 86.627 246.627 92.000 240.000 92.000 L 176.000 92.000 C 169.373 92.000 164.000 86.627 164.000 80.000 ZM 240.000 164.000 L 176.000 164.000 C 169.373 164.000 164.000 169.373 164.000 176.000 C 164.000 182.627 169.373 188.000 176.000 188.000 L 240.000 188.000 C 246.627 188.000 252.000 182.627 252.000 176.000 C 252.000 169.373 246.627 164.000 240.000 164.000 ZM 240.000 116.000 L 176.000 116.000 C 169.373 116.000 164.000 121.373 164.000 128.000 C 164.000 134.627 169.373 140.000 176.000 140.000 L 240.000 140.000 C 246.627 140.000 252.000 134.627 252.000 128.000 C 252.000 121.373 246.627 116.000 240.000 116.000 ZM 148.000 64.000 L 148.000 192.000 C 148.000 203.046 139.046 212.000 128.000 212.000 L 88.000 212.000 C 65.612 212.001 44.150 203.064 28.379 187.175 C 12.608 171.285 3.832 149.757 4.000 127.370 C 4.340 81.400 42.430 44.000 88.900 44.000 L 128.000 44.000 C 139.046 44.000 148.000 52.954 148.000 64.000 ZM 124.000 68.000 L 88.900 68.000 C 55.570 68.000 28.250 94.710 28.000 127.540 C 27.877 143.533 34.145 158.912 45.410 170.264 C 56.676 181.616 72.007 188.000 88.000 188.000 L 124.000 188.000 Z"),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
