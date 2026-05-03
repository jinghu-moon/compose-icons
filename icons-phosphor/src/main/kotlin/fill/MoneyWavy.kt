package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorFillIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.240 60.000 C 241.899 58.539 238.969 58.388 236.490 59.600 C 193.560 80.600 162.900 70.760 130.490 60.380 C 96.400 49.530 61.200 38.280 12.490 62.060 C 9.745 63.400 8.003 66.186 8.000 69.240 L 8.000 189.170 C 8.000 191.929 9.421 194.494 11.762 195.956 C 14.102 197.418 17.030 197.571 19.510 196.360 C 62.440 175.360 93.100 185.200 125.560 195.580 C 144.800 201.730 164.400 208.000 186.560 208.000 C 203.650 208.000 222.290 204.280 243.470 193.940 C 246.215 192.600 247.957 189.814 247.960 186.760 L 247.960 66.830 C 247.985 64.063 246.578 61.480 244.240 60.000 ZM 48.000 152.000 C 48.000 156.418 44.418 160.000 40.000 160.000 C 35.582 160.000 32.000 156.418 32.000 152.000 L 32.000 88.000 C 32.000 83.582 35.582 80.000 40.000 80.000 C 44.418 80.000 48.000 83.582 48.000 88.000 ZM 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 ZM 224.000 168.000 C 224.000 172.418 220.418 176.000 216.000 176.000 C 211.582 176.000 208.000 172.418 208.000 168.000 L 208.000 104.000 C 208.000 99.582 211.582 96.000 216.000 96.000 C 220.418 96.000 224.000 99.582 224.000 104.000 Z"),
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
        return _moneyWavy!!
    }

private var _moneyWavy: ImageVector? = null
