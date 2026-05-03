package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorLightIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 174.000 216.000 C 174.000 219.314 171.314 222.000 168.000 222.000 L 24.000 222.000 C 20.686 222.000 18.000 219.314 18.000 216.000 C 18.000 212.686 20.686 210.000 24.000 210.000 L 168.000 210.000 C 171.314 210.000 174.000 212.686 174.000 216.000 ZM 245.900 92.780 C 245.571 94.454 244.546 95.908 243.080 96.780 L 95.670 184.780 C 89.835 188.193 83.200 189.998 76.440 190.010 C 66.799 189.998 57.526 186.303 50.520 179.680 L 50.420 179.590 L 14.370 144.360 C 10.957 141.135 9.388 136.412 10.193 131.786 C 10.997 127.159 14.068 123.244 18.370 121.360 L 21.370 119.870 C 22.792 119.176 24.431 119.071 25.930 119.580 L 55.080 129.410 L 78.250 115.410 L 54.550 92.410 C 51.053 89.190 49.429 84.415 50.237 79.731 C 51.046 75.046 54.176 71.092 58.550 69.230 L 58.790 69.130 L 65.940 66.420 C 67.291 65.916 68.779 65.916 70.130 66.420 L 124.970 86.600 L 177.350 55.330 C 193.473 45.757 214.177 49.446 226.000 64.000 L 226.090 64.110 L 244.730 88.000 C 245.786 89.353 246.211 91.093 245.900 92.780 ZM 231.090 90.000 L 216.670 71.530 C 208.574 61.597 194.425 59.092 183.410 65.640 L 128.600 98.360 C 127.044 99.290 125.151 99.466 123.450 98.840 L 68.000 78.450 L 63.100 80.300 C 62.506 80.570 62.092 81.124 62.000 81.770 C 61.885 82.444 62.122 83.131 62.630 83.590 L 62.800 83.740 L 92.150 112.230 C 93.485 113.525 94.144 115.365 93.935 117.213 C 93.725 119.061 92.671 120.707 91.080 121.670 L 58.890 141.160 C 57.384 142.067 55.557 142.268 53.890 141.710 L 24.440 131.770 L 23.510 132.230 L 23.230 132.360 C 22.612 132.627 22.170 133.186 22.054 133.849 C 21.937 134.511 22.161 135.188 22.650 135.650 L 22.750 135.740 L 58.750 171.020 C 67.108 178.894 79.660 180.308 89.560 174.490 Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
