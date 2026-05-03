package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorThinIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 84.000 C 143.464 84.000 156.000 71.464 156.000 56.000 C 156.000 40.536 143.464 28.000 128.000 28.000 C 112.536 28.000 100.000 40.536 100.000 56.000 C 100.000 71.464 112.536 84.000 128.000 84.000 ZM 128.000 36.000 C 139.046 36.000 148.000 44.954 148.000 56.000 C 148.000 67.046 139.046 76.000 128.000 76.000 C 116.954 76.000 108.000 67.046 108.000 56.000 C 108.000 44.954 116.954 36.000 128.000 36.000 ZM 52.000 96.000 C 52.000 89.373 57.373 84.000 64.000 84.000 C 70.627 84.000 76.000 89.373 76.000 96.000 C 76.000 102.627 70.627 108.000 64.000 108.000 C 57.373 108.000 52.000 102.627 52.000 96.000 ZM 219.120 108.100 C 217.739 109.822 215.223 110.100 213.500 108.720 C 212.300 107.780 187.090 88.610 147.800 110.020 C 147.800 110.300 147.800 110.560 147.800 110.860 C 147.555 122.114 146.408 133.330 144.370 144.400 L 178.600 172.930 C 179.860 173.984 180.348 175.701 179.830 177.260 L 163.830 225.260 C 163.283 226.908 161.736 228.015 160.000 228.000 C 159.571 227.999 159.146 227.928 158.740 227.790 C 157.733 227.455 156.901 226.733 156.427 225.784 C 155.952 224.835 155.874 223.736 156.210 222.730 L 171.340 177.320 L 142.340 153.190 C 140.665 159.948 138.482 166.571 135.810 173.000 C 122.550 204.580 98.810 225.710 65.150 235.800 C 64.779 235.925 64.391 235.993 64.000 236.000 C 62.017 235.998 60.334 234.543 60.046 232.581 C 59.758 230.619 60.951 228.742 62.850 228.170 C 132.170 207.370 138.390 142.080 139.590 114.960 L 138.250 115.860 C 109.240 135.580 86.780 140.000 72.420 140.000 C 61.180 140.000 54.910 137.270 54.340 137.000 C 52.330 136.083 51.443 133.710 52.360 131.700 C 53.277 129.690 55.650 128.803 57.660 129.720 C 57.910 129.830 86.100 141.590 133.750 109.200 C 159.640 91.600 181.160 90.600 194.660 92.860 C 209.520 95.340 218.140 102.150 218.500 102.440 C 219.339 103.104 219.877 104.077 219.993 105.140 C 220.110 106.204 219.795 107.270 219.120 108.100 Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
