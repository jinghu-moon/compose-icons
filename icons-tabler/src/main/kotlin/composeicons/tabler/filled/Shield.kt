package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Shield: ImageVector
    get() {
        if (_shield != null) return _shield!!
        _shield = tablerFilledIcon(
            name = "Shield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.884f, 2.007f),
                    PathNode.LineTo(11.998f, 2.0f),
                    PathNode.LineTo(12.116f, 2.007f),
                    PathNode.LineTo(12.175f, 2.015f),
                    PathNode.LineTo(12.236f, 2.028f),
                    PathNode.LineTo(12.347f, 2.062f),
                    PathNode.CurveTo(12.423666f, 2.090263f, 12.496551f, 2.127881f, 12.564f, 2.174f),
                    PathNode.LineTo(12.668f, 2.256f),
                    PathNode.LineTo(12.923f, 2.474f),
                    PathNode.CurveTo(14.94031f, 4.149565f, 17.489864f, 5.049303f, 20.112f, 5.011f),
                    PathNode.LineTo(20.454f, 5.001f),
                    PathNode.CurveTo(20.914154f, 4.980007f, 21.32912f, 5.276058f, 21.459f, 5.718f),
                    PathNode.CurveTo(22.451826f, 9.095279f, 22.032593f, 12.730811f, 20.297144f, 15.793478f),
                    PathNode.CurveTo(18.561699f, 18.856146f, 15.658408f, 21.084097f, 12.251f, 21.968f),
                    PathNode.CurveTo(12.086389f, 22.010683f, 11.913611f, 22.010683f, 11.749f, 21.968f),
                    PathNode.CurveTo(8.341408f, 21.084318f, 5.437877f, 18.856457f, 3.702225f, 15.793764f),
                    PathNode.CurveTo(1.966573f, 12.731071f, 1.547205f, 9.095416f, 2.54f, 5.718f),
                    PathNode.CurveTo(2.669881f, 5.276058f, 3.084847f, 4.980007f, 3.545f, 5.001f),
                    PathNode.CurveTo(6.282463f, 5.126134f, 8.968063f, 4.22499f, 11.076f, 2.474f),
                    PathNode.LineTo(11.339f, 2.249f),
                    PathNode.LineTo(11.435f, 2.174f),
                    PathNode.CurveTo(11.50245f, 2.127881f, 11.575335f, 2.090263f, 11.652f, 2.062f),
                    PathNode.LineTo(11.764f, 2.028f),
                    PathNode.CurveTo(11.803192f, 2.018534f, 11.842936f, 2.01152f, 11.883f, 2.007f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _shield!!
    }

private var _shield: ImageVector? = null
