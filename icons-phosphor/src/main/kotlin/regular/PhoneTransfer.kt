package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorRegularIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 72.000 C 136.000 67.582 139.582 64.000 144.000 64.000 L 196.690 64.000 L 178.340 45.660 C 175.214 42.534 175.214 37.466 178.340 34.340 C 181.466 31.214 186.534 31.214 189.660 34.340 L 221.660 66.340 C 223.162 67.841 224.006 69.877 224.006 72.000 C 224.006 74.123 223.162 76.159 221.660 77.660 L 189.660 109.660 C 186.534 112.786 181.466 112.786 178.340 109.660 C 175.214 106.534 175.214 101.466 178.340 98.340 L 196.690 80.000 L 144.000 80.000 C 139.582 80.000 136.000 76.418 136.000 72.000 ZM 223.870 183.080 C 220.190 211.112 196.272 232.054 168.000 232.000 C 88.600 232.000 24.000 167.400 24.000 88.000 C 23.946 59.728 44.888 35.810 72.920 32.130 C 79.955 31.269 86.718 35.139 89.540 41.640 L 110.660 88.790 L 110.660 88.910 C 112.794 93.835 112.318 99.501 109.390 104.000 C 109.210 104.270 109.020 104.520 108.820 104.770 L 88.000 129.450 C 95.490 144.670 111.410 160.450 126.830 167.960 L 151.170 147.250 C 151.409 147.049 151.659 146.862 151.920 146.690 C 156.418 143.688 162.129 143.161 167.100 145.290 L 167.210 145.350 L 214.320 166.460 C 220.837 169.269 224.725 176.035 223.870 183.080 ZM 208.000 181.080 C 208.000 181.080 207.930 181.080 207.890 181.080 L 207.890 181.080 L 160.890 160.030 L 136.540 180.740 C 136.304 180.941 136.057 181.128 135.800 181.300 C 131.116 184.425 125.135 184.858 120.050 182.440 C 101.320 173.440 82.650 154.860 73.590 136.330 C 71.150 131.283 71.529 125.327 74.590 120.630 C 74.762 120.361 74.953 120.103 75.160 119.860 L 96.000 95.150 L 75.000 48.150 C 74.996 48.110 74.996 48.070 75.000 48.030 C 54.937 50.647 39.946 67.767 40.000 88.000 C 40.077 158.660 97.340 215.923 168.000 216.000 C 188.219 216.069 205.345 201.114 208.000 181.070 Z"),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
