package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorBoldIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(71.79f, 84.0f),
                    PathNode.CurveTo(34.23464f, 84.05799f, 3.83701f, 114.54964f, 3.895f, 152.105f),
                    PathNode.CurveTo(3.95299f, 189.66037f, 34.444637f, 220.05798f, 72.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(170.44455f, 220.0207f, 180.81516f, 218.24829f, 190.66f, 214.76f),
                    PathNode.LineTo(199.12f, 224.07f),
                    PathNode.CurveTo(203.5975f, 228.87978f, 211.1107f, 229.19368f, 215.9738f, 224.77417f),
                    PathNode.CurveTo(220.83693f, 220.35464f, 221.24089f, 212.84575f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 196.0f),
                    PathNode.LineTo(72.0f, 196.0f),
                    PathNode.CurveTo(48.159054f, 195.8491f, 28.775524f, 176.73764f, 28.287683f, 152.9012f),
                    PathNode.CurveTo(27.799843f, 129.06477f, 46.385193f, 109.17622f, 70.2f, 108.05f),
                    PathNode.CurveTo(68.740585f, 114.59975f, 68.00286f, 121.28963f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 134.62741f, 73.37258f, 140.0f, 80.0f, 140.0f),
                    PathNode.CurveTo(86.62742f, 140.0f, 92.0f, 134.62741f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.00225f, 121.62658f, 92.89763f, 115.28491f, 94.66f, 109.16f),
                    PathNode.LineTo(172.54f, 194.83f),
                    PathNode.CurveTo(168.40466f, 195.6033f, 164.207f, 195.99495f, 160.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 128.0f),
                    PathNode.CurveTo(252.04256f, 147.40535f, 245.90237f, 166.31975f, 234.47f, 182.0f),
                    PathNode.CurveTo(231.97989f, 185.54826f, 227.76968f, 187.4777f, 223.45627f, 187.0474f),
                    PathNode.CurveTo(219.14285f, 186.61708f, 215.3968f, 183.89392f, 213.65672f, 179.92368f),
                    PathNode.CurveTo(211.91666f, 175.95343f, 212.45308f, 171.35333f, 215.06f, 167.89f),
                    PathNode.CurveTo(233.99794f, 141.817f, 232.03473f, 106.03164f, 210.35825f, 82.18679f),
                    PathNode.CurveTo(188.68178f, 58.34194f, 153.24504f, 52.986115f, 125.49f, 69.36f),
                    PathNode.CurveTo(119.80177f, 72.539375f, 112.615776f, 70.59808f, 109.30231f, 64.986916f),
                    PathNode.CurveTo(105.98884f, 59.375744f, 107.75905f, 52.1457f, 113.29f, 48.7f),
                    PathNode.CurveTo(141.73961f, 31.933935f, 176.99272f, 31.70152f, 205.66092f, 48.09102f),
                    PathNode.CurveTo(234.3291f, 64.48052f, 252.0143f, 94.97758f, 252.0f, 128.0f),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
