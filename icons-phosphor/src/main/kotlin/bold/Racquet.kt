package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Racquet: ImageVector
    get() {
        if (_racquet != null) return _racquet!!
        _racquet = phosphorBoldIcon(
            name = "Racquet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.700 23.300 C 218.050 8.660 197.430 2.000 174.620 4.530 C 152.810 6.950 131.470 17.610 114.530 34.530 C 97.590 51.450 86.940 72.800 84.530 94.620 C 82.530 112.950 86.420 129.860 95.630 143.400 L 75.330 163.710 L 73.470 161.850 C 65.660 154.042 53.000 154.042 45.190 161.850 L 13.860 193.180 C 10.108 196.931 7.999 202.019 7.999 207.325 C 7.999 212.631 10.108 217.719 13.860 221.470 L 34.540 242.150 C 38.291 245.902 43.379 248.011 48.685 248.011 C 53.991 248.011 59.079 245.902 62.830 242.150 L 62.830 242.150 L 94.140 210.840 C 97.892 207.089 100.001 202.001 100.001 196.695 C 100.001 191.389 97.892 186.301 94.140 182.550 L 92.280 180.700 L 112.590 160.390 C 123.780 168.000 137.280 172.000 152.000 172.000 C 155.134 172.000 158.266 171.823 161.380 171.470 C 183.190 169.050 204.530 158.390 221.460 141.470 C 238.390 124.550 249.060 103.200 251.460 81.380 C 254.000 58.570 247.340 38.000 232.700 23.300 ZM 48.700 222.300 L 33.700 207.300 L 59.350 181.650 L 74.350 196.650 ZM 128.000 141.760 C 122.337 138.397 117.609 133.666 114.250 128.000 L 128.000 128.000 ZM 108.000 104.010 C 108.151 92.821 111.028 81.837 116.380 72.010 L 128.000 72.010 L 128.000 104.010 ZM 152.000 72.000 L 184.000 72.000 L 184.000 104.000 L 152.000 104.000 ZM 208.000 104.000 L 208.000 72.000 L 228.000 72.000 C 227.859 83.189 224.985 94.174 219.630 104.000 ZM 221.750 48.000 L 208.000 48.000 L 208.000 34.260 C 213.653 37.623 218.377 42.347 221.740 48.000 ZM 183.820 28.000 L 184.000 28.000 L 184.000 48.000 L 152.000 48.000 L 152.000 36.340 C 162.470 30.820 173.480 28.000 183.820 28.000 ZM 152.000 148.060 L 152.000 128.000 L 184.000 128.000 L 184.000 139.670 C 174.176 145.031 163.191 147.912 152.000 148.060 Z"),
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
        return _racquet!!
    }

private var _racquet: ImageVector? = null
