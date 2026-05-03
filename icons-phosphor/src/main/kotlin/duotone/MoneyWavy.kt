package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorDuotoneIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 16.000 69.210 L 16.000 189.210 C 107.640 144.440 148.360 231.560 240.000 186.790 L 240.000 66.790 C 148.360 111.560 107.640 24.440 16.000 69.210 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 244.240 60.000 C 241.899 58.539 238.969 58.388 236.490 59.600 C 193.560 80.600 162.900 70.760 130.490 60.380 C 96.490 49.490 61.240 38.240 12.540 62.020 C 9.763 63.352 7.997 66.160 8.000 69.240 L 8.000 189.170 C 8.000 191.929 9.421 194.494 11.762 195.956 C 14.102 197.418 17.030 197.571 19.510 196.360 C 62.440 175.360 93.100 185.200 125.560 195.580 C 144.800 201.730 164.400 208.000 186.560 208.000 C 203.650 208.000 222.290 204.280 243.470 193.940 C 246.215 192.600 247.957 189.814 247.960 186.760 L 247.960 66.830 C 247.985 64.063 246.578 61.480 244.240 60.000 ZM 232.000 181.670 C 191.400 199.840 161.750 190.360 130.440 180.350 C 111.200 174.200 91.600 167.930 69.440 167.930 C 53.871 168.006 38.460 171.061 24.040 176.930 L 24.040 74.330 C 64.640 56.160 94.290 65.640 125.600 75.650 C 156.910 85.660 189.140 96.000 232.000 79.090 ZM 128.000 96.000 C 110.327 96.000 96.000 110.327 96.000 128.000 C 96.000 145.673 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 145.673 160.000 128.000 C 160.000 110.327 145.673 96.000 128.000 96.000 ZM 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 ZM 56.000 96.000 L 56.000 144.000 C 56.000 148.418 52.418 152.000 48.000 152.000 C 43.582 152.000 40.000 148.418 40.000 144.000 L 40.000 96.000 C 40.000 91.582 43.582 88.000 48.000 88.000 C 52.418 88.000 56.000 91.582 56.000 96.000 ZM 200.000 160.000 L 200.000 112.000 C 200.000 107.582 203.582 104.000 208.000 104.000 C 212.418 104.000 216.000 107.582 216.000 112.000 L 216.000 160.000 C 216.000 164.418 212.418 168.000 208.000 168.000 C 203.582 168.000 200.000 164.418 200.000 160.000 Z"),
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
