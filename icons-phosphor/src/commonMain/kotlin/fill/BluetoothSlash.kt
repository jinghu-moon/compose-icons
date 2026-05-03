package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(221.38f, 221.92f),
                    PathNode.CurveTo(218.11035f, 224.89098f, 213.05144f, 224.64922f, 210.08f, 221.38f),
                    PathNode.LineTo(183.63f, 192.28f),
                    PathNode.LineTo(132.8f, 230.4f),
                    PathNode.CurveTo(130.20555f, 232.34326f, 126.694885f, 232.52887f, 123.91f, 230.87f),
                    PathNode.CurveTo(121.43508f, 229.33044f, 119.95049f, 226.60428f, 120.0f, 223.69f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(68.8f, 182.4f),
                    PathNode.CurveTo(65.285324f, 185.0348f, 60.303604f, 184.3429f, 57.64f, 180.85f),
                    PathNode.CurveTo(55.02758f, 177.1834f, 55.832554f, 172.10007f, 59.45f, 169.42f),
                    PathNode.LineTo(120.92f, 123.31f),
                    PathNode.LineTo(50.08f, 45.38f),
                    PathNode.CurveTo(47.172737f, 42.102833f, 47.442047f, 37.0969f, 50.68412f, 34.15056f),
                    PathNode.CurveTo(53.926197f, 31.204214f, 58.934998f, 31.413485f, 61.92f, 34.62f),
                    PathNode.LineTo(221.92f, 210.62f),
                    PathNode.CurveTo(224.89098f, 213.88965f, 224.64922f, 218.94856f, 221.38f, 221.92f),
                    PathNode.Close,
                    PathNode.MoveTo(155.0f, 113.22f),
                    PathNode.CurveTo(156.38771f, 114.74701f, 158.70921f, 114.9679f, 160.36f, 113.73f),
                    PathNode.LineTo(196.8f, 86.4f),
                    PathNode.CurveTo(198.81445f, 84.88917f, 200.0f, 82.51806f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 77.48194f, 198.81445f, 75.11083f, 196.8f, 73.6f),
                    PathNode.LineTo(132.8f, 25.6f),
                    PathNode.CurveTo(129.80989f, 23.343481f, 125.65432f, 23.463993f, 122.8f, 25.89f),
                    PathNode.CurveTo(120.978485f, 27.492073f, 119.95438f, 29.81462f, 120.0f, 32.24f),
                    PathNode.LineTo(120.0f, 73.18f),
                    PathNode.CurveTo(119.98912f, 74.169495f, 120.345406f, 75.1279f, 121.0f, 75.87f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
