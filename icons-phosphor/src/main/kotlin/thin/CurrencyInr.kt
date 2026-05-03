package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorThinIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 80.000 C 204.000 82.209 202.209 84.000 200.000 84.000 L 163.420 84.000 C 163.801 86.650 163.995 89.323 164.000 92.000 C 163.967 122.914 138.914 147.967 108.000 148.000 L 82.350 148.000 L 162.690 221.000 C 163.768 221.956 164.248 223.417 163.948 224.826 C 163.647 226.235 162.613 227.374 161.239 227.807 C 159.865 228.240 158.364 227.902 157.310 226.920 L 69.310 146.920 C 68.117 145.803 67.723 144.073 68.315 142.550 C 68.907 141.028 70.366 140.018 72.000 140.000 L 108.000 140.000 C 122.127 139.997 135.536 133.771 144.655 122.981 C 153.773 112.190 157.675 97.930 155.320 84.000 L 72.000 84.000 C 69.791 84.000 68.000 82.209 68.000 80.000 C 68.000 77.791 69.791 76.000 72.000 76.000 L 153.250 76.000 C 146.448 56.840 128.331 44.029 108.000 44.000 L 72.000 44.000 C 69.791 44.000 68.000 42.209 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 L 200.000 36.000 C 202.209 36.000 204.000 37.791 204.000 40.000 C 204.000 42.209 202.209 44.000 200.000 44.000 L 136.810 44.000 C 148.781 51.209 157.640 62.616 161.660 76.000 L 200.000 76.000 C 202.209 76.000 204.000 77.791 204.000 80.000 Z"),
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
