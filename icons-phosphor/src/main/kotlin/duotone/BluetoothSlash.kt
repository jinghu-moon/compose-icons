package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorDuotoneIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(192.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.92f, 210.62f),
                    PathNode.LineTo(61.92f, 34.62f),
                    PathNode.CurveTo(58.934998f, 31.413485f, 53.926197f, 31.204214f, 50.68412f, 34.15056f),
                    PathNode.CurveTo(47.442047f, 37.0969f, 47.172737f, 42.102833f, 50.08f, 45.38f),
                    PathNode.LineTo(120.92f, 123.31f),
                    PathNode.LineTo(59.2f, 169.6f),
                    PathNode.CurveTo(55.66538f, 172.25096f, 54.94903f, 177.26538f, 57.6f, 180.8f),
                    PathNode.CurveTo(60.250965f, 184.33463f, 65.26538f, 185.05096f, 68.8f, 182.4f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.CurveTo(120.0f, 227.03018f, 121.71202f, 229.80028f, 124.422295f, 231.15541f),
                    PathNode.CurveTo(127.13256f, 232.51056f, 130.37585f, 232.21811f, 132.8f, 230.4f),
                    PathNode.LineTo(183.63f, 192.28f),
                    PathNode.LineTo(210.08f, 221.38f),
                    PathNode.CurveTo(211.9919f, 223.53516f, 214.91493f, 224.49586f, 217.73259f, 223.89514f),
                    PathNode.CurveTo(220.55025f, 223.29443f, 222.82729f, 221.2251f, 223.69395f, 218.47755f),
                    PathNode.CurveTo(224.56061f, 215.73003f, 223.88303f, 212.7287f, 221.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(147.73f, 152.8f),
                    PathNode.LineTo(172.81f, 180.39f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 71.63f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 28.969824f, 121.71202f, 26.199718f, 124.422295f, 24.844582f),
                    PathNode.CurveTo(127.13256f, 23.489447f, 130.37585f, 23.781895f, 132.8f, 25.6f),
                    PathNode.LineTo(196.8f, 73.6f),
                    PathNode.CurveTo(198.81445f, 75.11083f, 200.0f, 77.48194f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 82.51806f, 198.81445f, 84.88917f, 196.8f, 86.4f),
                    PathNode.LineTo(163.27f, 111.55f),
                    PathNode.CurveTo(159.73538f, 114.200966f, 154.72096f, 113.48462f, 152.07f, 109.95f),
                    PathNode.CurveTo(149.41904f, 106.415375f, 150.13538f, 101.40097f, 153.67f, 98.75f),
                    PathNode.LineTo(178.67f, 80.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 71.63f),
                    PathNode.CurveTo(136.0f, 76.04828f, 132.41827f, 79.63f, 128.0f, 79.63f),
                    PathNode.CurveTo(123.58172f, 79.63f, 120.0f, 76.04828f, 120.0f, 71.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
