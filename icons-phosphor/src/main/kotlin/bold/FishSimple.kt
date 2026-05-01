package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorBoldIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 76.0f),
                    PathNode.CurveTo(172.0f, 84.836555f, 164.83656f, 92.0f, 156.0f, 92.0f),
                    PathNode.CurveTo(147.16344f, 92.0f, 140.0f, 84.836555f, 140.0f, 76.0f),
                    PathNode.CurveTo(140.0f, 67.163445f, 147.16344f, 60.0f, 156.0f, 60.0f),
                    PathNode.CurveTo(164.83656f, 60.0f, 172.0f, 67.163445f, 172.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 76.66f),
                    PathNode.CurveTo(236.32f, 108.51f, 228.45f, 136.43f, 213.26f, 157.42f),
                    PathNode.CurveTo(197.6f, 179.07f, 174.37f, 193.63f, 144.26f, 200.71f),
                    PathNode.CurveTo(125.06f, 205.23f, 102.87f, 206.71f, 77.9f, 205.09f),
                    PathNode.QuadTo(80.17f, 220.58f, 83.9f, 237.43f),
                    PathNode.CurveTo(84.895515f, 241.64693f, 83.54047f, 246.07304f, 80.35482f, 249.00992f),
                    PathNode.CurveTo(77.16917f, 251.9468f, 72.64771f, 252.93826f, 68.52545f, 251.6039f),
                    PathNode.CurveTo(64.40318f, 250.26953f, 61.320385f, 246.81656f, 60.46f, 242.57f),
                    PathNode.QuadTo(55.88f, 221.72f, 53.38f, 202.66f),
                    PathNode.QuadTo(34.38f, 200.16f, 13.51f, 195.59f),
                    PathNode.CurveTo(7.132581f, 194.08444f, 3.142079f, 187.74135f, 4.545633f, 181.34071f),
                    PathNode.CurveTo(5.949187f, 174.94006f, 12.227767f, 170.8488f, 18.65f, 172.15f),
                    PathNode.QuadTo(35.48f, 175.82f, 50.96f, 178.15f),
                    PathNode.CurveTo(49.38f, 153.15f, 50.83f, 131.03f, 55.34f, 111.85f),
                    PathNode.CurveTo(62.42f, 81.71f, 76.98f, 58.49f, 98.61f, 42.85f),
                    PathNode.CurveTo(119.61f, 27.64f, 147.53f, 19.75f, 179.39f, 20.08f),
                    PathNode.CurveTo(201.18f, 20.29f, 221.39f, 24.5f, 225.19f, 26.72f),
                    PathNode.CurveTo(226.93814f, 27.74897f, 228.39691f, 29.204298f, 229.43f, 30.95f),
                    PathNode.CurveTo(231.57f, 34.64f, 235.78f, 54.87f, 236.0f, 76.66f),
                    PathNode.Close,
                    PathNode.MoveTo(177.54f, 159.94f),
                    PathNode.CurveTo(137.86505f, 149.1294f, 106.870605f, 118.13494f, 96.06f, 78.46f),
                    PathNode.CurveTo(86.85f, 90.62f, 80.5f, 106.03f, 77.13f, 124.46f),
                    PathNode.CurveTo(74.13f, 140.85f, 73.47f, 159.71f, 75.13f, 180.85f),
                    PathNode.CurveTo(96.29f, 182.5f, 115.13f, 181.85f, 131.55f, 178.85f),
                    PathNode.CurveTo(150.0f, 175.49f, 165.37f, 169.14f, 177.53f, 159.94f),
                    PathNode.Close,
                    PathNode.MoveTo(209.0f, 47.0f),
                    PathNode.CurveTo(193.1f, 44.0f, 149.7f, 38.55f, 116.74f, 59.44f),
                    PathNode.CurveTo(121.97823f, 101.15803f, 154.83264f, 134.01654f, 196.55f, 139.26f),
                    PathNode.CurveTo(217.43f, 106.32f, 212.0f, 62.92f, 209.0f, 47.0f),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
