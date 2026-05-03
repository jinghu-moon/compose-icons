package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorThinIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 67.370 C 219.909 58.720 216.298 50.480 210.000 44.550 C 197.540 32.750 177.340 33.220 165.000 45.600 L 142.820 67.860 L 140.820 65.860 C 133.010 58.052 120.350 58.052 112.540 65.860 L 103.540 74.860 C 101.281 77.112 100.011 80.170 100.011 83.360 C 100.011 86.550 101.281 89.608 103.540 91.860 L 108.430 96.750 L 54.550 150.520 C 45.229 159.777 41.725 173.394 45.420 186.000 L 36.820 205.700 C 35.193 209.364 35.987 213.652 38.820 216.490 C 42.319 219.999 47.615 220.996 52.150 219.000 L 70.870 210.820 C 83.246 214.082 96.423 210.513 105.460 201.450 L 159.320 147.580 L 164.200 152.470 C 166.452 154.729 169.510 155.999 172.700 155.999 C 175.890 155.999 178.948 154.729 181.200 152.470 L 190.200 143.470 C 193.952 139.719 196.061 134.631 196.061 129.325 C 196.061 124.019 193.952 118.931 190.200 115.180 L 188.140 113.120 L 210.690 90.430 C 216.799 84.328 220.160 76.003 220.000 67.370 ZM 99.810 195.780 C 92.491 203.114 81.720 205.807 71.810 202.780 C 70.895 202.495 69.909 202.549 69.030 202.930 L 49.030 211.680 C 47.521 212.338 45.763 212.005 44.600 210.840 C 44.091 210.334 43.948 209.566 44.240 208.910 L 53.430 187.850 C 53.827 186.938 53.869 185.912 53.550 184.970 C 51.204 178.079 51.642 170.544 54.770 163.970 L 131.600 163.970 ZM 139.600 156.000 L 60.410 156.000 L 114.060 102.330 L 153.660 141.940 ZM 179.600 110.340 C 178.042 111.901 178.042 114.429 179.600 115.990 L 184.490 120.880 C 186.749 123.132 188.019 126.190 188.019 129.380 C 188.019 132.570 186.749 135.628 184.490 137.880 L 175.490 146.880 C 174.740 147.631 173.722 148.053 172.660 148.053 C 171.598 148.053 170.580 147.631 169.830 146.880 L 109.180 86.100 C 108.429 85.350 108.007 84.332 108.007 83.270 C 108.007 82.208 108.429 81.190 109.180 80.440 L 118.180 71.440 C 120.432 69.181 123.490 67.911 126.680 67.911 C 129.870 67.911 132.928 69.181 135.180 71.440 L 140.000 76.360 C 140.751 77.110 141.769 77.531 142.830 77.530 L 142.830 77.530 C 143.893 77.528 144.911 77.104 145.660 76.350 L 170.660 51.250 C 179.990 41.910 195.180 41.520 204.530 50.360 C 209.245 54.815 211.955 60.989 212.043 67.476 C 212.132 73.962 209.591 80.208 205.000 84.790 Z"),
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
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
