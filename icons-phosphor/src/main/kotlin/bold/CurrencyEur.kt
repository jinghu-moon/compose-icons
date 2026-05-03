package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorBoldIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.940 189.660 C 195.080 192.034 196.184 195.164 196.007 198.356 C 195.831 201.547 194.388 204.536 192.000 206.660 C 169.462 226.806 137.838 233.289 109.192 223.634 C 80.545 213.980 59.296 189.678 53.550 160.000 L 40.000 160.000 C 33.373 160.000 28.000 154.627 28.000 148.000 C 28.000 141.373 33.373 136.000 40.000 136.000 L 52.000 136.000 L 52.000 120.000 L 40.000 120.000 C 33.373 120.000 28.000 114.627 28.000 108.000 C 28.000 101.373 33.373 96.000 40.000 96.000 L 53.550 96.000 C 59.310 66.330 80.565 42.043 109.209 32.399 C 137.853 22.756 169.469 29.245 192.000 49.390 C 196.940 53.808 197.363 61.395 192.945 66.335 C 188.527 71.275 180.940 71.698 176.000 67.280 C 160.531 53.448 139.014 48.591 119.103 54.436 C 99.192 60.282 83.716 76.001 78.180 96.000 L 136.000 96.000 C 142.627 96.000 148.000 101.373 148.000 108.000 C 148.000 114.627 142.627 120.000 136.000 120.000 L 76.000 120.000 L 76.000 136.000 L 120.000 136.000 C 126.627 136.000 132.000 141.373 132.000 148.000 C 132.000 154.627 126.627 160.000 120.000 160.000 L 78.180 160.000 C 83.716 179.999 99.192 195.718 119.103 201.564 C 139.014 207.409 160.531 202.552 176.000 188.720 C 180.938 184.304 188.521 184.724 192.940 189.660 Z"),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
