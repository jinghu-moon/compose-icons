package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorLightIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.000 142.000 L 32.000 142.000 C 28.686 142.000 26.000 139.314 26.000 136.000 C 26.000 132.686 28.686 130.000 32.000 130.000 L 68.790 130.000 L 83.000 108.670 C 84.112 106.994 85.989 105.987 88.000 105.987 C 90.011 105.987 91.888 106.994 93.000 108.670 L 120.000 149.180 L 131.000 132.670 C 132.115 130.999 133.992 129.997 136.000 130.000 L 160.000 130.000 C 163.314 130.000 166.000 132.686 166.000 136.000 C 166.000 139.314 163.314 142.000 160.000 142.000 L 139.210 142.000 L 125.000 163.330 C 123.888 165.006 122.011 166.013 120.000 166.013 C 117.989 166.013 116.112 165.006 115.000 163.330 L 88.000 122.820 L 77.000 139.330 C 75.885 141.001 74.009 142.003 72.000 142.000 ZM 178.000 42.000 C 157.000 42.000 138.740 51.470 128.000 67.340 C 117.260 51.470 99.000 42.000 78.000 42.000 C 44.879 42.039 18.039 68.879 18.000 102.000 Q 18.000 103.090 18.000 104.190 C 18.105 107.504 20.876 110.105 24.190 110.000 C 27.504 109.895 30.105 107.124 30.000 103.810 C 30.000 103.210 30.000 102.600 30.000 102.000 C 30.028 75.502 51.502 54.028 78.000 54.000 C 98.280 54.000 115.310 64.830 122.450 82.270 C 123.375 84.521 125.567 85.990 128.000 85.990 C 130.433 85.990 132.625 84.521 133.550 82.270 C 140.690 64.830 157.720 54.000 178.000 54.000 C 204.498 54.028 225.972 75.502 226.000 102.000 C 226.000 157.730 144.390 207.650 128.000 217.110 C 118.160 211.450 84.910 191.290 59.840 163.950 C 58.420 162.266 56.192 161.496 54.035 161.943 C 51.878 162.390 50.140 163.983 49.507 166.092 C 48.873 168.202 49.446 170.489 51.000 172.050 C 81.940 205.820 123.410 228.340 125.160 229.280 C 126.933 230.233 129.067 230.233 130.840 229.280 C 149.680 218.689 167.450 206.298 183.900 192.280 C 219.800 161.590 238.000 131.200 238.000 102.000 C 237.961 68.879 211.121 42.039 178.000 42.000 Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
