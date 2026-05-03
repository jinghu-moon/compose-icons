package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorThinIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.000 211.270 L 210.940 211.150 L 164.530 112.290 L 186.210 78.290 L 186.210 78.190 C 188.500 74.395 188.500 69.645 186.210 65.850 L 186.060 65.610 L 164.000 34.000 L 164.000 8.000 C 164.000 5.791 162.209 4.000 160.000 4.000 C 157.791 4.000 156.000 5.791 156.000 8.000 L 156.000 33.820 L 149.870 41.490 C 144.557 48.136 136.509 52.006 128.000 52.006 C 119.491 52.006 111.443 48.136 106.130 41.490 L 100.000 33.820 L 100.000 8.000 C 100.000 5.791 98.209 4.000 96.000 4.000 C 93.791 4.000 92.000 5.791 92.000 8.000 L 92.000 34.000 L 69.860 65.590 L 69.710 65.830 C 67.420 69.625 67.420 74.375 69.710 78.170 C 69.729 78.202 69.745 78.236 69.760 78.270 L 91.440 112.270 L 45.000 211.150 L 44.940 211.270 C 43.348 214.983 43.730 219.248 45.958 222.618 C 48.186 225.988 51.960 228.011 56.000 228.000 L 200.000 228.000 C 204.029 227.990 207.785 225.959 209.998 222.593 C 212.212 219.226 212.588 214.973 211.000 211.270 ZM 76.540 74.000 C 75.825 72.762 75.825 71.238 76.540 70.000 L 96.210 41.900 L 99.890 46.490 C 106.722 55.029 117.065 59.999 128.000 59.999 C 138.936 59.999 149.278 55.029 156.110 46.490 L 159.790 41.900 L 179.490 70.000 C 180.205 71.238 180.205 72.762 179.490 74.000 L 157.840 108.000 L 98.190 108.000 ZM 203.330 218.200 C 202.600 219.329 201.344 220.007 200.000 220.000 L 56.000 220.000 C 54.656 220.007 53.400 219.329 52.670 218.200 C 51.923 217.103 51.787 215.700 52.310 214.480 L 98.540 116.000 L 157.460 116.000 L 203.690 214.480 C 204.213 215.700 204.077 217.103 203.330 218.200 Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
