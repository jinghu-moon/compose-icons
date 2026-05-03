package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorBoldIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.240 213.210 C 216.120 203.000 204.000 180.640 204.000 152.000 L 204.000 134.730 C 204.017 126.527 199.010 119.151 191.380 116.140 L 166.520 106.330 C 164.489 105.522 163.482 103.233 164.260 101.190 L 185.590 48.190 C 188.899 40.165 188.807 31.141 185.334 23.186 C 181.861 15.231 175.305 9.028 167.170 6.000 C 150.852 -0.005 132.719 8.061 126.250 24.200 L 126.180 24.380 L 105.180 77.470 C 104.793 78.462 104.021 79.256 103.040 79.670 C 102.088 80.090 101.008 80.112 100.040 79.730 L 74.600 69.430 C 67.101 66.392 58.510 68.199 52.870 74.000 C 31.060 96.430 20.000 122.680 20.000 152.000 C 19.945 181.941 31.522 210.733 52.290 232.300 C 54.564 234.674 57.712 236.012 61.000 236.000 L 232.000 236.000 C 237.587 235.995 242.432 232.134 243.684 226.689 C 244.936 221.244 242.264 215.655 237.240 213.210 ZM 68.190 92.730 L 91.060 102.000 C 97.972 104.767 105.701 104.667 112.538 101.723 C 119.376 98.778 124.760 93.232 127.500 86.310 L 148.450 33.310 C 150.083 29.230 154.607 27.124 158.780 28.500 C 160.820 29.256 162.465 30.810 163.335 32.804 C 164.204 34.798 164.224 37.061 163.390 39.070 C 163.388 39.107 163.388 39.143 163.390 39.180 L 142.000 92.290 C 136.339 106.652 143.347 122.888 157.680 128.620 L 180.000 137.450 L 180.000 152.000 C 180.000 153.000 180.000 154.070 180.050 155.100 L 57.610 106.100 C 60.757 101.356 64.296 96.883 68.190 92.730 ZM 116.740 212.000 C 105.969 201.249 98.332 187.766 94.650 173.000 C 92.993 166.580 86.445 162.718 80.025 164.375 C 73.605 166.032 69.743 172.580 71.400 179.000 C 74.388 190.720 79.283 201.869 85.890 212.000 L 66.250 212.000 C 51.856 195.329 43.956 174.026 44.000 152.000 C 43.960 143.840 45.108 135.718 47.410 127.890 L 184.080 182.550 C 187.015 193.207 191.965 203.204 198.660 212.000 Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
