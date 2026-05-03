package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorFillIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.380 221.920 C 218.110 224.891 213.051 224.649 210.080 221.380 L 183.630 192.280 L 132.800 230.400 C 130.206 232.343 126.695 232.529 123.910 230.870 C 121.435 229.330 119.950 226.604 120.000 223.690 L 120.000 144.000 L 68.800 182.400 C 65.285 185.035 60.304 184.343 57.640 180.850 C 55.028 177.183 55.833 172.100 59.450 169.420 L 120.920 123.310 L 50.080 45.380 C 47.173 42.103 47.442 37.097 50.684 34.151 C 53.926 31.204 58.935 31.413 61.920 34.620 L 221.920 210.620 C 224.891 213.890 224.649 218.949 221.380 221.920 ZM 155.000 113.220 C 156.388 114.747 158.709 114.968 160.360 113.730 L 196.800 86.400 C 198.814 84.889 200.000 82.518 200.000 80.000 C 200.000 77.482 198.814 75.111 196.800 73.600 L 132.800 25.600 C 129.810 23.343 125.654 23.464 122.800 25.890 C 120.978 27.492 119.954 29.815 120.000 32.240 L 120.000 73.180 C 119.989 74.169 120.345 75.128 121.000 75.870 Z"),
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
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
