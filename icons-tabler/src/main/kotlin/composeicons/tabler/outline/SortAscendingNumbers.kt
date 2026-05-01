package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAscendingNumbers: ImageVector
    get() {
        if (_sortAscendingNumbers != null) return _sortAscendingNumbers!!
        _sortAscendingNumbers = tablerOutlineIcon(
            name = "SortAscendingNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.LineTo(7.0f, 18.0f),
                    PathNode.LineTo(10.0f, 15.0f)
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
                    PathNode.LineTo(7.0f, 18.0f)
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
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.CurveTo(18.10457f, 3.0f, 19.0f, 3.895431f, 19.0f, 5.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 9.104569f, 18.10457f, 10.0f, 17.0f, 10.0f),
                    PathNode.CurveTo(15.895431f, 10.0f, 15.0f, 9.104569f, 15.0f, 8.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 3.895431f, 15.895431f, 3.0f, 17.0f, 3.0f)
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
                    PathNode.MoveTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.0f, 17.10457f, 15.895431f, 18.0f, 17.0f, 18.0f),
                    PathNode.CurveTo(18.10457f, 18.0f, 19.0f, 17.10457f, 19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 14.895431f, 18.10457f, 14.0f, 17.0f, 14.0f),
                    PathNode.CurveTo(15.895431f, 14.0f, 15.0f, 14.895431f, 15.0f, 16.0f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(15.5f, 21.0f)
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
        return _sortAscendingNumbers!!
    }

private var _sortAscendingNumbers: ImageVector? = null
