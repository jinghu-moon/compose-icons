package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayFootball: ImageVector
    get() {
        if (_playFootball != null) return _playFootball!!
        _playFootball = tablerOutlineIcon(
            name = "PlayFootball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 4.552285f, 11.447715f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(12.552285f, 5.0f, 13.0f, 4.552285f, 13.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 3.447715f, 12.552285f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(11.447715f, 3.0f, 11.0f, 3.447715f, 11.0f, 4.0f)
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
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.LineTo(8.75f, 16.5f)
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
                    PathNode.MoveTo(14.0f, 21.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(11.0f, 8.0f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(17.0f, 12.0f)
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
                    PathNode.MoveTo(19.5f, 20.0f),
                    PathNode.CurveTo(19.776142f, 20.0f, 20.0f, 19.776142f, 20.0f, 19.5f),
                    PathNode.CurveTo(20.0f, 19.223858f, 19.776142f, 19.0f, 19.5f, 19.0f),
                    PathNode.CurveTo(19.223858f, 19.0f, 19.0f, 19.223858f, 19.0f, 19.5f),
                    PathNode.CurveTo(19.0f, 19.776142f, 19.223858f, 20.0f, 19.5f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _playFootball!!
    }

private var _playFootball: ImageVector? = null
