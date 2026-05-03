package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorBoldIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.160 68.850 C 240.985 62.120 234.953 57.377 227.900 56.850 L 193.380 54.130 L 180.120 22.660 C 177.369 16.197 171.024 12.003 164.000 12.003 C 156.976 12.003 150.631 16.197 147.880 22.660 L 134.620 54.090 L 100.110 56.810 C 93.069 57.337 87.045 62.070 84.867 68.787 C 82.689 75.504 84.788 82.871 90.180 87.430 L 116.350 109.530 L 108.350 142.530 C 106.719 149.372 109.354 156.525 115.033 160.675 C 120.712 164.825 128.326 165.162 134.350 161.530 L 164.000 143.660 L 193.590 161.470 C 199.614 165.102 207.228 164.765 212.907 160.615 C 218.586 156.465 221.221 149.312 219.590 142.470 L 211.590 109.470 L 237.760 87.370 C 243.154 82.866 245.288 75.547 243.160 68.850 ZM 190.500 96.000 C 187.025 98.934 185.507 103.580 186.580 108.000 L 192.580 132.910 L 170.170 119.410 C 166.358 117.130 161.602 117.130 157.790 119.410 L 135.380 132.910 L 141.380 108.000 C 142.451 103.578 140.929 98.932 137.450 96.000 L 118.000 79.480 L 143.830 77.480 C 148.299 77.126 152.198 74.311 153.940 70.180 L 164.000 46.200 L 174.110 70.140 C 175.852 74.271 179.751 77.086 184.220 77.440 L 210.040 79.440 ZM 32.500 184.520 C 27.806 189.214 20.194 189.214 15.500 184.520 C 10.806 179.826 10.806 172.214 15.500 167.520 L 67.260 115.770 C 71.954 111.076 79.566 111.076 84.260 115.770 C 88.954 120.464 88.954 128.076 84.260 132.770 ZM 96.090 175.950 C 98.349 178.202 99.619 181.260 99.619 184.450 C 99.619 187.640 98.349 190.698 96.090 192.950 L 48.500 240.550 C 43.806 245.244 36.194 245.244 31.500 240.550 C 26.806 235.856 26.806 228.244 31.500 223.550 L 79.100 175.960 C 81.346 173.701 84.397 172.428 87.582 172.421 C 90.767 172.413 93.824 173.672 96.080 175.920 ZM 158.530 185.510 C 160.789 187.762 162.059 190.820 162.059 194.010 C 162.059 197.200 160.789 200.258 158.530 202.510 L 120.530 240.510 C 115.836 245.204 108.224 245.204 103.530 240.510 C 98.836 235.816 98.836 228.204 103.530 223.510 L 141.530 185.510 C 143.777 183.250 146.831 181.976 150.019 181.971 C 153.206 181.965 156.265 183.228 158.520 185.480 Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
