package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorThinIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 179.940 152.670 C 175.999 174.734 158.725 192.004 136.660 195.940 C 136.442 195.980 136.221 196.000 136.000 196.000 C 133.931 195.985 132.215 194.394 132.043 192.331 C 131.872 190.269 133.302 188.417 135.340 188.060 C 153.520 185.000 168.970 169.550 172.060 151.330 C 172.507 149.232 174.528 147.861 176.643 148.220 C 178.757 148.580 180.212 150.543 179.940 152.670 ZM 212.000 144.000 C 212.000 190.392 174.392 228.000 128.000 228.000 C 81.608 228.000 44.000 190.392 44.000 144.000 C 44.000 117.000 54.710 89.250 75.840 61.570 C 76.534 60.650 77.591 60.075 78.740 59.990 C 79.889 59.906 81.019 60.321 81.840 61.130 L 110.390 88.830 L 134.540 22.630 C 134.985 21.408 135.997 20.480 137.252 20.139 C 138.507 19.799 139.849 20.090 140.850 20.920 C 162.220 38.690 212.000 86.240 212.000 144.000 ZM 204.000 144.000 C 204.000 93.180 162.270 50.090 140.060 30.770 L 115.760 97.370 C 115.296 98.646 114.217 99.600 112.893 99.903 C 111.570 100.206 110.183 99.817 109.210 98.870 L 79.500 70.000 C 61.250 95.070 52.000 119.930 52.000 144.000 C 52.000 185.974 86.026 220.000 128.000 220.000 C 169.974 220.000 204.000 185.974 204.000 144.000 Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
