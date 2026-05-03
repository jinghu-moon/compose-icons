package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorBoldIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 72.000 C 132.000 65.373 137.373 60.000 144.000 60.000 L 187.000 60.000 L 175.510 48.490 C 170.816 43.796 170.816 36.184 175.510 31.490 C 180.204 26.796 187.816 26.796 192.510 31.490 L 224.510 63.490 C 226.769 65.742 228.039 68.800 228.039 71.990 C 228.039 75.180 226.769 78.238 224.510 80.490 L 192.510 112.490 C 187.816 117.184 180.204 117.184 175.510 112.490 C 170.816 107.796 170.816 100.184 175.510 95.490 L 187.000 84.000 L 144.000 84.000 C 137.373 84.000 132.000 78.627 132.000 72.000 ZM 227.840 183.580 C 223.900 213.608 198.285 236.046 168.000 236.000 C 86.390 236.000 20.000 169.610 20.000 88.000 C 19.954 57.715 42.392 32.100 72.420 28.160 C 81.203 27.074 89.656 31.890 93.200 40.000 L 114.310 87.130 L 114.380 87.310 C 117.031 93.465 116.411 100.540 112.730 106.140 C 112.473 106.542 112.189 106.926 111.880 107.290 L 92.820 130.000 C 99.880 142.840 113.320 156.160 126.310 163.210 L 148.620 144.210 C 148.976 143.908 149.350 143.627 149.740 143.370 C 155.366 139.597 162.523 138.942 168.740 141.630 L 168.920 141.710 L 216.000 162.800 C 224.110 166.344 228.926 174.797 227.840 183.580 ZM 203.530 183.520 L 161.530 164.710 L 139.110 183.780 C 138.754 184.085 138.380 184.369 137.990 184.630 C 132.130 188.536 124.647 189.071 118.290 186.040 C 98.810 176.640 79.400 157.360 69.980 138.040 C 66.933 131.722 67.419 124.269 71.260 118.400 C 71.521 117.998 71.808 117.614 72.120 117.250 L 91.300 94.500 L 72.480 52.500 C 55.820 56.164 43.964 70.942 44.000 88.000 C 44.083 156.449 99.551 211.917 168.000 212.000 C 185.070 212.050 199.864 200.191 203.530 183.520 Z"),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
