package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) return _pencilSlash!!
        _pencilSlash = phosphorBoldIcon(
            name = "PencilSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 84.760 98.270 L 33.860 149.170 C 30.096 152.911 27.986 158.003 28.000 163.310 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 92.690 228.000 C 97.997 228.015 103.090 225.905 106.830 222.140 L 154.260 174.720 L 199.130 224.070 C 201.998 227.303 206.382 228.744 210.609 227.843 C 214.835 226.942 218.251 223.838 219.551 219.716 C 220.851 215.595 219.835 211.093 216.890 207.930 ZM 111.430 127.610 L 72.000 167.000 L 61.000 156.000 L 101.000 116.050 ZM 52.000 181.000 L 75.000 204.000 L 52.000 204.000 ZM 100.000 195.000 L 89.000 184.000 L 127.620 145.380 L 138.130 156.940 ZM 230.150 70.540 L 185.460 25.860 C 177.650 18.052 164.990 18.052 157.180 25.860 L 121.180 61.860 C 116.952 66.136 116.541 72.880 120.219 77.638 C 123.897 82.395 130.528 83.695 135.730 80.680 L 147.080 92.000 C 142.971 96.758 143.230 103.880 147.674 108.327 C 152.118 112.773 159.240 113.036 164.000 108.930 L 175.000 120.000 L 174.460 120.530 C 169.766 125.224 169.766 132.836 174.460 137.530 C 179.154 142.224 186.766 142.224 191.460 137.530 L 230.130 98.860 C 233.894 95.110 236.012 90.017 236.016 84.704 C 236.020 79.391 233.909 74.295 230.150 70.540 ZM 192.000 103.000 L 153.000 64.000 L 171.340 45.660 L 210.340 84.660 Z"),
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
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
