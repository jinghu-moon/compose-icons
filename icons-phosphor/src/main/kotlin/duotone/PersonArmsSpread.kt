package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorDuotoneIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 104.000 40.000 C 104.000 26.745 114.745 16.000 128.000 16.000 C 141.255 16.000 152.000 26.745 152.000 40.000 C 152.000 53.255 141.255 64.000 128.000 64.000 C 114.745 64.000 104.000 53.255 104.000 40.000 ZM 212.000 80.000 L 44.000 80.000 C 31.130 80.000 27.290 97.500 39.000 102.900 L 96.000 128.000 L 73.130 214.930 C 70.443 220.915 73.061 227.948 79.007 230.721 C 84.953 233.493 92.023 230.976 94.880 225.070 L 128.000 168.000 L 161.120 225.070 C 163.977 230.976 171.047 233.493 176.993 230.721 C 182.939 227.948 185.557 220.915 182.870 214.930 L 160.000 128.000 L 217.000 102.900 C 228.690 97.500 224.850 80.000 212.000 80.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 160.000 40.000 C 160.000 22.327 145.673 8.000 128.000 8.000 C 110.327 8.000 96.000 22.327 96.000 40.000 C 96.000 57.673 110.327 72.000 128.000 72.000 C 145.673 72.000 160.000 57.673 160.000 40.000 ZM 128.000 56.000 C 119.163 56.000 112.000 48.837 112.000 40.000 C 112.000 31.163 119.163 24.000 128.000 24.000 C 136.837 24.000 144.000 31.163 144.000 40.000 C 144.000 48.837 136.837 56.000 128.000 56.000 ZM 231.500 87.710 C 229.621 78.467 221.431 71.869 212.000 72.000 L 44.000 72.000 C 34.607 72.000 26.480 78.536 24.465 87.710 C 22.450 96.884 27.091 106.225 35.620 110.160 L 35.750 110.220 L 86.500 132.570 L 65.500 212.290 C 60.935 222.369 65.406 234.240 75.485 238.805 C 85.564 243.370 97.435 238.899 102.000 228.820 L 128.000 183.940 L 154.000 228.820 C 158.786 238.484 170.373 242.614 180.192 238.155 C 190.012 233.695 194.527 222.254 190.400 212.290 L 169.400 132.570 L 220.150 110.220 L 220.280 110.160 C 228.940 106.357 233.657 96.919 231.500 87.710 ZM 213.700 95.610 L 156.770 120.680 C 153.170 122.266 151.257 126.235 152.260 130.040 L 175.130 217.000 C 175.247 217.466 175.411 217.918 175.620 218.350 C 176.248 219.649 176.128 221.185 175.307 222.371 C 174.485 223.556 173.088 224.208 171.651 224.075 C 170.215 223.942 168.961 223.046 168.370 221.730 C 168.260 221.510 168.150 221.300 168.030 221.100 L 134.920 164.000 C 133.489 161.533 130.852 160.014 128.000 160.014 C 125.148 160.014 122.511 161.533 121.080 164.000 L 88.000 221.060 C 87.880 221.260 87.770 221.470 87.660 221.690 C 87.069 223.006 85.815 223.902 84.379 224.035 C 82.942 224.168 81.545 223.516 80.723 222.331 C 79.902 221.145 79.782 219.609 80.410 218.310 C 80.619 217.878 80.783 217.426 80.900 216.960 L 103.740 130.000 C 104.743 126.195 102.830 122.226 99.230 120.640 L 42.300 95.610 C 40.617 94.807 39.712 92.948 40.119 91.128 C 40.525 89.308 42.135 88.011 44.000 88.000 L 212.000 88.000 C 213.870 87.997 215.493 89.290 215.908 91.113 C 216.322 92.937 215.418 94.805 213.730 95.610 Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
