package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorRegularIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.350 70.080 C 237.683 64.878 233.027 61.207 227.580 60.800 L 190.640 57.880 L 176.430 24.220 C 174.308 19.237 169.416 16.003 164.000 16.003 C 158.584 16.003 153.692 19.237 151.570 24.220 L 137.360 57.880 L 100.420 60.800 C 94.994 61.200 90.350 64.843 88.669 70.017 C 86.988 75.191 88.605 80.868 92.760 84.380 L 120.820 108.060 L 112.260 143.450 C 110.987 148.692 113.000 154.184 117.360 157.360 C 121.760 160.603 127.681 160.876 132.360 158.050 L 164.000 139.000 L 195.650 158.060 C 200.331 160.878 206.247 160.605 210.650 157.370 C 215.001 154.188 217.010 148.699 215.740 143.460 L 207.180 108.070 L 235.240 84.390 C 239.397 80.902 241.023 75.242 239.350 70.080 ZM 193.080 99.000 C 190.764 100.957 189.754 104.054 190.470 107.000 L 198.750 141.210 L 168.130 122.800 C 165.592 121.273 162.418 121.273 159.880 122.800 L 129.260 141.230 L 137.540 107.000 C 138.254 104.052 137.239 100.954 134.920 99.000 L 108.000 76.260 L 143.520 73.450 C 146.500 73.214 149.100 71.335 150.260 68.580 L 164.000 35.910 L 177.790 68.580 C 178.950 71.335 181.550 73.214 184.530 73.450 L 220.060 76.260 ZM 88.080 123.180 L 29.660 181.660 C 26.534 184.786 21.466 184.786 18.340 181.660 C 15.214 178.534 15.214 173.466 18.340 170.340 L 76.790 111.890 C 79.916 108.764 84.984 108.764 88.110 111.890 C 91.236 115.016 91.236 120.084 88.110 123.210 ZM 98.890 173.050 C 102.012 176.174 102.012 181.236 98.890 184.360 L 45.660 237.660 C 42.534 240.786 37.466 240.786 34.340 237.660 C 31.214 234.534 31.214 229.466 34.340 226.340 L 87.610 173.080 C 90.734 169.958 95.796 169.958 98.920 173.080 ZM 171.890 172.050 C 173.392 173.551 174.236 175.587 174.236 177.710 C 174.236 179.833 173.392 181.869 171.890 183.370 L 117.610 237.650 C 114.484 240.776 109.416 240.776 106.290 237.650 C 103.164 234.524 103.164 229.456 106.290 226.330 L 160.580 172.050 C 162.083 170.537 164.129 169.687 166.262 169.689 C 168.395 169.690 170.439 170.544 171.940 172.060 Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
