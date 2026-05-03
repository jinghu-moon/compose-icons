package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorBoldIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 75.900 88.520 L 39.230 127.810 C 36.527 130.704 35.426 134.746 36.288 138.611 C 37.150 142.477 39.864 145.668 43.540 147.140 L 94.720 167.610 L 84.130 238.220 C 83.332 243.425 86.020 248.542 90.759 250.838 C 95.498 253.134 101.180 252.072 104.770 248.220 L 163.670 185.110 L 199.120 224.110 C 203.598 228.920 211.111 229.234 215.974 224.814 C 220.837 220.395 221.241 212.886 216.880 207.970 ZM 113.600 203.550 L 119.870 161.780 C 120.695 156.276 117.627 150.927 112.460 148.860 L 68.740 131.370 L 92.090 106.370 L 147.470 167.290 ZM 111.410 68.060 C 109.071 65.888 107.693 62.873 107.583 59.683 C 107.472 56.492 108.637 53.389 110.820 51.060 L 151.230 7.810 C 154.820 3.958 160.502 2.896 165.241 5.192 C 169.980 7.488 172.668 12.605 171.870 17.810 L 161.280 88.390 L 212.460 108.860 C 216.136 110.332 218.850 113.523 219.712 117.389 C 220.574 121.254 219.473 125.296 216.770 128.190 L 199.950 146.190 C 195.427 151.036 187.831 151.298 182.985 146.775 C 178.139 142.252 177.877 134.656 182.400 129.810 L 187.260 124.600 L 143.540 107.110 C 138.373 105.043 135.305 99.694 136.130 94.190 L 142.400 52.420 L 128.400 67.420 C 126.235 69.763 123.226 71.148 120.038 71.268 C 116.850 71.388 113.745 70.234 111.410 68.060 Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
