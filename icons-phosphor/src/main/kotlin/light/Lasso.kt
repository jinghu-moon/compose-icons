package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorLightIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.680 61.630 C 184.110 49.000 156.880 42.000 128.000 42.000 C 99.120 42.000 71.890 49.000 51.320 61.630 C 29.830 74.850 18.000 92.730 18.000 112.000 C 18.000 131.270 29.830 149.130 51.320 162.350 C 70.450 174.100 95.350 181.000 122.000 181.850 C 122.000 182.490 122.000 183.130 122.000 183.790 C 122.000 198.550 115.060 210.890 102.460 218.520 C 87.240 227.740 66.460 228.420 50.780 220.230 C 48.875 219.172 46.546 219.231 44.696 220.383 C 42.846 221.535 41.766 223.599 41.875 225.776 C 41.984 227.952 43.264 229.898 45.220 230.860 C 54.429 235.598 64.644 238.047 75.000 238.000 C 86.863 238.048 98.514 234.860 108.700 228.780 C 125.040 218.890 134.030 202.910 134.030 183.780 C 134.030 183.130 134.030 182.490 134.030 181.840 C 160.680 180.950 185.600 174.100 204.750 162.320 C 226.170 149.110 238.000 131.230 238.000 112.000 C 238.000 92.770 226.170 74.850 204.680 61.630 ZM 64.680 156.090 C 70.000 144.090 81.880 141.020 91.160 142.220 C 103.440 143.820 115.800 152.890 120.240 169.770 C 99.730 168.810 80.480 164.080 64.720 156.090 ZM 198.350 152.090 C 180.730 162.940 157.520 169.190 132.580 169.880 C 130.890 161.104 126.998 152.901 121.270 146.040 C 114.036 137.429 103.854 131.821 92.710 130.310 C 75.820 128.110 61.220 135.850 54.300 149.990 C 38.610 139.370 30.000 126.000 30.000 112.000 C 30.000 97.070 39.800 82.820 57.610 71.870 C 76.320 60.340 101.320 54.000 128.000 54.000 C 154.680 54.000 179.680 60.340 198.390 71.850 C 216.200 82.800 226.000 97.050 226.000 112.000 C 226.000 126.950 216.200 141.160 198.390 152.110 Z"),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
