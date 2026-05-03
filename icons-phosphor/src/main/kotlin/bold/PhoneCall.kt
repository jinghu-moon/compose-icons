package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorBoldIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.410 44.900 C 142.123 38.500 148.699 34.699 155.100 36.410 C 186.690 44.640 211.360 69.310 219.590 100.900 C 220.800 105.075 219.658 109.577 216.604 112.671 C 213.551 115.764 209.063 116.964 204.873 115.808 C 200.683 114.652 197.446 111.321 196.410 107.100 C 190.342 83.830 172.170 65.658 148.900 59.590 C 142.500 57.877 138.699 51.301 140.410 44.900 ZM 227.850 183.580 C 223.905 213.609 198.287 236.047 168.000 236.000 C 86.390 236.000 20.000 169.610 20.000 88.000 C 19.953 57.713 42.391 32.095 72.420 28.150 C 81.202 27.083 89.646 31.898 93.200 40.000 L 114.310 87.130 C 114.332 87.192 114.359 87.252 114.390 87.310 C 117.025 93.469 116.402 100.537 112.730 106.140 C 112.473 106.542 112.189 106.926 111.880 107.290 L 92.820 130.000 C 99.880 142.840 113.320 156.160 126.310 163.210 L 148.620 144.210 C 148.978 143.910 149.352 143.630 149.740 143.370 C 155.365 139.596 162.523 138.940 168.740 141.630 L 168.920 141.710 L 216.000 162.800 C 224.100 166.356 228.914 174.798 227.850 183.580 ZM 203.540 183.520 L 161.540 164.710 L 139.110 183.780 C 138.757 184.085 138.387 184.369 138.000 184.630 C 132.135 188.519 124.657 189.039 118.310 186.000 C 98.830 176.600 79.420 157.320 70.000 138.000 C 66.953 131.682 67.439 124.229 71.280 118.360 C 71.541 117.958 71.828 117.574 72.140 117.210 L 91.300 94.490 L 72.480 52.490 C 55.820 56.161 43.967 70.941 44.000 88.000 C 44.083 156.449 99.551 211.917 168.000 212.000 C 185.071 212.047 199.866 200.191 203.540 183.520 ZM 137.630 97.470 C 147.589 100.609 155.391 108.411 158.530 118.370 C 160.101 123.367 164.732 126.767 169.970 126.770 C 171.194 126.769 172.411 126.583 173.580 126.220 C 179.875 124.228 183.378 117.525 181.420 111.220 C 175.928 93.782 162.268 80.122 144.830 74.630 C 140.714 73.249 136.173 74.199 132.956 77.114 C 129.738 80.029 128.346 84.454 129.315 88.686 C 130.285 92.918 133.465 96.296 137.630 97.520 Z"),
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
