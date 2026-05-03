package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiceFour: ImageVector
    get() {
        if (_diceFour != null) return _diceFour!!
        _diceFour = phosphorLightIcon(
            name = "DiceFour",
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
                    PathNode.MoveTo(110.0f, 100.0f),
                    PathNode.CurveTo(110.0f, 105.52285f, 105.52285f, 110.0f, 100.0f, 110.0f),
                    PathNode.CurveTo(94.47715f, 110.0f, 90.0f, 105.52285f, 90.0f, 100.0f),
                    PathNode.CurveTo(90.0f, 94.47715f, 94.47715f, 90.0f, 100.0f, 90.0f),
                    PathNode.CurveTo(105.52285f, 90.0f, 110.0f, 94.47715f, 110.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 100.0f),
                    PathNode.CurveTo(166.0f, 105.52285f, 161.52284f, 110.0f, 156.0f, 110.0f),
                    PathNode.CurveTo(150.47716f, 110.0f, 146.0f, 105.52285f, 146.0f, 100.0f),
                    PathNode.CurveTo(146.0f, 94.47715f, 150.47716f, 90.0f, 156.0f, 90.0f),
                    PathNode.CurveTo(161.52284f, 90.0f, 166.0f, 94.47715f, 166.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 156.0f),
                    PathNode.CurveTo(110.0f, 161.52284f, 105.52285f, 166.0f, 100.0f, 166.0f),
                    PathNode.CurveTo(94.47715f, 166.0f, 90.0f, 161.52284f, 90.0f, 156.0f),
                    PathNode.CurveTo(90.0f, 150.47716f, 94.47715f, 146.0f, 100.0f, 146.0f),
                    PathNode.CurveTo(105.52285f, 146.0f, 110.0f, 150.47716f, 110.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 156.0f),
                    PathNode.CurveTo(166.0f, 161.52284f, 161.52284f, 166.0f, 156.0f, 166.0f),
                    PathNode.CurveTo(150.47716f, 166.0f, 146.0f, 161.52284f, 146.0f, 156.0f),
                    PathNode.CurveTo(146.0f, 150.47716f, 150.47716f, 146.0f, 156.0f, 146.0f),
                    PathNode.CurveTo(161.52284f, 146.0f, 166.0f, 150.47716f, 166.0f, 156.0f),
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
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
