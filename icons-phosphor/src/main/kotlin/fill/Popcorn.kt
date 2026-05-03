package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorFillIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.520 74.210 C 227.614 72.417 224.951 71.670 222.390 72.210 C 219.253 60.931 211.750 51.368 201.542 45.636 C 191.334 39.905 179.263 38.477 168.000 41.670 C 160.832 26.029 145.205 16.000 128.000 16.000 C 110.795 16.000 95.168 26.029 88.000 41.670 C 76.740 38.473 64.669 39.895 54.460 45.621 C 44.251 51.347 36.744 60.905 33.600 72.180 C 30.929 71.632 28.163 72.482 26.261 74.435 C 24.359 76.387 23.582 79.175 24.200 81.830 L 54.760 211.670 C 56.463 218.897 62.915 224.003 70.340 224.000 L 185.660 224.000 C 193.085 224.003 199.537 218.897 201.240 211.670 L 231.790 81.830 C 232.438 79.067 231.575 76.168 229.520 74.210 ZM 70.340 208.000 L 42.910 91.440 L 80.760 102.250 L 94.860 208.000 ZM 122.060 73.760 L 87.570 87.560 L 49.000 76.540 C 51.261 68.359 57.112 61.645 64.907 58.286 C 72.702 54.927 81.600 55.285 89.100 59.260 C 91.307 60.431 93.935 60.503 96.204 59.455 C 98.472 58.407 100.120 56.360 100.660 53.920 C 103.513 41.116 114.872 32.009 127.990 32.009 C 141.108 32.009 152.467 41.116 155.320 53.920 C 155.860 56.360 157.508 58.407 159.776 59.455 C 162.045 60.503 164.673 60.431 166.880 59.260 C 174.382 55.277 183.285 54.915 191.086 58.275 C 198.886 61.634 204.740 68.353 207.000 76.540 L 168.440 87.540 L 133.950 73.740 C 130.131 72.219 125.874 72.226 122.060 73.760 ZM 185.660 208.000 L 161.140 208.000 L 175.240 102.250 L 213.090 91.440 Z"),
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
