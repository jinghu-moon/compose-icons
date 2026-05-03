package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorThinIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 186.830 69.170 C 187.581 69.920 188.003 70.938 188.003 72.000 C 188.003 73.062 187.581 74.080 186.830 74.830 L 170.830 90.830 C 169.267 92.393 166.733 92.393 165.170 90.830 C 163.607 89.267 163.607 86.733 165.170 85.170 L 181.170 69.170 C 181.920 68.419 182.938 67.997 184.000 67.997 C 185.062 67.997 186.080 68.419 186.830 69.170 ZM 220.000 72.000 C 220.029 81.554 216.233 90.722 209.460 97.460 L 185.460 121.460 C 184.870 122.042 184.117 122.430 183.300 122.570 C 161.650 126.290 130.560 144.030 93.390 173.900 C 65.050 196.670 43.050 218.610 42.830 218.830 L 42.590 219.050 L 42.590 219.050 C 40.957 220.473 38.488 220.338 37.020 218.746 C 35.552 217.153 35.619 214.682 37.170 213.170 L 37.170 213.170 C 37.390 213.000 59.330 191.000 82.100 162.610 C 112.000 125.440 129.710 94.350 133.430 72.700 C 133.570 71.883 133.958 71.130 134.540 70.540 L 158.540 46.540 C 168.836 36.241 184.323 33.159 197.778 38.732 C 211.232 44.306 220.003 57.437 220.000 72.000 ZM 212.000 72.000 C 212.001 60.674 205.179 50.464 194.715 46.129 C 184.252 41.795 172.208 44.191 164.200 52.200 L 141.080 75.320 C 135.750 103.320 111.600 138.740 88.570 167.430 C 117.260 144.430 152.730 120.250 180.680 114.910 L 203.800 91.800 C 209.069 86.560 212.022 79.430 212.000 72.000 Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
