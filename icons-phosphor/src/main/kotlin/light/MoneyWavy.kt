package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorLightIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.180 61.720 C 241.425 60.625 239.229 60.512 237.370 61.420 C 193.710 82.740 162.680 72.810 129.830 62.300 C 96.160 51.530 61.350 40.400 13.370 63.840 C 11.309 64.845 10.001 66.937 10.000 69.230 L 10.000 189.230 C 10.001 191.298 11.067 193.220 12.822 194.316 C 14.576 195.412 16.771 195.527 18.630 194.620 C 62.290 173.300 93.320 183.230 126.170 193.740 C 145.170 199.830 164.630 206.040 186.590 206.040 C 203.440 206.040 221.800 202.380 242.590 192.200 C 244.651 191.195 245.959 189.103 245.960 186.810 L 245.960 66.810 C 245.969 64.748 244.920 62.826 243.180 61.720 ZM 234.000 183.000 C 192.100 202.210 161.830 192.530 129.830 182.290 C 110.780 176.180 91.370 170.000 69.410 170.000 C 54.920 170.000 39.330 172.700 22.000 179.920 L 22.000 73.000 C 63.900 53.790 94.170 63.470 126.170 73.710 C 157.780 83.840 190.410 94.280 234.000 76.110 ZM 128.000 98.000 C 111.431 98.000 98.000 111.431 98.000 128.000 C 98.000 144.569 111.431 158.000 128.000 158.000 C 144.569 158.000 158.000 144.569 158.000 128.000 C 158.000 111.431 144.569 98.000 128.000 98.000 ZM 128.000 146.000 C 118.059 146.000 110.000 137.941 110.000 128.000 C 110.000 118.059 118.059 110.000 128.000 110.000 C 137.941 110.000 146.000 118.059 146.000 128.000 C 146.000 137.941 137.941 146.000 128.000 146.000 ZM 54.000 96.000 L 54.000 144.000 C 54.000 147.314 51.314 150.000 48.000 150.000 C 44.686 150.000 42.000 147.314 42.000 144.000 L 42.000 96.000 C 42.000 92.686 44.686 90.000 48.000 90.000 C 51.314 90.000 54.000 92.686 54.000 96.000 ZM 202.000 160.000 L 202.000 112.000 C 202.000 108.686 204.686 106.000 208.000 106.000 C 211.314 106.000 214.000 108.686 214.000 112.000 L 214.000 160.000 C 214.000 163.314 211.314 166.000 208.000 166.000 C 204.686 166.000 202.000 163.314 202.000 160.000 Z"),
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
