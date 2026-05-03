package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorBoldIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 204.000 L 228.000 204.000 L 228.000 96.000 C 228.000 84.954 219.046 76.000 208.000 76.000 L 172.000 76.000 L 172.000 32.000 C 171.998 25.167 168.507 18.809 162.744 15.138 C 156.981 11.468 149.743 10.993 143.550 13.880 L 39.550 62.420 C 32.514 65.716 28.014 72.780 28.000 80.550 L 28.000 204.000 L 16.000 204.000 C 9.373 204.000 4.000 209.373 4.000 216.000 C 4.000 222.627 9.373 228.000 16.000 228.000 L 240.000 228.000 C 246.627 228.000 252.000 222.627 252.000 216.000 C 252.000 209.373 246.627 204.000 240.000 204.000 ZM 204.000 100.000 L 204.000 204.000 L 172.000 204.000 L 172.000 100.000 ZM 52.000 83.090 L 148.000 38.300 L 148.000 204.000 L 52.000 204.000 ZM 132.000 112.000 L 132.000 124.000 C 132.000 130.627 126.627 136.000 120.000 136.000 C 113.373 136.000 108.000 130.627 108.000 124.000 L 108.000 112.000 C 108.000 105.373 113.373 100.000 120.000 100.000 C 126.627 100.000 132.000 105.373 132.000 112.000 ZM 92.000 112.000 L 92.000 124.000 C 92.000 130.627 86.627 136.000 80.000 136.000 C 73.373 136.000 68.000 130.627 68.000 124.000 L 68.000 112.000 C 68.000 105.373 73.373 100.000 80.000 100.000 C 86.627 100.000 92.000 105.373 92.000 112.000 ZM 92.000 164.000 L 92.000 176.000 C 92.000 182.627 86.627 188.000 80.000 188.000 C 73.373 188.000 68.000 182.627 68.000 176.000 L 68.000 164.000 C 68.000 157.373 73.373 152.000 80.000 152.000 C 86.627 152.000 92.000 157.373 92.000 164.000 ZM 132.000 164.000 L 132.000 176.000 C 132.000 182.627 126.627 188.000 120.000 188.000 C 113.373 188.000 108.000 182.627 108.000 176.000 L 108.000 164.000 C 108.000 157.373 113.373 152.000 120.000 152.000 C 126.627 152.000 132.000 157.373 132.000 164.000 Z"),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
