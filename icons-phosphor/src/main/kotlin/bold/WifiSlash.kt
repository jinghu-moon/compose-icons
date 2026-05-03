package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorBoldIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.880 207.930 C 219.825 211.093 220.841 215.595 219.541 219.716 C 218.241 223.838 214.825 226.942 210.599 227.843 C 206.372 228.744 201.988 227.303 199.120 224.070 L 147.780 167.600 C 130.134 160.951 110.328 163.619 95.070 174.700 C 89.713 178.605 82.205 177.427 78.300 172.070 C 74.395 166.713 75.573 159.205 80.930 155.300 C 93.172 146.359 107.719 141.112 122.850 140.180 L 103.510 118.900 C 88.903 122.450 75.236 129.119 63.450 138.450 C 58.249 142.425 50.822 141.498 46.757 136.367 C 42.692 131.235 43.490 123.793 48.550 119.640 C 59.689 110.828 72.212 103.924 85.610 99.210 L 68.300 80.210 C 55.076 85.854 42.725 93.356 31.620 102.490 C 26.489 106.696 18.921 105.946 14.715 100.815 C 10.509 95.684 11.259 88.116 16.390 83.910 C 27.130 75.091 38.879 67.578 51.390 61.530 L 39.120 48.070 C 36.175 44.907 35.159 40.405 36.459 36.284 C 37.759 32.162 41.175 29.058 45.401 28.157 C 49.628 27.256 54.012 28.697 56.880 31.930 ZM 128.000 188.000 C 119.163 188.000 112.000 195.163 112.000 204.000 C 112.000 212.837 119.163 220.000 128.000 220.000 C 136.837 220.000 144.000 212.837 144.000 204.000 C 144.000 195.163 136.837 188.000 128.000 188.000 ZM 192.550 138.450 C 197.751 142.425 205.178 141.498 209.243 136.367 C 213.308 131.235 212.510 123.793 207.450 119.640 C 196.216 110.715 183.555 103.753 170.000 99.050 C 163.774 96.995 157.052 100.316 154.902 106.510 C 152.752 112.703 155.970 119.476 162.130 121.720 C 173.139 125.546 183.423 131.202 192.550 138.450 ZM 239.610 83.910 C 208.127 58.126 168.694 44.026 128.000 44.000 C 124.060 44.000 120.070 44.130 116.140 44.390 C 109.513 44.829 104.496 50.558 104.935 57.185 C 105.374 63.812 111.103 68.829 117.730 68.390 C 121.130 68.160 124.590 68.050 128.000 68.050 C 163.141 68.069 197.193 80.244 224.380 102.510 C 229.502 106.716 237.064 105.972 241.270 100.850 C 245.476 95.728 244.732 88.166 239.610 83.960 Z"),
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
