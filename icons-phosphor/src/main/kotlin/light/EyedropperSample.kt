package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorLightIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 67.340 C 221.898 58.146 218.056 49.390 211.360 43.090 C 198.120 30.560 176.680 31.000 163.540 44.180 L 142.820 65.000 L 142.190 64.370 C 133.599 55.780 119.671 55.780 111.080 64.370 L 102.080 73.370 C 99.451 75.996 97.974 79.559 97.974 83.275 C 97.974 86.991 99.451 90.554 102.080 93.180 L 105.550 96.650 L 53.140 149.100 C 43.494 158.683 39.737 172.708 43.300 185.830 L 34.990 204.830 C 33.040 209.255 34.018 214.424 37.450 217.830 C 40.051 220.482 43.605 221.984 47.320 222.000 C 49.275 222.003 51.208 221.601 53.000 220.820 L 71.000 212.920 C 83.886 216.062 97.477 212.244 106.840 202.850 L 159.280 150.390 L 162.750 153.870 C 165.376 156.496 168.937 157.971 172.650 157.971 C 176.363 157.971 179.924 156.496 182.550 153.870 L 191.550 144.870 C 200.120 136.263 200.120 122.347 191.550 113.740 L 190.890 113.090 L 212.000 91.850 C 218.531 85.382 222.142 76.531 222.000 67.340 ZM 98.390 194.340 C 91.587 201.140 81.586 203.629 72.390 200.810 C 71.016 200.388 69.536 200.473 68.220 201.050 L 48.220 209.800 C 47.521 210.103 46.711 209.983 46.130 209.490 L 55.250 188.590 C 55.851 187.228 55.919 185.690 55.440 184.280 C 53.398 178.321 53.598 171.823 56.000 166.000 L 126.780 166.000 ZM 138.780 154.000 L 65.240 154.000 L 114.070 105.160 L 150.830 141.940 ZM 203.550 83.410 L 178.170 108.900 C 175.837 111.241 175.837 115.029 178.170 117.370 L 183.050 122.260 C 184.928 124.136 185.983 126.681 185.983 129.335 C 185.983 131.989 184.928 134.534 183.050 136.410 L 174.050 145.410 C 173.270 146.185 172.010 146.185 171.230 145.410 L 110.540 84.710 C 110.164 84.335 109.953 83.826 109.953 83.295 C 109.953 82.764 110.164 82.255 110.540 81.880 L 119.540 72.880 C 123.445 68.976 129.775 68.976 133.680 72.880 L 138.570 77.770 C 139.696 78.892 141.221 79.521 142.810 79.520 L 142.810 79.520 C 144.406 79.519 145.935 78.882 147.060 77.750 L 172.000 52.660 C 180.570 44.080 194.510 43.660 203.070 51.810 C 207.396 55.893 209.884 61.554 209.967 67.502 C 210.050 73.450 207.720 79.178 203.510 83.380 Z"),
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
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
