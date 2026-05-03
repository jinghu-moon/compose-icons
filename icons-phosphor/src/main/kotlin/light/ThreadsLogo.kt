package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorLightIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 185.220 125.250 C 181.564 122.489 177.613 120.141 173.440 118.250 C 169.910 88.650 150.440 79.430 141.610 76.750 C 122.610 71.010 100.880 77.840 91.010 92.650 C 89.171 95.411 89.919 99.141 92.680 100.980 C 95.441 102.819 99.171 102.071 101.010 99.310 C 107.950 88.900 124.260 84.030 138.150 88.240 C 145.370 90.420 156.540 96.580 160.540 113.850 C 154.604 112.458 148.527 111.760 142.430 111.770 C 128.900 111.770 116.270 115.230 106.880 121.540 C 96.000 128.850 90.000 139.660 90.000 152.000 C 90.000 174.000 108.000 185.520 125.710 185.520 C 138.147 185.434 150.019 180.315 158.620 171.330 C 165.200 164.480 172.970 152.220 173.910 132.070 C 175.316 132.911 176.675 133.829 177.980 134.820 C 188.460 142.740 193.980 154.220 193.980 168.000 C 193.980 188.160 172.980 218.000 127.980 218.000 C 100.910 218.000 81.060 208.810 68.980 190.670 C 59.000 175.750 54.000 154.660 54.000 128.000 C 54.000 101.340 59.000 80.250 69.000 65.330 C 81.080 47.190 100.930 38.000 128.000 38.000 C 161.850 38.000 183.570 51.670 194.400 79.800 C 195.590 82.893 199.062 84.435 202.155 83.245 C 205.248 82.055 206.790 78.583 205.600 75.490 C 193.000 42.650 166.850 26.000 128.000 26.000 C 96.670 26.000 73.460 37.000 59.000 58.670 C 47.720 75.600 42.000 98.930 42.000 128.000 C 42.000 157.070 47.720 180.400 59.000 197.330 C 73.460 219.000 96.670 230.000 128.000 230.000 C 157.430 230.000 175.810 218.810 186.050 209.420 C 198.540 198.000 206.000 182.490 206.000 168.000 C 206.000 150.310 198.810 135.520 185.220 125.250 ZM 150.000 163.000 C 143.666 169.638 134.915 173.430 125.740 173.510 C 109.330 173.520 102.000 162.710 102.000 152.000 C 102.000 138.410 114.640 123.790 142.410 123.790 C 149.051 123.789 155.654 124.801 161.990 126.790 C 161.990 127.200 161.990 127.610 161.990 128.030 C 162.000 142.720 157.840 154.820 150.000 163.000 Z"),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
