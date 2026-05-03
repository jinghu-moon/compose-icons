package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CommandOff: ImageVector
    get() {
        if (_commandOff != null) return _commandOff!!
        _commandOff = tablerOutlineIcon(
            name = "CommandOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 18.10457f, 8.10457f, 19.0f, 7.0f, 19.0f),
                    PathNode.CurveTo(5.895431f, 19.0f, 5.0f, 18.10457f, 5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 15.895431f, 5.895431f, 15.0f, 7.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.MoveTo(18.411f, 18.417f),
                    PathNode.CurveTo(17.838346f, 18.987059f, 16.978926f, 19.156536f, 16.23273f, 18.84655f),
                    PathNode.CurveTo(15.486534f, 18.536564f, 15.00017f, 17.808022f, 15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 5.895431f, 15.895431f, 5.0f, 17.0f, 5.0f),
                    PathNode.CurveTo(18.10457f, 5.0f, 19.0f, 5.895431f, 19.0f, 7.0f),
                    PathNode.CurveTo(19.0f, 8.10457f, 18.10457f, 9.0f, 17.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(6.191978f, 8.99983f, 5.463435f, 8.513466f, 5.15345f, 7.76727f),
                    PathNode.CurveTo(4.843465f, 7.021074f, 5.012941f, 6.161653f, 5.583f, 5.589f)
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
        return _commandOff!!
    }

private var _commandOff: ImageVector? = null
