package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorFillIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 176.000 C 200.000 178.518 198.814 180.889 196.800 182.400 L 132.800 230.400 C 131.415 231.439 129.731 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 144.000 L 68.800 182.400 C 65.265 185.051 60.251 184.335 57.600 180.800 C 54.949 177.265 55.665 172.251 59.200 169.600 L 114.670 128.000 L 59.200 86.400 C 55.665 83.749 54.949 78.735 57.600 75.200 C 60.251 71.665 65.265 70.949 68.800 73.600 L 120.000 112.000 L 120.000 32.000 C 120.000 28.970 121.712 26.200 124.422 24.845 C 127.133 23.489 130.376 23.782 132.800 25.600 L 196.800 73.600 C 198.814 75.111 200.000 77.482 200.000 80.000 C 200.000 82.518 198.814 84.889 196.800 86.400 L 141.330 128.000 L 196.800 169.600 C 198.814 171.111 200.000 173.482 200.000 176.000 ZM 72.000 128.000 C 72.000 121.373 66.627 116.000 60.000 116.000 C 53.373 116.000 48.000 121.373 48.000 128.000 C 48.000 134.627 53.373 140.000 60.000 140.000 C 66.627 140.000 72.000 134.627 72.000 128.000 ZM 204.000 116.000 C 197.373 116.000 192.000 121.373 192.000 128.000 C 192.000 134.627 197.373 140.000 204.000 140.000 C 210.627 140.000 216.000 134.627 216.000 128.000 C 216.000 121.373 210.627 116.000 204.000 116.000 Z"),
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
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
