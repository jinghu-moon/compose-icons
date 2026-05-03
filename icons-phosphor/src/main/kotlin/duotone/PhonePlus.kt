package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) return _phonePlus!!
        _phonePlus = phosphorDuotoneIcon(
            name = "PhonePlus",
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
                pathData = parseSvgPathData("M 214.360 166.460 L 167.260 145.350 L 167.140 145.290 C 162.169 143.161 156.458 143.688 151.960 146.690 C 151.699 146.862 151.449 147.049 151.210 147.250 L 126.870 168.000 C 111.450 160.510 95.530 144.710 88.040 129.490 L 108.820 104.780 C 109.020 104.530 109.210 104.280 109.390 104.010 C 112.323 99.528 112.819 93.874 110.710 88.950 C 110.706 88.910 110.706 88.870 110.710 88.830 L 89.540 41.640 C 86.721 35.135 79.957 31.261 72.920 32.120 C 44.889 35.809 23.949 59.727 24.000 88.000 C 24.000 167.400 88.600 232.000 168.000 232.000 C 196.273 232.051 220.191 211.111 223.880 183.080 C 224.739 176.043 220.865 169.279 214.360 166.460 ZM 168.000 216.000 C 97.340 215.923 40.077 158.660 40.000 88.000 C 39.922 67.799 54.847 50.678 74.870 48.000 C 74.866 48.040 74.866 48.080 74.870 48.120 L 95.870 95.120 L 75.200 119.860 C 74.990 120.101 74.800 120.359 74.630 120.630 C 71.569 125.327 71.190 131.283 73.630 136.330 C 82.690 154.860 101.360 173.390 120.090 182.440 C 125.175 184.858 131.156 184.425 135.840 181.300 C 136.099 181.127 136.346 180.936 136.580 180.730 L 160.890 160.000 L 207.890 181.060 L 207.890 181.060 C 207.890 181.060 207.970 181.060 208.000 181.060 C 205.350 201.108 188.222 216.069 168.000 216.000 ZM 136.000 80.000 C 136.000 75.582 139.582 72.000 144.000 72.000 L 168.000 72.000 L 168.000 48.000 C 168.000 43.582 171.582 40.000 176.000 40.000 C 180.418 40.000 184.000 43.582 184.000 48.000 L 184.000 72.000 L 208.000 72.000 C 212.418 72.000 216.000 75.582 216.000 80.000 C 216.000 84.418 212.418 88.000 208.000 88.000 L 184.000 88.000 L 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 C 171.582 120.000 168.000 116.418 168.000 112.000 L 168.000 88.000 L 144.000 88.000 C 139.582 88.000 136.000 84.418 136.000 80.000 Z"),
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
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
