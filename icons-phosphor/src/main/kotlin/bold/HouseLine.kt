package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorBoldIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 204.000 L 228.000 204.000 L 228.000 144.000 C 233.278 145.855 239.138 143.816 242.125 139.086 C 245.112 134.355 244.433 128.188 240.490 124.220 L 142.140 25.850 C 134.330 18.042 121.670 18.042 113.860 25.850 L 15.510 124.200 C 11.542 128.164 10.849 134.348 13.842 139.092 C 16.834 143.836 22.713 145.874 28.000 144.000 L 28.000 204.000 L 16.000 204.000 C 9.373 204.000 4.000 209.373 4.000 216.000 C 4.000 222.627 9.373 228.000 16.000 228.000 L 240.000 228.000 C 246.627 228.000 252.000 222.627 252.000 216.000 C 252.000 209.373 246.627 204.000 240.000 204.000 ZM 52.000 121.650 L 128.000 45.650 L 204.000 121.650 L 204.000 204.000 L 164.000 204.000 L 164.000 152.000 C 164.000 145.373 158.627 140.000 152.000 140.000 L 104.000 140.000 C 97.373 140.000 92.000 145.373 92.000 152.000 L 92.000 204.000 L 52.000 204.000 ZM 140.000 204.000 L 116.000 204.000 L 116.000 164.000 L 140.000 164.000 Z"),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
