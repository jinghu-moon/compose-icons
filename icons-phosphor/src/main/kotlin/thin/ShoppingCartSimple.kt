package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorThinIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.180 69.580 C 234.425 68.586 233.248 68.002 232.000 68.000 L 54.150 68.000 L 43.850 30.930 C 43.370 29.200 41.795 28.002 40.000 28.000 L 16.000 28.000 C 13.791 28.000 12.000 29.791 12.000 32.000 C 12.000 34.209 13.791 36.000 16.000 36.000 L 37.000 36.000 L 72.890 165.350 C 75.311 173.995 83.182 179.979 92.160 180.000 L 191.000 180.000 C 199.978 179.979 207.849 173.995 210.270 165.350 L 235.900 73.070 C 236.220 71.858 235.954 70.566 235.180 69.580 ZM 202.510 163.210 C 201.073 168.386 196.372 171.976 191.000 172.000 L 92.160 172.000 C 86.770 171.999 82.042 168.404 80.600 163.210 L 56.370 76.000 L 226.740 76.000 ZM 100.000 216.000 C 100.000 222.627 94.627 228.000 88.000 228.000 C 81.373 228.000 76.000 222.627 76.000 216.000 C 76.000 209.373 81.373 204.000 88.000 204.000 C 94.627 204.000 100.000 209.373 100.000 216.000 ZM 204.000 216.000 C 204.000 222.627 198.627 228.000 192.000 228.000 C 185.373 228.000 180.000 222.627 180.000 216.000 C 180.000 209.373 185.373 204.000 192.000 204.000 C 198.627 204.000 204.000 209.373 204.000 216.000 Z"),
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
