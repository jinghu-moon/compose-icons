package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockOff: ImageVector
    get() {
        if (_clockOff != null) return _clockOff!!
        _clockOff = tablerOutlineIcon(
            name = "ClockOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.633f, 5.64f),
                    PathNode.CurveTo(3.329904f, 7.908655f, 2.420498f, 11.238255f, 3.250593f, 14.362673f),
                    PathNode.CurveTo(4.08069f, 17.487091f, 6.522747f, 19.926271f, 9.648141f, 20.752686f),
                    PathNode.CurveTo(12.773535f, 21.579098f, 16.10206f, 20.665768f, 18.368f, 18.36f),
                    PathNode.MoveTo(20.042f, 16.04f),
                    PathNode.CurveTo(21.78337f, 12.572894f, 21.106846f, 8.380082f, 18.363382f, 5.636618f),
                    PathNode.CurveTo(15.619918f, 2.893155f, 11.427106f, 2.216631f, 7.96f, 3.958f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clockOff!!
    }

private var _clockOff: ImageVector? = null
