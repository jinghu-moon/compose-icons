package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsThreeOutlineVertical: ImageVector
    get() {
        if (_dotsThreeOutlineVertical != null) return _dotsThreeOutlineVertical!!
        _dotsThreeOutlineVertical = phosphorLightIcon(
            name = "DotsThreeOutlineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 98.0f),
                    PathNode.CurveTo(111.43146f, 98.0f, 98.0f, 111.43146f, 98.0f, 128.0f),
                    PathNode.CurveTo(98.0f, 144.56854f, 111.43146f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(144.56854f, 158.0f, 158.0f, 144.56854f, 158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 111.43146f, 144.56854f, 98.0f, 128.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 146.0f),
                    PathNode.CurveTo(118.05888f, 146.0f, 110.0f, 137.94113f, 110.0f, 128.0f),
                    PathNode.CurveTo(110.0f, 118.05888f, 118.05888f, 110.0f, 128.0f, 110.0f),
                    PathNode.CurveTo(137.94113f, 110.0f, 146.0f, 118.05888f, 146.0f, 128.0f),
                    PathNode.CurveTo(146.0f, 137.94113f, 137.94113f, 146.0f, 128.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 78.0f),
                    PathNode.CurveTo(144.56854f, 78.0f, 158.0f, 64.56854f, 158.0f, 48.0f),
                    PathNode.CurveTo(158.0f, 31.431458f, 144.56854f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(111.43146f, 18.0f, 98.0f, 31.431458f, 98.0f, 48.0f),
                    PathNode.CurveTo(98.0f, 64.56854f, 111.43146f, 78.0f, 128.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 30.0f),
                    PathNode.CurveTo(137.94113f, 30.0f, 146.0f, 38.058876f, 146.0f, 48.0f),
                    PathNode.CurveTo(146.0f, 57.941124f, 137.94113f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(118.05888f, 66.0f, 110.0f, 57.941124f, 110.0f, 48.0f),
                    PathNode.CurveTo(110.0f, 38.058876f, 118.05888f, 30.0f, 128.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 178.0f),
                    PathNode.CurveTo(111.43146f, 178.0f, 98.0f, 191.43146f, 98.0f, 208.0f),
                    PathNode.CurveTo(98.0f, 224.56854f, 111.43146f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(144.56854f, 238.0f, 158.0f, 224.56854f, 158.0f, 208.0f),
                    PathNode.CurveTo(158.0f, 191.43146f, 144.56854f, 178.0f, 128.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.0f),
                    PathNode.CurveTo(118.05888f, 226.0f, 110.0f, 217.94113f, 110.0f, 208.0f),
                    PathNode.CurveTo(110.0f, 198.05887f, 118.05888f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(137.94113f, 190.0f, 146.0f, 198.05887f, 146.0f, 208.0f),
                    PathNode.CurveTo(146.0f, 217.94113f, 137.94113f, 226.0f, 128.0f, 226.0f),
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
        return _dotsThreeOutlineVertical!!
    }

private var _dotsThreeOutlineVertical: ImageVector? = null
