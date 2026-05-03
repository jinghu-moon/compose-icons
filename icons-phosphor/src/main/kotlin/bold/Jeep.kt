package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorBoldIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 84.000 L 233.700 84.000 L 225.090 43.810 C 223.076 34.610 214.948 28.040 205.530 28.000 L 50.470 28.000 C 41.052 28.040 32.924 34.610 30.910 43.810 L 22.300 84.000 L 16.000 84.000 C 9.373 84.000 4.000 89.373 4.000 96.000 C 4.000 102.627 9.373 108.000 16.000 108.000 L 20.000 108.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 68.000 220.000 C 79.046 220.000 88.000 211.046 88.000 200.000 L 88.000 180.000 L 168.000 180.000 L 168.000 200.000 C 168.000 211.046 176.954 220.000 188.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 108.000 L 240.000 108.000 C 246.627 108.000 252.000 102.627 252.000 96.000 C 252.000 89.373 246.627 84.000 240.000 84.000 ZM 53.700 52.000 L 202.300 52.000 L 209.160 84.000 L 46.840 84.000 ZM 64.000 196.000 L 44.000 196.000 L 44.000 180.000 L 64.000 180.000 ZM 192.000 196.000 L 192.000 180.000 L 212.000 180.000 L 212.000 196.000 ZM 212.000 156.000 L 180.000 156.000 L 180.000 132.000 C 180.000 125.373 174.627 120.000 168.000 120.000 C 161.373 120.000 156.000 125.373 156.000 132.000 L 156.000 156.000 L 140.000 156.000 L 140.000 132.000 C 140.000 125.373 134.627 120.000 128.000 120.000 C 121.373 120.000 116.000 125.373 116.000 132.000 L 116.000 156.000 L 100.000 156.000 L 100.000 132.000 C 100.000 125.373 94.627 120.000 88.000 120.000 C 81.373 120.000 76.000 125.373 76.000 132.000 L 76.000 156.000 L 44.000 156.000 L 44.000 108.000 L 212.000 108.000 Z"),
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
        return _jeep!!
    }

private var _jeep: ImageVector? = null
