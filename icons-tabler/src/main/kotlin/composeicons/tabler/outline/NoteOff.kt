package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NoteOff: ImageVector
    get() {
        if (_noteOff != null) return _noteOff!!
        _noteOff = tablerOutlineIcon(
            name = "NoteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 20.0f),
                    PathNode.LineTo(16.505f, 16.495f),
                    PathNode.MoveTo(18.505f, 14.495f),
                    PathNode.LineTo(20.006f, 12.994f)
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
                    PathNode.MoveTo(17.0f, 13.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 4.895431f, 19.10457f, 4.0f, 18.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.MoveTo(4.573f, 4.6f),
                    PathNode.CurveTo(4.218f, 4.96f, 4.0f, 5.453f, 4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 19.10457f, 4.895431f, 20.0f, 6.0f, 20.0f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.CurveTo(13.0f, 13.728f, 13.109f, 13.481f, 13.285f, 13.301f)
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
        return _noteOff!!
    }

private var _noteOff: ImageVector? = null
