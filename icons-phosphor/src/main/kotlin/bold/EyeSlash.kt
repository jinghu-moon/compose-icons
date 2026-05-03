package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorBoldIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 55.120 65.720 C 20.670 88.660 5.720 121.580 5.000 123.130 C 3.630 126.236 3.630 129.774 5.000 132.880 C 5.370 133.700 14.130 153.140 33.490 172.490 C 59.370 198.340 92.000 212.000 128.000 212.000 C 145.496 212.097 162.836 208.697 179.000 202.000 L 199.090 224.100 C 203.568 228.910 211.081 229.224 215.944 224.804 C 220.807 220.385 221.211 212.876 216.850 207.960 ZM 128.000 188.000 C 98.410 188.000 72.530 177.270 51.090 156.120 C 42.657 147.770 35.400 138.309 29.520 128.000 C 34.790 118.690 48.310 98.100 71.520 83.710 L 161.610 182.820 C 150.745 186.289 139.405 188.037 128.000 188.000 ZM 251.000 132.880 C 250.640 133.690 242.000 152.880 223.000 172.040 C 220.036 175.330 215.502 176.720 211.203 175.657 C 206.905 174.594 203.541 171.250 202.453 166.958 C 201.364 162.666 202.728 158.123 206.000 155.140 C 213.981 147.025 220.866 137.901 226.480 128.000 C 220.604 117.688 213.347 108.228 204.910 99.880 C 183.460 78.730 157.590 68.000 128.000 68.000 C 124.650 68.000 121.300 68.140 118.000 68.420 C 113.671 68.884 109.430 66.966 106.919 63.410 C 104.408 59.853 104.020 55.216 105.905 51.291 C 107.791 47.367 111.654 44.772 116.000 44.510 C 119.930 44.170 124.000 44.000 128.000 44.000 C 164.000 44.000 196.630 57.670 222.490 83.520 C 241.840 102.870 250.600 122.320 250.970 123.130 C 252.349 126.231 252.360 129.770 251.000 132.880 Z"),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
