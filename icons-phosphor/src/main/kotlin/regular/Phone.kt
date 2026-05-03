package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorRegularIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.370 158.460 L 175.260 137.350 L 175.130 137.290 C 170.161 135.165 164.456 135.691 159.960 138.690 C 159.699 138.862 159.449 139.049 159.210 139.250 L 134.870 160.000 C 119.450 152.510 103.530 136.710 96.040 121.490 L 116.820 96.780 C 117.020 96.530 117.210 96.280 117.390 96.010 C 120.323 91.528 120.819 85.874 118.710 80.950 L 118.710 80.830 L 97.540 33.640 C 94.721 27.135 87.957 23.261 80.920 24.120 C 52.889 27.809 31.949 51.727 32.000 80.000 C 32.000 159.400 96.600 224.000 176.000 224.000 C 204.273 224.051 228.191 203.111 231.880 175.080 C 232.741 168.045 228.871 161.282 222.370 158.460 ZM 176.000 208.000 C 105.340 207.923 48.077 150.660 48.000 80.000 C 47.922 59.799 62.847 42.678 82.870 40.000 C 82.866 40.040 82.866 40.080 82.870 40.120 L 103.870 87.120 L 83.200 111.860 C 82.990 112.101 82.800 112.359 82.630 112.630 C 79.569 117.327 79.190 123.283 81.630 128.330 C 90.690 146.860 109.360 165.390 128.090 174.440 C 133.175 176.858 139.156 176.425 143.840 173.300 C 144.097 173.127 144.344 172.940 144.580 172.740 L 168.890 152.000 L 215.890 173.050 L 215.890 173.050 C 215.890 173.050 215.970 173.050 216.000 173.050 C 213.354 193.102 196.226 208.068 176.000 208.000 Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
