package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorLightIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 83.740 88.200 C 83.290 89.070 82.840 89.950 82.420 90.840 C 59.395 87.012 36.171 96.440 22.329 115.234 C 8.488 134.029 6.375 159.004 16.862 179.857 C 27.349 200.709 48.659 213.905 72.000 214.000 L 160.000 214.000 C 171.091 214.025 182.079 211.885 192.350 207.700 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 160.000 202.000 L 72.000 202.000 C 53.409 202.033 36.335 191.749 27.672 175.300 C 19.009 158.851 20.187 138.954 30.731 123.642 C 41.275 108.331 59.443 100.133 77.900 102.360 C 75.315 110.661 74.000 119.306 74.000 128.000 C 74.000 131.314 76.686 134.000 80.000 134.000 C 83.314 134.000 86.000 131.314 86.000 128.000 C 85.997 117.592 88.191 107.301 92.440 97.800 L 183.660 198.140 C 176.037 200.710 168.045 202.014 160.000 202.000 ZM 246.000 128.000 C 246.012 149.128 238.232 169.519 224.150 185.270 C 223.012 186.542 221.387 187.269 219.680 187.270 C 217.314 187.269 215.170 185.878 214.204 183.719 C 213.239 181.559 213.633 179.033 215.210 177.270 C 240.420 149.005 240.219 106.268 214.745 78.241 C 189.271 50.214 146.747 45.946 116.210 68.350 C 113.540 70.313 109.783 69.740 107.820 67.070 C 105.857 64.400 106.430 60.643 109.100 58.680 C 135.230 39.493 169.929 36.630 198.850 51.275 C 227.771 65.919 246.000 95.582 246.000 128.000 Z"),
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
