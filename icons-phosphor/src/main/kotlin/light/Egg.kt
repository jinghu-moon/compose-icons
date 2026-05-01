package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorLightIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(185.0f, 60.67f),
                    PathNode.CurveTo(167.18f, 34.0f, 145.87f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(110.13f, 18.0f, 88.82f, 34.0f, 71.0f, 60.67f),
                    PathNode.CurveTo(52.57f, 88.32f, 42.0f, 121.61f, 42.0f, 152.0f),
                    PathNode.CurveTo(42.0f, 199.49649f, 80.50351f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(175.49649f, 238.0f, 214.0f, 199.49649f, 214.0f, 152.0f),
                    PathNode.CurveTo(214.0f, 121.61f, 203.43f, 88.32f, 185.0f, 60.67f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.0f),
                    PathNode.CurveTo(87.15149f, 225.95041f, 54.04959f, 192.84851f, 54.0f, 152.0f),
                    PathNode.CurveTo(54.0f, 123.92f, 63.84f, 93.06f, 81.0f, 67.33f),
                    PathNode.CurveTo(96.11f, 44.65f, 114.56f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(141.44f, 30.0f, 159.89f, 44.65f, 175.0f, 67.33f),
                    PathNode.CurveTo(192.15f, 93.06f, 202.0f, 123.92f, 202.0f, 152.0f),
                    PathNode.CurveTo(201.95041f, 192.84851f, 168.84851f, 225.95041f, 128.0f, 226.0f),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
