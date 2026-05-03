package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = phosphorBoldIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 143.520 95.510 L 159.000 80.000 L 143.520 64.480 C 138.826 59.786 138.826 52.174 143.520 47.480 C 148.214 42.786 155.826 42.786 160.520 47.480 L 176.000 63.000 L 191.520 47.480 C 196.214 42.786 203.826 42.786 208.520 47.480 C 213.214 52.174 213.214 59.786 208.520 64.480 L 193.000 80.000 L 208.520 95.510 C 213.214 100.204 213.214 107.816 208.520 112.510 C 203.826 117.204 196.214 117.204 191.520 112.510 L 176.000 97.000 L 160.490 112.510 C 155.796 117.204 148.184 117.204 143.490 112.510 C 138.796 107.816 138.796 100.204 143.490 95.510 ZM 227.850 183.580 C 223.905 213.609 198.287 236.047 168.000 236.000 C 86.390 236.000 20.000 169.610 20.000 88.000 C 19.953 57.713 42.391 32.095 72.420 28.150 C 81.202 27.086 89.644 31.900 93.200 40.000 L 114.310 87.130 C 114.332 87.192 114.359 87.252 114.390 87.310 C 117.025 93.469 116.402 100.537 112.730 106.140 C 112.470 106.540 112.186 106.924 111.880 107.290 L 92.820 130.000 C 99.880 142.840 113.320 156.160 126.310 163.210 L 148.620 144.210 C 148.978 143.910 149.352 143.630 149.740 143.370 C 155.365 139.598 162.520 138.939 168.740 141.620 L 168.920 141.700 L 216.000 162.800 C 224.100 166.356 228.914 174.798 227.850 183.580 ZM 203.540 183.520 L 161.540 164.710 L 139.110 183.780 C 138.757 184.085 138.387 184.369 138.000 184.630 C 132.135 188.519 124.657 189.039 118.310 186.000 C 98.830 176.600 79.420 157.320 70.000 138.000 C 66.953 131.682 67.439 124.229 71.280 118.360 C 71.543 117.956 71.830 117.569 72.140 117.200 L 91.300 94.490 L 72.480 52.490 C 55.820 56.161 43.967 70.941 44.000 88.000 C 44.083 156.449 99.551 211.917 168.000 212.000 C 185.071 212.047 199.866 200.191 203.540 183.520 Z"),
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
