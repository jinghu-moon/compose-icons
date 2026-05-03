package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorLightIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.560 51.650 C 189.503 35.269 167.538 26.027 144.600 26.000 L 144.270 26.000 C 121.431 25.937 99.518 35.019 83.420 51.220 L 22.000 113.390 C 16.588 118.867 16.615 127.686 22.060 133.130 L 50.720 161.790 C 53.339 164.426 56.904 165.902 60.620 165.890 L 60.700 165.890 C 64.445 165.883 68.029 164.365 70.640 161.680 L 131.510 99.280 C 138.461 92.361 149.657 92.237 156.760 99.000 C 160.169 102.314 162.095 106.865 162.100 111.620 C 162.135 116.643 160.179 121.475 156.660 125.060 L 94.370 185.310 C 91.678 187.921 90.146 191.503 90.118 195.254 C 90.090 199.004 91.568 202.609 94.220 205.260 L 122.890 233.920 C 128.330 239.323 137.096 239.367 142.590 234.020 L 204.390 173.530 C 238.070 139.860 238.600 85.180 205.560 51.650 ZM 62.080 153.290 C 61.706 153.672 61.194 153.888 60.660 153.890 C 60.131 153.878 59.626 153.671 59.240 153.310 L 30.570 124.650 C 29.795 123.870 29.795 122.610 30.570 121.830 L 55.790 96.280 L 87.130 127.620 ZM 134.190 225.440 C 133.410 226.215 132.150 226.215 131.370 225.440 L 102.710 196.780 C 102.329 196.402 102.117 195.887 102.120 195.350 C 102.125 194.819 102.341 194.312 102.720 193.940 L 128.510 169.000 L 159.850 200.330 ZM 196.000 165.000 L 168.480 191.940 L 137.190 160.650 L 165.090 133.650 L 165.160 133.570 C 170.985 127.713 174.226 119.770 174.160 111.510 C 174.146 103.532 170.899 95.901 165.160 90.360 C 153.324 79.091 134.667 79.295 123.080 90.820 L 95.510 119.000 L 64.220 87.740 L 91.940 59.680 C 105.784 45.749 124.630 37.942 144.270 38.000 L 144.550 38.000 C 164.288 38.021 183.190 45.978 197.000 60.080 C 225.440 88.920 224.940 136.000 196.000 165.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _magnet!!
    }

private var _magnet: ImageVector? = null
