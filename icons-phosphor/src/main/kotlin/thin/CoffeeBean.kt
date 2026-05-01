package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorThinIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.0f, 47.0f),
                    PathNode.CurveTo(176.64f, 14.65f, 114.0f, 24.67f, 69.3f, 69.34f),
                    PathNode.CurveTo(24.6f, 114.01f, 14.63f, 176.66f, 47.0f, 209.0f),
                    PathNode.CurveTo(59.82f, 221.81f, 77.38f, 228.0f, 96.71f, 228.0f),
                    PathNode.CurveTo(126.17f, 228.0f, 159.71f, 213.66f, 186.71f, 186.68f),
                    PathNode.CurveTo(231.35f, 142.0f, 241.37f, 79.34f, 209.0f, 47.0f),
                    PathNode.Close,
                    PathNode.MoveTo(75.0f, 75.0f),
                    PathNode.CurveTo(100.47f, 49.54f, 132.0f, 35.91f, 159.26f, 35.91f),
                    PathNode.CurveTo(173.77f, 35.91f, 187.09f, 39.78f, 197.69f, 47.75f),
                    PathNode.CurveTo(171.93f, 54.8f, 134.69f, 74.15f, 124.09f, 127.24f),
                    PathNode.CurveTo(113.59f, 179.76f, 74.84f, 196.5f, 51.18f, 201.82f),
                    PathNode.CurveTo(23.77f, 172.12f, 34.16f, 115.81f, 75.0f, 75.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.0f, 181.0f),
                    PathNode.CurveTo(142.0f, 220.0f, 88.83f, 231.23f, 58.29f, 208.25f),
                    PathNode.CurveTo(84.04f, 201.25f, 121.29f, 181.86f, 131.91f, 128.77f),
                    PathNode.CurveTo(142.41f, 76.24f, 181.16f, 59.51f, 204.82f, 54.18f),
                    PathNode.CurveTo(232.23f, 83.88f, 221.84f, 140.19f, 181.0f, 181.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
