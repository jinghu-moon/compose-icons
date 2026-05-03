package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorBoldIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 92.000 C 171.882 92.000 188.000 75.882 188.000 56.000 C 188.000 36.118 171.882 20.000 152.000 20.000 C 132.118 20.000 116.000 36.118 116.000 56.000 C 116.000 75.882 132.118 92.000 152.000 92.000 ZM 152.000 44.000 C 158.627 44.000 164.000 49.373 164.000 56.000 C 164.000 62.627 158.627 68.000 152.000 68.000 C 145.373 68.000 140.000 62.627 140.000 56.000 C 140.000 49.373 145.373 44.000 152.000 44.000 ZM 228.000 137.400 C 228.001 142.093 225.266 146.355 221.000 148.310 C 214.102 150.751 206.847 152.029 199.530 152.090 C 185.530 152.090 165.280 148.270 139.760 133.090 C 136.803 140.309 133.372 147.324 129.490 154.090 C 153.120 162.830 188.000 183.800 188.000 232.000 C 188.000 238.627 182.627 244.000 176.000 244.000 C 169.373 244.000 164.000 238.627 164.000 232.000 C 164.000 213.310 157.050 198.940 142.740 188.060 C 133.580 181.060 123.190 177.060 115.310 174.720 C 114.500 175.720 113.670 176.720 112.810 177.670 C 92.810 200.540 67.990 212.430 40.560 212.430 C 37.304 212.430 34.050 212.266 30.810 211.940 C 26.519 211.544 22.770 208.877 20.988 204.954 C 19.206 201.031 19.664 196.453 22.189 192.961 C 24.713 189.469 28.916 187.598 33.200 188.060 C 85.500 193.280 110.680 142.140 118.990 120.310 C 84.800 102.460 63.740 118.780 63.510 119.000 C 58.328 122.893 50.991 121.967 46.938 116.909 C 42.885 111.851 43.581 104.489 48.510 100.280 C 50.080 99.000 88.000 69.440 142.750 106.620 C 185.850 135.930 210.850 126.540 211.250 126.380 C 214.955 124.783 219.215 125.155 222.587 127.369 C 225.960 129.584 227.993 133.345 228.000 137.380 Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
