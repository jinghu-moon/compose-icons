package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = phosphorFillIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.090 57.380 C 129.002 44.751 136.481 33.529 147.787 27.828 C 159.093 22.127 172.563 22.785 183.260 29.560 C 184.485 30.361 185.174 31.767 185.057 33.226 C 184.941 34.685 184.036 35.964 182.700 36.560 C 164.028 44.961 152.014 63.526 152.000 84.000 C 152.000 85.170 152.000 86.340 152.120 87.490 C 152.232 88.971 151.514 90.393 150.256 91.182 C 148.997 91.971 147.404 91.997 146.120 91.250 C 134.093 84.370 127.081 71.199 128.090 57.380 ZM 240.000 160.610 C 240.029 169.936 234.755 178.467 226.400 182.610 L 225.960 182.810 L 187.130 199.350 C 186.746 199.519 186.348 199.653 185.940 199.750 L 121.940 215.750 C 121.306 215.913 120.655 215.997 120.000 216.000 L 16.000 216.000 C 7.163 216.000 0.000 208.837 0.000 200.000 L 0.000 160.000 C 0.000 151.163 7.163 144.000 16.000 144.000 L 44.690 144.000 L 67.310 121.370 C 73.301 115.352 81.449 111.979 89.940 112.000 L 140.000 112.000 C 148.561 111.999 156.652 115.915 161.963 122.629 C 167.275 129.344 169.222 138.119 167.250 146.450 L 209.090 136.830 C 216.472 134.875 224.344 136.458 230.396 141.114 C 236.449 145.771 239.997 152.973 240.000 160.610 ZM 224.000 160.610 C 223.997 157.929 222.746 155.402 220.615 153.775 C 218.484 152.148 215.717 151.606 213.130 152.310 L 212.820 152.390 L 145.820 167.800 C 145.232 167.931 144.632 167.998 144.030 168.000 L 112.000 168.000 C 107.582 168.000 104.000 164.418 104.000 160.000 C 104.000 155.582 107.582 152.000 112.000 152.000 L 140.000 152.000 C 146.627 152.000 152.000 146.627 152.000 140.000 C 152.000 133.373 146.627 128.000 140.000 128.000 L 89.940 128.000 C 85.694 127.986 81.620 129.676 78.630 132.690 L 56.000 155.310 L 56.000 200.000 L 119.000 200.000 L 181.430 184.390 L 219.430 168.210 C 222.249 166.725 224.010 163.796 224.000 160.610 ZM 168.000 84.000 C 168.000 103.882 184.118 120.000 204.000 120.000 C 223.882 120.000 240.000 103.882 240.000 84.000 C 240.000 64.118 223.882 48.000 204.000 48.000 C 184.118 48.000 168.000 64.118 168.000 84.000 Z"),
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
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
