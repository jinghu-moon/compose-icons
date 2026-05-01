package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorLightIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.68f, 61.63f),
                    PathNode.CurveTo(184.11f, 49.0f, 156.88f, 42.0f, 128.0f, 42.0f),
                    PathNode.CurveTo(99.12f, 42.0f, 71.89f, 49.0f, 51.32f, 61.63f),
                    PathNode.CurveTo(29.83f, 74.85f, 18.0f, 92.73f, 18.0f, 112.0f),
                    PathNode.CurveTo(18.0f, 131.27f, 29.83f, 149.13f, 51.32f, 162.35f),
                    PathNode.CurveTo(70.45f, 174.1f, 95.35f, 181.0f, 122.0f, 181.85f),
                    PathNode.CurveTo(122.0f, 182.49f, 122.0f, 183.13f, 122.0f, 183.79f),
                    PathNode.CurveTo(122.0f, 198.55f, 115.06f, 210.89f, 102.46f, 218.52f),
                    PathNode.CurveTo(87.24f, 227.74f, 66.46f, 228.42f, 50.78f, 220.23f),
                    PathNode.CurveTo(48.874714f, 219.17213f, 46.54564f, 219.23051f, 44.695747f, 220.3825f),
                    PathNode.CurveTo(42.84586f, 221.53452f, 41.766045f, 223.59897f, 41.87495f, 225.77551f),
                    PathNode.CurveTo(41.983856f, 227.95206f, 43.264355f, 229.89842f, 45.22f, 230.86f),
                    PathNode.CurveTo(54.42884f, 235.59805f, 64.64385f, 238.0472f, 75.0f, 238.0f),
                    PathNode.CurveTo(86.86266f, 238.0477f, 98.51383f, 234.86006f, 108.7f, 228.78f),
                    PathNode.CurveTo(125.04f, 218.89f, 134.03f, 202.91f, 134.03f, 183.78f),
                    PathNode.CurveTo(134.03f, 183.13f, 134.03f, 182.49f, 134.03f, 181.84f),
                    PathNode.CurveTo(160.68f, 180.95f, 185.6f, 174.1f, 204.75f, 162.32f),
                    PathNode.CurveTo(226.17f, 149.11f, 238.0f, 131.23f, 238.0f, 112.0f),
                    PathNode.CurveTo(238.0f, 92.77f, 226.17f, 74.85f, 204.68f, 61.63f),
                    PathNode.Close,
                    PathNode.MoveTo(64.68f, 156.09f),
                    PathNode.CurveTo(70.0f, 144.09f, 81.88f, 141.02f, 91.16f, 142.22f),
                    PathNode.CurveTo(103.44f, 143.82f, 115.8f, 152.89f, 120.24f, 169.77f),
                    PathNode.CurveTo(99.73f, 168.81f, 80.48f, 164.08f, 64.72f, 156.09f),
                    PathNode.Close,
                    PathNode.MoveTo(198.35f, 152.09f),
                    PathNode.CurveTo(180.73f, 162.94f, 157.52f, 169.19f, 132.58f, 169.88f),
                    PathNode.CurveTo(130.8897f, 161.10379f, 126.998024f, 152.90067f, 121.27f, 146.04f),
                    PathNode.CurveTo(114.03609f, 137.42906f, 103.85424f, 131.8212f, 92.71f, 130.31f),
                    PathNode.CurveTo(75.82f, 128.11f, 61.22f, 135.85f, 54.3f, 149.99f),
                    PathNode.CurveTo(38.61f, 139.37f, 30.0f, 126.0f, 30.0f, 112.0f),
                    PathNode.CurveTo(30.0f, 97.07f, 39.8f, 82.82f, 57.61f, 71.87f),
                    PathNode.CurveTo(76.32f, 60.34f, 101.32f, 54.0f, 128.0f, 54.0f),
                    PathNode.CurveTo(154.68f, 54.0f, 179.68f, 60.34f, 198.39f, 71.85f),
                    PathNode.CurveTo(216.2f, 82.8f, 226.0f, 97.05f, 226.0f, 112.0f),
                    PathNode.CurveTo(226.0f, 126.95f, 216.2f, 141.16f, 198.39f, 152.11f),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
