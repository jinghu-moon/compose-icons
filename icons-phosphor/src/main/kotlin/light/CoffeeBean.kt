package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorLightIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.34f, 45.66f),
                    PathNode.CurveTo(194.0f, 29.35f, 170.0f, 22.87f, 142.79f, 27.42f),
                    PathNode.CurveTo(116.28f, 31.83f, 89.71f, 46.24f, 68.0f, 68.0f),
                    PathNode.CurveTo(46.29f, 89.76f, 31.86f, 116.3f, 27.44f, 142.81f),
                    PathNode.CurveTo(22.87f, 170.0f, 29.35f, 194.0f, 45.66f, 210.34f),
                    PathNode.CurveTo(58.57f, 223.25f, 76.29f, 230.0f, 96.64f, 230.0f),
                    PathNode.CurveTo(102.19259f, 229.98363f, 107.73448f, 229.51204f, 113.21f, 228.59f),
                    PathNode.CurveTo(139.72f, 224.17f, 166.29f, 209.76f, 188.03f, 188.03f),
                    PathNode.CurveTo(209.77f, 166.3f, 224.17f, 139.72f, 228.59f, 113.21f),
                    PathNode.CurveTo(233.13f, 86.0f, 226.65f, 62.0f, 210.34f, 45.66f),
                    PathNode.Close,
                    PathNode.MoveTo(76.46f, 76.46f),
                    PathNode.CurveTo(101.52f, 51.4f, 132.46f, 38.0f, 159.18f, 38.0f),
                    PathNode.CurveTo(171.76f, 38.0f, 183.4f, 41.0f, 193.05f, 47.12f),
                    PathNode.CurveTo(180.48122f, 50.958218f, 168.71849f, 57.058163f, 158.34f, 65.12f),
                    PathNode.CurveTo(139.52f, 79.98f, 127.34f, 100.74f, 122.12f, 126.83f),
                    PathNode.CurveTo(112.0f, 177.35f, 75.18f, 194.0f, 52.0f, 199.5f),
                    PathNode.CurveTo(26.3f, 170.42f, 36.83f, 116.09f, 76.46f, 76.46f),
                    PathNode.Close,
                    PathNode.MoveTo(179.54f, 179.54f),
                    PathNode.CurveTo(142.68f, 216.4f, 93.1f, 228.1f, 63.0f, 208.91f),
                    PathNode.CurveTo(75.56879f, 205.07178f, 87.33151f, 198.97185f, 97.71f, 190.91f),
                    PathNode.CurveTo(116.53f, 176.05f, 128.71f, 155.29f, 133.93f, 129.2f),
                    PathNode.CurveTo(144.0f, 78.65f, 180.82f, 62.0f, 204.05f, 56.5f),
                    PathNode.CurveTo(229.7f, 85.59f, 219.17f, 139.91f, 179.54f, 179.54f),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
