package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorBoldIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(59.68f, 70.69f),
                    PathNode.CurveTo(44.0f, 95.22f, 36.0f, 119.84f, 36.0f, 144.0f),
                    PathNode.CurveTo(35.987972f, 180.20499f, 57.211582f, 213.05086f, 90.22365f, 227.91708f),
                    PathNode.CurveTo(123.23572f, 242.7833f, 161.89764f, 236.90549f, 189.0f, 212.9f),
                    PathNode.LineTo(199.16f, 224.07f),
                    PathNode.CurveTo(203.63753f, 228.87978f, 211.15071f, 229.19368f, 216.01382f, 224.77417f),
                    PathNode.CurveTo(220.87692f, 220.35464f, 221.2809f, 212.84575f, 216.92f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(90.46063f, 211.96141f, 60.038586f, 181.53935f, 60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 126.26f, 65.54f, 107.88f, 76.49f, 89.18f),
                    PathNode.LineTo(172.81f, 195.18f),
                    PathNode.CurveTo(160.4129f, 206.04456f, 144.48412f, 212.02362f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.61f, 47.44f),
                    PathNode.CurveTo(90.36636f, 45.172466f, 89.1179f, 42.104927f, 89.14041f, 38.915085f),
                    PathNode.CurveTo(89.162926f, 35.725243f, 90.45458f, 32.675632f, 92.73f, 30.44f),
                    PathNode.CurveTo(101.55749f, 21.625362f, 111.04871f, 13.501489f, 121.12f, 6.14f),
                    PathNode.CurveTo(125.25116f, 3.249156f, 130.74884f, 3.249156f, 134.88f, 6.14f),
                    PathNode.CurveTo(138.36f, 8.6f, 220.0f, 66.64f, 220.0f, 144.0f),
                    PathNode.CurveTo(219.98802f, 148.46494f, 219.65382f, 152.92319f, 219.0f, 157.34f),
                    PathNode.CurveTo(218.14618f, 163.2354f, 213.0969f, 167.61201f, 207.14f, 167.62f),
                    PathNode.CurveTo(206.55771f, 167.61649f, 205.97635f, 167.57304f, 205.4f, 167.49f),
                    PathNode.CurveTo(198.84172f, 166.53712f, 194.29752f, 160.44833f, 195.25f, 153.89f),
                    PathNode.CurveTo(195.73569f, 150.61543f, 195.98634f, 147.31033f, 196.0f, 144.0f),
                    PathNode.CurveTo(196.0f, 91.07f, 146.51f, 46.09f, 128.0f, 31.12f),
                    PathNode.CurveTo(123.36f, 34.85f, 116.8f, 40.45f, 109.59f, 47.56f),
                    PathNode.CurveTo(107.323296f, 49.797493f, 104.26006f, 51.042072f, 101.07513f, 51.019566f),
                    PathNode.CurveTo(97.89019f, 50.997055f, 94.84486f, 49.709305f, 92.61f, 47.44f),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
