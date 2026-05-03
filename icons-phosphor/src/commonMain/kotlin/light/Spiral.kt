package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorLightIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 144.0f),
                    PathNode.CurveTo(246.0f, 147.3137f, 243.3137f, 150.0f, 240.0f, 150.0f),
                    PathNode.CurveTo(236.6863f, 150.0f, 234.0f, 147.3137f, 234.0f, 144.0f),
                    PathNode.CurveTo(233.93938f, 89.90122f, 190.09877f, 46.06062f, 136.0f, 46.0f),
                    PathNode.CurveTo(86.317215f, 46.05511f, 46.05511f, 86.317215f, 46.0f, 136.0f),
                    PathNode.CurveTo(46.0551f, 181.26451f, 82.7355f, 217.9449f, 128.0f, 218.0f),
                    PathNode.CurveTo(168.84851f, 217.95041f, 201.95041f, 184.84851f, 202.0f, 144.0f),
                    PathNode.CurveTo(201.95592f, 107.56748f, 172.43253f, 78.04408f, 136.0f, 78.0f),
                    PathNode.CurveTo(103.983475f, 78.038574f, 78.038574f, 103.983475f, 78.0f, 136.0f),
                    PathNode.CurveTo(78.03306f, 163.60052f, 100.39947f, 185.96693f, 128.0f, 186.0f),
                    PathNode.CurveTo(151.19595f, 186.0f, 170.0f, 167.19595f, 170.0f, 144.0f),
                    PathNode.CurveTo(170.0f, 125.22232f, 154.77768f, 110.0f, 136.0f, 110.0f),
                    PathNode.CurveTo(121.640594f, 110.0f, 110.0f, 121.640594f, 110.0f, 136.0f),
                    PathNode.CurveTo(110.0f, 145.94113f, 118.05888f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(133.52284f, 154.0f, 138.0f, 149.52284f, 138.0f, 144.0f),
                    PathNode.CurveTo(138.0f, 142.89543f, 137.10457f, 142.0f, 136.0f, 142.0f),
                    PathNode.CurveTo(132.6863f, 142.0f, 130.0f, 139.3137f, 130.0f, 136.0f),
                    PathNode.CurveTo(130.0f, 132.6863f, 132.6863f, 130.0f, 136.0f, 130.0f),
                    PathNode.CurveTo(143.73198f, 130.0f, 150.0f, 136.26802f, 150.0f, 144.0f),
                    PathNode.CurveTo(150.0f, 156.15027f, 140.15027f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(111.43146f, 166.0f, 98.0f, 152.56854f, 98.0f, 136.0f),
                    PathNode.CurveTo(98.0f, 115.013176f, 115.013176f, 98.0f, 136.0f, 98.0f),
                    PathNode.CurveTo(161.39139f, 98.03306f, 181.96695f, 118.608604f, 182.0f, 144.0f),
                    PathNode.CurveTo(181.96693f, 173.80966f, 157.80966f, 197.96693f, 128.0f, 198.0f),
                    PathNode.CurveTo(93.77434f, 197.96143f, 66.038574f, 170.22566f, 66.0f, 136.0f),
                    PathNode.CurveTo(66.04408f, 97.358345f, 97.358345f, 66.04408f, 136.0f, 66.0f),
                    PathNode.CurveTo(179.05765f, 66.0496f, 213.95041f, 100.94235f, 214.0f, 144.0f),
                    PathNode.CurveTo(213.9449f, 191.47365f, 175.47365f, 229.9449f, 128.0f, 230.0f),
                    PathNode.CurveTo(76.11036f, 229.93938f, 34.060616f, 187.88963f, 34.0f, 136.0f),
                    PathNode.CurveTo(34.066124f, 79.69437f, 79.69437f, 34.066124f, 136.0f, 34.0f),
                    PathNode.CurveTo(196.72162f, 34.071636f, 245.92834f, 83.27837f, 246.0f, 144.0f),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
