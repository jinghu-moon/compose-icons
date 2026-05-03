package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) return _cloudSun!!
        _cloudSun = phosphorFillIcon(
            name = "CloudSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 72.000 C 157.155 71.996 150.340 72.914 143.740 74.730 C 141.135 70.479 137.970 66.598 134.330 63.190 L 143.840 49.620 C 146.375 46.000 145.495 41.010 141.875 38.475 C 138.255 35.940 133.265 36.820 130.730 40.440 L 121.220 54.000 C 113.400 50.051 104.761 47.996 96.000 48.000 C 95.410 48.000 94.840 48.000 94.260 48.000 L 91.370 31.710 C 90.957 28.820 89.002 26.384 86.270 25.355 C 83.538 24.326 80.462 24.867 78.245 26.767 C 76.028 28.666 75.022 31.622 75.620 34.480 L 78.500 50.820 C 69.628 53.755 61.629 58.859 55.230 65.670 L 41.610 56.140 C 39.269 54.459 36.205 54.167 33.589 55.376 C 30.973 56.584 29.209 59.106 28.971 61.978 C 28.733 64.850 30.058 67.628 32.440 69.250 L 46.000 78.770 C 42.037 86.589 39.981 95.234 40.000 104.000 C 40.000 104.570 40.000 105.150 40.000 105.720 L 23.710 108.600 C 19.623 109.316 16.761 113.039 17.120 117.173 C 17.480 121.307 20.940 124.480 25.090 124.480 C 25.556 124.479 26.021 124.439 26.480 124.360 L 42.800 121.480 C 44.234 125.846 46.202 130.017 48.660 133.900 C 33.001 148.445 27.836 171.091 35.640 190.988 C 43.444 210.884 62.627 223.980 84.000 224.000 L 164.000 224.000 C 205.974 224.000 240.000 189.974 240.000 148.000 C 240.000 106.026 205.974 72.000 164.000 72.000 ZM 92.920 120.760 C 82.403 118.945 71.583 120.400 61.920 124.930 C 50.810 106.579 56.154 82.730 74.034 70.876 C 91.914 59.021 115.961 63.382 128.540 80.760 C 112.221 89.348 99.566 103.558 92.920 120.760 Z"),
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
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
