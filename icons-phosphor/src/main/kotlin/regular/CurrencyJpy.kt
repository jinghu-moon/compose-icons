package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorRegularIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.190 53.070 L 144.880 128.000 L 176.000 128.000 C 180.418 128.000 184.000 131.582 184.000 136.000 C 184.000 140.418 180.418 144.000 176.000 144.000 L 136.000 144.000 L 136.000 160.000 L 176.000 160.000 C 180.418 160.000 184.000 163.582 184.000 168.000 C 184.000 172.418 180.418 176.000 176.000 176.000 L 136.000 176.000 L 136.000 216.000 C 136.000 220.418 132.418 224.000 128.000 224.000 C 123.582 224.000 120.000 220.418 120.000 216.000 L 120.000 176.000 L 80.000 176.000 C 75.582 176.000 72.000 172.418 72.000 168.000 C 72.000 163.582 75.582 160.000 80.000 160.000 L 120.000 160.000 L 120.000 144.000 L 80.000 144.000 C 75.582 144.000 72.000 140.418 72.000 136.000 C 72.000 131.582 75.582 128.000 80.000 128.000 L 111.120 128.000 L 49.810 53.070 C 47.010 49.651 47.511 44.610 50.930 41.810 C 54.349 39.010 59.390 39.511 62.190 42.930 L 128.000 123.370 L 193.810 42.930 C 196.610 39.511 201.651 39.010 205.070 41.810 C 208.489 44.610 208.990 49.651 206.190 53.070 Z"),
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
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
