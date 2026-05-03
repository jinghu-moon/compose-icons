package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorLightIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.53f, 49.06f),
                    PathNode.CurveTo(160.28166f, 34.911884f, 146.5006f, 22.167171f, 131.44f, 11.06f),
                    PathNode.CurveTo(129.37442f, 9.614577f, 126.62557f, 9.614577f, 124.56f, 11.06f),
                    PathNode.CurveTo(109.4994f, 22.167171f, 95.71834f, 34.911884f, 83.47f, 49.06f),
                    PathNode.CurveTo(56.34f, 80.26f, 42.0f, 113.09f, 42.0f, 144.0f),
                    PathNode.CurveTo(42.0f, 191.49649f, 80.50351f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(175.49649f, 230.0f, 214.0f, 191.49649f, 214.0f, 144.0f),
                    PathNode.CurveTo(214.0f, 113.09f, 199.66f, 80.26f, 172.53f, 49.06f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(87.15149f, 217.95041f, 54.04959f, 184.84851f, 54.0f, 144.0f),
                    PathNode.CurveTo(54.0f, 84.38f, 113.0f, 35.07f, 128.0f, 23.49f),
                    PathNode.CurveTo(143.0f, 35.07f, 202.0f, 84.38f, 202.0f, 144.0f),
                    PathNode.CurveTo(201.95041f, 184.84851f, 168.84851f, 217.95041f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.92f, 153.0f),
                    PathNode.CurveTo(177.82224f, 175.8982f, 159.8982f, 193.82224f, 137.0f, 197.92f),
                    PathNode.CurveTo(136.669f, 197.97055f, 136.33482f, 197.99728f, 136.0f, 198.0f),
                    PathNode.CurveTo(132.87164f, 198.01239f, 130.25877f, 195.61908f, 129.99724f, 192.50165f),
                    PathNode.CurveTo(129.73572f, 189.38423f, 131.91331f, 186.589f, 135.0f, 186.08f),
                    PathNode.CurveTo(152.38f, 183.16f, 167.13f, 168.4f, 170.08f, 151.0f),
                    PathNode.CurveTo(170.63228f, 147.73047f, 173.73047f, 145.52771f, 177.0f, 146.08f),
                    PathNode.CurveTo(180.26953f, 146.63228f, 182.47229f, 149.73047f, 181.92f, 153.0f),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
