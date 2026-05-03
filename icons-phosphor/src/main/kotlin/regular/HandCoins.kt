package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = phosphorRegularIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.330 141.060 C 224.296 136.417 216.442 134.853 209.090 136.830 L 167.250 146.450 C 169.222 138.119 167.275 129.344 161.963 122.629 C 156.652 115.915 148.561 111.999 140.000 112.000 L 89.940 112.000 C 81.449 111.979 73.301 115.352 67.310 121.370 L 44.690 144.000 L 16.000 144.000 C 7.163 144.000 0.000 151.163 0.000 160.000 L 0.000 200.000 C 0.000 208.837 7.163 216.000 16.000 216.000 L 120.000 216.000 C 120.654 216.000 121.306 215.920 121.940 215.760 L 185.940 199.760 C 186.348 199.663 186.746 199.529 187.130 199.360 L 226.000 182.820 L 226.440 182.620 C 234.035 178.825 239.135 171.382 239.935 162.930 C 240.734 154.478 237.119 146.211 230.370 141.060 ZM 16.000 160.000 L 40.000 160.000 L 40.000 200.000 L 16.000 200.000 ZM 219.430 168.210 L 181.430 184.390 L 119.000 200.000 L 56.000 200.000 L 56.000 155.310 L 78.630 132.690 C 81.620 129.676 85.694 127.986 89.940 128.000 L 140.000 128.000 C 146.627 128.000 152.000 133.373 152.000 140.000 C 152.000 146.627 146.627 152.000 140.000 152.000 L 112.000 152.000 C 107.582 152.000 104.000 155.582 104.000 160.000 C 104.000 164.418 107.582 168.000 112.000 168.000 L 144.000 168.000 C 144.602 167.998 145.202 167.931 145.790 167.800 L 212.790 152.390 L 213.100 152.310 C 217.336 151.134 221.776 153.342 223.396 157.429 C 225.015 161.515 223.292 166.166 219.400 168.210 ZM 164.000 96.000 C 165.977 96.002 167.950 95.842 169.900 95.520 C 176.006 113.656 195.232 123.845 213.668 118.716 C 232.103 113.587 243.305 94.931 239.167 76.249 C 235.028 57.566 216.997 45.385 198.120 48.520 C 192.260 31.102 174.220 20.894 156.271 24.839 C 138.321 28.785 126.225 45.617 128.210 63.887 C 130.195 82.158 145.622 96.000 164.000 96.000 ZM 224.000 84.000 C 224.000 95.046 215.046 104.000 204.000 104.000 C 192.954 104.000 184.000 95.046 184.000 84.000 C 184.000 72.954 192.954 64.000 204.000 64.000 C 215.046 64.000 224.000 72.954 224.000 84.000 ZM 164.000 40.000 C 172.966 40.004 180.834 45.976 183.250 54.610 C 174.965 60.439 169.520 69.490 168.250 79.540 C 166.853 79.842 165.429 79.996 164.000 80.000 C 152.954 80.000 144.000 71.046 144.000 60.000 C 144.000 48.954 152.954 40.000 164.000 40.000 Z"),
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
