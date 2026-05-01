package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayVolleyball: ImageVector
    get() {
        if (_playVolleyball != null) return _playVolleyball!!
        _playVolleyball = tablerOutlineIcon(
            name = "PlayVolleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 4.552285f, 13.447715f, 5.0f, 14.0f, 5.0f),
                    PathNode.CurveTo(14.552285f, 5.0f, 15.0f, 4.552285f, 15.0f, 4.0f),
                    PathNode.CurveTo(15.0f, 3.447715f, 14.552285f, 3.0f, 14.0f, 3.0f),
                    PathNode.CurveTo(13.447715f, 3.0f, 13.0f, 3.447715f, 13.0f, 4.0f)
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
                    PathNode.MoveTo(20.5f, 10.0f),
                    PathNode.CurveTo(20.776142f, 10.0f, 21.0f, 9.776142f, 21.0f, 9.5f),
                    PathNode.CurveTo(21.0f, 9.223858f, 20.776142f, 9.0f, 20.5f, 9.0f),
                    PathNode.CurveTo(20.223858f, 9.0f, 20.0f, 9.223858f, 20.0f, 9.5f),
                    PathNode.CurveTo(20.0f, 9.776142f, 20.223858f, 10.0f, 20.5f, 10.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(2.0f, 16.0f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.LineTo(7.5f, 14.5f)
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
                    PathNode.MoveTo(11.5f, 21.0f),
                    PathNode.LineTo(14.0f, 15.5f),
                    PathNode.LineTo(8.5f, 12.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(19.0f, 14.0f)
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
        return _playVolleyball!!
    }

private var _playVolleyball: ImageVector? = null
