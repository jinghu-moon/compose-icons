package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorBoldIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.360 56.550 C 242.847 54.356 238.450 54.129 234.730 55.950 C 193.250 76.240 163.330 66.660 131.660 56.510 C 98.480 45.890 60.880 33.850 10.730 58.370 C 6.609 60.385 3.997 64.573 4.000 69.160 L 4.000 189.260 C 3.997 193.401 6.129 197.252 9.642 199.446 C 13.154 201.640 17.549 201.869 21.270 200.050 C 62.750 179.760 92.670 189.340 124.340 199.490 C 143.170 205.490 163.420 212.000 186.580 212.000 C 204.240 212.000 223.580 208.230 245.270 197.630 C 249.391 195.615 252.003 191.427 252.000 186.840 L 252.000 66.740 C 252.005 62.598 249.873 58.746 246.360 56.550 ZM 228.000 179.120 C 190.000 195.280 161.590 186.190 131.660 176.610 C 112.830 170.610 92.580 164.090 69.420 164.090 C 55.308 164.116 41.303 166.533 28.000 171.240 L 28.000 76.880 C 66.000 60.720 94.410 69.800 124.340 79.390 C 153.600 88.760 186.290 99.230 228.000 84.760 ZM 128.000 96.000 C 110.327 96.000 96.000 110.327 96.000 128.000 C 96.000 145.673 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 145.673 160.000 128.000 C 159.967 110.341 145.659 96.033 128.000 96.000 ZM 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 ZM 64.000 100.000 L 64.000 140.000 C 64.000 146.627 58.627 152.000 52.000 152.000 C 45.373 152.000 40.000 146.627 40.000 140.000 L 40.000 100.000 C 40.000 93.373 45.373 88.000 52.000 88.000 C 58.627 88.000 64.000 93.373 64.000 100.000 ZM 192.000 156.000 L 192.000 116.000 C 192.000 109.373 197.373 104.000 204.000 104.000 C 210.627 104.000 216.000 109.373 216.000 116.000 L 216.000 156.000 C 216.000 162.627 210.627 168.000 204.000 168.000 C 197.373 168.000 192.000 162.627 192.000 156.000 Z"),
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
        return _moneyWavy!!
    }

private var _moneyWavy: ImageVector? = null
