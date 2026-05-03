package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayBasketball: ImageVector
    get() {
        if (_playBasketball != null) return _playBasketball!!
        _playBasketball = tablerOutlineIcon(
            name = "PlayBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 4.0f),
                    PathNode.CurveTo(10.0f, 4.552285f, 10.447715f, 5.0f, 11.0f, 5.0f),
                    PathNode.CurveTo(11.552285f, 5.0f, 12.0f, 4.552285f, 12.0f, 4.0f),
                    PathNode.CurveTo(12.0f, 3.447715f, 11.552285f, 3.0f, 11.0f, 3.0f),
                    PathNode.CurveTo(10.447715f, 3.0f, 10.0f, 3.447715f, 10.0f, 4.0f)
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
                    PathNode.MoveTo(5.0f, 21.0f),
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
                    PathNode.LineTo(10.5f, 8.0f)
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.LineTo(10.5f, 8.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(18.0f, 12.0f)
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
                    PathNode.MoveTo(18.5f, 16.0f),
                    PathNode.CurveTo(18.776142f, 16.0f, 19.0f, 15.776142f, 19.0f, 15.5f),
                    PathNode.CurveTo(19.0f, 15.223858f, 18.776142f, 15.0f, 18.5f, 15.0f),
                    PathNode.CurveTo(18.223858f, 15.0f, 18.0f, 15.223858f, 18.0f, 15.5f),
                    PathNode.CurveTo(18.0f, 15.776142f, 18.223858f, 16.0f, 18.5f, 16.0f)
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
        return _playBasketball!!
    }

private var _playBasketball: ImageVector? = null
