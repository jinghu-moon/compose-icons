package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorBoldIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.440 120.590 L 137.440 8.590 C 135.165 5.691 131.685 3.999 128.000 3.999 C 124.315 3.999 120.835 5.691 118.560 8.590 L 30.560 120.590 C 27.145 124.940 27.145 131.060 30.560 135.410 L 31.160 136.170 C 31.288 136.370 31.436 136.558 31.600 136.730 L 118.600 247.410 C 120.875 250.309 124.355 252.001 128.040 252.001 C 131.725 252.001 135.205 250.309 137.480 247.410 L 225.480 135.410 C 228.883 131.051 228.867 124.931 225.440 120.590 ZM 140.000 50.700 L 197.120 123.400 L 140.000 149.400 ZM 116.000 149.360 L 58.880 123.360 L 116.000 50.700 ZM 116.000 175.730 L 116.000 205.300 L 79.850 159.300 ZM 140.000 175.730 L 176.150 159.300 L 140.000 205.300 Z"),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
