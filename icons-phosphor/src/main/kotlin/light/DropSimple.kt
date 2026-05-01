package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorLightIcon(
            name = "DropSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.53f, 49.06f),
                    PathNode.CurveTo(160.29025f, 34.903572f, 146.50822f, 22.157957f, 131.44f, 11.06f),
                    PathNode.CurveTo(129.37442f, 9.614577f, 126.62557f, 9.614577f, 124.56f, 11.06f),
                    PathNode.CurveTo(109.49178f, 22.157957f, 95.70975f, 34.903572f, 83.47f, 49.06f),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
