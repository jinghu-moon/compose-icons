package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorLightIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 124.240 140.240 L 124.240 140.240 L 145.330 119.150 C 153.493 123.492 162.575 125.820 171.820 125.940 C 180.585 125.961 189.185 123.559 196.670 119.000 C 219.740 105.000 232.090 72.470 229.670 31.910 C 229.493 28.872 227.068 26.447 224.030 26.270 C 183.470 23.890 150.910 36.270 136.940 59.270 C 127.720 74.490 127.740 92.980 136.800 110.620 L 120.000 127.510 L 105.360 112.880 C 111.680 99.880 111.510 86.280 104.690 75.020 C 94.210 57.720 70.000 48.440 39.850 50.210 C 36.812 50.387 34.387 52.812 34.210 55.850 C 32.440 86.000 41.720 110.200 59.000 120.690 C 64.720 124.183 71.297 126.022 78.000 126.000 C 84.577 125.921 91.050 124.348 96.930 121.400 L 111.510 136.000 L 101.510 146.000 L 56.000 146.000 C 52.686 146.000 50.000 148.686 50.000 152.000 C 50.000 155.314 52.686 158.000 56.000 158.000 L 67.180 158.000 L 80.750 219.000 C 82.128 225.441 87.834 230.032 94.420 230.000 L 161.590 230.000 C 168.173 230.027 173.873 225.437 175.250 219.000 L 188.820 158.000 L 200.000 158.000 C 203.314 158.000 206.000 155.314 206.000 152.000 C 206.000 148.686 203.314 146.000 200.000 146.000 L 118.480 146.000 L 124.240 140.240 ZM 147.240 65.540 C 158.240 47.320 184.480 37.210 217.960 38.040 C 218.790 71.510 208.680 97.720 190.460 108.760 C 178.160 116.200 163.370 115.680 148.670 107.330 C 140.310 92.630 139.790 77.840 147.240 65.540 ZM 93.580 109.540 C 83.580 115.100 73.580 115.410 65.240 110.380 C 52.780 102.870 45.750 85.000 46.000 62.000 C 69.000 61.710 86.880 68.780 94.420 81.240 C 99.450 89.540 99.140 99.560 93.580 109.580 ZM 176.520 158.000 L 163.520 216.430 C 163.318 217.346 162.508 217.998 161.570 218.000 L 94.420 218.000 C 93.464 218.022 92.625 217.364 92.420 216.430 L 79.480 158.000 Z"),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
