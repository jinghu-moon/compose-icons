package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorThinIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 204.000 C 136.000 208.418 132.418 212.000 128.000 212.000 C 123.582 212.000 120.000 208.418 120.000 204.000 C 120.000 199.582 123.582 196.000 128.000 196.000 C 132.418 196.000 136.000 199.582 136.000 204.000 ZM 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 64.720 64.340 C 49.086 70.697 34.502 79.378 21.460 90.090 C 19.751 91.493 19.502 94.016 20.905 95.725 C 22.308 97.434 24.831 97.683 26.540 96.280 C 39.718 85.444 54.550 76.794 70.470 70.660 L 100.110 103.270 C 83.115 107.337 67.212 115.063 53.510 125.910 C 51.779 127.291 51.494 129.814 52.875 131.545 C 54.256 133.276 56.779 133.561 58.510 132.180 C 72.478 121.123 88.882 113.556 106.360 110.110 L 142.000 149.370 C 137.389 148.461 132.700 148.002 128.000 148.000 C 112.774 147.962 97.933 152.786 85.640 161.770 C 84.242 162.791 83.660 164.596 84.197 166.241 C 84.734 167.887 86.269 169.000 88.000 169.000 C 88.847 168.998 89.672 168.733 90.360 168.240 C 108.369 155.142 131.893 152.347 152.470 160.860 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 234.540 90.090 C 204.485 65.481 166.844 52.024 128.000 52.000 C 120.812 52.001 113.631 52.455 106.500 53.360 C 104.307 53.636 102.754 55.637 103.030 57.830 C 103.306 60.023 105.307 61.576 107.500 61.300 C 114.299 60.435 121.146 60.001 128.000 60.000 C 164.994 60.017 200.843 72.836 229.460 96.280 C 231.169 97.683 233.692 97.434 235.095 95.725 C 236.498 94.016 236.249 91.493 234.540 90.090 ZM 197.540 132.180 C 199.271 133.561 201.794 133.276 203.175 131.545 C 204.556 129.814 204.271 127.291 202.540 125.910 C 187.900 114.320 170.760 106.301 152.480 102.490 C 151.061 102.148 149.568 102.607 148.585 103.686 C 147.603 104.766 147.286 106.295 147.760 107.676 C 148.233 109.057 149.422 110.071 150.860 110.320 C 167.899 113.888 183.873 121.372 197.520 132.180 Z"),
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
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
