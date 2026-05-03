package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorThinIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 216.000 C 252.000 218.209 250.209 220.000 248.000 220.000 L 104.000 220.000 C 101.791 220.000 100.000 218.209 100.000 216.000 C 100.000 213.791 101.791 212.000 104.000 212.000 L 248.000 212.000 C 250.209 212.000 252.000 213.791 252.000 216.000 ZM 230.920 187.850 L 54.290 138.400 C 38.768 134.010 28.039 119.861 28.000 103.730 L 28.000 48.000 C 28.005 44.146 29.861 40.530 32.988 38.278 C 36.115 36.026 40.134 35.413 43.790 36.630 L 49.270 38.450 C 50.429 38.840 51.347 39.739 51.760 40.890 L 63.070 72.180 L 100.000 82.710 L 100.000 48.000 C 100.002 44.145 101.856 40.525 104.984 38.271 C 108.112 36.016 112.132 35.402 115.790 36.620 L 121.270 38.440 C 122.363 38.806 123.245 39.626 123.690 40.690 L 146.940 96.110 L 209.640 113.630 C 225.204 117.991 235.973 132.166 236.000 148.330 L 236.000 184.000 C 236.000 185.251 235.413 186.431 234.416 187.186 C 233.419 187.942 232.125 188.188 230.920 187.850 ZM 228.000 148.330 C 227.985 135.751 219.604 124.718 207.490 121.330 L 142.920 103.330 C 141.743 102.999 140.781 102.148 140.310 101.020 L 117.000 45.470 L 113.250 44.220 C 112.035 43.820 110.701 44.026 109.663 44.774 C 108.624 45.521 108.006 46.720 108.000 48.000 L 108.000 88.000 C 108.001 89.256 107.413 90.440 106.410 91.197 C 105.407 91.954 104.108 92.195 102.900 91.850 L 58.900 79.310 C 57.665 78.955 56.675 78.029 56.240 76.820 L 44.900 45.430 L 41.260 44.220 C 40.042 43.806 38.699 44.011 37.660 44.770 C 36.622 45.519 36.005 46.720 36.000 48.000 L 36.000 103.720 C 36.017 116.279 44.366 127.301 56.450 130.720 L 228.000 178.720 Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
