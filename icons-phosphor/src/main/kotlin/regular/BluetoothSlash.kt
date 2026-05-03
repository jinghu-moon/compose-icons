package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorRegularIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.920 210.620 L 61.920 34.620 C 58.935 31.413 53.926 31.204 50.684 34.151 C 47.442 37.097 47.173 42.103 50.080 45.380 L 120.920 123.310 L 59.200 169.600 C 55.665 172.251 54.949 177.265 57.600 180.800 C 60.251 184.335 65.265 185.051 68.800 182.400 L 120.000 144.000 L 120.000 224.000 C 120.000 227.030 121.712 229.800 124.422 231.155 C 127.133 232.511 130.376 232.218 132.800 230.400 L 183.630 192.280 L 210.080 221.380 C 211.992 223.535 214.915 224.496 217.733 223.895 C 220.550 223.294 222.827 221.225 223.694 218.478 C 224.561 215.730 223.883 212.729 221.920 210.620 ZM 136.000 208.000 L 136.000 144.000 L 147.730 152.800 L 172.810 180.390 ZM 120.000 71.630 L 120.000 32.000 C 120.000 28.970 121.712 26.200 124.422 24.845 C 127.133 23.489 130.376 23.782 132.800 25.600 L 196.800 73.600 C 198.814 75.111 200.000 77.482 200.000 80.000 C 200.000 82.518 198.814 84.889 196.800 86.400 L 163.270 111.550 C 159.735 114.201 154.721 113.485 152.070 109.950 C 149.419 106.415 150.135 101.401 153.670 98.750 L 178.670 80.000 L 136.000 48.000 L 136.000 71.630 C 136.000 76.048 132.418 79.630 128.000 79.630 C 123.582 79.630 120.000 76.048 120.000 71.630 Z"),
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
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
