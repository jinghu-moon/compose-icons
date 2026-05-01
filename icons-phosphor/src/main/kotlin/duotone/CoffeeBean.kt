package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorDuotoneIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.79f, 183.79f),
                    PathNode.CurveTo(140.65f, 226.93f, 80.7f, 236.93f, 49.89f, 206.11f),
                    PathNode.CurveTo(19.08f, 175.29f, 29.07f, 115.35f, 72.21f, 72.21f),
                    PathNode.CurveTo(115.35f, 29.07f, 175.3f, 19.07f, 206.11f, 49.89f),
                    PathNode.CurveTo(236.92f, 80.71f, 226.93f, 140.65f, 183.79f, 183.79f),
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
                    PathNode.MoveTo(211.75f, 44.25f),
                    PathNode.CurveTo(195.0f, 27.47f, 170.37f, 20.79f, 142.46f, 25.44f),
                    PathNode.CurveTo(115.55f, 29.93f, 88.59f, 44.53f, 66.56f, 66.56f),
                    PathNode.CurveTo(44.53f, 88.59f, 29.93f, 115.56f, 25.44f, 142.46f),
                    PathNode.CurveTo(20.79f, 170.37f, 27.44f, 194.97f, 44.25f, 211.75f),
                    PathNode.CurveTo(57.54f, 225.05f, 75.75f, 232.0f, 96.62f, 232.0f),
                    PathNode.CurveTo(102.289894f, 231.98355f, 107.948875f, 231.50194f, 113.54f, 230.56f),
                    PathNode.CurveTo(140.45f, 226.07f, 167.41f, 211.47f, 189.44f, 189.44f),
                    PathNode.CurveTo(211.47f, 167.41f, 226.07f, 140.44f, 230.56f, 113.54f),
                    PathNode.CurveTo(235.21f, 85.63f, 228.53f, 61.0f, 211.75f, 44.25f),
                    PathNode.Close,
                    PathNode.MoveTo(77.87f, 77.87f),
                    PathNode.CurveTo(102.56f, 53.19f, 133.0f, 39.93f, 159.15f, 39.93f),
                    PathNode.CurveTo(169.2137f, 39.7766f, 179.16457f, 42.0653f, 188.15f, 46.6f),
                    PathNode.CurveTo(176.94293f, 50.509945f, 166.45354f, 56.232662f, 157.1f, 63.54f),
                    PathNode.CurveTo(137.9f, 78.7f, 125.47f, 99.86f, 120.16f, 126.43f),
                    PathNode.CurveTo(110.44f, 175.01f, 75.46f, 191.61f, 52.68f, 197.27f),
                    PathNode.CurveTo(28.71f, 168.76f, 39.4f, 116.35f, 77.87f, 77.87f),
                    PathNode.Close,
                    PathNode.MoveTo(178.13f, 178.13f),
                    PathNode.CurveTo(143.44f, 212.81f, 97.42f, 224.91f, 67.81f, 209.4f),
                    PathNode.CurveTo(79.029335f, 205.49005f, 89.5319f, 199.76752f, 98.9f, 192.46f),
                    PathNode.CurveTo(118.1f, 177.3f, 130.53f, 156.14f, 135.84f, 129.57f),
                    PathNode.CurveTo(145.56f, 80.99f, 180.54f, 64.39f, 203.32f, 58.73f),
                    PathNode.CurveTo(227.29f, 87.24f, 216.6f, 139.65f, 178.13f, 178.13f),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
