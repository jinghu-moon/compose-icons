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
                pathData = parseSvgPathData("M192.94 189.66c2.14 2.374 3.244 5.504 3.067 8.696-.176 3.191-1.619 6.18-4.007 8.304-22.538 20.146-54.162 26.629-82.808 16.974C80.545 213.98 59.296 189.678 53.55 160h-13.55c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12v-16h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h13.55C59.31 66.33 80.565 42.043 109.209 32.399 137.853 22.756 169.469 29.245 192 49.39c4.94 4.418 5.363 12.005 .945 16.945-4.418 4.94-12.005 5.363-16.945 .945C160.531 53.448 139.014 48.591 119.103 54.436 99.192 60.282 83.716 76.001 78.18 96h57.82c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-60v16h44c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-41.82c5.536 19.999 21.012 35.718 40.923 41.564 19.911 5.846 41.428 .988 56.897-12.844 4.938-4.416 12.521-3.996 16.94 .94Z"),
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
