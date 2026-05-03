package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorThinIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.470 71.090 L 216.470 47.510 C 214.218 45.251 211.160 43.981 207.970 43.981 C 204.780 43.981 201.722 45.251 199.470 47.510 L 104.000 141.830 L 64.500 103.510 C 62.248 101.251 59.190 99.981 56.000 99.981 C 52.810 99.981 49.752 101.251 47.500 103.510 L 23.500 127.510 C 21.241 129.762 19.971 132.820 19.971 136.010 C 19.971 139.200 21.241 142.258 23.500 144.510 L 95.110 216.510 C 97.362 218.769 100.420 220.039 103.610 220.039 C 106.800 220.039 109.858 218.769 112.110 216.510 L 240.490 88.080 C 242.744 85.826 244.008 82.768 244.004 79.581 C 244.001 76.393 242.729 73.339 240.470 71.090 ZM 234.840 82.430 L 106.430 210.830 C 104.869 212.388 102.341 212.388 100.780 210.830 L 29.170 138.830 C 28.419 138.080 27.997 137.062 27.997 136.000 C 27.997 134.938 28.419 133.920 29.170 133.170 L 53.170 109.170 C 53.917 108.414 54.937 107.992 56.000 108.000 C 57.085 108.006 58.124 108.441 58.890 109.210 L 101.240 150.290 C 102.794 151.808 105.276 151.808 106.830 150.290 L 205.200 53.190 C 205.951 52.433 206.973 52.007 208.040 52.007 C 209.107 52.007 210.129 52.433 210.880 53.190 L 234.880 76.770 C 235.626 77.526 236.041 78.547 236.033 79.608 C 236.026 80.670 235.596 81.685 234.840 82.430 Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
