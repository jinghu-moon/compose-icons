package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorThinIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 203.100 50.530 L 136.440 132.000 L 176.000 132.000 C 178.209 132.000 180.000 133.791 180.000 136.000 C 180.000 138.209 178.209 140.000 176.000 140.000 L 132.000 140.000 L 132.000 164.000 L 176.000 164.000 C 178.209 164.000 180.000 165.791 180.000 168.000 C 180.000 170.209 178.209 172.000 176.000 172.000 L 132.000 172.000 L 132.000 216.000 C 132.000 218.209 130.209 220.000 128.000 220.000 C 125.791 220.000 124.000 218.209 124.000 216.000 L 124.000 172.000 L 80.000 172.000 C 77.791 172.000 76.000 170.209 76.000 168.000 C 76.000 165.791 77.791 164.000 80.000 164.000 L 124.000 164.000 L 124.000 140.000 L 80.000 140.000 C 77.791 140.000 76.000 138.209 76.000 136.000 C 76.000 133.791 77.791 132.000 80.000 132.000 L 119.560 132.000 L 52.900 50.530 C 51.503 48.818 51.758 46.297 53.470 44.900 C 55.182 43.503 57.703 43.758 59.100 45.470 L 128.000 129.680 L 196.900 45.470 C 198.297 43.758 200.818 43.503 202.530 44.900 C 204.242 46.297 204.497 48.818 203.100 50.530 Z"),
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
