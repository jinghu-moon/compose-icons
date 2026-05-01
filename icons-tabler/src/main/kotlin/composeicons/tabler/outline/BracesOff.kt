package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracesOff: ImageVector
    get() {
        if (_bracesOff != null) return _bracesOff!!
        _bracesOff = tablerOutlineIcon(
            name = "BracesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.176f, 5.177f),
                    PathNode.CurveTo(5.063f, 5.428f, 5.0f, 5.707f, 5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(5.0f, 10.657f, 4.105f, 12.0f, 3.0f, 12.0f),
                    PathNode.CurveTo(4.105f, 12.0f, 5.0f, 13.343f, 5.0f, 15.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 19.10457f, 5.895431f, 20.0f, 7.0f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 4.0f),
                    PathNode.CurveTo(18.10457f, 4.0f, 19.0f, 4.895431f, 19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.0f, 10.657f, 19.895f, 12.0f, 21.0f, 12.0f),
                    PathNode.CurveTo(19.895f, 12.0f, 19.0f, 13.343f, 19.0f, 15.0f),
                    PathNode.MoveTo(18.824f, 18.821f),
                    PathNode.CurveTo(18.50093f, 19.538647f, 17.787014f, 20.00011f, 17.0f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
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
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bracesOff!!
    }

private var _bracesOff: ImageVector? = null
