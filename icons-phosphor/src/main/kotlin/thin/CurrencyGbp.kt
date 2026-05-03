package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorThinIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 208.000 C 188.000 210.209 186.209 212.000 184.000 212.000 L 56.000 212.000 C 53.791 212.000 52.000 210.209 52.000 208.000 C 52.000 205.791 53.791 204.000 56.000 204.000 L 60.000 204.000 C 77.673 204.000 92.000 189.673 92.000 172.000 L 92.000 132.000 L 56.000 132.000 C 53.791 132.000 52.000 130.209 52.000 128.000 C 52.000 125.791 53.791 124.000 56.000 124.000 L 92.000 124.000 L 92.000 84.000 C 92.015 65.429 102.742 48.533 119.541 40.618 C 136.341 32.702 156.200 35.188 170.530 47.000 C 171.664 47.900 172.223 49.341 171.992 50.770 C 171.762 52.199 170.778 53.392 169.419 53.889 C 168.060 54.387 166.539 54.112 165.440 53.170 C 153.498 43.328 136.951 41.257 122.952 47.852 C 108.954 54.447 100.015 68.525 100.000 84.000 L 100.000 124.000 L 136.000 124.000 C 138.209 124.000 140.000 125.791 140.000 128.000 C 140.000 130.209 138.209 132.000 136.000 132.000 L 100.000 132.000 L 100.000 172.000 C 100.000 184.590 94.072 196.446 84.000 204.000 L 184.000 204.000 C 186.209 204.000 188.000 205.791 188.000 208.000 Z"),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
