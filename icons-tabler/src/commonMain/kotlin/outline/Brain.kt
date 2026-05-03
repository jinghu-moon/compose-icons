package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = tablerOutlineIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 13.0f),
                    PathNode.CurveTo(13.567003f, 13.0f, 12.0f, 14.567003f, 12.0f, 16.5f),
                    PathNode.LineTo(12.0f, 17.5f),
                    PathNode.CurveTo(12.0f, 19.432997f, 13.567003f, 21.0f, 15.5f, 21.0f),
                    PathNode.CurveTo(17.432997f, 21.0f, 19.0f, 19.432997f, 19.0f, 17.5f),
                    PathNode.LineTo(19.0f, 15.7f)
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
                    PathNode.MoveTo(8.5f, 13.0f),
                    PathNode.CurveTo(10.432997f, 13.0f, 12.0f, 14.567003f, 12.0f, 16.5f),
                    PathNode.LineTo(12.0f, 17.5f),
                    PathNode.CurveTo(12.0f, 19.432997f, 10.432997f, 21.0f, 8.5f, 21.0f),
                    PathNode.CurveTo(6.567004f, 21.0f, 5.0f, 19.432997f, 5.0f, 17.5f),
                    PathNode.LineTo(5.0f, 15.7f)
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
                    PathNode.MoveTo(17.5f, 16.0f),
                    PathNode.CurveTo(19.432997f, 16.0f, 21.0f, 14.432997f, 21.0f, 12.5f),
                    PathNode.CurveTo(21.0f, 10.567003f, 19.432997f, 9.0f, 17.5f, 9.0f),
                    PathNode.LineTo(17.0f, 9.0f)
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
                    PathNode.MoveTo(19.0f, 9.3f),
                    PathNode.LineTo(19.0f, 6.5f),
                    PathNode.CurveTo(19.0f, 4.567004f, 17.432997f, 3.0f, 15.5f, 3.0f),
                    PathNode.CurveTo(13.567003f, 3.0f, 12.0f, 4.567004f, 12.0f, 6.5f)
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
                    PathNode.MoveTo(6.5f, 16.0f),
                    PathNode.CurveTo(4.567004f, 16.0f, 3.0f, 14.432997f, 3.0f, 12.5f),
                    PathNode.CurveTo(3.0f, 10.567003f, 4.567004f, 9.0f, 6.5f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f)
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
                    PathNode.MoveTo(5.0f, 9.3f),
                    PathNode.LineTo(5.0f, 6.5f),
                    PathNode.CurveTo(5.0f, 4.567004f, 6.567004f, 3.0f, 8.5f, 3.0f),
                    PathNode.CurveTo(10.432997f, 3.0f, 12.0f, 4.567004f, 12.0f, 6.5f),
                    PathNode.LineTo(12.0f, 16.5f)
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
        return _brain!!
    }

private var _brain: ImageVector? = null
