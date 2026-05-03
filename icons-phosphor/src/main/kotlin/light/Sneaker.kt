package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorLightIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 131.000 L 167.270 110.760 C 160.370 108.467 154.745 103.390 151.760 96.760 L 128.510 42.310 C 125.523 35.593 117.850 32.331 110.940 34.840 L 35.220 62.370 C 29.694 64.393 26.014 69.645 26.000 75.530 L 26.000 192.000 C 26.000 199.732 32.268 206.000 40.000 206.000 L 240.000 206.000 C 247.732 206.000 254.000 199.732 254.000 192.000 L 254.000 167.060 C 254.002 150.696 243.527 136.168 228.000 131.000 ZM 39.320 73.650 L 115.000 46.120 C 115.217 46.037 115.448 45.996 115.680 46.000 C 116.439 46.000 117.132 46.430 117.470 47.110 L 125.470 65.790 L 102.000 74.360 C 99.270 75.351 97.641 78.154 98.133 81.016 C 98.625 83.878 101.096 85.977 104.000 86.000 C 104.683 85.993 105.360 85.868 106.000 85.630 L 130.180 76.840 L 136.490 91.600 L 118.000 98.360 C 115.270 99.351 113.641 102.154 114.133 105.016 C 114.625 107.878 117.096 109.977 120.000 110.000 C 120.682 109.992 121.358 109.870 122.000 109.640 L 141.260 102.640 C 143.746 107.782 147.359 112.297 151.830 115.850 L 134.000 122.360 C 131.270 123.351 129.641 126.154 130.133 129.016 C 130.625 131.878 133.096 133.977 136.000 134.000 C 136.699 133.997 137.392 133.876 138.050 133.640 L 166.690 123.220 L 224.220 142.400 C 233.086 145.346 239.683 152.833 241.490 162.000 L 38.000 162.000 L 38.000 75.530 C 38.000 74.688 38.528 73.936 39.320 73.650 ZM 240.000 194.000 L 40.000 194.000 C 38.895 194.000 38.000 193.105 38.000 192.000 L 38.000 174.000 L 242.000 174.000 L 242.000 192.000 C 242.000 193.105 241.105 194.000 240.000 194.000 Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
