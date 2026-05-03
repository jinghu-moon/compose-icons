package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) return _eyedropper!!
        _eyedropper = phosphorLightIcon(
            name = "Eyedropper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 67.340 C 221.898 58.146 218.056 49.390 211.360 43.090 C 198.120 30.560 176.680 31.000 163.540 44.180 L 142.820 65.000 L 142.190 64.370 C 133.599 55.780 119.671 55.780 111.080 64.370 L 102.080 73.370 C 99.451 75.996 97.974 79.559 97.974 83.275 C 97.974 86.991 99.451 90.554 102.080 93.180 L 105.550 96.650 L 53.140 149.100 C 43.490 158.681 39.733 172.708 43.300 185.830 L 34.990 204.830 C 33.040 209.255 34.018 214.424 37.450 217.830 C 40.051 220.482 43.605 221.984 47.320 222.000 C 49.275 222.003 51.208 221.601 53.000 220.820 L 71.000 212.920 C 83.886 216.062 97.477 212.244 106.840 202.850 L 159.280 150.390 L 162.750 153.870 C 165.376 156.496 168.937 157.971 172.650 157.971 C 176.363 157.971 179.924 156.496 182.550 153.870 L 191.550 144.870 C 195.678 140.744 197.997 135.147 197.997 129.310 C 197.997 123.473 195.678 117.876 191.550 113.750 L 190.890 113.090 L 212.000 91.850 C 218.531 85.382 222.142 76.531 222.000 67.340 ZM 98.390 194.340 C 91.587 201.140 81.586 203.629 72.390 200.810 C 71.019 200.390 69.543 200.476 68.230 201.050 L 48.230 209.800 C 47.531 210.103 46.721 209.983 46.140 209.490 L 55.260 188.590 C 55.861 187.228 55.929 185.690 55.450 184.280 C 52.254 174.909 54.684 164.536 61.710 157.560 L 114.150 105.110 L 150.910 141.890 ZM 203.550 83.340 L 178.170 108.900 C 175.837 111.241 175.837 115.029 178.170 117.370 L 183.050 122.260 C 184.928 124.136 185.983 126.681 185.983 129.335 C 185.983 131.989 184.928 134.534 183.050 136.410 L 174.050 145.410 C 173.270 146.185 172.010 146.185 171.230 145.410 L 110.540 84.710 C 110.164 84.335 109.953 83.826 109.953 83.295 C 109.953 82.764 110.164 82.255 110.540 81.880 L 119.540 72.880 C 123.445 68.976 129.775 68.976 133.680 72.880 L 138.570 77.770 C 139.696 78.892 141.221 79.521 142.810 79.520 L 142.810 79.520 C 144.406 79.519 145.935 78.882 147.060 77.750 L 172.000 52.660 C 180.580 44.080 194.520 43.660 203.080 51.810 C 207.406 55.893 209.894 61.554 209.977 67.502 C 210.060 73.450 207.730 79.178 203.520 83.380 Z"),
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
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
