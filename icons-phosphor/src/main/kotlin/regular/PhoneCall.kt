package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorRegularIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.270 45.930 C 144.818 43.880 146.159 42.131 147.997 41.070 C 149.835 40.008 152.020 39.720 154.070 40.270 C 184.268 48.149 207.851 71.732 215.730 101.930 C 216.280 103.980 215.992 106.165 214.930 108.003 C 213.869 109.841 212.120 111.182 210.070 111.730 C 209.394 111.908 208.699 111.998 208.000 112.000 C 204.375 112.000 201.203 109.563 200.270 106.060 C 193.844 81.408 174.592 62.156 149.940 55.730 C 147.888 55.184 146.137 53.844 145.073 52.006 C 144.010 50.167 143.721 47.982 144.270 45.930 ZM 141.940 87.730 C 155.730 91.410 164.590 100.270 168.270 114.060 C 169.203 117.563 172.375 120.000 176.000 120.000 C 176.699 119.998 177.394 119.908 178.070 119.730 C 180.120 119.182 181.869 117.841 182.930 116.003 C 183.992 114.165 184.280 111.980 183.730 109.930 C 178.610 90.770 165.230 77.390 146.070 72.270 C 141.801 71.130 137.415 73.666 136.275 77.935 C 135.135 82.204 137.671 86.590 141.940 87.730 ZM 223.880 183.080 C 220.191 211.111 196.273 232.051 168.000 232.000 C 88.600 232.000 24.000 167.400 24.000 88.000 C 23.949 59.727 44.889 35.809 72.920 32.120 C 79.957 31.261 86.721 35.135 89.540 41.640 L 110.660 88.790 L 110.660 88.910 C 112.794 93.835 112.318 99.501 109.390 104.000 C 109.210 104.270 109.020 104.520 108.820 104.770 L 88.000 129.450 C 95.490 144.670 111.410 160.450 126.830 167.960 L 151.170 147.250 C 151.409 147.049 151.659 146.862 151.920 146.690 C 156.416 143.691 162.121 143.165 167.090 145.290 L 167.220 145.350 L 214.330 166.460 C 220.847 169.269 224.735 176.035 223.880 183.080 ZM 208.000 181.080 C 208.000 181.080 207.930 181.080 207.890 181.080 L 207.890 181.080 L 160.890 160.030 L 136.540 180.740 C 136.304 180.940 136.057 181.127 135.800 181.300 C 131.116 184.425 125.135 184.858 120.050 182.440 C 101.320 173.390 82.650 154.860 73.590 136.330 C 71.150 131.283 71.529 125.327 74.590 120.630 C 74.760 120.359 74.950 120.101 75.160 119.860 L 96.000 95.150 L 75.000 48.150 C 74.996 48.110 74.996 48.070 75.000 48.030 C 54.937 50.647 39.946 67.767 40.000 88.000 C 40.077 158.660 97.340 215.923 168.000 216.000 C 188.219 216.069 205.345 201.114 208.000 181.070 Z"),
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
