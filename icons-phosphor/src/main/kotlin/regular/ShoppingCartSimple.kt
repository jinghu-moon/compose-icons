package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorRegularIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 216.000 C 104.000 224.837 96.837 232.000 88.000 232.000 C 79.163 232.000 72.000 224.837 72.000 216.000 C 72.000 207.163 79.163 200.000 88.000 200.000 C 96.837 200.000 104.000 207.163 104.000 216.000 ZM 192.000 200.000 C 183.163 200.000 176.000 207.163 176.000 216.000 C 176.000 224.837 183.163 232.000 192.000 232.000 C 200.837 232.000 208.000 224.837 208.000 216.000 C 208.000 207.163 200.837 200.000 192.000 200.000 ZM 239.710 74.140 L 214.070 166.420 C 211.173 176.778 201.755 183.955 191.000 184.000 L 92.160 184.000 C 81.372 183.995 71.906 176.810 69.000 166.420 L 33.920 40.000 L 16.000 40.000 C 11.582 40.000 8.000 36.418 8.000 32.000 C 8.000 27.582 11.582 24.000 16.000 24.000 L 40.000 24.000 C 43.595 23.999 46.748 26.396 47.710 29.860 L 57.190 64.000 L 232.000 64.000 C 234.500 64.000 236.857 65.168 238.370 67.158 C 239.883 69.148 240.379 71.731 239.710 74.140 ZM 221.470 80.000 L 61.640 80.000 L 84.450 162.140 C 85.412 165.604 88.565 168.001 92.160 168.000 L 191.000 168.000 C 194.595 168.001 197.748 165.604 198.710 162.140 Z"),
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
