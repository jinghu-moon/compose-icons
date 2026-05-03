package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorRegularIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 190.000 192.330 C 191.416 193.912 192.145 195.991 192.026 198.111 C 191.908 200.230 190.953 202.215 189.370 203.630 C 166.935 223.720 135.119 229.508 107.046 218.608 C 78.973 207.708 59.399 181.965 56.400 152.000 L 40.000 152.000 C 35.582 152.000 32.000 148.418 32.000 144.000 C 32.000 139.582 35.582 136.000 40.000 136.000 L 56.000 136.000 L 56.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 116.418 32.000 112.000 C 32.000 107.582 35.582 104.000 40.000 104.000 L 56.400 104.000 C 59.408 74.047 78.976 48.317 107.038 37.419 C 135.100 26.520 166.904 32.298 189.340 52.370 C 192.634 55.319 192.914 60.381 189.965 63.675 C 187.016 66.969 181.954 67.249 178.660 64.300 C 160.927 48.453 135.869 43.747 113.594 52.078 C 91.319 60.410 75.501 80.406 72.520 104.000 L 136.000 104.000 C 140.418 104.000 144.000 107.582 144.000 112.000 C 144.000 116.418 140.418 120.000 136.000 120.000 L 72.000 120.000 L 72.000 136.000 L 120.000 136.000 C 124.418 136.000 128.000 139.582 128.000 144.000 C 128.000 148.418 124.418 152.000 120.000 152.000 L 72.520 152.000 C 75.498 175.596 91.315 195.595 113.590 203.929 C 135.866 212.263 160.925 207.557 178.660 191.710 C 180.242 190.281 182.330 189.542 184.459 189.659 C 186.588 189.775 188.583 190.737 190.000 192.330 Z"),
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
