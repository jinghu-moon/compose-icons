package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorThinIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 187.000 195.000 C 187.708 195.790 188.074 196.830 188.016 197.889 C 187.957 198.949 187.481 199.942 186.690 200.650 C 164.891 220.160 133.829 225.426 106.818 214.191 C 79.807 202.956 61.642 177.214 60.110 148.000 L 40.000 148.000 C 37.791 148.000 36.000 146.209 36.000 144.000 C 36.000 141.791 37.791 140.000 40.000 140.000 L 60.000 140.000 L 60.000 116.000 L 40.000 116.000 C 37.791 116.000 36.000 114.209 36.000 112.000 C 36.000 109.791 37.791 108.000 40.000 108.000 L 60.110 108.000 C 61.649 78.794 79.810 53.062 106.813 41.828 C 133.817 30.594 164.870 35.853 186.670 55.350 C 188.327 56.825 188.475 59.363 187.000 61.020 C 185.525 62.677 182.987 62.825 181.330 61.350 C 161.886 43.968 134.214 39.238 110.100 49.175 C 85.987 59.112 69.682 81.966 68.130 108.000 L 136.000 108.000 C 138.209 108.000 140.000 109.791 140.000 112.000 C 140.000 114.209 138.209 116.000 136.000 116.000 L 68.000 116.000 L 68.000 140.000 L 120.000 140.000 C 122.209 140.000 124.000 141.791 124.000 144.000 C 124.000 146.209 122.209 148.000 120.000 148.000 L 68.130 148.000 C 69.667 174.042 85.967 196.908 110.084 206.855 C 134.200 216.802 161.881 212.076 181.330 194.690 C 182.121 193.975 183.165 193.606 184.230 193.664 C 185.294 193.723 186.291 194.203 187.000 195.000 Z"),
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
