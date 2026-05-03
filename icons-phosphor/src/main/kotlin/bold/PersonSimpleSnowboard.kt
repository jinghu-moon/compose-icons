package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorBoldIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 80.000 C 185.673 80.000 200.000 65.673 200.000 48.000 C 200.000 30.327 185.673 16.000 168.000 16.000 C 150.327 16.000 136.000 30.327 136.000 48.000 C 136.000 65.673 150.327 80.000 168.000 80.000 ZM 168.000 40.000 C 172.418 40.000 176.000 43.582 176.000 48.000 C 176.000 52.418 172.418 56.000 168.000 56.000 C 163.582 56.000 160.000 52.418 160.000 48.000 C 160.000 43.582 163.582 40.000 168.000 40.000 ZM 219.380 108.480 L 83.380 68.480 C 77.148 66.947 70.814 70.588 69.002 76.744 C 67.189 82.900 70.542 89.393 76.610 91.480 L 112.250 102.000 L 83.610 145.000 L 44.000 133.270 C 34.607 130.464 24.440 132.299 16.620 138.210 C 8.646 144.117 3.960 153.467 4.000 163.390 C 4.034 177.270 13.141 189.494 26.430 193.500 L 26.430 193.500 L 180.000 238.710 C 189.462 241.479 199.676 239.617 207.552 233.688 C 215.429 227.759 220.043 218.459 220.000 208.600 C 219.967 194.717 210.855 182.489 197.560 178.490 L 157.820 166.790 L 170.000 148.680 C 172.133 145.500 172.621 141.493 171.313 137.894 C 170.005 134.296 167.057 131.537 163.380 130.470 L 128.820 120.470 L 136.400 109.090 L 212.650 131.520 C 216.826 132.956 221.454 131.983 224.697 128.986 C 227.940 125.989 229.276 121.453 228.173 117.176 C 227.071 112.900 223.708 109.575 219.420 108.520 ZM 196.000 208.600 C 196.023 210.966 194.906 213.198 193.000 214.600 C 191.228 215.960 188.907 216.381 186.770 215.730 L 33.210 170.480 C 30.557 169.628 28.600 167.369 28.135 164.622 C 27.670 161.875 28.775 159.097 31.000 157.420 C 32.778 156.072 35.092 155.652 37.230 156.290 L 190.820 201.510 C 193.916 202.480 196.017 205.356 196.000 208.600 ZM 140.880 149.000 L 133.680 159.730 L 107.680 152.090 L 114.780 141.450 Z"),
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
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
