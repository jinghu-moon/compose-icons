package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bicycle: ImageVector
    get() {
        if (_bicycle != null) return _bicycle!!
        _bicycle = phosphorFillIcon(
            name = "Bicycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 54.460 164.710 L 82.330 126.500 C 99.743 144.374 100.556 172.608 84.201 191.455 C 67.846 210.301 39.779 213.473 19.631 198.752 C -0.518 184.030 -6.026 156.326 6.959 135.018 C 19.944 113.709 47.090 105.903 69.410 117.060 L 41.540 155.290 C 39.731 157.591 39.323 160.697 40.476 163.388 C 41.630 166.078 44.161 167.923 47.076 168.199 C 49.990 168.475 52.822 167.136 54.460 164.710 ZM 208.000 112.000 C 202.216 111.997 196.480 113.044 191.070 115.090 L 214.910 156.000 C 216.561 158.479 216.698 161.669 215.266 164.281 C 213.834 166.892 211.071 168.492 208.093 168.433 C 205.116 168.374 202.417 166.666 201.090 164.000 L 177.260 123.140 C 159.361 138.070 154.775 163.700 166.386 183.910 C 177.996 204.121 202.447 213.069 224.361 205.128 C 246.274 197.187 259.315 174.651 255.282 151.695 C 251.249 128.738 231.308 111.997 208.000 112.000 ZM 165.930 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 C 200.000 84.418 203.582 88.000 208.000 88.000 C 212.418 88.000 216.000 84.418 216.000 80.000 C 216.000 66.745 205.255 56.000 192.000 56.000 L 152.000 56.000 C 149.145 56.006 146.510 57.534 145.085 60.008 C 143.661 62.482 143.663 65.528 145.090 68.000 L 156.740 88.000 L 99.260 88.000 L 82.910 60.000 C 81.484 57.530 78.852 56.006 76.000 56.000 L 48.000 56.000 C 43.582 56.000 40.000 59.582 40.000 64.000 C 40.000 68.418 43.582 72.000 48.000 72.000 L 71.410 72.000 L 85.120 95.510 L 69.410 117.060 C 74.216 119.459 78.583 122.651 82.330 126.500 L 93.920 110.600 L 125.090 164.000 C 126.417 166.666 129.116 168.374 132.093 168.433 C 135.071 168.492 137.834 166.892 139.266 164.281 C 140.698 161.669 140.561 158.479 138.910 156.000 L 108.590 104.000 L 166.070 104.000 L 177.260 123.170 C 181.380 119.725 186.048 116.994 191.070 115.090 Z"),
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
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
