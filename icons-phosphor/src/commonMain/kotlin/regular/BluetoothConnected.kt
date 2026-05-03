package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorRegularIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.8f, 169.6f),
                    PathNode.LineTo(141.33f, 128.0f),
                    PathNode.LineTo(196.8f, 86.4f),
                    PathNode.CurveTo(198.81445f, 84.88917f, 200.0f, 82.51806f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 77.48194f, 198.81445f, 75.11083f, 196.8f, 73.6f),
                    PathNode.LineTo(132.8f, 25.6f),
                    PathNode.CurveTo(130.37585f, 23.781895f, 127.13256f, 23.489447f, 124.422295f, 24.844582f),
                    PathNode.CurveTo(121.71202f, 26.199718f, 120.0f, 28.969824f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.LineTo(68.8f, 73.6f),
                    PathNode.CurveTo(65.26538f, 70.949036f, 60.250965f, 71.665375f, 57.6f, 75.2f),
                    PathNode.CurveTo(54.94903f, 78.73462f, 55.66538f, 83.74903f, 59.2f, 86.4f),
                    PathNode.LineTo(114.67f, 128.0f),
                    PathNode.LineTo(59.2f, 169.6f),
                    PathNode.CurveTo(55.66538f, 172.25096f, 54.94903f, 177.26538f, 57.6f, 180.8f),
                    PathNode.CurveTo(60.250965f, 184.33463f, 65.26538f, 185.05096f, 68.8f, 182.4f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.CurveTo(120.0f, 227.03018f, 121.71202f, 229.80028f, 124.422295f, 231.15541f),
                    PathNode.CurveTo(127.13256f, 232.51056f, 130.37585f, 232.21811f, 132.8f, 230.4f),
                    PathNode.LineTo(196.8f, 182.4f),
                    PathNode.CurveTo(198.81445f, 180.88918f, 200.0f, 178.51805f, 200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 173.48195f, 198.81445f, 171.11082f, 196.8f, 169.6f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 48.0f),
                    PathNode.LineTo(178.67f, 80.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(178.67f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 140.0f),
                    PathNode.CurveTo(53.37258f, 140.0f, 48.0f, 134.62741f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 121.37258f, 53.37258f, 116.0f, 60.0f, 116.0f),
                    PathNode.CurveTo(66.62742f, 116.0f, 72.0f, 121.37258f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 134.62741f, 66.62742f, 140.0f, 60.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 134.62741f, 210.62741f, 140.0f, 204.0f, 140.0f),
                    PathNode.CurveTo(197.37259f, 140.0f, 192.0f, 134.62741f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 121.37258f, 197.37259f, 116.0f, 204.0f, 116.0f),
                    PathNode.CurveTo(210.62741f, 116.0f, 216.0f, 121.37258f, 216.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
