package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiceThree: ImageVector
    get() {
        if (_diceThree != null) return _diceThree!!
        _diceThree = phosphorLightIcon(
            name = "DiceThree",
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
                    PathNode.MoveTo(102.0f, 92.0f),
                    PathNode.CurveTo(102.0f, 97.52285f, 97.52285f, 102.0f, 92.0f, 102.0f),
                    PathNode.CurveTo(86.47715f, 102.0f, 82.0f, 97.52285f, 82.0f, 92.0f),
                    PathNode.CurveTo(82.0f, 86.47715f, 86.47715f, 82.0f, 92.0f, 82.0f),
                    PathNode.CurveTo(97.52285f, 82.0f, 102.0f, 86.47715f, 102.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 133.52284f, 133.52284f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(122.47715f, 138.0f, 118.0f, 133.52284f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 122.47715f, 122.47715f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(133.52284f, 118.0f, 138.0f, 122.47715f, 138.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 164.0f),
                    PathNode.CurveTo(174.0f, 169.52284f, 169.52284f, 174.0f, 164.0f, 174.0f),
                    PathNode.CurveTo(158.47716f, 174.0f, 154.0f, 169.52284f, 154.0f, 164.0f),
                    PathNode.CurveTo(154.0f, 158.47716f, 158.47716f, 154.0f, 164.0f, 154.0f),
                    PathNode.CurveTo(169.52284f, 154.0f, 174.0f, 158.47716f, 174.0f, 164.0f),
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
        return _diceThree!!
    }

private var _diceThree: ImageVector? = null
