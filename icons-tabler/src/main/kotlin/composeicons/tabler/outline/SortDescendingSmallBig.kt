package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortDescendingSmallBig: ImageVector
    get() {
        if (_sortDescendingSmallBig != null) return _sortDescendingSmallBig!!
        _sortDescendingSmallBig = tablerOutlineIcon(
            name = "SortDescendingSmallBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 15.0f),
                    PathNode.LineTo(7.0f, 18.0f),
                    PathNode.LineTo(4.0f, 15.0f)
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
                    PathNode.MoveTo(14.0f, 18.333f),
                    PathNode.CurveTo(14.0f, 18.702f, 14.298f, 19.0f, 14.667f, 19.0f),
                    PathNode.LineTo(17.333f, 19.0f),
                    PathNode.CurveTo(17.701374f, 19.0f, 18.0f, 18.701374f, 18.0f, 18.333f),
                    PathNode.LineTo(18.0f, 15.667f),
                    PathNode.CurveTo(18.0f, 15.298626f, 17.701374f, 15.0f, 17.333f, 15.0f),
                    PathNode.LineTo(14.667f, 15.0f),
                    PathNode.CurveTo(14.298626f, 15.0f, 14.0f, 15.298626f, 14.0f, 15.667f),
                    PathNode.LineTo(14.0f, 18.333f)
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
                    PathNode.MoveTo(14.0f, 10.833f),
                    PathNode.CurveTo(14.0f, 11.478f, 14.522f, 12.0f, 15.167f, 12.0f),
                    PathNode.LineTo(19.833f, 12.0f),
                    PathNode.CurveTo(20.478f, 12.0f, 21.0f, 11.478f, 21.0f, 10.833f),
                    PathNode.LineTo(21.0f, 6.167f),
                    PathNode.CurveTo(21.0f, 5.522f, 20.478f, 5.0f, 19.833f, 5.0f),
                    PathNode.LineTo(15.167f, 5.0f),
                    PathNode.CurveTo(14.522f, 5.0f, 14.0f, 5.522f, 14.0f, 6.167f),
                    PathNode.LineTo(14.0f, 10.833f)
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
        return _sortDescendingSmallBig!!
    }

private var _sortDescendingSmallBig: ImageVector? = null
