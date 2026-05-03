package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorLightIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 88.180 C 237.623 101.600 232.110 114.364 222.600 123.840 L 187.850 158.590 C 177.997 168.495 164.590 174.044 150.620 174.000 L 150.570 174.000 C 136.364 173.989 122.765 168.236 112.865 158.047 C 102.964 147.859 97.603 134.101 98.000 119.900 C 98.087 116.649 100.748 114.059 104.000 114.060 L 104.170 114.060 C 107.480 114.153 110.090 116.910 110.000 120.220 C 109.687 131.186 113.822 141.812 121.465 149.681 C 129.109 157.550 139.610 161.994 150.580 162.000 L 150.580 162.000 C 161.361 162.026 171.705 157.741 179.310 150.100 L 214.060 115.360 C 229.325 99.402 229.048 74.173 213.437 58.553 C 197.825 42.933 172.596 42.643 156.630 57.900 L 145.630 68.900 C 143.286 71.244 139.484 71.244 137.140 68.900 C 134.796 66.556 134.796 62.754 137.140 60.410 L 148.140 49.410 C 158.009 39.538 171.396 33.991 185.355 33.991 C 199.314 33.991 212.701 39.538 222.570 49.410 C 232.815 59.669 238.395 73.687 238.000 88.180 ZM 110.380 187.080 L 99.380 198.080 C 91.768 205.745 81.402 210.038 70.600 210.000 L 70.600 210.000 C 54.172 209.988 39.368 200.084 33.087 184.905 C 26.805 169.725 30.284 152.256 41.900 140.640 L 76.620 105.900 C 88.383 94.106 106.154 90.687 121.454 97.274 C 136.753 103.861 146.483 119.119 146.000 135.770 C 145.910 139.080 148.520 141.837 151.830 141.930 L 152.000 141.930 C 155.252 141.931 157.913 139.341 158.000 136.090 C 158.611 114.531 146.006 94.781 126.195 86.255 C 106.384 77.730 83.376 82.154 68.140 97.420 L 33.380 132.160 C 18.336 147.208 13.833 169.834 21.970 189.495 C 30.107 209.157 49.282 221.984 70.560 222.000 L 70.560 222.000 C 84.529 222.041 97.933 216.488 107.780 206.580 L 118.780 195.580 C 120.315 194.068 120.922 191.848 120.368 189.765 C 119.815 187.682 118.187 186.056 116.103 185.505 C 114.020 184.954 111.801 185.563 110.290 187.100 Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
