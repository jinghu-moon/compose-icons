package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorLightIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.44f, 212.0f),
                    PathNode.LineTo(60.44f, 36.0f),
                    PathNode.CurveTo(58.163273f, 33.886772f, 54.65007f, 33.860672f, 52.342197f, 35.93984f),
                    PathNode.CurveTo(50.03432f, 38.019005f, 49.69497f, 41.515873f, 51.56f, 44.0f),
                    PathNode.LineTo(123.88f, 123.55f),
                    PathNode.LineTo(60.4f, 171.2f),
                    PathNode.CurveTo(57.749035f, 173.18823f, 57.211777f, 176.94904f, 59.2f, 179.6f),
                    PathNode.CurveTo(61.188225f, 182.25096f, 64.949036f, 182.78822f, 67.6f, 180.8f),
                    PathNode.LineTo(122.0f, 140.0f),
                    PathNode.LineTo(122.0f, 224.0f),
                    PathNode.CurveTo(122.0f, 226.27263f, 123.284004f, 228.3502f, 125.31672f, 229.36656f),
                    PathNode.CurveTo(127.34943f, 230.38292f, 129.78189f, 230.16357f, 131.6f, 228.8f),
                    PathNode.LineTo(183.88f, 189.59f),
                    PathNode.LineTo(211.56f, 220.0f),
                    PathNode.CurveTo(213.79123f, 222.45215f, 217.58786f, 222.63123f, 220.04f, 220.4f),
                    PathNode.CurveTo(222.49214f, 218.16876f, 222.67123f, 214.37215f, 220.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 212.0f),
                    PathNode.LineTo(134.0f, 140.0f),
                    PathNode.LineTo(149.09f, 151.31f),
                    PathNode.LineTo(175.77f, 180.67f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 71.63f),
                    PathNode.LineTo(122.0f, 32.0f),
                    PathNode.CurveTo(122.0f, 29.727367f, 123.284004f, 27.64979f, 125.31672f, 26.633436f),
                    PathNode.CurveTo(127.34943f, 25.617085f, 129.78189f, 25.83642f, 131.6f, 27.2f),
                    PathNode.LineTo(195.6f, 75.2f),
                    PathNode.CurveTo(197.11082f, 76.33313f, 198.0f, 78.11146f, 198.0f, 80.0f),
                    PathNode.CurveTo(198.0f, 81.88854f, 197.11082f, 83.66687f, 195.6f, 84.8f),
                    PathNode.LineTo(162.07f, 110.0f),
                    PathNode.CurveTo(159.41904f, 111.98822f, 155.65822f, 111.450966f, 153.67f, 108.8f),
                    PathNode.CurveTo(151.68178f, 106.14903f, 152.21904f, 102.38822f, 154.87f, 100.4f),
                    PathNode.LineTo(182.0f, 80.0f),
                    PathNode.LineTo(134.0f, 44.0f),
                    PathNode.LineTo(134.0f, 71.63f),
                    PathNode.CurveTo(134.0f, 74.94371f, 131.3137f, 77.63f, 128.0f, 77.63f),
                    PathNode.CurveTo(124.686295f, 77.63f, 122.0f, 74.94371f, 122.0f, 71.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
