package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorBoldIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.550 64.740 C 239.282 61.755 235.749 60.001 232.000 60.000 L 60.230 60.000 L 51.560 28.790 C 50.118 23.596 45.390 20.001 40.000 20.000 L 20.000 20.000 C 13.373 20.000 8.000 25.373 8.000 32.000 C 8.000 38.627 13.373 44.000 20.000 44.000 L 30.880 44.000 L 65.180 167.490 C 68.574 179.600 79.603 187.979 92.180 188.000 L 191.000 188.000 C 203.577 187.979 214.606 179.600 218.000 167.490 L 243.630 75.210 C 244.613 71.587 243.843 67.713 241.550 64.740 ZM 194.800 161.070 C 194.325 162.782 192.777 163.976 191.000 164.000 L 92.160 164.000 C 90.365 163.998 88.790 162.800 88.310 161.070 L 66.900 84.000 L 216.210 84.000 ZM 108.000 220.000 C 108.000 231.046 99.046 240.000 88.000 240.000 C 76.954 240.000 68.000 231.046 68.000 220.000 C 68.000 208.954 76.954 200.000 88.000 200.000 C 99.046 200.000 108.000 208.954 108.000 220.000 ZM 212.000 220.000 C 212.000 231.046 203.046 240.000 192.000 240.000 C 180.954 240.000 172.000 231.046 172.000 220.000 C 172.000 208.954 180.954 200.000 192.000 200.000 C 203.046 200.000 212.000 208.954 212.000 220.000 Z"),
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
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
