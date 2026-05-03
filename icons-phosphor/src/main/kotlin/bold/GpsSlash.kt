package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorBoldIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 128.000 C 252.000 134.627 246.627 140.000 240.000 140.000 L 219.210 140.000 C 218.504 145.429 217.312 150.784 215.650 156.000 C 214.062 160.973 209.441 164.349 204.220 164.350 C 202.981 164.347 201.751 164.154 200.570 163.780 C 197.536 162.812 195.012 160.678 193.553 157.847 C 192.094 155.017 191.819 151.723 192.790 148.690 C 199.368 128.011 195.690 105.435 182.889 87.912 C 170.089 70.390 149.700 60.022 128.000 60.000 C 123.132 59.999 118.279 60.515 113.520 61.540 C 109.289 62.557 104.839 61.203 101.891 58.003 C 98.942 54.802 97.958 50.257 99.317 46.123 C 100.677 41.989 104.168 38.915 108.440 38.090 C 110.930 37.550 113.440 37.090 116.000 36.780 L 116.000 16.000 C 116.000 9.373 121.373 4.000 128.000 4.000 C 134.627 4.000 140.000 9.373 140.000 16.000 L 140.000 36.780 C 181.260 42.279 213.721 74.740 219.220 116.000 L 240.000 116.000 C 246.627 116.000 252.000 121.373 252.000 128.000 ZM 216.880 207.930 C 219.825 211.093 220.841 215.595 219.541 219.716 C 218.241 223.838 214.825 226.942 210.599 227.843 C 206.372 228.744 201.988 227.303 199.120 224.070 L 180.470 203.560 C 168.427 211.939 154.548 217.303 140.000 219.200 L 140.000 240.000 C 140.000 246.627 134.627 252.000 128.000 252.000 C 121.373 252.000 116.000 246.627 116.000 240.000 L 116.000 219.220 C 74.740 213.721 42.279 181.260 36.780 140.000 L 16.000 140.000 C 9.373 140.000 4.000 134.627 4.000 128.000 C 4.000 121.373 9.373 116.000 16.000 116.000 L 36.790 116.000 C 39.117 98.512 46.405 82.057 57.790 68.580 L 39.120 48.070 C 36.175 44.907 35.159 40.405 36.459 36.284 C 37.759 32.162 41.175 29.058 45.401 28.157 C 49.628 27.256 54.012 28.697 56.880 31.930 L 190.690 179.110 L 190.690 179.110 ZM 164.140 185.600 L 74.140 86.600 C 54.190 112.700 55.751 149.330 77.849 173.638 C 99.947 197.946 136.263 202.980 164.140 185.600 Z"),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
