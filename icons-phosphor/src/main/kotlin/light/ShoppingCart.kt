package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorLightIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.610 60.160 C 227.470 58.791 225.781 58.000 224.000 58.000 L 61.000 58.000 L 54.630 22.930 C 54.113 20.077 51.630 18.002 48.730 18.000 L 24.000 18.000 C 20.686 18.000 18.000 20.686 18.000 24.000 C 18.000 27.314 20.686 30.000 24.000 30.000 L 43.720 30.000 L 69.530 171.940 C 70.339 176.415 72.520 180.529 75.770 183.710 C 64.825 192.452 62.774 208.294 71.131 219.536 C 79.488 230.778 95.248 233.379 106.774 225.417 C 118.299 217.456 121.446 201.795 113.890 190.000 L 166.110 190.000 C 159.714 200.009 160.915 213.081 169.027 221.757 C 177.140 230.434 190.101 232.509 200.517 226.799 C 210.933 221.089 216.155 209.046 213.204 197.540 C 210.252 186.034 199.878 177.991 188.000 178.000 L 91.170 178.000 C 86.337 178.001 82.195 174.545 81.330 169.790 L 77.730 150.000 L 196.100 150.000 C 206.733 150.003 215.846 142.401 217.750 131.940 L 229.900 65.070 C 230.218 63.323 229.745 61.525 228.610 60.160 ZM 106.000 204.000 C 106.000 211.732 99.732 218.000 92.000 218.000 C 84.268 218.000 78.000 211.732 78.000 204.000 C 78.000 196.268 84.268 190.000 92.000 190.000 C 99.732 190.000 106.000 196.268 106.000 204.000 ZM 202.000 204.000 C 202.000 211.732 195.732 218.000 188.000 218.000 C 180.268 218.000 174.000 211.732 174.000 204.000 C 174.000 196.268 180.268 190.000 188.000 190.000 C 195.732 190.000 202.000 196.268 202.000 204.000 ZM 205.940 129.790 C 205.075 134.545 200.933 138.001 196.100 138.000 L 75.550 138.000 L 63.190 70.000 L 216.810 70.000 Z"),
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
