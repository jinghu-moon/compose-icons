package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorBoldIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.840 120.460 C 185.693 118.099 182.347 116.014 178.840 114.230 C 175.120 92.550 162.430 76.820 143.320 71.030 C 121.940 64.550 97.290 72.420 86.000 89.340 C 82.322 94.863 83.817 102.322 89.340 106.000 C 94.863 109.678 102.322 108.183 106.000 102.660 C 111.470 94.460 125.110 90.580 136.410 94.000 C 142.821 95.900 148.190 100.315 151.290 106.240 C 148.346 105.939 145.389 105.789 142.430 105.790 C 108.560 105.790 84.000 125.220 84.000 152.000 C 84.000 174.900 101.540 191.520 125.710 191.520 C 139.773 191.440 153.204 185.668 162.940 175.520 C 168.940 169.290 175.820 159.060 178.660 143.450 C 184.860 149.870 188.000 158.120 188.000 168.040 C 188.000 185.780 168.930 212.040 128.000 212.040 C 82.240 212.040 60.000 184.560 60.000 128.040 C 60.000 71.520 82.240 44.040 128.000 44.040 C 159.080 44.040 179.000 56.460 188.800 82.040 C 191.180 88.226 198.124 91.310 204.310 88.930 C 210.496 86.550 213.580 79.606 211.200 73.420 C 197.770 38.440 169.000 20.000 128.000 20.000 C 68.670 20.000 36.000 58.350 36.000 128.000 C 36.000 197.650 68.670 236.000 128.000 236.000 C 159.360 236.000 179.080 223.950 190.110 213.850 C 203.810 201.280 212.000 184.140 212.000 168.000 C 212.000 148.360 204.000 131.920 188.840 120.460 ZM 145.640 158.850 C 140.442 164.315 133.252 167.443 125.710 167.520 C 117.540 167.520 108.000 163.460 108.000 152.000 C 108.000 136.740 125.840 129.790 142.410 129.790 C 146.956 129.785 151.488 130.295 155.920 131.310 C 155.360 142.930 151.840 152.410 145.640 158.850 Z"),
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
