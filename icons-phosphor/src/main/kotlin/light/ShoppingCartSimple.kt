package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorLightIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.780 68.370 C 235.645 66.876 233.876 65.999 232.000 66.000 L 55.670 66.000 L 45.780 30.390 C 45.057 27.795 42.694 26.000 40.000 26.000 L 16.000 26.000 C 12.686 26.000 10.000 28.686 10.000 32.000 C 10.000 35.314 12.686 38.000 16.000 38.000 L 35.440 38.000 L 71.000 165.890 C 73.666 175.382 82.301 181.956 92.160 182.000 L 191.000 182.000 C 200.874 181.974 209.530 175.396 212.200 165.890 L 237.830 73.610 C 238.320 71.795 237.931 69.856 236.780 68.370 ZM 200.580 162.680 C 199.382 166.987 195.471 169.976 191.000 170.000 L 92.160 170.000 C 87.671 169.998 83.733 167.005 82.530 162.680 L 59.000 78.000 L 224.110 78.000 ZM 102.000 216.000 C 102.000 223.732 95.732 230.000 88.000 230.000 C 80.268 230.000 74.000 223.732 74.000 216.000 C 74.000 208.268 80.268 202.000 88.000 202.000 C 95.732 202.000 102.000 208.268 102.000 216.000 ZM 206.000 216.000 C 206.000 223.732 199.732 230.000 192.000 230.000 C 184.268 230.000 178.000 223.732 178.000 216.000 C 178.000 208.268 184.268 202.000 192.000 202.000 C 199.732 202.000 206.000 208.268 206.000 216.000 Z"),
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
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
