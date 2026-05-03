package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorLightIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(44.08f, 51.37f),
                    PathNode.CurveTo(42.76255f, 52.50692f, 42.003605f, 54.159817f, 42.0f, 55.9f),
                    PathNode.LineTo(42.0f, 224.0f),
                    PathNode.CurveTo(42.0f, 227.3137f, 44.68629f, 230.0f, 48.0f, 230.0f),
                    PathNode.CurveTo(51.31371f, 230.0f, 54.0f, 227.3137f, 54.0f, 224.0f),
                    PathNode.LineTo(54.0f, 178.78f),
                    PathNode.CurveTo(82.08f, 155.99f, 105.88f, 167.78f, 133.34f, 181.35f),
                    PathNode.CurveTo(149.46f, 189.35f, 166.83f, 197.93f, 185.34f, 197.93f),
                    PathNode.CurveTo(198.91f, 197.93f, 213.1f, 193.33f, 227.9f, 180.51f),
                    PathNode.CurveTo(229.21964f, 179.38138f, 229.9856f, 177.73639f, 230.0f, 176.0f),
                    PathNode.LineTo(230.0f, 55.9f),
                    PathNode.CurveTo(230.00244f, 53.54966f, 228.63235f, 51.41432f, 226.49483f, 50.437042f),
                    PathNode.CurveTo(224.3573f, 49.459763f, 221.84598f, 49.820526f, 220.07f, 51.36f),
                    PathNode.CurveTo(191.07f, 76.48f, 166.79f, 64.45f, 138.66f, 50.52f),
                    PathNode.CurveTo(110.77f, 36.71f, 79.0f, 21.16f, 44.08f, 51.37f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 173.17f),
                    PathNode.CurveTo(189.92f, 195.97f, 166.12f, 184.17f, 138.66f, 170.59f),
                    PathNode.CurveTo(113.4f, 158.08f, 85.09f, 144.07f, 54.0f, 164.0f),
                    PathNode.LineTo(54.0f, 58.72f),
                    PathNode.CurveTo(82.08f, 35.92f, 105.88f, 47.72f, 133.34f, 61.28f),
                    PathNode.CurveTo(158.6f, 73.79f, 186.91f, 87.8f, 218.0f, 67.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flag!!
    }

private var _flag: ImageVector? = null
