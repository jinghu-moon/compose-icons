package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorThinIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.500 52.940 C 224.890 47.000 218.000 44.000 208.930 44.000 C 183.070 44.000 147.650 72.730 132.000 101.280 L 132.000 56.000 C 132.000 53.791 130.209 52.000 128.000 52.000 C 125.791 52.000 124.000 53.791 124.000 56.000 L 124.000 101.280 C 108.350 72.730 72.930 44.000 47.070 44.000 C 38.070 44.000 31.070 47.000 26.500 52.940 C 15.400 67.200 20.500 95.190 27.000 120.690 C 30.670 135.110 37.550 145.330 47.480 151.070 C 51.419 153.327 55.742 154.836 60.230 155.520 C 51.149 167.639 49.691 183.848 56.463 197.393 C 63.235 210.938 77.076 219.497 92.220 219.505 C 107.364 219.513 121.214 210.968 128.000 197.430 C 134.778 210.980 148.630 219.538 163.781 219.535 C 178.932 219.533 192.781 210.970 199.554 197.418 C 206.328 183.865 204.863 167.649 195.770 155.530 C 200.259 154.842 204.581 153.330 208.520 151.070 C 218.450 145.330 225.330 135.070 229.000 120.690 C 235.470 95.190 240.600 67.200 229.500 52.940 ZM 92.000 212.000 C 75.087 211.819 61.213 198.553 60.274 181.666 C 59.334 164.778 71.652 150.056 88.440 148.000 C 90.649 147.757 92.243 145.769 92.000 143.560 C 91.757 141.351 89.769 139.757 87.560 140.000 C 80.359 140.809 73.518 143.576 67.780 148.000 C 44.980 149.240 37.100 128.000 34.780 118.760 C 29.130 96.520 23.780 69.500 32.830 57.890 C 35.870 53.910 40.540 52.000 47.070 52.000 C 76.550 52.000 124.000 98.680 124.000 127.670 L 124.000 180.000 C 124.000 197.673 109.673 212.000 92.000 212.000 ZM 221.240 118.720 C 218.900 127.940 211.020 149.190 188.240 147.960 C 182.491 143.548 175.643 140.796 168.440 140.000 C 166.231 139.757 164.243 141.351 164.000 143.560 C 163.757 145.769 165.351 147.757 167.560 148.000 C 184.727 149.861 197.345 164.969 196.119 182.193 C 194.892 199.417 180.260 212.585 163.003 211.994 C 145.745 211.404 132.047 197.267 132.000 180.000 L 132.000 127.670 C 132.000 98.670 179.450 52.000 208.930 52.000 C 215.460 52.000 220.130 53.910 223.190 57.850 C 232.220 69.460 226.890 96.480 221.240 118.720 Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
