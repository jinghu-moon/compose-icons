package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorDuotoneIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 91.640 L 92.590 179.640 C 80.361 186.760 64.908 185.003 54.590 175.320 L 18.530 140.000 C 16.560 138.153 15.654 135.437 16.122 132.777 C 16.590 130.118 18.368 127.874 20.850 126.810 L 24.000 125.270 L 55.790 136.000 L 88.000 116.510 L 58.650 88.000 C 56.621 86.174 55.663 83.440 56.108 80.748 C 56.554 78.055 58.341 75.775 60.850 74.700 L 68.000 72.000 L 125.530 93.170 L 180.370 60.420 C 193.972 52.416 211.378 55.523 221.370 67.740 Z"),
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
                pathData = parseSvgPathData("M 176.000 216.000 C 176.000 220.418 172.418 224.000 168.000 224.000 L 24.000 224.000 C 19.582 224.000 16.000 220.418 16.000 216.000 C 16.000 211.582 19.582 208.000 24.000 208.000 L 168.000 208.000 C 172.418 208.000 176.000 211.582 176.000 216.000 ZM 247.860 93.150 C 247.437 95.402 246.068 97.365 244.100 98.540 L 96.690 186.540 C 90.545 190.143 83.553 192.048 76.430 192.060 C 66.283 192.048 56.524 188.160 49.150 181.190 L 49.030 181.070 L 13.000 145.800 C 9.129 142.124 7.346 136.758 8.247 131.496 C 9.149 126.234 12.616 121.768 17.490 119.590 L 20.490 118.120 C 22.385 117.190 24.570 117.046 26.570 117.720 L 54.830 127.260 L 75.000 115.060 L 53.170 93.870 C 49.181 90.195 47.326 84.750 48.240 79.404 C 49.155 74.058 52.716 69.539 57.700 67.400 L 58.020 67.270 L 65.170 64.560 C 66.973 63.888 68.957 63.888 70.760 64.560 L 124.700 84.380 L 176.270 53.600 C 193.257 43.490 215.090 47.373 227.550 62.720 L 227.670 62.870 L 246.310 86.760 C 247.719 88.569 248.283 90.896 247.860 93.150 ZM 228.120 89.450 L 215.120 72.780 C 207.642 63.632 194.599 61.328 184.440 67.360 L 129.640 100.080 C 127.562 101.312 125.040 101.547 122.770 100.720 L 68.000 80.580 L 64.000 82.110 L 64.210 82.310 L 93.570 110.800 C 95.347 112.527 96.224 114.979 95.944 117.441 C 95.664 119.903 94.259 122.096 92.140 123.380 L 59.930 142.870 C 57.913 144.088 55.462 144.355 53.230 143.600 L 24.560 133.930 L 24.370 134.030 L 24.000 134.200 C 24.048 134.234 24.092 134.275 24.130 134.320 L 60.130 169.580 C 67.847 176.832 79.421 178.127 88.550 172.760 Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
