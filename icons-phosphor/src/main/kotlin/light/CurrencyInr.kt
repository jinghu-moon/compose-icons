package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorLightIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 80.000 C 206.000 83.314 203.314 86.000 200.000 86.000 L 165.690 86.000 C 165.895 87.993 165.998 89.996 166.000 92.000 C 165.961 124.017 140.017 149.961 108.000 150.000 L 87.520 150.000 L 164.000 219.560 C 166.452 221.791 166.631 225.588 164.400 228.040 C 162.169 230.492 158.372 230.671 155.920 228.440 L 67.920 148.440 C 66.079 146.767 65.462 144.132 66.367 141.816 C 67.272 139.499 69.513 137.982 72.000 138.000 L 108.000 138.000 C 133.391 137.967 153.967 117.391 154.000 92.000 C 153.993 89.994 153.860 87.990 153.600 86.000 L 72.000 86.000 C 68.686 86.000 66.000 83.314 66.000 80.000 C 66.000 76.686 68.686 74.000 72.000 74.000 L 150.330 74.000 C 143.094 57.037 126.442 46.022 108.000 46.000 L 72.000 46.000 C 68.686 46.000 66.000 43.314 66.000 40.000 C 66.000 36.686 68.686 34.000 72.000 34.000 L 200.000 34.000 C 203.314 34.000 206.000 36.686 206.000 40.000 C 206.000 43.314 203.314 46.000 200.000 46.000 L 143.270 46.000 C 152.552 53.126 159.473 62.884 163.130 74.000 L 200.000 74.000 C 203.314 74.000 206.000 76.686 206.000 80.000 Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
