package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorThinIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 242.120 63.390 C 240.948 62.658 239.481 62.582 238.240 63.190 C 193.870 84.870 162.470 74.830 129.240 64.190 C 96.010 53.550 61.530 42.520 14.240 65.610 C 12.866 66.283 11.997 67.680 12.000 69.210 L 12.000 189.210 C 11.997 190.592 12.708 191.878 13.880 192.610 C 15.052 193.342 16.519 193.418 17.760 192.810 C 62.130 171.130 93.530 181.170 126.760 191.810 C 145.620 197.810 164.840 204.000 186.560 204.000 C 203.170 204.000 221.250 200.400 241.740 190.390 C 243.114 189.717 243.983 188.320 243.980 186.790 L 243.980 66.790 C 243.987 65.412 243.284 64.127 242.120 63.390 ZM 236.000 184.270 C 192.810 204.540 161.900 194.650 129.220 184.190 C 110.360 178.190 91.140 172.010 69.420 172.010 C 54.420 172.010 38.140 175.010 20.000 182.950 L 20.000 71.730 C 63.190 51.460 94.100 61.350 126.780 71.810 C 158.700 82.000 191.670 92.570 236.000 73.050 ZM 128.000 100.000 C 112.536 100.000 100.000 112.536 100.000 128.000 C 100.000 143.464 112.536 156.000 128.000 156.000 C 143.464 156.000 156.000 143.464 156.000 128.000 C 156.000 112.536 143.464 100.000 128.000 100.000 ZM 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 ZM 52.000 96.000 L 52.000 144.000 C 52.000 146.209 50.209 148.000 48.000 148.000 C 45.791 148.000 44.000 146.209 44.000 144.000 L 44.000 96.000 C 44.000 93.791 45.791 92.000 48.000 92.000 C 50.209 92.000 52.000 93.791 52.000 96.000 ZM 204.000 160.000 L 204.000 112.000 C 204.000 109.791 205.791 108.000 208.000 108.000 C 210.209 108.000 212.000 109.791 212.000 112.000 L 212.000 160.000 C 212.000 162.209 210.209 164.000 208.000 164.000 C 205.791 164.000 204.000 162.209 204.000 160.000 Z"),
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
