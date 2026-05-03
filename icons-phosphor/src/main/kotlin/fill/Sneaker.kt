package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorFillIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.650 129.110 L 200.590 119.760 C 199.738 119.464 198.812 119.464 197.960 119.760 L 154.730 135.480 C 153.857 135.809 152.933 135.984 152.000 136.000 C 148.400 135.998 145.244 133.592 144.290 130.120 C 143.243 126.014 145.510 121.789 149.510 120.390 L 168.000 113.670 C 169.018 113.303 169.692 112.331 169.679 111.249 C 169.665 110.166 168.967 109.211 167.940 108.870 C 164.662 107.776 161.660 105.985 159.140 103.620 C 158.041 102.538 156.419 102.184 154.970 102.710 L 130.750 111.510 C 128.653 112.271 126.333 112.122 124.351 111.098 C 122.369 110.075 120.904 108.270 120.310 106.120 C 119.263 102.014 121.530 97.789 125.530 96.390 L 146.000 88.930 C 147.035 88.554 147.869 87.769 148.307 86.758 C 148.744 85.748 148.745 84.602 148.310 83.590 L 145.250 76.430 C 144.416 74.474 142.198 73.512 140.200 74.240 L 114.700 83.510 C 112.603 84.271 110.283 84.122 108.301 83.098 C 106.319 82.075 104.854 80.270 104.260 78.120 C 103.213 74.014 105.480 69.789 109.480 68.390 L 133.480 59.660 C 134.512 59.284 135.345 58.500 135.782 57.492 C 136.219 56.484 136.222 55.340 135.790 54.330 L 130.390 41.600 C 130.390 41.600 130.390 41.530 130.390 41.500 C 126.960 33.807 118.154 30.091 110.250 33.000 L 34.530 60.490 C 28.216 62.803 24.013 68.806 24.000 75.530 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 240.000 208.000 C 248.837 208.000 256.000 200.837 256.000 192.000 L 256.000 167.060 C 256.001 149.842 244.984 134.555 228.650 129.110 ZM 240.000 192.000 L 40.000 192.000 L 40.000 176.000 L 240.000 176.000 Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
