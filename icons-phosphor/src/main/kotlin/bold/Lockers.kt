package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorBoldIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 80.000 C 192.000 86.627 186.627 92.000 180.000 92.000 L 164.000 92.000 C 157.373 92.000 152.000 86.627 152.000 80.000 C 152.000 73.373 157.373 68.000 164.000 68.000 L 180.000 68.000 C 186.627 68.000 192.000 73.373 192.000 80.000 ZM 180.000 108.000 L 164.000 108.000 C 157.373 108.000 152.000 113.373 152.000 120.000 C 152.000 126.627 157.373 132.000 164.000 132.000 L 180.000 132.000 C 186.627 132.000 192.000 126.627 192.000 120.000 C 192.000 113.373 186.627 108.000 180.000 108.000 ZM 76.000 92.000 L 92.000 92.000 C 98.627 92.000 104.000 86.627 104.000 80.000 C 104.000 73.373 98.627 68.000 92.000 68.000 L 76.000 68.000 C 69.373 68.000 64.000 73.373 64.000 80.000 C 64.000 86.627 69.373 92.000 76.000 92.000 ZM 92.000 108.000 L 76.000 108.000 C 69.373 108.000 64.000 113.373 64.000 120.000 C 64.000 126.627 69.373 132.000 76.000 132.000 L 92.000 132.000 C 98.627 132.000 104.000 126.627 104.000 120.000 C 104.000 113.373 98.627 108.000 92.000 108.000 ZM 228.000 48.000 L 228.000 224.000 C 228.000 230.627 222.627 236.000 216.000 236.000 C 209.373 236.000 204.000 230.627 204.000 224.000 L 204.000 212.000 L 140.000 212.000 L 140.000 224.000 C 140.000 230.627 134.627 236.000 128.000 236.000 C 121.373 236.000 116.000 230.627 116.000 224.000 L 116.000 212.000 L 52.000 212.000 L 52.000 224.000 C 52.000 230.627 46.627 236.000 40.000 236.000 C 33.373 236.000 28.000 230.627 28.000 224.000 L 28.000 48.000 C 28.000 36.954 36.954 28.000 48.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 116.000 188.000 L 116.000 52.000 L 52.000 52.000 L 52.000 188.000 ZM 140.000 188.000 L 204.000 188.000 L 204.000 52.000 L 140.000 52.000 Z"),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
