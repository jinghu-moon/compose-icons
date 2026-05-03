package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorThinIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.360 98.490 C 233.848 93.721 229.580 90.356 224.590 90.000 L 163.120 85.000 L 139.440 27.670 C 137.533 23.033 133.014 20.006 128.000 20.006 C 122.986 20.006 118.467 23.033 116.560 27.670 L 92.880 85.000 L 31.410 90.000 C 26.415 90.424 22.162 93.802 20.619 98.571 C 19.075 103.340 20.542 108.569 24.340 111.840 L 71.190 152.250 L 56.870 212.640 C 55.643 217.524 57.504 222.664 61.574 225.630 C 65.644 228.595 71.106 228.793 75.380 226.130 L 128.000 193.770 L 180.620 226.130 C 184.851 228.803 190.290 228.600 194.310 225.620 C 198.443 222.695 200.357 217.533 199.130 212.620 L 184.810 152.200 L 231.660 111.790 C 235.502 108.534 236.968 103.263 235.360 98.490 ZM 226.430 105.750 L 177.750 147.750 C 176.620 148.725 176.126 150.248 176.470 151.700 L 191.340 214.490 C 191.786 216.247 191.102 218.097 189.620 219.140 C 188.209 220.192 186.295 220.264 184.810 219.320 L 130.100 185.670 C 128.813 184.876 127.187 184.876 125.900 185.670 L 71.190 219.320 C 69.705 220.264 67.791 220.192 66.380 219.140 C 64.898 218.097 64.214 216.247 64.660 214.490 L 79.530 151.700 C 79.874 150.248 79.380 148.725 78.250 147.750 L 29.570 105.750 C 28.194 104.590 27.670 102.704 28.250 101.000 C 28.784 99.313 30.295 98.123 32.060 98.000 L 96.000 92.790 C 97.500 92.671 98.806 91.720 99.380 90.330 L 124.000 30.730 C 124.660 29.077 126.260 27.993 128.040 27.993 C 129.820 27.993 131.420 29.077 132.080 30.730 L 156.700 90.330 C 157.261 91.696 158.530 92.642 160.000 92.790 L 223.900 97.940 C 225.665 98.063 227.176 99.253 227.710 100.940 C 228.327 102.653 227.817 104.570 226.430 105.750 Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
