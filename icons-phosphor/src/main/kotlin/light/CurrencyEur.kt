package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorLightIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.470 193.660 C 189.534 194.846 190.082 196.407 189.994 197.997 C 189.905 199.588 189.188 201.079 188.000 202.140 C 165.881 221.911 134.462 227.423 106.934 216.361 C 79.406 205.299 60.537 179.579 58.250 150.000 L 40.000 150.000 C 36.686 150.000 34.000 147.314 34.000 144.000 C 34.000 140.686 36.686 138.000 40.000 138.000 L 58.000 138.000 L 58.000 118.000 L 40.000 118.000 C 36.686 118.000 34.000 115.314 34.000 112.000 C 34.000 108.686 36.686 106.000 40.000 106.000 L 58.250 106.000 C 60.537 76.421 79.406 50.701 106.934 39.639 C 134.462 28.577 165.881 34.089 188.000 53.860 C 190.485 56.069 190.709 59.875 188.500 62.360 C 186.291 64.845 182.485 65.069 180.000 62.860 C 161.416 46.246 135.057 41.519 111.859 50.641 C 88.660 59.763 72.580 81.178 70.290 106.000 L 136.000 106.000 C 139.314 106.000 142.000 108.686 142.000 112.000 C 142.000 115.314 139.314 118.000 136.000 118.000 L 70.000 118.000 L 70.000 138.000 L 120.000 138.000 C 123.314 138.000 126.000 140.686 126.000 144.000 C 126.000 147.314 123.314 150.000 120.000 150.000 L 70.290 150.000 C 72.560 174.833 88.632 196.266 111.835 205.403 C 135.037 214.539 161.408 209.818 180.000 193.200 C 182.466 190.989 186.258 191.195 188.470 193.660 Z"),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
