package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorLightIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 249.920 113.400 L 182.470 45.490 C 145.709 8.821 86.197 8.848 49.470 45.550 L 35.680 59.780 C 33.374 62.163 33.437 65.964 35.820 68.270 C 38.203 70.576 42.004 70.513 44.310 68.130 L 58.000 54.000 C 64.028 47.961 70.961 42.900 78.550 39.000 L 127.550 88.000 L 30.090 185.400 C 27.461 188.026 25.984 191.589 25.984 195.305 C 25.984 199.021 27.461 202.584 30.090 205.210 L 50.780 225.900 C 53.406 228.526 56.967 230.001 60.680 230.001 C 64.393 230.001 67.954 228.526 70.580 225.900 L 168.000 128.460 L 201.420 161.880 C 204.046 164.506 207.607 165.981 211.320 165.981 C 215.033 165.981 218.594 164.506 221.220 161.880 L 249.900 133.190 C 255.367 127.729 255.376 118.872 249.920 113.400 ZM 62.100 217.410 C 61.725 217.786 61.216 217.997 60.685 217.997 C 60.154 217.997 59.645 217.786 59.270 217.410 L 38.580 196.720 C 38.204 196.345 37.993 195.836 37.993 195.305 C 37.993 194.774 38.204 194.265 38.580 193.890 L 108.000 124.460 L 131.510 148.000 ZM 163.760 115.730 L 140.000 139.490 L 116.480 116.000 L 140.240 92.240 C 141.367 91.115 142.000 89.587 142.000 87.995 C 142.000 86.403 141.367 84.875 140.240 83.750 L 90.540 34.000 C 119.907 24.431 152.160 32.159 174.000 54.000 L 219.620 99.930 L 188.000 131.490 L 172.240 115.730 C 169.897 113.390 166.103 113.390 163.760 115.730 ZM 241.420 124.730 L 212.730 153.430 C 212.355 153.806 211.846 154.017 211.315 154.017 C 210.784 154.017 210.275 153.806 209.900 153.430 L 196.490 140.000 L 228.050 108.430 L 241.420 121.890 C 242.189 122.669 242.189 123.921 241.420 124.700 Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
