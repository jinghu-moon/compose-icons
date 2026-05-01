package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorBoldIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(199.2f, 166.4f),
                    PathNode.LineTo(148.0f, 128.0f),
                    PathNode.LineTo(199.2f, 89.6f),
                    PathNode.CurveTo(202.22166f, 87.33374f, 204.0f, 83.777084f, 204.0f, 80.0f),
                    PathNode.CurveTo(204.0f, 76.222916f, 202.22166f, 72.66626f, 199.2f, 70.4f),
                    PathNode.LineTo(135.2f, 22.4f),
                    PathNode.CurveTo(131.56378f, 19.672842f, 126.698845f, 19.23417f, 122.63344f, 21.266874f),
                    PathNode.CurveTo(118.56803f, 23.299578f, 116.0f, 27.454735f, 116.0f, 32.0f),
                    PathNode.LineTo(116.0f, 104.0f),
                    PathNode.LineTo(71.2f, 70.4f),
                    PathNode.CurveTo(65.89806f, 66.42355f, 58.37645f, 67.49807f, 54.4f, 72.8f),
                    PathNode.CurveTo(50.42355f, 78.10194f, 51.498062f, 85.62355f, 56.8f, 89.6f),
                    PathNode.LineTo(108.0f, 128.0f),
                    PathNode.LineTo(56.8f, 166.4f),
                    PathNode.CurveTo(51.498062f, 170.37645f, 50.42355f, 177.89807f, 54.4f, 183.2f),
                    PathNode.CurveTo(58.37645f, 188.50194f, 65.89806f, 189.57645f, 71.2f, 185.6f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.LineTo(116.0f, 224.0f),
                    PathNode.CurveTo(116.0f, 228.54526f, 118.56803f, 232.70044f, 122.63344f, 234.73312f),
                    PathNode.CurveTo(126.698845f, 236.76582f, 131.56378f, 236.32716f, 135.2f, 233.6f),
                    PathNode.LineTo(199.2f, 185.6f),
                    PathNode.CurveTo(202.22166f, 183.33374f, 204.0f, 179.77708f, 204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 172.22292f, 202.22166f, 168.66626f, 199.2f, 166.4f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 56.0f),
                    PathNode.LineTo(172.0f, 80.0f),
                    PathNode.LineTo(140.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 200.0f),
                    PathNode.LineTo(140.0f, 152.0f),
                    PathNode.LineTo(172.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 144.0f),
                    PathNode.CurveTo(47.163445f, 144.0f, 40.0f, 136.83656f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 119.163445f, 47.163445f, 112.0f, 56.0f, 112.0f),
                    PathNode.CurveTo(64.836555f, 112.0f, 72.0f, 119.163445f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 136.83656f, 64.836555f, 144.0f, 56.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 136.83656f, 216.83656f, 144.0f, 208.0f, 144.0f),
                    PathNode.CurveTo(199.16344f, 144.0f, 192.0f, 136.83656f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 119.163445f, 199.16344f, 112.0f, 208.0f, 112.0f),
                    PathNode.CurveTo(216.83656f, 112.0f, 224.0f, 119.163445f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
