package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorLightIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.61f, 33.84f),
                    PathNode.CurveTo(168.16f, 26.3f, 146.2f, 24.1f, 124.77f, 27.67f),
                    PathNode.CurveTo(101.77f, 31.49f, 81.84f, 41.39f, 67.19f, 56.29f),
                    PathNode.CurveTo(56.31f, 67.36f, 43.13f, 88.94f, 42.06f, 128.94f),
                    PathNode.CurveTo(41.37f, 155.17f, 46.4f, 183.81f, 55.52f, 205.56f),
                    PathNode.CurveTo(64.29f, 226.48f, 75.65f, 238.0f, 87.52f, 238.0f),
                    PathNode.CurveTo(109.24f, 238.0f, 119.24f, 218.47f, 128.91f, 199.59f),
                    PathNode.CurveTo(135.99f, 185.77f, 143.31f, 171.48f, 155.12f, 163.47f),
                    PathNode.LineTo(155.12f, 163.47f),
                    PathNode.CurveTo(161.12f, 159.36f, 169.21f, 156.26f, 177.73f, 152.97f),
                    PathNode.CurveTo(201.0f, 144.0f, 230.0f, 132.81f, 230.0f, 93.17f),
                    PathNode.CurveTo(230.0f, 66.75f, 214.19f, 45.13f, 186.61f, 33.84f),
                    PathNode.Close,
                    PathNode.MoveTo(173.41f, 141.78f),
                    PathNode.CurveTo(164.24f, 145.32f, 155.57f, 148.66f, 148.41f, 153.54f),
                    PathNode.CurveTo(134.05f, 163.27f, 125.66f, 179.66f, 118.26f, 194.12f),
                    PathNode.CurveTo(109.47f, 211.23f, 101.9f, 226.0f, 87.52f, 226.0f),
                    PathNode.CurveTo(82.52f, 226.0f, 74.34f, 219.41f, 66.58f, 200.92f),
                    PathNode.CurveTo(58.09f, 180.66f, 53.41f, 153.92f, 54.06f, 129.26f),
                    PathNode.CurveTo(54.81f, 101.1f, 62.51f, 78.17f, 75.75f, 64.71f),
                    PathNode.CurveTo(94.2f, 45.93f, 120.32f, 38.06f, 144.61f, 38.06f),
                    PathNode.CurveTo(157.42532f, 37.95937f, 170.14125f, 40.315174f, 182.07f, 45.0f),
                    PathNode.CurveTo(213.33f, 57.74f, 218.0f, 80.65f, 218.0f, 93.17f),
                    PathNode.CurveTo(218.0f, 124.58f, 196.34f, 132.93f, 173.41f, 141.78f),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
