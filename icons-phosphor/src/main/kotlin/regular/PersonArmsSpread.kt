package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorRegularIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 40.000 C 160.000 22.327 145.673 8.000 128.000 8.000 C 110.327 8.000 96.000 22.327 96.000 40.000 C 96.000 57.673 110.327 72.000 128.000 72.000 C 145.673 72.000 160.000 57.673 160.000 40.000 ZM 128.000 56.000 C 119.163 56.000 112.000 48.837 112.000 40.000 C 112.000 31.163 119.163 24.000 128.000 24.000 C 136.837 24.000 144.000 31.163 144.000 40.000 C 144.000 48.837 136.837 56.000 128.000 56.000 ZM 231.500 87.710 C 229.621 78.467 221.431 71.869 212.000 72.000 L 44.000 72.000 C 34.607 72.000 26.480 78.536 24.465 87.710 C 22.450 96.884 27.091 106.225 35.620 110.160 L 35.750 110.160 L 86.500 132.510 L 65.500 212.230 C 60.924 222.309 65.386 234.189 75.465 238.765 C 85.544 243.341 97.424 238.879 102.000 228.800 L 128.000 183.930 L 154.000 228.800 C 158.802 238.431 170.364 242.535 180.164 238.088 C 189.964 233.640 194.487 222.235 190.400 212.280 L 169.400 132.560 L 220.150 110.210 L 220.280 110.210 C 228.960 106.400 233.680 96.935 231.500 87.710 ZM 213.700 95.610 L 156.770 120.670 C 153.170 122.256 151.257 126.225 152.260 130.030 L 175.130 217.000 C 175.247 217.466 175.411 217.918 175.620 218.350 C 176.306 219.818 176.039 221.555 174.944 222.748 C 173.849 223.942 172.141 224.358 170.620 223.800 C 169.625 223.435 168.816 222.691 168.370 221.730 C 168.269 221.514 168.155 221.303 168.030 221.100 L 134.920 164.000 C 133.489 161.533 130.852 160.014 128.000 160.014 C 125.148 160.014 122.511 161.533 121.080 164.000 L 88.000 221.050 C 87.875 221.253 87.761 221.464 87.660 221.680 C 87.214 222.641 86.405 223.385 85.410 223.750 C 83.889 224.308 82.181 223.892 81.086 222.698 C 79.991 221.505 79.724 219.768 80.410 218.300 C 80.619 217.868 80.783 217.416 80.900 216.950 L 103.740 130.000 C 104.743 126.195 102.830 122.226 99.230 120.640 L 42.300 95.610 C 40.617 94.807 39.712 92.948 40.119 91.128 C 40.525 89.308 42.135 88.011 44.000 88.000 L 212.000 88.000 C 213.870 87.997 215.493 89.290 215.908 91.113 C 216.322 92.937 215.418 94.805 213.730 95.610 Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
