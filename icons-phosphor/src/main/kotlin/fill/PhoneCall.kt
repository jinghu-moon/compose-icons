package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorFillIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.270 45.930 C 144.818 43.880 146.159 42.131 147.997 41.070 C 149.835 40.008 152.020 39.720 154.070 40.270 C 184.268 48.149 207.851 71.732 215.730 101.930 C 216.280 103.980 215.992 106.165 214.930 108.003 C 213.869 109.841 212.120 111.182 210.070 111.730 C 209.394 111.908 208.699 111.998 208.000 112.000 C 204.378 112.001 201.207 109.569 200.270 106.070 C 193.847 81.414 174.595 62.158 149.940 55.730 C 147.888 55.184 146.137 53.844 145.073 52.006 C 144.010 50.167 143.721 47.982 144.270 45.930 ZM 141.940 87.730 C 155.730 91.410 164.590 100.280 168.270 114.070 C 169.207 117.569 172.378 120.001 176.000 120.000 C 176.699 119.998 177.394 119.908 178.070 119.730 C 180.120 119.182 181.869 117.841 182.930 116.003 C 183.992 114.165 184.280 111.980 183.730 109.930 C 178.610 90.770 165.230 77.390 146.070 72.270 C 141.801 71.130 137.415 73.666 136.275 77.935 C 135.135 82.204 137.671 86.590 141.940 87.730 ZM 214.370 166.460 L 167.260 145.350 L 167.130 145.290 C 162.161 143.165 156.456 143.691 151.960 146.690 C 151.699 146.862 151.449 147.049 151.210 147.250 L 126.870 168.000 C 111.450 160.510 95.530 144.710 88.040 129.490 L 108.820 104.780 C 109.020 104.530 109.210 104.280 109.390 104.010 C 112.323 99.528 112.819 93.874 110.710 88.950 L 110.710 88.830 L 89.540 41.640 C 86.721 35.135 79.957 31.261 72.920 32.120 C 44.889 35.809 23.949 59.727 24.000 88.000 C 24.000 167.400 88.600 232.000 168.000 232.000 C 196.273 232.051 220.191 211.111 223.880 183.080 C 224.741 176.045 220.871 169.282 214.370 166.460 Z"),
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
