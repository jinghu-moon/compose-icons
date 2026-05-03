package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorDuotoneIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 215.940 182.080 C 212.727 206.094 192.229 224.019 168.000 224.000 C 92.889 224.000 32.000 163.111 32.000 88.000 C 31.981 63.771 49.905 43.273 73.920 40.060 C 77.445 39.641 80.825 41.596 82.220 44.860 L 103.350 92.060 C 104.404 94.522 104.157 97.349 102.690 99.590 L 81.320 125.000 C 79.778 127.327 79.573 130.293 80.780 132.810 C 89.050 149.740 106.550 167.030 123.530 175.220 C 126.061 176.422 129.038 176.198 131.360 174.630 L 156.360 153.330 C 158.611 151.832 161.466 151.573 163.950 152.640 L 211.110 173.770 C 214.390 175.156 216.359 178.544 215.940 182.080 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 146.340 109.660 C 144.838 108.159 143.994 106.123 143.994 104.000 C 143.994 101.877 144.838 99.841 146.340 98.340 L 180.690 64.000 L 160.000 64.000 C 155.582 64.000 152.000 60.418 152.000 56.000 C 152.000 51.582 155.582 48.000 160.000 48.000 L 200.000 48.000 C 204.418 48.000 208.000 51.582 208.000 56.000 L 208.000 96.000 C 208.000 100.418 204.418 104.000 200.000 104.000 C 195.582 104.000 192.000 100.418 192.000 96.000 L 192.000 75.310 L 157.660 109.660 C 156.159 111.162 154.123 112.006 152.000 112.006 C 149.877 112.006 147.841 111.162 146.340 109.660 ZM 223.880 183.080 C 220.191 211.111 196.273 232.051 168.000 232.000 C 88.600 232.000 24.000 167.400 24.000 88.000 C 23.949 59.727 44.889 35.809 72.920 32.120 C 79.955 31.259 86.718 35.129 89.540 41.630 L 110.660 88.790 L 110.660 88.910 C 112.794 93.835 112.318 99.501 109.390 104.000 C 109.210 104.270 109.020 104.520 108.820 104.770 L 88.000 129.450 C 95.490 144.670 111.410 160.450 126.830 167.960 L 151.170 147.250 C 151.409 147.049 151.659 146.862 151.920 146.690 C 156.411 143.679 162.123 143.152 167.090 145.290 L 167.220 145.350 L 214.330 166.460 C 220.847 169.269 224.735 176.035 223.880 183.080 ZM 208.000 181.080 C 208.000 181.080 207.930 181.080 207.890 181.080 L 207.890 181.080 L 160.890 160.020 L 136.540 180.740 C 136.304 180.940 136.057 181.127 135.800 181.300 C 131.116 184.425 125.135 184.858 120.050 182.440 C 101.320 173.390 82.650 154.860 73.590 136.330 C 71.150 131.283 71.529 125.327 74.590 120.630 C 74.760 120.359 74.950 120.101 75.160 119.860 L 96.000 95.150 L 75.000 48.150 C 74.996 48.110 74.996 48.070 75.000 48.030 C 54.937 50.647 39.946 67.767 40.000 88.000 C 40.077 158.660 97.340 215.923 168.000 216.000 C 188.219 216.069 205.345 201.114 208.000 181.070 Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
