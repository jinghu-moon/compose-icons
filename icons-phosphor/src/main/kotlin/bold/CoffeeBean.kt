package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorBoldIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.58f, 41.42f),
                    PathNode.CurveTo(196.86f, 23.71f, 171.0f, 16.63f, 141.81f, 21.5f),
                    PathNode.CurveTo(114.07f, 26.12f, 86.35f, 41.12f, 63.73f, 63.73f),
                    PathNode.CurveTo(41.11f, 86.34f, 26.12f, 114.07f, 21.5f, 141.81f),
                    PathNode.CurveTo(16.63f, 171.02f, 23.71f, 196.86f, 41.42f, 214.58f),
                    PathNode.CurveTo(55.48f, 228.64f, 74.67f, 236.0f, 96.6f, 236.0f),
                    PathNode.CurveTo(102.49455f, 235.98341f, 108.37775f, 235.4817f, 114.19f, 234.5f),
                    PathNode.CurveTo(141.93f, 229.88f, 169.65f, 214.88f, 192.27f, 192.27f),
                    PathNode.CurveTo(214.89f, 169.66f, 229.88f, 141.93f, 234.5f, 114.19f),
                    PathNode.CurveTo(239.37f, 85.0f, 232.29f, 59.14f, 214.58f, 41.42f),
                    PathNode.Close,
                    PathNode.MoveTo(45.17f, 145.75f),
                    PathNode.CurveTo(48.97f, 122.91f, 61.59f, 99.81f, 80.7f, 80.75f),
                    PathNode.CurveTo(99.81f, 61.69f, 122.91f, 49.0f, 145.75f, 45.17f),
                    PathNode.CurveTo(150.2166f, 44.407116f, 154.73875f, 44.015778f, 159.27f, 44.0f),
                    PathNode.CurveTo(165.4433f, 43.955048f, 171.58946f, 44.821037f, 177.51f, 46.57f),
                    PathNode.CurveTo(169.34647f, 50.232933f, 161.65979f, 54.877174f, 154.62f, 60.4f),
                    PathNode.CurveTo(134.62f, 76.17f, 121.74f, 98.12f, 116.24f, 125.65f),
                    PathNode.CurveTo(107.29f, 170.38f, 75.94f, 186.75f, 54.17f, 192.74f),
                    PathNode.CurveTo(45.25f, 180.83f, 42.06f, 164.41f, 45.17f, 145.75f),
                    PathNode.Close,
                    PathNode.MoveTo(210.83f, 110.25f),
                    PathNode.CurveTo(207.03f, 133.09f, 194.41f, 156.19f, 175.3f, 175.3f),
                    PathNode.CurveTo(156.19f, 194.41f, 133.09f, 207.0f, 110.25f, 210.83f),
                    PathNode.CurveTo(98.6f, 212.77f, 87.85f, 212.24f, 78.5f, 209.41f),
                    PathNode.CurveTo(86.658806f, 205.7581f, 94.33937f, 201.12021f, 101.37f, 195.6f),
                    PathNode.CurveTo(121.37f, 179.83f, 134.26f, 157.88f, 139.76f, 130.35f),
                    PathNode.CurveTo(148.76f, 85.62f, 180.06f, 69.25f, 201.83f, 63.26f),
                    PathNode.CurveTo(210.75f, 75.17f, 213.94f, 91.59f, 210.83f, 110.25f),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
