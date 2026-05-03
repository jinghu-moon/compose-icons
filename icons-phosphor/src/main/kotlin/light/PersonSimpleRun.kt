package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorLightIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 86.000 C 168.569 86.000 182.000 72.569 182.000 56.000 C 182.000 39.431 168.569 26.000 152.000 26.000 C 135.431 26.000 122.000 39.431 122.000 56.000 C 122.000 72.569 135.431 86.000 152.000 86.000 ZM 152.000 38.000 C 161.941 38.000 170.000 46.059 170.000 56.000 C 170.000 65.941 161.941 74.000 152.000 74.000 C 142.059 74.000 134.000 65.941 134.000 56.000 C 134.000 46.059 142.059 38.000 152.000 38.000 ZM 218.490 138.860 C 217.900 139.130 211.320 141.990 199.610 141.990 C 185.750 141.990 164.710 137.990 137.880 120.990 C 133.581 133.826 127.728 146.087 120.450 157.500 C 129.880 160.280 142.450 165.220 153.640 173.760 C 172.460 188.050 182.000 207.650 182.000 232.000 C 182.000 235.314 179.314 238.000 176.000 238.000 C 172.686 238.000 170.000 235.314 170.000 232.000 C 170.000 188.000 132.770 172.820 113.090 167.890 Q 111.890 169.440 110.630 170.980 C 91.380 194.290 67.290 206.430 40.520 206.430 C 37.475 206.440 34.431 206.296 31.400 206.000 C 28.086 205.669 25.669 202.714 26.000 199.400 C 26.331 196.086 29.286 193.669 32.600 194.000 C 59.230 196.660 82.370 186.340 101.370 163.310 C 114.530 147.370 123.310 127.800 127.450 114.160 C 86.940 89.640 60.860 109.380 59.730 110.270 C 57.135 112.250 53.434 111.793 51.399 109.241 C 49.364 106.689 49.742 102.979 52.250 100.890 C 52.620 100.590 61.640 93.460 77.010 90.890 C 90.870 88.580 112.930 89.590 139.370 107.560 C 186.510 139.560 213.250 128.030 213.510 127.910 C 216.525 126.529 220.089 127.855 221.470 130.870 C 222.851 133.885 221.525 137.449 218.510 138.830 Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
