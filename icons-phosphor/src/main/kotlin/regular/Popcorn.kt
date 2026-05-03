package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorRegularIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.520 74.210 C 227.614 72.417 224.951 71.670 222.390 72.210 C 219.253 60.931 211.750 51.368 201.542 45.636 C 191.334 39.905 179.263 38.477 168.000 41.670 C 160.832 26.029 145.205 16.000 128.000 16.000 C 110.795 16.000 95.168 26.029 88.000 41.670 C 76.740 38.473 64.669 39.895 54.460 45.621 C 44.251 51.347 36.744 60.905 33.600 72.180 C 30.929 71.632 28.163 72.482 26.261 74.435 C 24.359 76.387 23.582 79.175 24.200 81.830 L 54.760 211.670 C 56.463 218.897 62.915 224.003 70.340 224.000 L 185.660 224.000 C 193.085 224.003 199.537 218.897 201.240 211.670 L 231.790 81.830 C 232.438 79.067 231.575 76.168 229.520 74.210 ZM 76.000 56.000 C 80.572 55.987 85.076 57.107 89.110 59.260 C 91.317 60.431 93.945 60.503 96.214 59.455 C 98.482 58.407 100.130 56.360 100.670 53.920 C 103.523 41.116 114.882 32.009 128.000 32.009 C 141.118 32.009 152.477 41.116 155.330 53.920 C 155.870 56.360 157.518 58.407 159.786 59.455 C 162.055 60.503 164.683 60.431 166.890 59.260 C 174.391 55.281 183.292 54.921 191.089 58.280 C 198.887 61.640 204.739 68.356 207.000 76.540 L 168.440 87.540 L 133.950 73.740 C 130.137 72.215 125.883 72.215 122.070 73.740 L 87.570 87.560 L 49.000 76.540 C 52.356 64.400 63.405 55.995 76.000 56.000 ZM 70.340 208.000 L 42.910 91.440 L 80.760 102.250 L 94.860 208.000 ZM 145.000 208.000 L 111.000 208.000 L 96.750 101.120 L 128.000 88.620 L 159.250 101.120 ZM 185.660 208.000 L 161.140 208.000 L 175.240 102.250 L 213.090 91.440 Z"),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
