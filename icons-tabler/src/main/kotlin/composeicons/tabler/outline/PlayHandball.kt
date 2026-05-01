package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayHandball: ImageVector
    get() {
        if (_playHandball != null) return _playHandball!!
        _playHandball = tablerOutlineIcon(
            name = "PlayHandball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 21.0f),
                    PathNode.LineTo(16.5f, 19.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.LineTo(14.0f, 10.5f)
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
                    PathNode.MoveTo(7.0f, 6.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(14.0f, 10.5f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.LineTo(20.5f, 16.0f)
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
                    PathNode.MoveTo(4.0f, 20.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.LineTo(10.5f, 17.0f)
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
                    PathNode.MoveTo(15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 7.552285f, 15.447715f, 8.0f, 16.0f, 8.0f),
                    PathNode.CurveTo(16.552284f, 8.0f, 17.0f, 7.552285f, 17.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 6.447716f, 16.552284f, 6.0f, 16.0f, 6.0f),
                    PathNode.CurveTo(15.447715f, 6.0f, 15.0f, 6.447716f, 15.0f, 7.0f)
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
                    PathNode.MoveTo(9.5f, 5.0f),
                    PathNode.CurveTo(9.776142f, 5.0f, 10.0f, 4.776143f, 10.0f, 4.5f),
                    PathNode.CurveTo(10.0f, 4.223858f, 9.776142f, 4.0f, 9.5f, 4.0f),
                    PathNode.CurveTo(9.223858f, 4.0f, 9.0f, 4.223858f, 9.0f, 4.5f),
                    PathNode.CurveTo(9.0f, 4.776143f, 9.223858f, 5.0f, 9.5f, 5.0f)
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
        }
        return _playHandball!!
    }

private var _playHandball: ImageVector? = null
