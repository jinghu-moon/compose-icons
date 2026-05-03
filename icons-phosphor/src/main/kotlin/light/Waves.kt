package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorLightIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.620 178.580 C 221.636 179.805 222.124 181.384 221.976 182.969 C 221.827 184.553 221.056 186.014 219.830 187.030 C 202.960 201.030 187.830 206.030 174.080 206.030 C 155.890 206.030 139.950 197.370 125.140 189.330 C 99.140 175.210 76.700 163.020 43.830 190.330 C 41.254 192.445 37.450 192.071 35.335 189.495 C 33.220 186.919 33.594 183.115 36.170 181.000 C 75.300 148.550 104.820 164.590 130.860 178.740 C 156.900 192.890 179.300 205.050 212.170 177.740 C 213.401 176.730 214.984 176.251 216.569 176.408 C 218.154 176.566 219.612 177.347 220.620 178.580 ZM 212.170 121.770 C 179.300 149.040 156.850 136.840 130.860 122.770 C 104.870 108.700 75.300 92.540 36.170 125.000 C 33.616 127.115 33.260 130.901 35.375 133.455 C 37.490 136.009 41.276 136.365 43.830 134.250 C 76.700 106.980 99.150 119.170 125.140 133.250 C 139.950 141.250 155.890 149.960 174.080 149.960 C 187.870 149.960 202.960 144.960 219.830 130.960 C 222.382 128.845 222.735 125.062 220.620 122.510 C 218.505 119.958 214.722 119.605 212.170 121.720 ZM 43.830 78.210 C 76.700 50.940 99.150 63.140 125.140 77.210 C 140.000 85.300 155.890 94.000 174.080 94.000 C 187.870 94.000 202.960 89.000 219.830 75.000 C 222.382 72.885 222.735 69.102 220.620 66.550 C 218.505 63.998 214.722 63.645 212.170 65.760 C 179.300 93.030 156.850 80.830 130.860 66.760 C 104.870 52.690 75.300 36.520 36.170 69.000 C 33.618 71.115 33.265 74.898 35.380 77.450 C 37.495 80.002 41.278 80.355 43.830 78.240 Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
