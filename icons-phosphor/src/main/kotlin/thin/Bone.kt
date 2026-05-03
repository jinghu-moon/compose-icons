package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorThinIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.600 63.460 C 222.543 56.188 213.564 51.988 204.100 52.000 L 204.000 52.000 C 203.960 38.430 195.365 26.361 182.554 21.885 C 169.743 17.410 155.502 21.501 147.021 32.094 C 138.539 42.687 137.661 57.478 144.830 69.000 C 145.859 70.579 145.647 72.662 144.320 74.000 L 74.000 144.360 C 72.662 145.687 70.579 145.899 69.000 144.870 C 57.491 137.671 42.692 138.518 32.079 146.982 C 21.466 155.446 17.348 169.685 21.805 182.508 C 26.263 195.330 38.325 203.944 51.900 204.000 L 52.000 204.000 C 52.033 217.574 60.628 229.651 73.442 234.129 C 86.256 238.608 100.502 234.514 108.984 223.916 C 117.466 213.318 118.338 198.521 111.160 187.000 C 110.131 185.421 110.343 183.338 111.670 182.000 L 182.000 111.640 C 183.338 110.313 185.421 110.101 187.000 111.130 C 200.343 119.612 217.881 117.077 228.277 105.165 C 238.673 93.252 238.810 75.532 228.600 63.460 ZM 222.100 99.800 C 214.343 108.674 201.291 110.602 191.300 104.350 C 186.552 101.332 180.345 102.018 176.370 106.000 L 106.000 176.370 C 102.025 180.350 101.347 186.556 104.370 191.300 C 109.994 200.334 108.998 211.993 101.922 219.941 C 94.847 227.890 83.382 230.230 73.757 225.691 C 64.133 221.151 58.647 210.815 60.280 200.300 C 60.480 199.037 60.063 197.755 59.160 196.850 C 58.409 196.100 57.391 195.679 56.330 195.680 C 56.122 195.682 55.915 195.698 55.710 195.730 C 45.195 197.363 34.859 191.877 30.319 182.253 C 25.780 172.628 28.120 161.163 36.069 154.088 C 44.017 147.012 55.676 146.016 64.710 151.640 C 69.454 154.655 75.655 153.973 79.630 150.000 L 150.000 79.630 C 153.975 75.650 154.653 69.444 151.630 64.700 C 146.006 55.666 147.002 44.007 154.078 36.059 C 161.153 28.110 172.618 25.770 182.243 30.309 C 191.867 34.849 197.353 45.185 195.720 55.700 C 195.523 56.962 195.940 58.243 196.844 59.146 C 197.747 60.050 199.028 60.467 200.290 60.270 C 210.277 58.682 220.188 63.524 225.073 72.378 C 229.958 81.232 228.769 92.198 222.100 99.800 Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
