package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorBoldIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 76.000 L 111.420 76.000 L 90.730 34.630 C 88.697 30.567 84.543 28.001 80.000 28.000 L 48.000 28.000 C 41.373 28.000 36.000 33.373 36.000 40.000 L 36.000 76.000 L 24.000 76.000 C 17.373 76.000 12.000 81.373 12.000 88.000 C 12.000 94.627 17.373 100.000 24.000 100.000 L 36.000 100.000 L 36.000 204.000 L 24.000 204.000 C 17.373 204.000 12.000 209.373 12.000 216.000 C 12.000 222.627 17.373 228.000 24.000 228.000 L 128.000 228.000 C 134.627 228.000 140.000 222.627 140.000 216.000 C 140.000 209.373 134.627 204.000 128.000 204.000 L 116.000 204.000 L 116.000 100.000 L 204.000 100.000 L 204.000 180.000 L 192.000 180.000 L 192.000 176.000 C 192.000 169.373 186.627 164.000 180.000 164.000 C 173.373 164.000 168.000 169.373 168.000 176.000 L 168.000 184.000 C 168.000 195.046 176.954 204.000 188.000 204.000 L 208.000 204.000 C 219.046 204.000 228.000 195.046 228.000 184.000 L 228.000 100.000 L 240.000 100.000 C 246.627 100.000 252.000 94.627 252.000 88.000 C 252.000 81.373 246.627 76.000 240.000 76.000 ZM 60.000 52.000 L 72.580 52.000 L 84.580 76.000 L 60.000 76.000 ZM 60.000 204.000 L 60.000 164.000 L 92.000 164.000 L 92.000 204.000 ZM 92.000 140.000 L 60.000 140.000 L 60.000 100.000 L 92.000 100.000 Z"),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
