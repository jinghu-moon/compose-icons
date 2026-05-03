package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorBoldIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 24.000 104.000 C 17.373 104.000 12.000 98.627 12.000 92.000 C 12.000 85.373 17.373 80.000 24.000 80.000 L 120.000 80.000 C 126.627 80.000 132.000 74.627 132.000 68.000 C 132.000 61.373 126.627 56.000 120.000 56.000 C 116.136 56.112 112.463 57.706 109.740 60.450 C 105.012 64.761 97.733 64.603 93.195 60.092 C 88.658 55.581 88.457 48.304 92.740 43.550 C 99.976 36.297 109.756 32.154 120.000 32.000 C 139.882 32.000 156.000 48.118 156.000 68.000 C 156.000 87.882 139.882 104.000 120.000 104.000 ZM 208.000 68.000 C 197.742 68.143 187.946 72.288 180.700 79.550 C 176.417 84.304 176.618 91.581 181.155 96.092 C 185.693 100.603 192.972 100.761 197.700 96.450 C 200.433 93.696 204.122 92.102 208.000 92.000 C 214.627 92.000 220.000 97.373 220.000 104.000 C 220.000 110.627 214.627 116.000 208.000 116.000 L 32.000 116.000 C 25.373 116.000 20.000 121.373 20.000 128.000 C 20.000 134.627 25.373 140.000 32.000 140.000 L 208.000 140.000 C 227.882 140.000 244.000 123.882 244.000 104.000 C 244.000 84.118 227.882 68.000 208.000 68.000 ZM 152.000 152.000 L 40.000 152.000 C 33.373 152.000 28.000 157.373 28.000 164.000 C 28.000 170.627 33.373 176.000 40.000 176.000 L 152.000 176.000 C 158.627 176.000 164.000 181.373 164.000 188.000 C 164.000 194.627 158.627 200.000 152.000 200.000 C 148.133 199.886 144.457 198.293 141.730 195.550 C 138.766 192.260 134.232 190.870 129.933 191.933 C 125.635 192.996 122.271 196.340 121.183 200.632 C 120.094 204.924 121.458 209.467 124.730 212.450 C 131.969 219.705 141.753 223.849 152.000 224.000 C 171.882 224.000 188.000 207.882 188.000 188.000 C 188.000 168.118 171.882 152.000 152.000 152.000 Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
