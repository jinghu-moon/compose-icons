package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorBoldIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.350 133.100 C 210.130 152.030 194.920 162.100 178.850 163.750 C 177.239 163.917 175.620 164.001 174.000 164.000 C 153.190 164.000 135.840 149.870 120.410 137.300 C 106.170 125.700 92.730 114.760 79.660 116.120 C 70.400 117.120 60.200 124.440 49.340 137.940 C 45.099 142.739 37.836 143.362 32.840 139.354 C 27.843 135.347 26.875 128.122 30.640 122.940 C 45.870 104.000 61.080 94.000 77.150 92.250 C 100.150 89.830 118.970 105.170 135.580 118.700 C 149.820 130.300 163.260 141.240 176.330 139.880 C 185.590 138.880 195.790 131.560 206.650 118.060 C 209.250 114.481 213.609 112.623 217.992 113.225 C 222.374 113.827 226.070 116.792 227.609 120.940 C 229.148 125.087 228.279 129.745 225.350 133.060 Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
