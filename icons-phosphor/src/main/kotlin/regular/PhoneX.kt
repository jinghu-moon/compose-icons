package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = phosphorRegularIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 146.340 98.340 L 164.690 80.000 L 146.340 61.660 C 143.214 58.534 143.214 53.466 146.340 50.340 C 149.466 47.214 154.534 47.214 157.660 50.340 L 176.000 68.690 L 194.340 50.340 C 197.466 47.214 202.534 47.214 205.660 50.340 C 208.786 53.466 208.786 58.534 205.660 61.660 L 187.320 80.000 L 205.660 98.340 C 208.786 101.466 208.786 106.534 205.660 109.660 C 202.534 112.786 197.466 112.786 194.340 109.660 L 176.000 91.310 L 157.660 109.660 C 154.534 112.786 149.466 112.786 146.340 109.660 C 143.214 106.534 143.214 101.466 146.340 98.340 ZM 223.880 183.080 C 220.191 211.111 196.273 232.051 168.000 232.000 C 88.600 232.000 24.000 167.400 24.000 88.000 C 23.949 59.727 44.889 35.809 72.920 32.120 C 79.957 31.261 86.721 35.135 89.540 41.640 L 110.660 88.790 L 110.660 88.910 C 112.794 93.835 112.318 99.501 109.390 104.000 C 109.210 104.270 109.020 104.520 108.820 104.770 L 88.000 129.450 C 95.490 144.670 111.410 160.450 126.830 167.960 L 151.170 147.250 C 151.409 147.049 151.659 146.862 151.920 146.690 C 156.416 143.691 162.121 143.165 167.090 145.290 L 167.220 145.350 L 214.330 166.460 C 220.847 169.269 224.735 176.035 223.880 183.080 ZM 208.000 181.080 C 208.000 181.080 207.930 181.080 207.890 181.080 L 207.890 181.080 L 160.890 160.030 L 136.540 180.740 C 136.304 180.940 136.057 181.127 135.800 181.300 C 131.116 184.425 125.135 184.858 120.050 182.440 C 101.320 173.390 82.650 154.860 73.590 136.330 C 71.150 131.283 71.529 125.327 74.590 120.630 C 74.760 120.359 74.950 120.101 75.160 119.860 L 96.000 95.150 L 75.000 48.150 C 74.996 48.110 74.996 48.070 75.000 48.030 C 54.937 50.647 39.946 67.767 40.000 88.000 C 40.077 158.660 97.340 215.923 168.000 216.000 C 188.219 216.069 205.345 201.114 208.000 181.070 Z"),
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
