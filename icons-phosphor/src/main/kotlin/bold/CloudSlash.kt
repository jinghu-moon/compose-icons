package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorBoldIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 71.790 84.000 C 34.235 84.058 3.837 114.550 3.895 152.105 C 3.953 189.660 34.445 220.058 72.000 220.000 L 160.000 220.000 C 170.445 220.021 180.815 218.248 190.660 214.760 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 160.000 196.000 L 72.000 196.000 C 48.159 195.849 28.776 176.738 28.288 152.901 C 27.800 129.065 46.385 109.176 70.200 108.050 C 68.741 114.600 68.003 121.290 68.000 128.000 C 68.000 134.627 73.373 140.000 80.000 140.000 C 86.627 140.000 92.000 134.627 92.000 128.000 C 92.002 121.627 92.898 115.285 94.660 109.160 L 172.540 194.830 C 168.405 195.603 164.207 195.995 160.000 196.000 ZM 252.000 128.000 C 252.043 147.405 245.902 166.320 234.470 182.000 C 231.980 185.548 227.770 187.478 223.456 187.047 C 219.143 186.617 215.397 183.894 213.657 179.924 C 211.917 175.953 212.453 171.353 215.060 167.890 C 233.998 141.817 232.035 106.032 210.358 82.187 C 188.682 58.342 153.245 52.986 125.490 69.360 C 119.802 72.539 112.616 70.598 109.302 64.987 C 105.989 59.376 107.759 52.146 113.290 48.700 C 141.740 31.934 176.993 31.702 205.661 48.091 C 234.329 64.481 252.014 94.978 252.000 128.000 Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
