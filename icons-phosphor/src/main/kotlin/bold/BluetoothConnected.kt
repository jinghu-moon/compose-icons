package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorBoldIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 199.200 166.400 L 148.000 128.000 L 199.200 89.600 C 202.222 87.334 204.000 83.777 204.000 80.000 C 204.000 76.223 202.222 72.666 199.200 70.400 L 135.200 22.400 C 131.564 19.673 126.699 19.234 122.633 21.267 C 118.568 23.300 116.000 27.455 116.000 32.000 L 116.000 104.000 L 71.200 70.400 C 65.898 66.424 58.376 67.498 54.400 72.800 C 50.424 78.102 51.498 85.624 56.800 89.600 L 108.000 128.000 L 56.800 166.400 C 51.498 170.376 50.424 177.898 54.400 183.200 C 58.376 188.502 65.898 189.576 71.200 185.600 L 116.000 152.000 L 116.000 224.000 C 116.000 228.545 118.568 232.700 122.633 234.733 C 126.699 236.766 131.564 236.327 135.200 233.600 L 199.200 185.600 C 202.222 183.334 204.000 179.777 204.000 176.000 C 204.000 172.223 202.222 168.666 199.200 166.400 ZM 140.000 56.000 L 172.000 80.000 L 140.000 104.000 ZM 140.000 200.000 L 140.000 152.000 L 172.000 176.000 ZM 56.000 144.000 C 47.163 144.000 40.000 136.837 40.000 128.000 C 40.000 119.163 47.163 112.000 56.000 112.000 C 64.837 112.000 72.000 119.163 72.000 128.000 C 72.000 136.837 64.837 144.000 56.000 144.000 ZM 224.000 128.000 C 224.000 136.837 216.837 144.000 208.000 144.000 C 199.163 144.000 192.000 136.837 192.000 128.000 C 192.000 119.163 199.163 112.000 208.000 112.000 C 216.837 112.000 224.000 119.163 224.000 128.000 Z"),
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
