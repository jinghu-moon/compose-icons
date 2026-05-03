package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorBoldIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.88f, 207.93f),
                    PathNode.LineTo(64.88f, 31.93f),
                    PathNode.CurveTo(60.402496f, 27.120228f, 52.889294f, 26.80632f, 48.026184f, 31.225838f),
                    PathNode.CurveTo(43.16307f, 35.64535f, 42.75911f, 43.15425f, 47.12f, 48.07f),
                    PathNode.LineTo(115.0f, 122.75f),
                    PathNode.LineTo(56.8f, 166.4f),
                    PathNode.CurveTo(51.498062f, 170.37645f, 50.42355f, 177.89807f, 54.4f, 183.2f),
                    PathNode.CurveTo(58.37645f, 188.50194f, 65.89806f, 189.57645f, 71.2f, 185.6f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.LineTo(116.0f, 224.0f),
                    PathNode.CurveTo(116.0f, 228.54526f, 118.56803f, 232.70044f, 122.63344f, 234.73312f),
                    PathNode.CurveTo(126.698845f, 236.76582f, 131.56378f, 236.32716f, 135.2f, 233.6f),
                    PathNode.LineTo(183.11f, 197.66f),
                    PathNode.LineTo(207.11f, 224.07f),
                    PathNode.CurveTo(211.58751f, 228.87978f, 219.10071f, 229.19368f, 223.96382f, 224.77417f),
                    PathNode.CurveTo(228.82693f, 220.35464f, 229.2309f, 212.84575f, 224.87f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 200.0f),
                    PathNode.LineTo(140.0f, 152.0f),
                    PathNode.LineTo(145.0f, 155.77f),
                    PathNode.LineTo(166.87f, 179.83f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 59.74f),
                    PathNode.LineTo(116.0f, 32.0f),
                    PathNode.CurveTo(116.0f, 27.454735f, 118.56803f, 23.299578f, 122.63344f, 21.266874f),
                    PathNode.CurveTo(126.698845f, 19.23417f, 131.56378f, 19.672842f, 135.2f, 22.4f),
                    PathNode.LineTo(199.2f, 70.4f),
                    PathNode.CurveTo(202.22166f, 72.66626f, 204.0f, 76.222916f, 204.0f, 80.0f),
                    PathNode.CurveTo(204.0f, 83.777084f, 202.22166f, 87.33374f, 199.2f, 89.6f),
                    PathNode.LineTo(172.1f, 109.93f),
                    PathNode.CurveTo(166.79807f, 113.90645f, 159.27644f, 112.83194f, 155.3f, 107.53f),
                    PathNode.CurveTo(151.32355f, 102.228065f, 152.39807f, 94.70645f, 157.7f, 90.73f),
                    PathNode.LineTo(172.0f, 80.0f),
                    PathNode.LineTo(140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 59.74f),
                    PathNode.CurveTo(140.0f, 66.36742f, 134.62741f, 71.74f, 128.0f, 71.74f),
                    PathNode.CurveTo(121.37258f, 71.74f, 116.0f, 66.36742f, 116.0f, 59.74f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
