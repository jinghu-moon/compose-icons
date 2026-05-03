package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsThreeOutline: ImageVector
    get() {
        if (_dotsThreeOutline != null) return _dotsThreeOutline!!
        _dotsThreeOutline = phosphorLightIcon(
            name = "DotsThreeOutline",
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
                    PathNode.MoveTo(48.0f, 98.0f),
                    PathNode.CurveTo(31.431458f, 98.0f, 18.0f, 111.43146f, 18.0f, 128.0f),
                    PathNode.CurveTo(18.0f, 144.56854f, 31.431458f, 158.0f, 48.0f, 158.0f),
                    PathNode.CurveTo(64.56854f, 158.0f, 78.0f, 144.56854f, 78.0f, 128.0f),
                    PathNode.CurveTo(78.0f, 111.43146f, 64.56854f, 98.0f, 48.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 146.0f),
                    PathNode.CurveTo(38.058876f, 146.0f, 30.0f, 137.94113f, 30.0f, 128.0f),
                    PathNode.CurveTo(30.0f, 118.05888f, 38.058876f, 110.0f, 48.0f, 110.0f),
                    PathNode.CurveTo(57.941124f, 110.0f, 66.0f, 118.05888f, 66.0f, 128.0f),
                    PathNode.CurveTo(66.0f, 137.94113f, 57.941124f, 146.0f, 48.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 98.0f),
                    PathNode.CurveTo(191.43146f, 98.0f, 178.0f, 111.43146f, 178.0f, 128.0f),
                    PathNode.CurveTo(178.0f, 144.56854f, 191.43146f, 158.0f, 208.0f, 158.0f),
                    PathNode.CurveTo(224.56854f, 158.0f, 238.0f, 144.56854f, 238.0f, 128.0f),
                    PathNode.CurveTo(238.0f, 111.43146f, 224.56854f, 98.0f, 208.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 146.0f),
                    PathNode.CurveTo(198.05887f, 146.0f, 190.0f, 137.94113f, 190.0f, 128.0f),
                    PathNode.CurveTo(190.0f, 118.05888f, 198.05887f, 110.0f, 208.0f, 110.0f),
                    PathNode.CurveTo(217.94113f, 110.0f, 226.0f, 118.05888f, 226.0f, 128.0f),
                    PathNode.CurveTo(226.0f, 137.94113f, 217.94113f, 146.0f, 208.0f, 146.0f),
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
        return _dotsThreeOutline!!
    }

private var _dotsThreeOutline: ImageVector? = null
