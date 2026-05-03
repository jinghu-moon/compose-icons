package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorBoldIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 253.760 93.000 C 251.905 90.409 249.096 88.662 245.952 88.145 C 242.808 87.627 239.588 88.381 237.000 90.240 L 228.000 96.680 L 228.000 80.000 C 228.000 73.373 222.627 68.000 216.000 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 L 28.000 96.680 L 19.000 90.240 C 13.610 86.374 6.106 87.610 2.240 93.000 C -1.626 98.390 -0.390 105.894 5.000 109.760 L 28.000 126.180 L 28.000 184.000 C 28.000 203.882 44.118 220.000 64.000 220.000 L 192.000 220.000 C 211.882 220.000 228.000 203.882 228.000 184.000 L 228.000 126.180 L 251.000 109.760 C 253.591 107.905 255.338 105.096 255.855 101.952 C 256.373 98.808 255.619 95.588 253.760 93.000 ZM 204.000 184.000 C 204.000 190.627 198.627 196.000 192.000 196.000 L 64.000 196.000 C 57.373 196.000 52.000 190.627 52.000 184.000 L 52.000 92.000 L 204.000 92.000 ZM 76.000 40.000 L 76.000 16.000 C 76.000 9.373 81.373 4.000 88.000 4.000 C 94.627 4.000 100.000 9.373 100.000 16.000 L 100.000 40.000 C 100.000 46.627 94.627 52.000 88.000 52.000 C 81.373 52.000 76.000 46.627 76.000 40.000 ZM 116.000 40.000 L 116.000 16.000 C 116.000 9.373 121.373 4.000 128.000 4.000 C 134.627 4.000 140.000 9.373 140.000 16.000 L 140.000 40.000 C 140.000 46.627 134.627 52.000 128.000 52.000 C 121.373 52.000 116.000 46.627 116.000 40.000 ZM 156.000 40.000 L 156.000 16.000 C 156.000 9.373 161.373 4.000 168.000 4.000 C 174.627 4.000 180.000 9.373 180.000 16.000 L 180.000 40.000 C 180.000 46.627 174.627 52.000 168.000 52.000 C 161.373 52.000 156.000 46.627 156.000 40.000 Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
