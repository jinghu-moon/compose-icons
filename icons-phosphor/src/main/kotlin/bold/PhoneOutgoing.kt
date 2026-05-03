package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorBoldIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 143.520 112.480 C 141.261 110.228 139.991 107.170 139.991 103.980 C 139.991 100.790 141.261 97.732 143.520 95.480 L 171.000 68.000 L 160.000 68.000 C 153.373 68.000 148.000 62.627 148.000 56.000 C 148.000 49.373 153.373 44.000 160.000 44.000 L 200.000 44.000 C 206.627 44.000 212.000 49.373 212.000 56.000 L 212.000 96.000 C 212.000 102.627 206.627 108.000 200.000 108.000 C 193.373 108.000 188.000 102.627 188.000 96.000 L 188.000 85.000 L 160.490 112.510 C 158.238 114.769 155.180 116.039 151.990 116.039 C 148.800 116.039 145.742 114.769 143.490 112.510 ZM 227.850 183.580 C 223.905 213.609 198.287 236.047 168.000 236.000 C 86.390 236.000 20.000 169.610 20.000 88.000 C 19.953 57.713 42.391 32.095 72.420 28.150 C 81.202 27.083 89.646 31.898 93.200 40.000 L 114.310 87.130 C 114.332 87.192 114.359 87.252 114.390 87.310 C 117.025 93.469 116.402 100.537 112.730 106.140 C 112.473 106.542 112.189 106.926 111.880 107.290 L 92.820 130.000 C 99.880 142.840 113.320 156.160 126.310 163.210 L 148.620 144.210 C 148.978 143.910 149.352 143.630 149.740 143.370 C 155.365 139.596 162.523 138.940 168.740 141.630 L 168.920 141.710 L 216.000 162.800 C 224.100 166.356 228.914 174.798 227.850 183.580 ZM 203.540 183.520 L 161.540 164.710 L 139.110 183.780 C 138.757 184.085 138.387 184.369 138.000 184.630 C 132.135 188.519 124.657 189.039 118.310 186.000 C 98.830 176.600 79.420 157.320 70.000 138.000 C 66.953 131.682 67.439 124.229 71.280 118.360 C 71.541 117.958 71.828 117.574 72.140 117.210 L 91.300 94.500 L 72.480 52.500 C 55.824 56.171 43.972 70.944 44.000 88.000 C 44.083 156.449 99.551 211.917 168.000 212.000 C 185.071 212.047 199.866 200.191 203.540 183.520 Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
