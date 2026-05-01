package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorBoldIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(55.12f, 65.72f),
                    PathNode.CurveTo(20.67f, 88.66f, 5.72f, 121.58f, 5.0f, 123.13f),
                    PathNode.CurveTo(3.630182f, 126.235664f, 3.630182f, 129.77434f, 5.0f, 132.88f),
                    PathNode.CurveTo(5.37f, 133.7f, 14.13f, 153.14f, 33.49f, 172.49f),
                    PathNode.CurveTo(59.37f, 198.34f, 92.0f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(145.49638f, 212.09695f, 162.83578f, 208.69708f, 179.0f, 202.0f),
                    PathNode.LineTo(199.09f, 224.1f),
                    PathNode.CurveTo(203.5675f, 228.90977f, 211.0807f, 229.22368f, 215.94382f, 224.80417f),
                    PathNode.CurveTo(220.80693f, 220.38464f, 221.21089f, 212.87575f, 216.85f, 207.96f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 188.0f),
                    PathNode.CurveTo(98.41f, 188.0f, 72.53f, 177.27f, 51.09f, 156.12f),
                    PathNode.CurveTo(42.656544f, 147.76955f, 35.399837f, 138.30925f, 29.52f, 128.0f),
                    PathNode.CurveTo(34.79f, 118.69f, 48.31f, 98.1f, 71.52f, 83.71f),
                    PathNode.LineTo(161.61f, 182.82f),
                    PathNode.CurveTo(150.74542f, 186.28915f, 139.40494f, 188.03696f, 128.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(251.0f, 132.88f),
                    PathNode.CurveTo(250.64f, 133.69f, 242.0f, 152.88f, 223.0f, 172.04f),
                    PathNode.CurveTo(220.03624f, 175.32983f, 215.50163f, 176.7202f, 211.2032f, 175.65704f),
                    PathNode.CurveTo(206.90477f, 174.59389f, 203.5411f, 171.25002f, 202.45262f, 166.95793f),
                    PathNode.CurveTo(201.36412f, 162.66583f, 202.72772f, 158.12311f, 206.0f, 155.14f),
                    PathNode.CurveTo(213.98117f, 147.0253f, 220.86627f, 137.90118f, 226.48f, 128.0f),
                    PathNode.CurveTo(220.60358f, 117.68847f, 213.34654f, 108.22772f, 204.91f, 99.88f),
                    PathNode.CurveTo(183.46f, 78.73f, 157.59f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(124.65f, 68.0f, 121.3f, 68.14f, 118.0f, 68.42f),
                    PathNode.CurveTo(113.671f, 68.88377f, 109.43039f, 66.96643f, 106.91913f, 63.409904f),
                    PathNode.CurveTo(104.40786f, 59.853382f, 104.01993f, 55.21566f, 105.90545f, 51.291355f),
                    PathNode.CurveTo(107.79096f, 47.36705f, 111.65411f, 44.771854f, 116.0f, 44.51f),
                    PathNode.CurveTo(119.93f, 44.17f, 124.0f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(164.0f, 44.0f, 196.63f, 57.67f, 222.49f, 83.52f),
                    PathNode.CurveTo(241.84f, 102.87f, 250.6f, 122.32f, 250.97f, 123.13f),
                    PathNode.CurveTo(252.34938f, 126.231445f, 252.36028f, 129.77013f, 251.0f, 132.88f),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
