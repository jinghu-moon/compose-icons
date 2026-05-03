package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorBoldIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 56.000 C 160.000 27.281 136.719 4.000 108.000 4.000 C 79.281 4.000 56.000 27.281 56.000 56.000 L 56.000 150.690 C 36.961 177.226 40.956 213.840 65.270 235.646 C 89.584 257.451 126.416 257.451 150.730 235.646 C 175.044 213.840 179.039 177.226 160.000 150.690 ZM 108.000 228.000 C 92.530 228.001 78.447 219.081 71.835 205.094 C 65.224 191.108 67.270 174.564 77.090 162.610 C 78.966 160.433 79.999 157.654 80.000 154.780 L 80.000 56.000 C 80.000 40.536 92.536 28.000 108.000 28.000 C 123.464 28.000 136.000 40.536 136.000 56.000 L 136.000 154.770 C 135.997 157.575 136.977 160.292 138.770 162.450 C 148.674 174.381 150.791 190.961 144.203 204.997 C 137.614 219.034 123.506 227.997 108.000 228.000 ZM 132.000 188.000 C 132.002 199.648 123.641 209.615 112.171 211.639 C 100.700 213.664 89.432 207.159 85.448 196.215 C 81.463 185.270 85.913 173.044 96.000 167.220 L 96.000 56.000 C 96.000 49.373 101.373 44.000 108.000 44.000 C 114.627 44.000 120.000 49.373 120.000 56.000 L 120.000 167.220 C 127.424 171.506 131.998 179.427 132.000 188.000 ZM 173.940 83.000 C 170.327 77.447 171.898 70.016 177.450 66.400 C 194.270 55.400 207.770 61.200 216.710 65.010 C 224.800 68.470 227.640 69.380 233.450 65.590 C 239.003 61.973 246.438 63.542 250.055 69.095 C 253.672 74.648 252.103 82.083 246.550 85.700 C 239.280 90.380 232.640 92.000 226.710 92.000 C 218.920 92.000 212.370 89.200 207.290 87.000 C 199.200 83.540 196.360 82.630 190.550 86.420 C 185.018 90.057 177.585 88.527 173.940 83.000 ZM 250.050 109.100 C 253.665 114.651 252.099 122.081 246.550 125.700 C 239.280 130.430 232.640 132.050 226.710 132.050 C 218.920 132.050 212.370 129.250 207.290 127.050 C 199.200 123.590 196.360 122.680 190.550 126.470 C 184.997 130.087 177.562 128.518 173.945 122.965 C 170.328 117.412 171.897 109.977 177.450 106.360 C 194.270 95.360 207.770 101.160 216.710 104.970 C 224.800 108.430 227.640 109.340 233.450 105.550 C 239.001 101.935 246.431 103.501 250.050 109.050 Z"),
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
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
