package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorBoldIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 28.000 132.000 C 21.373 132.000 16.000 126.627 16.000 120.000 C 16.000 113.373 21.373 108.000 28.000 108.000 L 56.000 108.000 C 58.209 108.000 60.000 106.209 60.000 104.000 C 60.000 101.791 58.209 100.000 56.000 100.000 L 40.000 100.000 C 25.210 99.978 12.988 88.456 12.094 73.693 C 11.199 58.930 21.941 46.018 36.620 44.210 C 38.248 39.361 42.770 36.076 47.885 36.029 C 53.000 35.981 57.583 39.182 59.300 44.000 L 64.000 44.000 C 70.627 44.000 76.000 49.373 76.000 56.000 C 76.000 62.627 70.627 68.000 64.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 69.791 36.000 72.000 C 36.000 74.209 37.791 76.000 40.000 76.000 L 56.000 76.000 C 70.790 76.022 83.012 87.544 83.906 102.307 C 84.801 117.070 74.059 129.982 59.380 131.790 C 57.752 136.639 53.230 139.924 48.115 139.971 C 43.000 140.019 38.417 136.818 36.700 132.000 ZM 236.000 56.000 L 236.000 192.000 C 236.000 203.046 227.046 212.000 216.000 212.000 L 40.000 212.000 C 28.954 212.000 20.000 203.046 20.000 192.000 L 20.000 164.000 C 20.000 157.373 25.373 152.000 32.000 152.000 C 38.627 152.000 44.000 157.373 44.000 164.000 L 44.000 188.000 L 156.000 188.000 L 156.000 164.000 L 88.000 164.000 C 81.373 164.000 76.000 158.627 76.000 152.000 C 76.000 145.373 81.373 140.000 88.000 140.000 L 156.000 140.000 L 156.000 116.000 L 112.000 116.000 C 105.373 116.000 100.000 110.627 100.000 104.000 C 100.000 97.373 105.373 92.000 112.000 92.000 L 212.000 92.000 L 212.000 68.000 L 104.000 68.000 C 97.373 68.000 92.000 62.627 92.000 56.000 C 92.000 49.373 97.373 44.000 104.000 44.000 L 224.000 44.000 C 230.627 44.000 236.000 49.373 236.000 56.000 ZM 180.000 140.000 L 212.000 140.000 L 212.000 116.000 L 180.000 116.000 ZM 212.000 188.000 L 212.000 164.000 L 180.000 164.000 L 180.000 188.000 Z"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
