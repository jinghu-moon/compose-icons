package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorThinIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 161.000 110.870 C 160.402 109.994 160.176 108.915 160.373 107.872 C 160.570 106.830 161.173 105.908 162.050 105.310 L 229.740 59.000 C 231.565 57.752 234.057 58.220 235.305 60.045 C 236.553 61.870 236.085 64.362 234.260 65.610 L 166.590 111.910 C 164.778 113.166 162.291 112.719 161.030 110.910 ZM 235.300 196.000 C 234.039 197.809 231.552 198.256 229.740 197.000 L 136.000 132.850 L 88.470 165.380 C 96.115 180.238 91.040 198.478 76.820 207.253 C 62.600 216.028 44.022 212.384 34.169 198.888 C 24.317 185.392 26.508 166.587 39.199 155.717 C 51.890 144.847 70.808 145.571 82.630 157.380 C 83.080 157.830 83.520 158.300 83.940 158.780 L 128.940 128.000 L 83.940 97.220 C 83.520 97.700 83.080 98.220 82.630 98.620 C 70.854 110.366 52.024 111.078 39.396 100.253 C 26.767 89.429 24.590 70.712 34.397 57.278 C 44.204 43.844 62.694 40.215 76.852 48.944 C 91.009 57.674 96.069 75.825 88.470 90.620 L 138.160 124.620 L 138.160 124.620 L 234.250 190.380 C 235.144 190.978 235.759 191.912 235.957 192.969 C 236.154 194.027 235.918 195.119 235.300 196.000 ZM 77.000 93.000 C 78.040 91.961 78.984 90.829 79.820 89.620 C 79.820 89.620 79.820 89.620 79.820 89.620 L 79.820 89.620 C 87.099 79.059 84.788 64.641 74.572 56.885 C 64.357 49.129 49.848 50.776 41.631 60.624 C 33.414 70.473 34.393 85.042 43.854 93.703 C 53.316 102.363 67.914 102.054 77.000 93.000 ZM 84.000 180.000 C 84.016 175.187 82.568 170.482 79.850 166.510 L 79.850 166.450 L 79.850 166.450 C 79.007 165.215 78.053 164.061 77.000 163.000 C 67.619 153.651 52.438 153.669 43.079 163.039 C 33.719 172.410 33.719 187.590 43.079 196.961 C 52.438 206.331 67.619 206.349 77.000 197.000 L 77.000 197.000 C 81.511 192.496 84.032 186.374 84.000 180.000 Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
