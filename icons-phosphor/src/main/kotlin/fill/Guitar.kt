package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = phosphorFillIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.660 46.340 L 209.660 6.340 C 206.534 3.214 201.466 3.214 198.340 6.340 C 195.214 9.466 195.214 14.534 198.340 17.660 L 200.690 20.000 L 140.520 80.160 C 117.730 68.300 92.210 69.290 76.750 84.740 C 72.670 88.837 69.474 93.728 67.360 99.110 C 66.033 102.091 63.073 104.009 59.810 104.000 C 45.220 104.490 32.550 109.720 23.160 119.110 C 11.080 131.220 6.000 148.600 8.740 168.070 C 11.400 186.700 21.070 205.150 36.000 220.000 C 50.930 234.850 69.340 244.560 88.000 247.220 C 91.344 247.720 94.719 247.980 98.100 248.000 C 113.420 248.000 126.930 242.770 136.860 232.840 C 146.250 223.450 151.480 210.780 151.970 196.190 C 151.967 192.920 153.897 189.958 156.890 188.640 C 162.272 186.527 167.164 183.331 171.260 179.250 C 186.710 163.790 187.700 138.250 175.840 115.480 L 236.000 55.310 L 238.340 57.660 C 241.466 60.786 246.534 60.786 249.660 57.660 C 252.786 54.534 252.786 49.466 249.660 46.340 ZM 93.660 205.650 C 90.536 208.772 85.474 208.772 82.350 205.650 L 50.350 173.650 C 47.227 170.524 47.229 165.458 50.355 162.335 C 53.481 159.212 58.547 159.214 61.670 162.340 L 93.670 194.340 C 96.789 197.467 96.784 202.529 93.660 205.650 ZM 135.800 159.790 C 127.793 167.800 115.749 170.198 105.284 165.865 C 94.820 161.531 87.997 151.321 87.997 139.995 C 87.997 128.669 94.820 118.459 105.284 114.125 C 115.749 109.792 127.793 112.190 135.800 120.200 C 146.729 131.134 146.729 148.856 135.800 159.790 ZM 166.860 101.790 C 164.976 99.461 162.974 97.232 160.860 95.110 C 158.737 92.994 156.504 90.991 154.170 89.110 L 176.000 67.310 L 188.690 80.000 ZM 200.000 68.680 L 187.320 56.000 L 212.000 31.310 L 224.690 44.000 Z"),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
