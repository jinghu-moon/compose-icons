package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorLightIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 102.000 C 192.569 102.000 206.000 88.569 206.000 72.000 C 206.000 55.431 192.569 42.000 176.000 42.000 C 159.431 42.000 146.000 55.431 146.000 72.000 C 146.000 88.569 159.431 102.000 176.000 102.000 ZM 176.000 54.000 C 185.941 54.000 194.000 62.059 194.000 72.000 C 194.000 81.941 185.941 90.000 176.000 90.000 C 166.059 90.000 158.000 81.941 158.000 72.000 C 158.000 62.059 166.059 54.000 176.000 54.000 ZM 220.620 186.580 C 221.636 187.805 222.124 189.384 221.976 190.969 C 221.827 192.553 221.056 194.014 219.830 195.030 C 202.960 209.030 187.830 214.030 174.080 214.030 C 155.890 214.030 139.950 205.380 125.140 197.330 C 99.140 183.220 76.700 171.020 43.830 198.330 C 41.254 200.445 37.450 200.071 35.335 197.495 C 33.220 194.919 33.594 191.115 36.170 189.000 C 75.300 156.550 104.820 172.590 130.860 186.730 C 156.900 200.870 179.300 213.040 212.170 185.730 C 213.403 184.721 214.986 184.243 216.571 184.403 C 218.156 184.562 219.613 185.346 220.620 186.580 ZM 36.170 149.000 C 33.618 151.115 33.265 154.898 35.380 157.450 C 37.495 160.002 41.278 160.355 43.830 158.240 C 76.700 130.980 99.150 143.170 125.140 157.240 C 140.000 165.340 155.890 174.000 174.080 174.000 C 187.870 174.000 202.960 169.000 219.830 155.000 C 222.382 152.885 222.735 149.102 220.620 146.550 C 218.505 143.998 214.722 143.645 212.170 145.760 C 204.690 151.960 197.740 156.120 191.170 158.680 L 136.360 103.860 C 117.273 84.673 91.303 73.921 64.240 74.000 L 40.000 74.000 C 36.686 74.000 34.000 76.686 34.000 80.000 C 34.000 83.314 36.686 86.000 40.000 86.000 L 64.240 86.000 C 80.099 85.968 95.682 90.154 109.390 98.130 L 77.290 130.230 C 64.770 131.260 51.180 136.570 36.170 149.000 ZM 127.880 112.360 L 177.420 161.910 C 161.120 163.170 146.640 155.310 130.860 146.740 C 119.230 140.420 106.860 133.740 93.350 131.140 L 119.500 105.000 C 122.437 107.288 125.235 109.749 127.880 112.370 Z"),
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
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
