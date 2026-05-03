package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorThinIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 251.790 190.730 C 251.087 188.638 248.823 187.510 246.730 188.210 L 226.030 195.110 L 195.580 134.210 C 194.902 132.855 193.516 131.999 192.000 132.000 L 108.000 132.000 L 108.000 100.150 C 109.320 100.060 110.650 100.000 112.000 100.000 L 168.000 100.000 C 170.209 100.000 172.000 98.209 172.000 96.000 C 172.000 93.791 170.209 92.000 168.000 92.000 L 112.000 92.000 C 110.660 92.000 109.320 92.000 108.000 92.130 L 108.000 75.710 C 122.535 73.612 132.980 60.640 131.928 45.992 C 130.876 31.344 118.686 19.997 104.000 19.997 C 89.314 19.997 77.124 31.344 76.072 45.992 C 75.020 60.640 85.465 73.612 100.000 75.710 L 100.000 93.080 C 65.365 99.327 41.221 130.969 44.338 166.024 C 47.456 201.079 76.807 227.963 112.000 228.000 C 143.720 228.000 172.270 206.550 179.870 177.000 C 180.328 174.899 179.044 172.812 176.963 172.274 C 174.881 171.736 172.747 172.940 172.130 175.000 C 165.420 201.080 140.130 220.000 112.000 220.000 C 81.194 220.006 55.389 196.681 52.293 166.030 C 49.197 135.380 69.815 107.366 100.000 101.210 L 100.000 136.000 C 100.000 138.209 101.791 140.000 104.000 140.000 L 189.530 140.000 L 220.420 201.790 C 221.098 203.145 222.484 204.001 224.000 204.000 C 224.429 203.999 224.854 203.928 225.260 203.790 L 249.260 195.790 C 250.267 195.455 251.099 194.733 251.573 193.784 C 252.048 192.835 252.126 191.736 251.790 190.730 ZM 84.000 48.000 C 84.000 36.954 92.954 28.000 104.000 28.000 C 115.046 28.000 124.000 36.954 124.000 48.000 C 124.000 59.046 115.046 68.000 104.000 68.000 C 92.954 68.000 84.000 59.046 84.000 48.000 Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
