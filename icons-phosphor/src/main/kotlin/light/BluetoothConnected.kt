package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorLightIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 195.600 171.200 L 138.000 128.000 L 195.600 84.800 C 197.111 83.667 198.000 81.889 198.000 80.000 C 198.000 78.111 197.111 76.333 195.600 75.200 L 131.600 27.200 C 129.782 25.836 127.349 25.617 125.317 26.633 C 123.284 27.650 122.000 29.727 122.000 32.000 L 122.000 116.000 L 67.600 75.200 C 64.949 73.212 61.188 73.749 59.200 76.400 C 57.212 79.051 57.749 82.812 60.400 84.800 L 118.000 128.000 L 60.400 171.200 C 57.749 173.188 57.212 176.949 59.200 179.600 C 61.188 182.251 64.949 182.788 67.600 180.800 L 122.000 140.000 L 122.000 224.000 C 122.000 226.273 123.284 228.350 125.317 229.367 C 127.349 230.383 129.782 230.164 131.600 228.800 L 195.600 180.800 C 197.111 179.667 198.000 177.889 198.000 176.000 C 198.000 174.111 197.111 172.333 195.600 171.200 ZM 134.000 44.000 L 182.000 80.000 L 134.000 116.000 ZM 134.000 212.000 L 134.000 140.000 L 182.000 176.000 ZM 60.000 138.000 C 54.477 138.000 50.000 133.523 50.000 128.000 C 50.000 122.477 54.477 118.000 60.000 118.000 C 65.523 118.000 70.000 122.477 70.000 128.000 C 70.000 133.523 65.523 138.000 60.000 138.000 ZM 214.000 128.000 C 214.000 133.523 209.523 138.000 204.000 138.000 C 198.477 138.000 194.000 133.523 194.000 128.000 C 194.000 122.477 198.477 118.000 204.000 118.000 C 209.523 118.000 214.000 122.477 214.000 128.000 Z"),
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
