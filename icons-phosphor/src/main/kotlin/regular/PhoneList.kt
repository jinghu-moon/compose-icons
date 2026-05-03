package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneList: ImageVector
    get() {
        if (_phoneList != null) return _phoneList!!
        _phoneList = phosphorRegularIcon(
            name = "PhoneList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 214.360 166.460 L 167.260 145.350 L 167.140 145.290 C 162.169 143.161 156.458 143.688 151.960 146.690 C 151.699 146.862 151.449 147.049 151.210 147.250 L 126.870 168.000 C 111.450 160.510 95.530 144.710 88.040 129.490 L 108.820 104.780 C 109.020 104.530 109.210 104.280 109.390 104.010 C 112.323 99.528 112.819 93.874 110.710 88.950 C 110.706 88.910 110.706 88.870 110.710 88.830 L 89.540 41.640 C 86.721 35.135 79.957 31.261 72.920 32.120 C 44.889 35.809 23.949 59.727 24.000 88.000 C 24.000 167.400 88.600 232.000 168.000 232.000 C 196.273 232.051 220.191 211.111 223.880 183.080 C 224.739 176.043 220.865 169.279 214.360 166.460 ZM 168.000 216.000 C 97.340 215.923 40.077 158.660 40.000 88.000 C 39.922 67.799 54.847 50.678 74.870 48.000 C 74.866 48.040 74.866 48.080 74.870 48.120 L 95.870 95.120 L 75.200 119.860 C 74.990 120.101 74.800 120.359 74.630 120.630 C 71.569 125.327 71.190 131.283 73.630 136.330 C 82.690 154.860 101.360 173.390 120.090 182.440 C 125.175 184.858 131.156 184.425 135.840 181.300 C 136.099 181.127 136.346 180.936 136.580 180.730 L 160.890 160.000 L 207.890 181.060 L 207.890 181.060 C 207.890 181.060 207.970 181.060 208.000 181.060 C 205.350 201.108 188.222 216.069 168.000 216.000 ZM 136.000 64.000 C 136.000 59.582 139.582 56.000 144.000 56.000 L 208.000 56.000 C 212.418 56.000 216.000 59.582 216.000 64.000 C 216.000 68.418 212.418 72.000 208.000 72.000 L 144.000 72.000 C 139.582 72.000 136.000 68.418 136.000 64.000 ZM 136.000 104.000 C 136.000 99.582 139.582 96.000 144.000 96.000 L 208.000 96.000 C 212.418 96.000 216.000 99.582 216.000 104.000 C 216.000 108.418 212.418 112.000 208.000 112.000 L 144.000 112.000 C 139.582 112.000 136.000 108.418 136.000 104.000 Z"),
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
        return _phoneList!!
    }

private var _phoneList: ImageVector? = null
