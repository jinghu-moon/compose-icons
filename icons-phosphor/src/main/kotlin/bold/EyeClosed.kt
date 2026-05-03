package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorBoldIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.420 162.000 C 237.734 167.755 235.755 175.106 230.000 178.420 C 224.245 181.734 216.894 179.755 213.580 174.000 L 196.720 144.500 C 187.312 150.418 177.169 155.078 166.550 158.360 L 171.840 190.000 C 172.924 196.536 168.505 202.713 161.970 203.800 C 161.310 203.916 160.640 203.973 159.970 203.970 C 154.119 203.964 149.125 199.739 148.150 193.970 L 143.000 163.170 C 133.011 164.277 122.929 164.277 112.940 163.170 L 107.840 194.000 C 106.864 199.777 101.859 204.004 96.000 204.000 C 95.330 204.003 94.660 203.946 94.000 203.830 C 90.861 203.301 88.061 201.547 86.215 198.953 C 84.370 196.360 83.630 193.139 84.160 190.000 L 89.450 158.280 C 78.831 154.998 68.688 150.338 59.280 144.420 L 42.420 174.000 C 39.106 179.755 31.755 181.734 26.000 178.420 C 20.245 175.106 18.266 167.755 21.580 162.000 L 40.000 129.850 C 33.757 124.212 27.969 118.090 22.690 111.540 C 18.817 106.374 19.725 99.070 24.746 95.010 C 29.767 90.951 37.099 91.591 41.340 96.460 C 57.380 116.320 85.440 140.000 128.000 140.000 C 170.560 140.000 198.620 116.320 214.660 96.460 C 218.839 91.355 226.354 90.581 231.486 94.726 C 236.618 98.871 237.441 106.381 233.330 111.540 C 228.045 118.090 222.250 124.213 216.000 129.850 Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
