package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorBoldIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 59.680 70.690 C 44.000 95.220 36.000 119.840 36.000 144.000 C 35.988 180.205 57.212 213.051 90.224 227.917 C 123.236 242.783 161.898 236.905 189.000 212.900 L 199.160 224.070 C 203.638 228.880 211.151 229.194 216.014 224.774 C 220.877 220.355 221.281 212.846 216.920 207.930 ZM 128.000 212.000 C 90.461 211.961 60.039 181.539 60.000 144.000 C 60.000 126.260 65.540 107.880 76.490 89.180 L 172.810 195.180 C 160.413 206.045 144.484 212.024 128.000 212.000 ZM 92.610 47.440 C 90.366 45.172 89.118 42.105 89.140 38.915 C 89.163 35.725 90.455 32.676 92.730 30.440 C 101.557 21.625 111.049 13.501 121.120 6.140 C 125.251 3.249 130.749 3.249 134.880 6.140 C 138.360 8.600 220.000 66.640 220.000 144.000 C 219.988 148.465 219.654 152.923 219.000 157.340 C 218.146 163.235 213.097 167.612 207.140 167.620 C 206.558 167.616 205.976 167.573 205.400 167.490 C 198.842 166.537 194.298 160.448 195.250 153.890 C 195.736 150.615 195.986 147.310 196.000 144.000 C 196.000 91.070 146.510 46.090 128.000 31.120 C 123.360 34.850 116.800 40.450 109.590 47.560 C 107.323 49.797 104.260 51.042 101.075 51.020 C 97.890 50.997 94.845 49.709 92.610 47.440 Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
