package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorRegularIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.140 58.870 C 228.620 57.051 226.371 56.000 224.000 56.000 L 62.680 56.000 L 56.600 22.570 C 55.909 18.766 52.596 16.001 48.730 16.000 L 24.000 16.000 C 19.582 16.000 16.000 19.582 16.000 24.000 C 16.000 28.418 19.582 32.000 24.000 32.000 L 42.000 32.000 L 67.560 172.290 C 68.313 176.451 70.152 180.338 72.890 183.560 C 62.400 193.358 61.018 209.503 69.692 220.941 C 78.365 232.379 94.284 235.405 106.549 227.947 C 118.815 220.489 123.454 204.964 117.290 192.000 L 162.710 192.000 C 160.920 195.747 159.994 199.848 160.000 204.000 C 160.000 219.464 172.536 232.000 188.000 232.000 C 203.464 232.000 216.000 219.464 216.000 204.000 C 216.000 188.536 203.464 176.000 188.000 176.000 L 91.170 176.000 C 87.304 175.999 83.991 173.234 83.300 169.430 L 80.130 152.000 L 196.130 152.000 C 207.729 151.998 217.667 143.702 219.740 132.290 L 231.900 65.430 C 232.317 63.090 231.672 60.687 230.140 58.870 ZM 104.000 204.000 C 104.000 210.627 98.627 216.000 92.000 216.000 C 85.373 216.000 80.000 210.627 80.000 204.000 C 80.000 197.373 85.373 192.000 92.000 192.000 C 98.627 192.000 104.000 197.373 104.000 204.000 ZM 200.000 204.000 C 200.000 210.627 194.627 216.000 188.000 216.000 C 181.373 216.000 176.000 210.627 176.000 204.000 C 176.000 197.373 181.373 192.000 188.000 192.000 C 194.627 192.000 200.000 197.373 200.000 204.000 ZM 204.000 129.430 C 203.307 133.245 199.978 136.014 196.100 136.000 L 77.220 136.000 L 65.590 72.000 L 214.410 72.000 Z"),
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
