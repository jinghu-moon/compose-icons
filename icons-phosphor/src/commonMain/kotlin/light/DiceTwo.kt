package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorLightIcon(
            name = "DiceTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(47.431458f, 34.0f, 34.0f, 47.431458f, 34.0f, 64.0f),
                    PathNode.LineTo(34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 208.56854f, 47.431458f, 222.0f, 64.0f, 222.0f),
                    PathNode.LineTo(192.0f, 222.0f),
                    PathNode.CurveTo(208.56854f, 222.0f, 222.0f, 208.56854f, 222.0f, 192.0f),
                    PathNode.LineTo(222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 47.431458f, 208.56854f, 34.0f, 192.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 192.0f),
                    PathNode.CurveTo(210.0f, 201.94113f, 201.94113f, 210.0f, 192.0f, 210.0f),
                    PathNode.LineTo(64.0f, 210.0f),
                    PathNode.CurveTo(54.058876f, 210.0f, 46.0f, 201.94113f, 46.0f, 192.0f),
                    PathNode.LineTo(46.0f, 64.0f),
                    PathNode.CurveTo(46.0f, 54.058876f, 54.058876f, 46.0f, 64.0f, 46.0f),
                    PathNode.LineTo(192.0f, 46.0f),
                    PathNode.CurveTo(201.94113f, 46.0f, 210.0f, 54.058876f, 210.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 108.0f),
                    PathNode.CurveTo(118.0f, 113.52285f, 113.52285f, 118.0f, 108.0f, 118.0f),
                    PathNode.CurveTo(102.47715f, 118.0f, 98.0f, 113.52285f, 98.0f, 108.0f),
                    PathNode.CurveTo(98.0f, 102.47715f, 102.47715f, 98.0f, 108.0f, 98.0f),
                    PathNode.CurveTo(113.52285f, 98.0f, 118.0f, 102.47715f, 118.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 148.0f),
                    PathNode.CurveTo(158.0f, 153.52284f, 153.52284f, 158.0f, 148.0f, 158.0f),
                    PathNode.CurveTo(142.47716f, 158.0f, 138.0f, 153.52284f, 138.0f, 148.0f),
                    PathNode.CurveTo(138.0f, 142.47716f, 142.47716f, 138.0f, 148.0f, 138.0f),
                    PathNode.CurveTo(153.52284f, 138.0f, 158.0f, 142.47716f, 158.0f, 148.0f),
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
        return _diceTwo!!
    }

private var _diceTwo: ImageVector? = null
