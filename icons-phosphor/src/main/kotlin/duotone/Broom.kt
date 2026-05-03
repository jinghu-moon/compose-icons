package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorDuotoneIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 192.800 165.120 L 43.930 105.570 C 48.733 97.104 54.631 89.307 61.470 82.380 C 63.732 80.086 67.149 79.373 70.140 80.570 L 95.520 90.850 C 99.474 92.428 103.893 92.366 107.800 90.677 C 111.708 88.988 114.781 85.811 116.340 81.850 L 137.340 28.750 C 141.490 18.750 152.810 13.420 162.970 17.220 C 168.059 19.113 172.160 22.993 174.331 27.970 C 176.501 32.947 176.555 38.593 174.480 43.610 L 153.130 96.710 C 149.882 104.906 153.875 114.185 162.060 117.460 L 187.000 127.300 C 190.027 128.524 192.006 131.465 192.000 134.730 L 192.000 152.000 C 191.991 156.386 192.258 160.768 192.800 165.120 Z"),
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
                pathData = parseSvgPathData("M 235.500 216.810 C 212.940 205.810 200.000 182.230 200.000 152.010 L 200.000 134.730 C 200.017 128.169 196.013 122.268 189.910 119.860 L 165.000 110.000 C 160.921 108.368 158.921 103.752 160.520 99.660 L 181.840 46.660 C 184.764 39.631 184.699 31.715 181.662 24.735 C 178.625 17.754 172.876 12.312 165.740 9.660 C 151.438 4.420 135.562 11.511 129.920 25.660 C 129.916 25.700 129.916 25.740 129.920 25.780 L 108.900 79.000 C 107.272 83.100 102.633 85.108 98.530 83.490 L 73.110 73.140 C 67.115 70.711 60.245 72.158 55.740 76.800 C 34.680 98.450 24.000 123.750 24.000 152.000 C 23.945 180.909 35.125 208.709 55.180 229.530 C 56.699 231.118 58.803 232.011 61.000 232.000 L 232.000 232.000 C 235.723 231.996 238.952 229.425 239.788 225.796 C 240.624 222.168 238.846 218.443 235.500 216.810 ZM 67.140 88.000 L 92.550 98.300 C 98.474 100.670 105.098 100.583 110.958 98.060 C 116.818 95.536 121.432 90.783 123.780 84.850 L 144.780 31.850 C 147.340 25.740 154.250 22.580 160.210 24.850 C 163.280 25.989 165.752 28.334 167.051 31.340 C 168.350 34.346 168.364 37.753 167.090 40.770 L 145.690 93.760 C 140.812 106.067 146.821 120.001 159.120 124.900 L 184.000 134.730 L 184.000 152.000 C 184.000 152.330 184.000 152.660 184.000 153.000 L 55.770 101.710 C 59.179 96.837 62.982 92.252 67.140 88.000 ZM 115.140 216.000 C 103.229 204.575 94.791 190.015 90.800 174.000 C 89.643 169.785 85.317 167.280 81.085 168.373 C 76.854 169.465 74.282 173.752 75.310 178.000 C 78.799 191.777 85.045 204.704 93.670 216.000 L 64.440 216.000 C 48.662 198.421 39.955 175.621 40.000 152.000 C 39.902 139.485 42.540 127.099 47.730 115.710 L 185.530 170.830 C 188.530 188.830 196.090 204.310 207.420 215.990 Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
