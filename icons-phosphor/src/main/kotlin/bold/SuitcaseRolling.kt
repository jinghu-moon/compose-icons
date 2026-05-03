package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorBoldIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 96.000 L 116.000 176.000 C 116.000 182.627 110.627 188.000 104.000 188.000 C 97.373 188.000 92.000 182.627 92.000 176.000 L 92.000 96.000 C 92.000 89.373 97.373 84.000 104.000 84.000 C 110.627 84.000 116.000 89.373 116.000 96.000 ZM 140.000 96.000 L 140.000 176.000 C 140.000 182.627 145.373 188.000 152.000 188.000 C 158.627 188.000 164.000 182.627 164.000 176.000 L 164.000 96.000 C 164.000 89.373 158.627 84.000 152.000 84.000 C 145.373 84.000 140.000 89.373 140.000 96.000 ZM 212.000 64.000 L 212.000 208.000 C 212.000 219.046 203.046 228.000 192.000 228.000 L 180.000 228.000 L 180.000 240.000 C 180.000 246.627 174.627 252.000 168.000 252.000 C 161.373 252.000 156.000 246.627 156.000 240.000 L 156.000 228.000 L 100.000 228.000 L 100.000 240.000 C 100.000 246.627 94.627 252.000 88.000 252.000 C 81.373 252.000 76.000 246.627 76.000 240.000 L 76.000 228.000 L 64.000 228.000 C 52.954 228.000 44.000 219.046 44.000 208.000 L 44.000 64.000 C 44.000 52.954 52.954 44.000 64.000 44.000 L 84.000 44.000 L 84.000 28.000 C 84.000 12.536 96.536 0.000 112.000 0.000 L 144.000 0.000 C 159.464 0.000 172.000 12.536 172.000 28.000 L 172.000 44.000 L 192.000 44.000 C 203.046 44.000 212.000 52.954 212.000 64.000 ZM 108.000 44.000 L 148.000 44.000 L 148.000 28.000 C 148.000 25.791 146.209 24.000 144.000 24.000 L 112.000 24.000 C 109.791 24.000 108.000 25.791 108.000 28.000 ZM 188.000 68.000 L 68.000 68.000 L 68.000 204.000 L 188.000 204.000 Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
