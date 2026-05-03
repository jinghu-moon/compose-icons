package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorLightIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 42.0f),
                    PathNode.LineTo(160.0f, 42.0f),
                    PathNode.CurveTo(152.26802f, 42.0f, 146.0f, 48.268013f, 146.0f, 56.0f),
                    PathNode.LineTo(146.0f, 144.0f),
                    PathNode.CurveTo(146.0f, 153.94113f, 137.94113f, 162.0f, 128.0f, 162.0f),
                    PathNode.CurveTo(118.05888f, 162.0f, 110.0f, 153.94113f, 110.0f, 144.0f),
                    PathNode.LineTo(110.0f, 56.0f),
                    PathNode.CurveTo(110.0f, 48.268013f, 103.73199f, 42.0f, 96.0f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(48.268013f, 42.0f, 42.0f, 48.268013f, 42.0f, 56.0f),
                    PathNode.LineTo(42.0f, 144.0f),
                    PathNode.CurveTo(42.0f, 191.49649f, 80.50351f, 230.0f, 128.0f, 230.0f),
                    PathNode.LineTo(128.65f, 230.0f),
                    PathNode.CurveTo(175.71f, 229.65f, 214.0f, 190.62f, 214.0f, 143.0f),
                    PathNode.LineTo(214.0f, 56.0f),
                    PathNode.CurveTo(214.0f, 48.268013f, 207.73198f, 42.0f, 200.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 54.0f),
                    PathNode.LineTo(200.0f, 54.0f),
                    PathNode.CurveTo(201.10457f, 54.0f, 202.0f, 54.89543f, 202.0f, 56.0f),
                    PathNode.LineTo(202.0f, 90.0f),
                    PathNode.LineTo(158.0f, 90.0f),
                    PathNode.LineTo(158.0f, 56.0f),
                    PathNode.CurveTo(158.0f, 54.89543f, 158.89543f, 54.0f, 160.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 54.0f),
                    PathNode.LineTo(96.0f, 54.0f),
                    PathNode.CurveTo(97.10457f, 54.0f, 98.0f, 54.89543f, 98.0f, 56.0f),
                    PathNode.LineTo(98.0f, 90.0f),
                    PathNode.LineTo(54.0f, 90.0f),
                    PathNode.LineTo(54.0f, 56.0f),
                    PathNode.CurveTo(54.0f, 54.89543f, 54.89543f, 54.0f, 56.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.56f, 218.0f),
                    PathNode.LineTo(128.0f, 218.0f),
                    PathNode.CurveTo(87.13093f, 218.0f, 54.0f, 184.86908f, 54.0f, 144.0f),
                    PathNode.LineTo(54.0f, 102.0f),
                    PathNode.LineTo(98.0f, 102.0f),
                    PathNode.LineTo(98.0f, 144.0f),
                    PathNode.CurveTo(98.0f, 160.56854f, 111.43146f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(144.56854f, 174.0f, 158.0f, 160.56854f, 158.0f, 144.0f),
                    PathNode.LineTo(158.0f, 102.0f),
                    PathNode.LineTo(202.0f, 102.0f),
                    PathNode.LineTo(202.0f, 143.0f),
                    PathNode.CurveTo(202.0f, 184.05f, 169.06f, 217.7f, 128.56f, 218.0f),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
