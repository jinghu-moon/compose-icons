package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorLightIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 233.910 82.790 L 173.220 22.100 C 170.594 19.471 167.031 17.994 163.315 17.994 C 159.599 17.994 156.036 19.471 153.410 22.100 L 98.930 76.770 C 89.410 73.520 64.930 68.430 39.220 89.180 C 36.119 91.673 34.225 95.367 34.011 99.340 C 33.797 103.313 35.284 107.189 38.100 110.000 L 87.810 159.710 L 43.760 203.710 C 42.155 205.206 41.494 207.458 42.037 209.584 C 42.580 211.710 44.240 213.370 46.366 213.913 C 48.492 214.456 50.744 213.795 52.240 212.190 L 96.290 168.140 L 146.000 217.890 C 148.624 220.519 152.185 221.998 155.900 222.000 Q 156.390 222.000 156.900 222.000 C 160.938 221.713 164.654 219.693 167.090 216.460 C 186.810 190.250 184.240 169.230 179.550 157.160 L 233.920 102.610 C 236.551 99.982 238.028 96.416 238.026 92.698 C 238.024 88.980 236.543 85.415 233.910 82.790 ZM 225.420 94.100 L 225.420 94.100 L 168.150 151.560 C 166.331 153.388 165.884 156.174 167.040 158.480 C 176.980 178.360 165.330 198.800 157.500 209.200 C 157.150 209.657 156.620 209.941 156.045 209.979 C 155.471 210.018 154.908 209.807 154.500 209.400 L 46.580 101.510 C 46.171 101.105 45.957 100.544 45.991 99.969 C 46.025 99.395 46.306 98.863 46.760 98.510 C 59.260 88.420 71.260 85.750 80.460 85.750 C 86.386 85.661 92.264 86.823 97.710 89.160 C 100.029 90.308 102.822 89.840 104.640 88.000 L 161.900 30.590 C 162.275 30.214 162.784 30.003 163.315 30.003 C 163.846 30.003 164.355 30.214 164.730 30.590 L 225.420 91.270 C 225.796 91.645 226.007 92.154 226.007 92.685 C 226.007 93.216 225.796 93.725 225.420 94.100 Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
