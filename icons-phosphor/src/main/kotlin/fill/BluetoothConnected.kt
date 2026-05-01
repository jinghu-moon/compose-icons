package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorFillIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 178.51805f, 198.81445f, 180.88918f, 196.8f, 182.4f),
                    PathNode.LineTo(132.8f, 230.4f),
                    PathNode.CurveTo(131.41524f, 231.43858f, 129.73096f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(123.58172f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(68.8f, 182.4f),
                    PathNode.CurveTo(65.26538f, 185.05096f, 60.250965f, 184.33463f, 57.6f, 180.8f),
                    PathNode.CurveTo(54.94903f, 177.26538f, 55.66538f, 172.25096f, 59.2f, 169.6f),
                    PathNode.LineTo(114.67f, 128.0f),
                    PathNode.LineTo(59.2f, 86.4f),
                    PathNode.CurveTo(55.66538f, 83.74903f, 54.94903f, 78.73462f, 57.6f, 75.2f),
                    PathNode.CurveTo(60.250965f, 71.665375f, 65.26538f, 70.949036f, 68.8f, 73.6f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 28.969824f, 121.71202f, 26.199718f, 124.422295f, 24.844582f),
                    PathNode.CurveTo(127.13256f, 23.489447f, 130.37585f, 23.781895f, 132.8f, 25.6f),
                    PathNode.LineTo(196.8f, 73.6f),
                    PathNode.CurveTo(198.81445f, 75.11083f, 200.0f, 77.48194f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 82.51806f, 198.81445f, 84.88917f, 196.8f, 86.4f),
                    PathNode.LineTo(141.33f, 128.0f),
                    PathNode.LineTo(196.8f, 169.6f),
                    PathNode.CurveTo(198.81445f, 171.11082f, 200.0f, 173.48195f, 200.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 121.37258f, 66.62742f, 116.0f, 60.0f, 116.0f),
                    PathNode.CurveTo(53.37258f, 116.0f, 48.0f, 121.37258f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 134.62741f, 53.37258f, 140.0f, 60.0f, 140.0f),
                    PathNode.CurveTo(66.62742f, 140.0f, 72.0f, 134.62741f, 72.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 116.0f),
                    PathNode.CurveTo(197.37259f, 116.0f, 192.0f, 121.37258f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 134.62741f, 197.37259f, 140.0f, 204.0f, 140.0f),
                    PathNode.CurveTo(210.62741f, 140.0f, 216.0f, 134.62741f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 121.37258f, 210.62741f, 116.0f, 204.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
